# ArchiAndes to Accordant Importer
This a java eclipse project to import input packages, functional, and deployment views from [ArchiAndes](https://github.com/kmilo-castellanos/ArchInputs) database to Accordant models.
This importer migrates from ArchiAndes' projects, constraints, quality scenarios, and decisions to Accordant InputPackage models. Also, Draw.io (MxGraph) diagrams built using AccordantLib in ArchIandes are migrated to Accordant functional and deployment models.  

To run this importer, execute:

```
$ java -jar accordant-model-loader.jar  <project_name>* <mongoConn> <outputPaht>

```
Where <project_name> corresponds to the project name in ArchiAndes to be imported. The argument <mongoConn> is the mongodb connection string (by default: 'mongodb://127.0.0.1:3001/'). And <outputPaht> is the path where models (.xmi) will be generated (by default is the local folder).