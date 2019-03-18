/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.accordant_dv.tests

import co.edu.uniandes.accordant_dv.DeploymentView
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(AdvlInjectorProvider)
class AdvlParsingTest {
	@Inject
	ParseHelper<DeploymentView> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}