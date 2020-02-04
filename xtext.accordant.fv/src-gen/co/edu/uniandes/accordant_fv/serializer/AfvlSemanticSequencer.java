/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.accordant_fv.serializer;

import co.edu.uniandes.accordant_fv.Accordant_fvPackage;
import co.edu.uniandes.accordant_fv.Adaptor;
import co.edu.uniandes.accordant_fv.Distributor;
import co.edu.uniandes.accordant_fv.Estimator;
import co.edu.uniandes.accordant_fv.Event;
import co.edu.uniandes.accordant_fv.FunctionalView;
import co.edu.uniandes.accordant_fv.Ingestor;
import co.edu.uniandes.accordant_fv.Port;
import co.edu.uniandes.accordant_fv.ProcedureCall;
import co.edu.uniandes.accordant_fv.Role;
import co.edu.uniandes.accordant_fv.Sink;
import co.edu.uniandes.accordant_fv.Stream;
import co.edu.uniandes.accordant_fv.Transformer;
import co.edu.uniandes.accordant_fv.services.AfvlGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class AfvlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AfvlGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Accordant_fvPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Accordant_fvPackage.ADAPTOR:
				sequence_Adaptor(context, (Adaptor) semanticObject); 
				return; 
			case Accordant_fvPackage.DISTRIBUTOR:
				sequence_Distributor(context, (Distributor) semanticObject); 
				return; 
			case Accordant_fvPackage.ESTIMATOR:
				sequence_Estimator(context, (Estimator) semanticObject); 
				return; 
			case Accordant_fvPackage.EVENT:
				sequence_Event(context, (Event) semanticObject); 
				return; 
			case Accordant_fvPackage.FUNCTIONAL_VIEW:
				sequence_FunctionalView(context, (FunctionalView) semanticObject); 
				return; 
			case Accordant_fvPackage.INGESTOR:
				sequence_Ingestor(context, (Ingestor) semanticObject); 
				return; 
			case Accordant_fvPackage.PORT:
				sequence_Port(context, (Port) semanticObject); 
				return; 
			case Accordant_fvPackage.PROCEDURE_CALL:
				sequence_ProcedureCall(context, (ProcedureCall) semanticObject); 
				return; 
			case Accordant_fvPackage.ROLE:
				sequence_Role(context, (Role) semanticObject); 
				return; 
			case Accordant_fvPackage.SINK:
				sequence_Sink(context, (Sink) semanticObject); 
				return; 
			case Accordant_fvPackage.STREAM:
				sequence_Stream(context, (Stream) semanticObject); 
				return; 
			case Accordant_fvPackage.TRANSFORMER:
				sequence_Transformer(context, (Transformer) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Connector returns Adaptor
	 *     Adaptor returns Adaptor
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         delivery=DeliveryModel? 
	 *         synct=SyncType? 
	 *         notification=NotificationModel? 
	 *         buffering=Buffering? 
	 *         throughput=Throughput? 
	 *         props=EString? 
	 *         spoint=[SensitivityPoint|ID]? 
	 *         roles+=Role 
	 *         roles+=Role*
	 *     )
	 */
	protected void sequence_Adaptor(ISerializationContext context, Adaptor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Connector returns Distributor
	 *     Distributor returns Distributor
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         delivery=DeliveryModel? 
	 *         synct=SyncType? 
	 *         notification=NotificationModel? 
	 *         buffering=Buffering? 
	 *         throughput=Throughput? 
	 *         props=EString? 
	 *         spoint=[SensitivityPoint|ID]? 
	 *         roles+=Role 
	 *         roles+=Role*
	 *     )
	 */
	protected void sequence_Distributor(ISerializationContext context, Distributor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Component returns Estimator
	 *     Estimator returns Estimator
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         procModel=ProcessingModel? 
	 *         pmml=EString? 
	 *         spoint=[SensitivityPoint|ID]? 
	 *         ports+=Port 
	 *         ports+=Port*
	 *     )
	 */
	protected void sequence_Estimator(ISerializationContext context, Estimator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Connector returns Event
	 *     Event returns Event
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         delivery=DeliveryModel? 
	 *         synct=SyncType? 
	 *         notification=NotificationModel? 
	 *         buffering=Buffering? 
	 *         throughput=Throughput? 
	 *         props=EString? 
	 *         spoint=[SensitivityPoint|ID]? 
	 *         roles+=Role 
	 *         roles+=Role*
	 *     )
	 */
	protected void sequence_Event(ISerializationContext context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FunctionalView returns FunctionalView
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         project=[Project|ID] 
	 *         comps+=Component 
	 *         comps+=Component* 
	 *         conns+=Connector 
	 *         conns+=Connector*
	 *     )
	 */
	protected void sequence_FunctionalView(ISerializationContext context, FunctionalView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Component returns Ingestor
	 *     Ingestor returns Ingestor
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         type=AccessType 
	 *         procModel=ProcessingModel? 
	 *         conn=EString? 
	 *         format=EString? 
	 *         props=EString? 
	 *         spoint=[SensitivityPoint|ID]? 
	 *         ports+=Port 
	 *         ports+=Port*
	 *     )
	 */
	protected void sequence_Ingestor(ISerializationContext context, Ingestor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Port returns Port
	 *
	 * Constraint:
	 *     (name=ID type=PortType?)
	 */
	protected void sequence_Port(ISerializationContext context, Port semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Connector returns ProcedureCall
	 *     ProcedureCall returns ProcedureCall
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         delivery=DeliveryModel? 
	 *         synct=SyncType? 
	 *         notification=NotificationModel? 
	 *         buffering=Buffering? 
	 *         throughput=Throughput? 
	 *         props=EString? 
	 *         spoint=[SensitivityPoint|ID]? 
	 *         roles+=Role 
	 *         roles+=Role*
	 *     )
	 */
	protected void sequence_ProcedureCall(ISerializationContext context, ProcedureCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Role returns Role
	 *
	 * Constraint:
	 *     (name=ID type=RoleType? port=[Port|ID]?)
	 */
	protected void sequence_Role(ISerializationContext context, Role semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Component returns Sink
	 *     Sink returns Sink
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         type=AccessType 
	 *         procModel=ProcessingModel? 
	 *         conn=EString? 
	 *         format=EString? 
	 *         props=EString? 
	 *         spoint=[SensitivityPoint|ID]? 
	 *         ports+=Port 
	 *         ports+=Port*
	 *     )
	 */
	protected void sequence_Sink(ISerializationContext context, Sink semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Connector returns Stream
	 *     Stream returns Stream
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         delivery=DeliveryModel? 
	 *         synct=SyncType? 
	 *         notification=NotificationModel? 
	 *         buffering=Buffering? 
	 *         throughput=Throughput? 
	 *         props=EString? 
	 *         spoint=[SensitivityPoint|ID]? 
	 *         roles+=Role 
	 *         roles+=Role*
	 *     )
	 */
	protected void sequence_Stream(ISerializationContext context, Stream semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Component returns Transformer
	 *     Transformer returns Transformer
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         procModel=ProcessingModel? 
	 *         pmml=EString? 
	 *         spoint=[SensitivityPoint|ID]? 
	 *         ports+=Port 
	 *         ports+=Port*
	 *     )
	 */
	protected void sequence_Transformer(ISerializationContext context, Transformer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
