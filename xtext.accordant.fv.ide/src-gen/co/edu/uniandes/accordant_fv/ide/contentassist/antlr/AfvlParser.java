/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.accordant_fv.ide.contentassist.antlr;

import co.edu.uniandes.accordant_fv.ide.contentassist.antlr.internal.InternalAfvlParser;
import co.edu.uniandes.accordant_fv.services.AfvlGrammarAccess;
import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class AfvlParser extends AbstractContentAssistParser {

	@Inject
	private AfvlGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalAfvlParser createParser() {
		InternalAfvlParser result = new InternalAfvlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getConnectorAccess().getAlternatives(), "rule__Connector__Alternatives");
					put(grammarAccess.getComponentAccess().getAlternatives(), "rule__Component__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getDeliveryModelAccess().getAlternatives(), "rule__DeliveryModel__Alternatives");
					put(grammarAccess.getSyncTypeAccess().getAlternatives(), "rule__SyncType__Alternatives");
					put(grammarAccess.getPortTypeAccess().getAlternatives(), "rule__PortType__Alternatives");
					put(grammarAccess.getRoleTypeAccess().getAlternatives(), "rule__RoleType__Alternatives");
					put(grammarAccess.getNotificationModelAccess().getAlternatives(), "rule__NotificationModel__Alternatives");
					put(grammarAccess.getBufferingAccess().getAlternatives(), "rule__Buffering__Alternatives");
					put(grammarAccess.getThroughputAccess().getAlternatives(), "rule__Throughput__Alternatives");
					put(grammarAccess.getProcessingModelAccess().getAlternatives(), "rule__ProcessingModel__Alternatives");
					put(grammarAccess.getAccessTypeAccess().getAlternatives(), "rule__AccessType__Alternatives");
					put(grammarAccess.getFunctionalViewAccess().getGroup(), "rule__FunctionalView__Group__0");
					put(grammarAccess.getFunctionalViewAccess().getGroup_9(), "rule__FunctionalView__Group_9__0");
					put(grammarAccess.getFunctionalViewAccess().getGroup_14(), "rule__FunctionalView__Group_14__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getPortAccess().getGroup(), "rule__Port__Group__0");
					put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
					put(grammarAccess.getStreamAccess().getGroup(), "rule__Stream__Group__0");
					put(grammarAccess.getStreamAccess().getGroup_3(), "rule__Stream__Group_3__0");
					put(grammarAccess.getStreamAccess().getGroup_4(), "rule__Stream__Group_4__0");
					put(grammarAccess.getStreamAccess().getGroup_5(), "rule__Stream__Group_5__0");
					put(grammarAccess.getStreamAccess().getGroup_6(), "rule__Stream__Group_6__0");
					put(grammarAccess.getStreamAccess().getGroup_7(), "rule__Stream__Group_7__0");
					put(grammarAccess.getStreamAccess().getGroup_8(), "rule__Stream__Group_8__0");
					put(grammarAccess.getStreamAccess().getGroup_9(), "rule__Stream__Group_9__0");
					put(grammarAccess.getStreamAccess().getGroup_14(), "rule__Stream__Group_14__0");
					put(grammarAccess.getAdaptorAccess().getGroup(), "rule__Adaptor__Group__0");
					put(grammarAccess.getAdaptorAccess().getGroup_3(), "rule__Adaptor__Group_3__0");
					put(grammarAccess.getAdaptorAccess().getGroup_4(), "rule__Adaptor__Group_4__0");
					put(grammarAccess.getAdaptorAccess().getGroup_5(), "rule__Adaptor__Group_5__0");
					put(grammarAccess.getAdaptorAccess().getGroup_6(), "rule__Adaptor__Group_6__0");
					put(grammarAccess.getAdaptorAccess().getGroup_7(), "rule__Adaptor__Group_7__0");
					put(grammarAccess.getAdaptorAccess().getGroup_8(), "rule__Adaptor__Group_8__0");
					put(grammarAccess.getAdaptorAccess().getGroup_9(), "rule__Adaptor__Group_9__0");
					put(grammarAccess.getAdaptorAccess().getGroup_13(), "rule__Adaptor__Group_13__0");
					put(grammarAccess.getDistributorAccess().getGroup(), "rule__Distributor__Group__0");
					put(grammarAccess.getDistributorAccess().getGroup_3(), "rule__Distributor__Group_3__0");
					put(grammarAccess.getDistributorAccess().getGroup_4(), "rule__Distributor__Group_4__0");
					put(grammarAccess.getDistributorAccess().getGroup_5(), "rule__Distributor__Group_5__0");
					put(grammarAccess.getDistributorAccess().getGroup_6(), "rule__Distributor__Group_6__0");
					put(grammarAccess.getDistributorAccess().getGroup_7(), "rule__Distributor__Group_7__0");
					put(grammarAccess.getDistributorAccess().getGroup_8(), "rule__Distributor__Group_8__0");
					put(grammarAccess.getDistributorAccess().getGroup_9(), "rule__Distributor__Group_9__0");
					put(grammarAccess.getDistributorAccess().getGroup_13(), "rule__Distributor__Group_13__0");
					put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
					put(grammarAccess.getEventAccess().getGroup_3(), "rule__Event__Group_3__0");
					put(grammarAccess.getEventAccess().getGroup_4(), "rule__Event__Group_4__0");
					put(grammarAccess.getEventAccess().getGroup_5(), "rule__Event__Group_5__0");
					put(grammarAccess.getEventAccess().getGroup_6(), "rule__Event__Group_6__0");
					put(grammarAccess.getEventAccess().getGroup_7(), "rule__Event__Group_7__0");
					put(grammarAccess.getEventAccess().getGroup_8(), "rule__Event__Group_8__0");
					put(grammarAccess.getEventAccess().getGroup_9(), "rule__Event__Group_9__0");
					put(grammarAccess.getEventAccess().getGroup_14(), "rule__Event__Group_14__0");
					put(grammarAccess.getProcedureCallAccess().getGroup(), "rule__ProcedureCall__Group__0");
					put(grammarAccess.getProcedureCallAccess().getGroup_3(), "rule__ProcedureCall__Group_3__0");
					put(grammarAccess.getProcedureCallAccess().getGroup_4(), "rule__ProcedureCall__Group_4__0");
					put(grammarAccess.getProcedureCallAccess().getGroup_5(), "rule__ProcedureCall__Group_5__0");
					put(grammarAccess.getProcedureCallAccess().getGroup_6(), "rule__ProcedureCall__Group_6__0");
					put(grammarAccess.getProcedureCallAccess().getGroup_7(), "rule__ProcedureCall__Group_7__0");
					put(grammarAccess.getProcedureCallAccess().getGroup_8(), "rule__ProcedureCall__Group_8__0");
					put(grammarAccess.getProcedureCallAccess().getGroup_9(), "rule__ProcedureCall__Group_9__0");
					put(grammarAccess.getProcedureCallAccess().getGroup_14(), "rule__ProcedureCall__Group_14__0");
					put(grammarAccess.getTransformerAccess().getGroup(), "rule__Transformer__Group__0");
					put(grammarAccess.getTransformerAccess().getGroup_3(), "rule__Transformer__Group_3__0");
					put(grammarAccess.getTransformerAccess().getGroup_4(), "rule__Transformer__Group_4__0");
					put(grammarAccess.getTransformerAccess().getGroup_5(), "rule__Transformer__Group_5__0");
					put(grammarAccess.getTransformerAccess().getGroup_10(), "rule__Transformer__Group_10__0");
					put(grammarAccess.getEstimatorAccess().getGroup(), "rule__Estimator__Group__0");
					put(grammarAccess.getEstimatorAccess().getGroup_3(), "rule__Estimator__Group_3__0");
					put(grammarAccess.getEstimatorAccess().getGroup_4(), "rule__Estimator__Group_4__0");
					put(grammarAccess.getEstimatorAccess().getGroup_5(), "rule__Estimator__Group_5__0");
					put(grammarAccess.getEstimatorAccess().getGroup_10(), "rule__Estimator__Group_10__0");
					put(grammarAccess.getIngestorAccess().getGroup(), "rule__Ingestor__Group__0");
					put(grammarAccess.getIngestorAccess().getGroup_6(), "rule__Ingestor__Group_6__0");
					put(grammarAccess.getIngestorAccess().getGroup_7(), "rule__Ingestor__Group_7__0");
					put(grammarAccess.getIngestorAccess().getGroup_8(), "rule__Ingestor__Group_8__0");
					put(grammarAccess.getIngestorAccess().getGroup_9(), "rule__Ingestor__Group_9__0");
					put(grammarAccess.getIngestorAccess().getGroup_10(), "rule__Ingestor__Group_10__0");
					put(grammarAccess.getIngestorAccess().getGroup_15(), "rule__Ingestor__Group_15__0");
					put(grammarAccess.getSinkAccess().getGroup(), "rule__Sink__Group__0");
					put(grammarAccess.getSinkAccess().getGroup_6(), "rule__Sink__Group_6__0");
					put(grammarAccess.getSinkAccess().getGroup_7(), "rule__Sink__Group_7__0");
					put(grammarAccess.getSinkAccess().getGroup_8(), "rule__Sink__Group_8__0");
					put(grammarAccess.getSinkAccess().getGroup_9(), "rule__Sink__Group_9__0");
					put(grammarAccess.getSinkAccess().getGroup_10(), "rule__Sink__Group_10__0");
					put(grammarAccess.getSinkAccess().getGroup_15(), "rule__Sink__Group_15__0");
					put(grammarAccess.getFunctionalViewAccess().getNameAssignment_1(), "rule__FunctionalView__NameAssignment_1");
					put(grammarAccess.getFunctionalViewAccess().getProjectAssignment_4(), "rule__FunctionalView__ProjectAssignment_4");
					put(grammarAccess.getFunctionalViewAccess().getCompsAssignment_8(), "rule__FunctionalView__CompsAssignment_8");
					put(grammarAccess.getFunctionalViewAccess().getCompsAssignment_9_1(), "rule__FunctionalView__CompsAssignment_9_1");
					put(grammarAccess.getFunctionalViewAccess().getConnsAssignment_13(), "rule__FunctionalView__ConnsAssignment_13");
					put(grammarAccess.getFunctionalViewAccess().getConnsAssignment_14_1(), "rule__FunctionalView__ConnsAssignment_14_1");
					put(grammarAccess.getPortAccess().getNameAssignment_2(), "rule__Port__NameAssignment_2");
					put(grammarAccess.getPortAccess().getTypeAssignment_4(), "rule__Port__TypeAssignment_4");
					put(grammarAccess.getRoleAccess().getNameAssignment_2(), "rule__Role__NameAssignment_2");
					put(grammarAccess.getRoleAccess().getTypeAssignment_4(), "rule__Role__TypeAssignment_4");
					put(grammarAccess.getRoleAccess().getPortAssignment_6(), "rule__Role__PortAssignment_6");
					put(grammarAccess.getStreamAccess().getNameAssignment_1(), "rule__Stream__NameAssignment_1");
					put(grammarAccess.getStreamAccess().getDeliveryAssignment_3_2(), "rule__Stream__DeliveryAssignment_3_2");
					put(grammarAccess.getStreamAccess().getSynctAssignment_4_2(), "rule__Stream__SynctAssignment_4_2");
					put(grammarAccess.getStreamAccess().getNotificationAssignment_5_2(), "rule__Stream__NotificationAssignment_5_2");
					put(grammarAccess.getStreamAccess().getBufferingAssignment_6_2(), "rule__Stream__BufferingAssignment_6_2");
					put(grammarAccess.getStreamAccess().getThroughputAssignment_7_2(), "rule__Stream__ThroughputAssignment_7_2");
					put(grammarAccess.getStreamAccess().getPropsAssignment_8_2(), "rule__Stream__PropsAssignment_8_2");
					put(grammarAccess.getStreamAccess().getDecisionAssignment_9_2(), "rule__Stream__DecisionAssignment_9_2");
					put(grammarAccess.getStreamAccess().getRolesAssignment_13(), "rule__Stream__RolesAssignment_13");
					put(grammarAccess.getStreamAccess().getRolesAssignment_14_1(), "rule__Stream__RolesAssignment_14_1");
					put(grammarAccess.getAdaptorAccess().getNameAssignment_1(), "rule__Adaptor__NameAssignment_1");
					put(grammarAccess.getAdaptorAccess().getDeliveryAssignment_3_2(), "rule__Adaptor__DeliveryAssignment_3_2");
					put(grammarAccess.getAdaptorAccess().getSynctAssignment_4_2(), "rule__Adaptor__SynctAssignment_4_2");
					put(grammarAccess.getAdaptorAccess().getNotificationAssignment_5_2(), "rule__Adaptor__NotificationAssignment_5_2");
					put(grammarAccess.getAdaptorAccess().getBufferingAssignment_6_2(), "rule__Adaptor__BufferingAssignment_6_2");
					put(grammarAccess.getAdaptorAccess().getThroughputAssignment_7_2(), "rule__Adaptor__ThroughputAssignment_7_2");
					put(grammarAccess.getAdaptorAccess().getPropsAssignment_8_2(), "rule__Adaptor__PropsAssignment_8_2");
					put(grammarAccess.getAdaptorAccess().getDecisionAssignment_9_2(), "rule__Adaptor__DecisionAssignment_9_2");
					put(grammarAccess.getAdaptorAccess().getRolesAssignment_12(), "rule__Adaptor__RolesAssignment_12");
					put(grammarAccess.getAdaptorAccess().getRolesAssignment_13_1(), "rule__Adaptor__RolesAssignment_13_1");
					put(grammarAccess.getDistributorAccess().getNameAssignment_1(), "rule__Distributor__NameAssignment_1");
					put(grammarAccess.getDistributorAccess().getDeliveryAssignment_3_2(), "rule__Distributor__DeliveryAssignment_3_2");
					put(grammarAccess.getDistributorAccess().getSynctAssignment_4_2(), "rule__Distributor__SynctAssignment_4_2");
					put(grammarAccess.getDistributorAccess().getNotificationAssignment_5_2(), "rule__Distributor__NotificationAssignment_5_2");
					put(grammarAccess.getDistributorAccess().getBufferingAssignment_6_2(), "rule__Distributor__BufferingAssignment_6_2");
					put(grammarAccess.getDistributorAccess().getThroughputAssignment_7_2(), "rule__Distributor__ThroughputAssignment_7_2");
					put(grammarAccess.getDistributorAccess().getPropsAssignment_8_2(), "rule__Distributor__PropsAssignment_8_2");
					put(grammarAccess.getDistributorAccess().getDecisionAssignment_9_2(), "rule__Distributor__DecisionAssignment_9_2");
					put(grammarAccess.getDistributorAccess().getRolesAssignment_12(), "rule__Distributor__RolesAssignment_12");
					put(grammarAccess.getDistributorAccess().getRolesAssignment_13_1(), "rule__Distributor__RolesAssignment_13_1");
					put(grammarAccess.getEventAccess().getNameAssignment_1(), "rule__Event__NameAssignment_1");
					put(grammarAccess.getEventAccess().getDeliveryAssignment_3_2(), "rule__Event__DeliveryAssignment_3_2");
					put(grammarAccess.getEventAccess().getSynctAssignment_4_2(), "rule__Event__SynctAssignment_4_2");
					put(grammarAccess.getEventAccess().getNotificationAssignment_5_2(), "rule__Event__NotificationAssignment_5_2");
					put(grammarAccess.getEventAccess().getBufferingAssignment_6_2(), "rule__Event__BufferingAssignment_6_2");
					put(grammarAccess.getEventAccess().getThroughputAssignment_7_2(), "rule__Event__ThroughputAssignment_7_2");
					put(grammarAccess.getEventAccess().getPropsAssignment_8_2(), "rule__Event__PropsAssignment_8_2");
					put(grammarAccess.getEventAccess().getDecisionAssignment_9_2(), "rule__Event__DecisionAssignment_9_2");
					put(grammarAccess.getEventAccess().getRolesAssignment_13(), "rule__Event__RolesAssignment_13");
					put(grammarAccess.getEventAccess().getRolesAssignment_14_1(), "rule__Event__RolesAssignment_14_1");
					put(grammarAccess.getProcedureCallAccess().getNameAssignment_1(), "rule__ProcedureCall__NameAssignment_1");
					put(grammarAccess.getProcedureCallAccess().getDeliveryAssignment_3_2(), "rule__ProcedureCall__DeliveryAssignment_3_2");
					put(grammarAccess.getProcedureCallAccess().getSynctAssignment_4_2(), "rule__ProcedureCall__SynctAssignment_4_2");
					put(grammarAccess.getProcedureCallAccess().getNotificationAssignment_5_2(), "rule__ProcedureCall__NotificationAssignment_5_2");
					put(grammarAccess.getProcedureCallAccess().getBufferingAssignment_6_2(), "rule__ProcedureCall__BufferingAssignment_6_2");
					put(grammarAccess.getProcedureCallAccess().getThroughputAssignment_7_2(), "rule__ProcedureCall__ThroughputAssignment_7_2");
					put(grammarAccess.getProcedureCallAccess().getPropsAssignment_8_2(), "rule__ProcedureCall__PropsAssignment_8_2");
					put(grammarAccess.getProcedureCallAccess().getDecisionAssignment_9_2(), "rule__ProcedureCall__DecisionAssignment_9_2");
					put(grammarAccess.getProcedureCallAccess().getRolesAssignment_13(), "rule__ProcedureCall__RolesAssignment_13");
					put(grammarAccess.getProcedureCallAccess().getRolesAssignment_14_1(), "rule__ProcedureCall__RolesAssignment_14_1");
					put(grammarAccess.getTransformerAccess().getNameAssignment_1(), "rule__Transformer__NameAssignment_1");
					put(grammarAccess.getTransformerAccess().getProcModelAssignment_3_2(), "rule__Transformer__ProcModelAssignment_3_2");
					put(grammarAccess.getTransformerAccess().getPmmlAssignment_4_2(), "rule__Transformer__PmmlAssignment_4_2");
					put(grammarAccess.getTransformerAccess().getDecisionAssignment_5_2(), "rule__Transformer__DecisionAssignment_5_2");
					put(grammarAccess.getTransformerAccess().getPortsAssignment_9(), "rule__Transformer__PortsAssignment_9");
					put(grammarAccess.getTransformerAccess().getPortsAssignment_10_1(), "rule__Transformer__PortsAssignment_10_1");
					put(grammarAccess.getEstimatorAccess().getNameAssignment_1(), "rule__Estimator__NameAssignment_1");
					put(grammarAccess.getEstimatorAccess().getProcModelAssignment_3_2(), "rule__Estimator__ProcModelAssignment_3_2");
					put(grammarAccess.getEstimatorAccess().getPmmlAssignment_4_2(), "rule__Estimator__PmmlAssignment_4_2");
					put(grammarAccess.getEstimatorAccess().getDecisionAssignment_5_2(), "rule__Estimator__DecisionAssignment_5_2");
					put(grammarAccess.getEstimatorAccess().getPortsAssignment_9(), "rule__Estimator__PortsAssignment_9");
					put(grammarAccess.getEstimatorAccess().getPortsAssignment_10_1(), "rule__Estimator__PortsAssignment_10_1");
					put(grammarAccess.getIngestorAccess().getNameAssignment_1(), "rule__Ingestor__NameAssignment_1");
					put(grammarAccess.getIngestorAccess().getTypeAssignment_5(), "rule__Ingestor__TypeAssignment_5");
					put(grammarAccess.getIngestorAccess().getProcModelAssignment_6_2(), "rule__Ingestor__ProcModelAssignment_6_2");
					put(grammarAccess.getIngestorAccess().getConnAssignment_7_2(), "rule__Ingestor__ConnAssignment_7_2");
					put(grammarAccess.getIngestorAccess().getFormatAssignment_8_2(), "rule__Ingestor__FormatAssignment_8_2");
					put(grammarAccess.getIngestorAccess().getPropsAssignment_9_2(), "rule__Ingestor__PropsAssignment_9_2");
					put(grammarAccess.getIngestorAccess().getDecisionAssignment_10_2(), "rule__Ingestor__DecisionAssignment_10_2");
					put(grammarAccess.getIngestorAccess().getPortsAssignment_14(), "rule__Ingestor__PortsAssignment_14");
					put(grammarAccess.getIngestorAccess().getPortsAssignment_15_1(), "rule__Ingestor__PortsAssignment_15_1");
					put(grammarAccess.getSinkAccess().getNameAssignment_1(), "rule__Sink__NameAssignment_1");
					put(grammarAccess.getSinkAccess().getTypeAssignment_5(), "rule__Sink__TypeAssignment_5");
					put(grammarAccess.getSinkAccess().getProcModelAssignment_6_2(), "rule__Sink__ProcModelAssignment_6_2");
					put(grammarAccess.getSinkAccess().getConnAssignment_7_2(), "rule__Sink__ConnAssignment_7_2");
					put(grammarAccess.getSinkAccess().getFormatAssignment_8_2(), "rule__Sink__FormatAssignment_8_2");
					put(grammarAccess.getSinkAccess().getPropsAssignment_9_2(), "rule__Sink__PropsAssignment_9_2");
					put(grammarAccess.getSinkAccess().getDecisionAssignment_10_2(), "rule__Sink__DecisionAssignment_10_2");
					put(grammarAccess.getSinkAccess().getPortsAssignment_14(), "rule__Sink__PortsAssignment_14");
					put(grammarAccess.getSinkAccess().getPortsAssignment_15_1(), "rule__Sink__PortsAssignment_15_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AfvlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AfvlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
