/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.accordant_rq.ide.contentassist.antlr;

import co.edu.uniandes.accordant_rq.ide.contentassist.antlr.internal.InternalAinlParser;
import co.edu.uniandes.accordant_rq.services.AinlGrammarAccess;
import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class AinlParser extends AbstractContentAssistParser {

	@Inject
	private AinlGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalAinlParser createParser() {
		InternalAinlParser result = new InternalAinlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEFloatAccess().getAlternatives_4_0(), "rule__EFloat__Alternatives_4_0");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getQAMetricAccess().getAlternatives(), "rule__QAMetric__Alternatives");
					put(grammarAccess.getMetricUnitAccess().getAlternatives(), "rule__MetricUnit__Alternatives");
					put(grammarAccess.getQAttributeAccess().getAlternatives(), "rule__QAttribute__Alternatives");
					put(grammarAccess.getInputPackageAccess().getGroup(), "rule__InputPackage__Group__0");
					put(grammarAccess.getInputPackageAccess().getGroup_7(), "rule__InputPackage__Group_7__0");
					put(grammarAccess.getInputPackageAccess().getGroup_12(), "rule__InputPackage__Group_12__0");
					put(grammarAccess.getQScenarioAccess().getGroup(), "rule__QScenario__Group__0");
					put(grammarAccess.getEFloatAccess().getGroup(), "rule__EFloat__Group__0");
					put(grammarAccess.getEFloatAccess().getGroup_4(), "rule__EFloat__Group_4__0");
					put(grammarAccess.getAnalyzedQSAccess().getGroup(), "rule__AnalyzedQS__Group__0");
					put(grammarAccess.getAnalyzedQSAccess().getGroup_2(), "rule__AnalyzedQS__Group_2__0");
					put(grammarAccess.getAnalyzedQSAccess().getGroup_6(), "rule__AnalyzedQS__Group_6__0");
					put(grammarAccess.getSensitivityPointAccess().getGroup(), "rule__SensitivityPoint__Group__0");
					put(grammarAccess.getSensitivityPointAccess().getGroup_4(), "rule__SensitivityPoint__Group_4__0");
					put(grammarAccess.getSensitivityPointAccess().getGroup_5(), "rule__SensitivityPoint__Group_5__0");
					put(grammarAccess.getSensitivityPointAccess().getGroup_9(), "rule__SensitivityPoint__Group_9__0");
					put(grammarAccess.getTacticAccess().getGroup(), "rule__Tactic__Group__0");
					put(grammarAccess.getTacticAccess().getGroup_4(), "rule__Tactic__Group_4__0");
					put(grammarAccess.getTacticAccess().getGroup_5(), "rule__Tactic__Group_5__0");
					put(grammarAccess.getTacticAccess().getGroup_6(), "rule__Tactic__Group_6__0");
					put(grammarAccess.getTacticAccess().getGroup_7(), "rule__Tactic__Group_7__0");
					put(grammarAccess.getTacticAccess().getGroup_8(), "rule__Tactic__Group_8__0");
					put(grammarAccess.getInputPackageAccess().getNameAssignment_2(), "rule__InputPackage__NameAssignment_2");
					put(grammarAccess.getInputPackageAccess().getScenariosAssignment_6(), "rule__InputPackage__ScenariosAssignment_6");
					put(grammarAccess.getInputPackageAccess().getScenariosAssignment_7_1(), "rule__InputPackage__ScenariosAssignment_7_1");
					put(grammarAccess.getInputPackageAccess().getGtacticsAssignment_11(), "rule__InputPackage__GtacticsAssignment_11");
					put(grammarAccess.getInputPackageAccess().getGtacticsAssignment_12_1(), "rule__InputPackage__GtacticsAssignment_12_1");
					put(grammarAccess.getQScenarioAccess().getQAttributeAssignment_5(), "rule__QScenario__QAttributeAssignment_5");
					put(grammarAccess.getQScenarioAccess().getMeasureAssignment_8(), "rule__QScenario__MeasureAssignment_8");
					put(grammarAccess.getQScenarioAccess().getMinValueAssignment_11(), "rule__QScenario__MinValueAssignment_11");
					put(grammarAccess.getQScenarioAccess().getMaxValueAssignment_14(), "rule__QScenario__MaxValueAssignment_14");
					put(grammarAccess.getQScenarioAccess().getUnitAssignment_17(), "rule__QScenario__UnitAssignment_17");
					put(grammarAccess.getQScenarioAccess().getStimulusAssignment_20(), "rule__QScenario__StimulusAssignment_20");
					put(grammarAccess.getQScenarioAccess().getEnvironmentAssignment_23(), "rule__QScenario__EnvironmentAssignment_23");
					put(grammarAccess.getAnalyzedQSAccess().getReasoningAssignment_2_2(), "rule__AnalyzedQS__ReasoningAssignment_2_2");
					put(grammarAccess.getAnalyzedQSAccess().getQsAssignment_5(), "rule__AnalyzedQS__QsAssignment_5");
					put(grammarAccess.getAnalyzedQSAccess().getPointsAssignment_6_2(), "rule__AnalyzedQS__PointsAssignment_6_2");
					put(grammarAccess.getSensitivityPointAccess().getIsRiskAssignment_0(), "rule__SensitivityPoint__IsRiskAssignment_0");
					put(grammarAccess.getSensitivityPointAccess().getNameAssignment_2(), "rule__SensitivityPoint__NameAssignment_2");
					put(grammarAccess.getSensitivityPointAccess().getRationaleAssignment_4_1(), "rule__SensitivityPoint__RationaleAssignment_4_1");
					put(grammarAccess.getSensitivityPointAccess().getCodeAssignment_5_1(), "rule__SensitivityPoint__CodeAssignment_5_1");
					put(grammarAccess.getSensitivityPointAccess().getTacticAssignment_8(), "rule__SensitivityPoint__TacticAssignment_8");
					put(grammarAccess.getSensitivityPointAccess().getTacticAssignment_9_1(), "rule__SensitivityPoint__TacticAssignment_9_1");
					put(grammarAccess.getTacticAccess().getNameAssignment_2(), "rule__Tactic__NameAssignment_2");
					put(grammarAccess.getTacticAccess().getQAttributeAssignment_4_2(), "rule__Tactic__QAttributeAssignment_4_2");
					put(grammarAccess.getTacticAccess().getRationaleAssignment_5_2(), "rule__Tactic__RationaleAssignment_5_2");
					put(grammarAccess.getTacticAccess().getStimulusAssignment_6_2(), "rule__Tactic__StimulusAssignment_6_2");
					put(grammarAccess.getTacticAccess().getResponseAssignment_7_2(), "rule__Tactic__ResponseAssignment_7_2");
					put(grammarAccess.getTacticAccess().getViewpointAssignment_8_2(), "rule__Tactic__ViewpointAssignment_8_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AinlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AinlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}