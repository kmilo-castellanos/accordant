/*
 * generated by Xtext 2.18.0.M3
 */
package co.edu.uniandes.accordant_dv.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AdvlAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("co/edu/uniandes/accordant_dv/parser/antlr/internal/InternalAdvl.tokens");
	}
}
