# ACCORDANT's Repository
This repository comprises eclipse (modeling) projects of ACCORDANT framework. The ACCORDANT is based on a domain-specific modeling approach to design big data analytics (BDA) applications based on architectural inputs, functional, and deployment views. The seven stepts of ACCORDANT process are described below. For more information, please visit the [ACCORDANT Site](https://sistemasproyectos.uniandes.edu.co/iniciativas/architlab/research/big-data-analytics/). A repository with use cases implemented with ACCORDANT can be found in [ACCORDANT-usecases](https://github.com/kmilo-castellanos/accordant-usecases).

![ACCORDANT Process](http://sistemasproyectos.uniandes.edu.co/iniciativas/architlab/wp-content/uploads/sites/7/2019/11/process.png)


## ACCORDANT's domain-specific language (DSL) projects:

Metamodels
* accordant_rq: Contains the ecore metamodel, diagram, and model java clases of architectural drivers
* accordant_fv: Contains ecore metamodel, diagram, and model java clases of the functional view
* accordant_dv: Contains ecore metamodel, diagram, and model java clases of the deployment view



Architectural Inputs DSL
* xtext.accordant.rq: Xtext Architectural Inputs specification, grammar, validators, and generators
* xtext.accordant.rq.ide: Xtext functional view IDE
* xtext.accordant.rq.tests: Xtext functional view tests
* xtext.accordant.rq.ui: Xtext functional view UI
* xtext.accordant.rq.ui.tests: Xtext functional view UI tests

Functional View DSL
* xtext.accordant.fv: Xtext functional view specification, grammar, validators, and generators
* xtext.accordant.fv.ide: Xtext functional view IDE
* xtext.accordant.fv.tests: Xtext functional view tests
* xtext.accordant.fv.ui: Xtext functional view UI
* xtext.accordant.fv.ui.tests: Xtext functional view UI tests

Deployment View DSL
* xtext.accordant.dv: Xtext deployment view specification, grammar, validators, and generators
* xtext.accordant.dv.ide: Xtext deployment view IDE
* xtext.accordant.dv.tests: Xtext deployment view tests
* xtext.accordant.dv.ui: Xtext deployment view UI
* xtext.accordant.dv.ui.tests: Xtext deployment view UI tests


ArchiAndes to Accordant Importer
* accordant-model-loader:: Java project to import Inputs and Draw.io Models stored in [ArchiAndes](https://github.com/kmilo-castellanos/ArchInputs).