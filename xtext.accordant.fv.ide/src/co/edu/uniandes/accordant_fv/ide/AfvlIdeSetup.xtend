/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.accordant_fv.ide

import co.edu.uniandes.accordant_fv.AfvlRuntimeModule
import co.edu.uniandes.accordant_fv.AfvlStandaloneSetup
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class AfvlIdeSetup extends AfvlStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new AfvlRuntimeModule, new AfvlIdeModule))
	}
	
}
