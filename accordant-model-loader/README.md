# ArchiAndes to Accordant Importer
This a java eclipse project to import model from [ArchiAndes](https://github.com/kmilo-castellanos/ArchInputs) and generate code from those models. Input packages, functional, and deployment views can be imported from ArchiAndes database to Accordant models. In addition, code generators can be executed from imported models.
This importer migrates from ArchiAndes' projects, constraints, quality scenarios, and decisions to Accordant InputPackage models. Draw.io (MxGraph) diagrams built using AccordantLib in can be imported to Accordant functional and deployment models.  

### Import
To run the importer, execute:

```
$ java -jar accordant-model-loader.jar  <project_name>* <mongo_conn> <output_path>

```
Where <project_name> corresponds to the project name in ArchiAndes to be imported. The argument <mongo_conn> is the mongodb connection string (by default: 'mongodb://127.0.0.1:3001/'). And <output_path> is the path where models (.xmi) will be generated (by default is the current folder).

### Code Generation

To use the code generators for functional or deployment view, run:

co.edu.uniandes.accordant.codegenerator.FVCodeGenerator or DVCodeGenerator specifying the input xmi models.
