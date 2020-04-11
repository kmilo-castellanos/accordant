# ArchiAndes to Accordant Importer
This a java eclipse project to import input packges, functional view, and deployment view from [ArchiAndes](https://github.com/kmilo-castellanos/ArchInputs) database.
This importer migrates projects, constraints, quality scenarios, and decisions to Input package Models. Also, Draw.io (MxGraph) diagrams built using AccordantLib are migrated to functional and deployment models.  

To run this importer, execute:

```
$ java -jar accordant-model-loader.jar  <project_name>* <mongoConn> <outputPaht>

```
Where <project_name> corresponds to the project in ArchiAndes name to be imported. The argument <mongoConn> is the mongodb connection string (by default: 'mongodb://127.0.0.1:3001/'). And <outputPaht> is the path where models (.xmi) will be generated (by default is the local folder).