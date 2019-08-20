/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.accordant_dv.serializer;

import co.edu.uniandes.accordant_dv.Accordant_dvPackage;
import co.edu.uniandes.accordant_dv.Artifact;
import co.edu.uniandes.accordant_dv.Deployment;
import co.edu.uniandes.accordant_dv.DeploymentView;
import co.edu.uniandes.accordant_dv.Device;
import co.edu.uniandes.accordant_dv.EnvVar;
import co.edu.uniandes.accordant_dv.ExecEnvironment;
import co.edu.uniandes.accordant_dv.ExposedPort;
import co.edu.uniandes.accordant_dv.Pod;
import co.edu.uniandes.accordant_dv.ServerlessEnv;
import co.edu.uniandes.accordant_dv.Service;
import co.edu.uniandes.accordant_dv.services.AdvlGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class AdvlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AdvlGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Accordant_dvPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Accordant_dvPackage.ARTIFACT:
				sequence_Artifact(context, (Artifact) semanticObject); 
				return; 
			case Accordant_dvPackage.DEPLOYMENT:
				sequence_Deployment(context, (Deployment) semanticObject); 
				return; 
			case Accordant_dvPackage.DEPLOYMENT_VIEW:
				sequence_DeploymentView(context, (DeploymentView) semanticObject); 
				return; 
			case Accordant_dvPackage.DEVICE:
				sequence_Device(context, (Device) semanticObject); 
				return; 
			case Accordant_dvPackage.ENV_VAR:
				sequence_EnvVar(context, (EnvVar) semanticObject); 
				return; 
			case Accordant_dvPackage.EXEC_ENVIRONMENT:
				sequence_ExecEnvironment(context, (ExecEnvironment) semanticObject); 
				return; 
			case Accordant_dvPackage.EXPOSED_PORT:
				sequence_ExposedPort(context, (ExposedPort) semanticObject); 
				return; 
			case Accordant_dvPackage.POD:
				sequence_Pod(context, (Pod) semanticObject); 
				return; 
			case Accordant_dvPackage.SERVERLESS_ENV:
				sequence_ServerlessEnv(context, (ServerlessEnv) semanticObject); 
				return; 
			case Accordant_dvPackage.SERVICE:
				sequence_Service(context, (Service) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Artifact returns Artifact
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         component=EString? 
	 *         connector=EString? 
	 *         paas=[ExecEnvironment|ID]? 
	 *         saas=[ServerlessEnv|ID]? 
	 *         props=EString?
	 *     )
	 */
	protected void sequence_Artifact(ISerializationContext context, Artifact semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DeploymentView returns DeploymentView
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (devs+=Device devs+=Device*)? 
	 *         (deployments+=Deployment deployments+=Deployment*)? 
	 *         (services+=Service services+=Service*)? 
	 *         (serverless+=ServerlessEnv serverless+=ServerlessEnv*)? 
	 *         artifacts+=Artifact 
	 *         artifacts+=Artifact*
	 *     )
	 */
	protected void sequence_DeploymentView(ISerializationContext context, DeploymentView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Deployment returns Deployment
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         replicas=EInt? 
	 *         maxSurge=EInt? 
	 *         maxUnavail=EInt? 
	 *         pods+=Pod 
	 *         pods+=Pod*
	 *     )
	 */
	protected void sequence_Deployment(ISerializationContext context, Deployment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Device returns Device
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         host=EString? 
	 *         type=TypeDevice? 
	 *         cpu=EInt? 
	 *         storage=EInt? 
	 *         mem=EInt?
	 *     )
	 */
	protected void sequence_Device(ISerializationContext context, Device semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnvVar returns EnvVar
	 *
	 * Constraint:
	 *     (name=EString value=EString)?
	 */
	protected void sequence_EnvVar(ISerializationContext context, EnvVar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExecEnvironment returns ExecEnvironment
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         image=EString? 
	 *         cpu_lim=EFloat? 
	 *         mem_lim=EInt? 
	 *         cpu_req=EFloat? 
	 *         mem_req=EInt? 
	 *         (ports+=EInt ports+=EInt*)? 
	 *         (commands+=EString commands+=EString*)? 
	 *         (vars+=EnvVar vars+=EnvVar*)?
	 *     )
	 */
	protected void sequence_ExecEnvironment(ISerializationContext context, ExecEnvironment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExposedPort returns ExposedPort
	 *
	 * Constraint:
	 *     (name=ID protocol=EString? target=EString? port=EInt? (exposes+=[Pod|ID] exposes+=[Pod|ID]*)?)
	 */
	protected void sequence_ExposedPort(ISerializationContext context, ExposedPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pod returns Pod
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         host=EString? 
	 *         node=[Device|ID]? 
	 *         restartPolicy=EString? 
	 *         envs+=ExecEnvironment 
	 *         envs+=ExecEnvironment*
	 *     )
	 */
	protected void sequence_Pod(ISerializationContext context, Pod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ServerlessEnv returns ServerlessEnv
	 *
	 * Constraint:
	 *     (name=ID provider=EString? memory=EFloat? timeout=EInt?)
	 */
	protected void sequence_ServerlessEnv(ISerializationContext context, ServerlessEnv semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Service returns Service
	 *
	 * Constraint:
	 *     (name=ID type=EString? extAccess=EString? ports+=ExposedPort ports+=ExposedPort*)
	 */
	protected void sequence_Service(ISerializationContext context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
