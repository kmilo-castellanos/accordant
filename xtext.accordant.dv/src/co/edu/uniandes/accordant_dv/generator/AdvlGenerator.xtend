/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.accordant_dv.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import co.edu.uniandes.accordant_dv.Device
import co.edu.uniandes.accordant_dv.DeploymentView
import co.edu.uniandes.accordant_dv.Service
import co.edu.uniandes.accordant_dv.Artifact
import co.edu.uniandes.accordant_fv.Sink
import co.edu.uniandes.accordant_fv.Ingestor
import co.edu.uniandes.accordant_fv.Estimator

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AdvlGenerator extends AbstractGenerator {
	
 

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if(resource.allContents.filter(Device)!==null && resource.allContents.filter(Device).size>0){
			fsa.generateFile("kubernetes-gen/"+resource.className+"-nodes.yaml", deviceToKubeNode(resource.contents.head as DeploymentView))
		}
		
		fsa.generateFile("kubernetes-gen/"+resource.className+"-deployments.yaml", deploymentToKubeDeployment(resource.contents.head as DeploymentView))
		
		if(resource.allContents.filter(Service)!==null && resource.allContents.filter(Service).size>0){
			//println("serviceToKubeService")
			fsa.generateFile("kubernetes-gen/"+resource.className+"-services.yaml", serviceToKubeService(resource.contents.head as DeploymentView))
		}
		if(resource.allContents.filter(Artifact)!==null && resource.allContents.filter(Artifact).size>0){
			for (art : resource.allContents.toIterable.filter(Artifact)) {
            	fsa.generateFile("artifacts/"+art.name, artifactCode(art))
       		}
			
		}
	}
	
	def className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.'))
	}
	def format(String exp) {
		return exp.replaceAll("_","-")
	}
	
	
	def artifactCode(Artifact arti)  
		'''
		«IF arti.comp!=null»
		#! comp
		«IF arti.comp instanceof co.edu.uniandes.accordant_fv.Sink && arti.technology.equals("MongoDB")»
		#! Mongo generated by Accordant
		«var sink = arti.comp as Sink »
		git clone https://github.com/mongodb/mongo-kafka.git
		cd mongo-kafka
		./gradlew check -Dorg.mongodb.test.uri=«sink.conn»
		«ELSEIF arti.comp instanceof co.edu.uniandes.accordant_fv.Ingestor && arti.technology.equals("HttpKafka")»
		#! HttpIngestor generated by Accordant
		«var inges = arti.comp as Ingestor »
		wget https://repo.spring.io/snapshot/org/springframework/cloud/stream/app/http-source-kafka/3.0.0-SNAPSHOT/http-source-kafka-3.0.0-SNAPSHOT.jar
		java -jar http-source-kafka-3.0.0-SNAPSHOT.jar --server.port=«inges.conn» --spring.cloud.stream.bindings.output.destination=source-topic
		«ELSEIF arti.comp instanceof co.edu.uniandes.accordant_fv.Estimator && arti.technology.equals("OpenScoring")»
		#! Estimator generated by Estimator
		«var estim = arti.comp as Estimator »
		publish pmml openscoring «estim.pmml»
		«ENDIF»
		«ENDIF»
		'''
	
	def SinkToMongoDB(DeploymentView deployView) {
		
	}
	
	def serviceToKubeService(DeploymentView deployView)  
		'''
		# generated by Accordant
		«FOR serv : deployView.services»
		apiVersion: v1
		kind: Service
		metadata:
		  name: «format(serv.name)»
		spec:
		  type: «serv.type»
		  selector:
		     component: «format(serv.name)»
		«IF serv.ports!==null»
			  ports:
			«FOR port: serv.ports»  - name: «port.name»
			    protocol: «port.protocol»
			    port: «port.port»
			    targetPort: «port.target»
			«ENDFOR»
		«ENDIF»
		---
		
		«ENDFOR»
		
		'''
		
	def deploymentToKubeDeployment(DeploymentView deployView) 	
		'''	
		# generated by Accordant
		«FOR dep : deployView.deployments»
		kind: Deployment
		apiVersion: apps/v1
		metadata:
		  name: «format(dep.name)»
		spec:
		  replicas: «dep.replicas»
		  selector:
		    matchLabels:
		      component: «format(dep.name)»
		«IF dep.strategy!==null»
		strategy:
		  type: «dep.strategy»
			«IF dep.strategy=="RollingUpdate"»
		  rollingUpdate:
		    maxSurge: «dep.maxSurge»
		    maxUnavailable: «dep.maxUnavail»
          	«ENDIF»
		«ENDIF»
		  template:
		«FOR pod : dep.pods»
			    metadata:
			      labels:
			        component: «format(dep.name)»
					«IF pod.restartPolicy!==null»    restartPolicy: «pod.restartPolicy»«ENDIF»
			    spec:
			      containers: 
			«FOR exenv: pod.envs»
				      - name: «format(exenv.name)»
				        image: «exenv.image»
				        «IF exenv.commands!==null && exenv.commands.size>0»
				        command: «exenv.commands»
				        «ENDIF»
				«IF exenv.vars!==null && exenv.vars.size>0»
					        env:
					«FOR envVar: exenv.vars»        - name: «envVar.name»
					          value: «envVar.value»
					«ENDFOR»
				«ENDIF»
				«IF exenv.ports!==null»
					        ports:
					«FOR port: exenv.ports»        - containerPort: «port»
					«ENDFOR»
				«ENDIF»
				«IF exenv.cpu_lim>0 || exenv.cpu_lim>0 ||exenv.cpu_req>0 || exenv.cpu_req>0»
					        resources:
					«IF exenv.cpu_lim>0 || exenv.mem_lim>0»
						          limits:
						«IF exenv.cpu_lim>0»            cpu: «exenv.cpu_lim»«ENDIF»
						«IF exenv.mem_lim>0»            memory: «exenv.mem_lim»M«ENDIF»
      				«ENDIF»
					«IF exenv.mem_req>0 || exenv.cpu_req>0»
						          requests:
						«IF exenv.cpu_req>0»            cpu: «exenv.cpu_req»«ENDIF»
						«IF exenv.mem_req>0»            memory: «exenv.mem_req»M«ENDIF»
    				    «ENDIF»   
				    «ENDIF»
				«ENDFOR»
 			«ENDFOR»
		---
		
 		«ENDFOR»
		
		''' 
		
	def deviceToKubeNode(DeploymentView deployView)  
		'''
		# generated by Accordant
		«FOR dev : deployView.devs»
		apiVersion: v1
		kind: Node
		metadata:
		  name: «dev.host»
		labels:
		  env: «format(deployView.name)»
				
		---

		«ENDFOR»		
		'''
		
	
}
