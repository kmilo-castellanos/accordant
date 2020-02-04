/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.accordant_rq.parser.antlr;

import co.edu.uniandes.accordant_rq.parser.antlr.internal.InternalAinlParser;
import co.edu.uniandes.accordant_rq.services.AinlGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class AinlParser extends AbstractAntlrParser {

	@Inject
	private AinlGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAinlParser createParser(XtextTokenStream stream) {
		return new InternalAinlParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Project";
	}

	public AinlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AinlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
