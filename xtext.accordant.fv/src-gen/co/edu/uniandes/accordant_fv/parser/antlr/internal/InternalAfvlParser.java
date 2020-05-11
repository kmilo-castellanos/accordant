package co.edu.uniandes.accordant_fv.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.edu.uniandes.accordant_fv.services.AfvlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAfvlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FunctionalView'", "'use'", "'project'", "'{'", "'Components'", "','", "'}'", "'Connectors'", "'Port'", "':'", "'fields'", "'Role'", "'->'", "'Stream'", "'delivery'", "'sync'", "'notification'", "'buffering'", "'throughput'", "'props'", "'decision'", "'roles'", "'Adaptor'", "'Distributor'", "'Event'", "'ProcCall'", "'Transformer'", "'procModel'", "'pmml'", "'ports'", "'Estimator'", "'Ingestor'", "'type'", "'conn'", "'format'", "'Sink'", "'order'", "'BEST_EFFORT'", "'AT_LEAST_ONCE'", "'AT_MOST_ONCE'", "'EXACTLY_ONCE'", "'ASYNC'", "'SYNC'", "'REQUIRED'", "'PROVIDED'", "'OUT'", "'IN'", "'POLLED'", "'PUBSUB'", "'QUEUED'", "'CENTRAL'", "'BUFFERED'", "'UNBUFFERED'", "'ATOMIC'", "'HIGH_ORDER'", "'STREAM'", "'BATCH'", "'MICROBATCH'", "'HTTP'", "'DATABASE'", "'FILESYSTEM'", "'HDFS'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAfvlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAfvlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAfvlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAfvl.g"; }



     	private AfvlGrammarAccess grammarAccess;

        public InternalAfvlParser(TokenStream input, AfvlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FunctionalView";
       	}

       	@Override
       	protected AfvlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFunctionalView"
    // InternalAfvl.g:65:1: entryRuleFunctionalView returns [EObject current=null] : iv_ruleFunctionalView= ruleFunctionalView EOF ;
    public final EObject entryRuleFunctionalView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalView = null;


        try {
            // InternalAfvl.g:65:55: (iv_ruleFunctionalView= ruleFunctionalView EOF )
            // InternalAfvl.g:66:2: iv_ruleFunctionalView= ruleFunctionalView EOF
            {
             newCompositeNode(grammarAccess.getFunctionalViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionalView=ruleFunctionalView();

            state._fsp--;

             current =iv_ruleFunctionalView; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionalView"


    // $ANTLR start "ruleFunctionalView"
    // InternalAfvl.g:72:1: ruleFunctionalView returns [EObject current=null] : (otherlv_0= 'FunctionalView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'use' otherlv_3= 'project' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'Components' otherlv_7= '{' ( (lv_comps_8_0= ruleComponent ) ) (otherlv_9= ',' ( (lv_comps_10_0= ruleComponent ) ) )* otherlv_11= '}' otherlv_12= 'Connectors' otherlv_13= '{' ( (lv_conns_14_0= ruleConnector ) ) (otherlv_15= ',' ( (lv_conns_16_0= ruleConnector ) ) )* otherlv_17= '}' otherlv_18= '}' ) ;
    public final EObject ruleFunctionalView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_comps_8_0 = null;

        EObject lv_comps_10_0 = null;

        EObject lv_conns_14_0 = null;

        EObject lv_conns_16_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:78:2: ( (otherlv_0= 'FunctionalView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'use' otherlv_3= 'project' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'Components' otherlv_7= '{' ( (lv_comps_8_0= ruleComponent ) ) (otherlv_9= ',' ( (lv_comps_10_0= ruleComponent ) ) )* otherlv_11= '}' otherlv_12= 'Connectors' otherlv_13= '{' ( (lv_conns_14_0= ruleConnector ) ) (otherlv_15= ',' ( (lv_conns_16_0= ruleConnector ) ) )* otherlv_17= '}' otherlv_18= '}' ) )
            // InternalAfvl.g:79:2: (otherlv_0= 'FunctionalView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'use' otherlv_3= 'project' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'Components' otherlv_7= '{' ( (lv_comps_8_0= ruleComponent ) ) (otherlv_9= ',' ( (lv_comps_10_0= ruleComponent ) ) )* otherlv_11= '}' otherlv_12= 'Connectors' otherlv_13= '{' ( (lv_conns_14_0= ruleConnector ) ) (otherlv_15= ',' ( (lv_conns_16_0= ruleConnector ) ) )* otherlv_17= '}' otherlv_18= '}' )
            {
            // InternalAfvl.g:79:2: (otherlv_0= 'FunctionalView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'use' otherlv_3= 'project' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'Components' otherlv_7= '{' ( (lv_comps_8_0= ruleComponent ) ) (otherlv_9= ',' ( (lv_comps_10_0= ruleComponent ) ) )* otherlv_11= '}' otherlv_12= 'Connectors' otherlv_13= '{' ( (lv_conns_14_0= ruleConnector ) ) (otherlv_15= ',' ( (lv_conns_16_0= ruleConnector ) ) )* otherlv_17= '}' otherlv_18= '}' )
            // InternalAfvl.g:80:3: otherlv_0= 'FunctionalView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'use' otherlv_3= 'project' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'Components' otherlv_7= '{' ( (lv_comps_8_0= ruleComponent ) ) (otherlv_9= ',' ( (lv_comps_10_0= ruleComponent ) ) )* otherlv_11= '}' otherlv_12= 'Connectors' otherlv_13= '{' ( (lv_conns_14_0= ruleConnector ) ) (otherlv_15= ',' ( (lv_conns_16_0= ruleConnector ) ) )* otherlv_17= '}' otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionalViewAccess().getFunctionalViewKeyword_0());
            		
            // InternalAfvl.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionalViewAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionalViewRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionalViewAccess().getUseKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionalViewAccess().getProjectKeyword_3());
            		
            // InternalAfvl.g:110:3: ( (otherlv_4= RULE_ID ) )
            // InternalAfvl.g:111:4: (otherlv_4= RULE_ID )
            {
            // InternalAfvl.g:111:4: (otherlv_4= RULE_ID )
            // InternalAfvl.g:112:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionalViewRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_4, grammarAccess.getFunctionalViewAccess().getProjectProjectCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionalViewAccess().getLeftCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionalViewAccess().getComponentsKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getFunctionalViewAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalAfvl.g:135:3: ( (lv_comps_8_0= ruleComponent ) )
            // InternalAfvl.g:136:4: (lv_comps_8_0= ruleComponent )
            {
            // InternalAfvl.g:136:4: (lv_comps_8_0= ruleComponent )
            // InternalAfvl.g:137:5: lv_comps_8_0= ruleComponent
            {

            					newCompositeNode(grammarAccess.getFunctionalViewAccess().getCompsComponentParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_comps_8_0=ruleComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalViewRule());
            					}
            					add(
            						current,
            						"comps",
            						lv_comps_8_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Component");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:154:3: (otherlv_9= ',' ( (lv_comps_10_0= ruleComponent ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAfvl.g:155:4: otherlv_9= ',' ( (lv_comps_10_0= ruleComponent ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_8); 

            	    				newLeafNode(otherlv_9, grammarAccess.getFunctionalViewAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalAfvl.g:159:4: ( (lv_comps_10_0= ruleComponent ) )
            	    // InternalAfvl.g:160:5: (lv_comps_10_0= ruleComponent )
            	    {
            	    // InternalAfvl.g:160:5: (lv_comps_10_0= ruleComponent )
            	    // InternalAfvl.g:161:6: lv_comps_10_0= ruleComponent
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionalViewAccess().getCompsComponentParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_comps_10_0=ruleComponent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFunctionalViewRule());
            	    						}
            	    						add(
            	    							current,
            	    							"comps",
            	    							lv_comps_10_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Component");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getFunctionalViewAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_12=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_12, grammarAccess.getFunctionalViewAccess().getConnectorsKeyword_11());
            		
            otherlv_13=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_13, grammarAccess.getFunctionalViewAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalAfvl.g:191:3: ( (lv_conns_14_0= ruleConnector ) )
            // InternalAfvl.g:192:4: (lv_conns_14_0= ruleConnector )
            {
            // InternalAfvl.g:192:4: (lv_conns_14_0= ruleConnector )
            // InternalAfvl.g:193:5: lv_conns_14_0= ruleConnector
            {

            					newCompositeNode(grammarAccess.getFunctionalViewAccess().getConnsConnectorParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_9);
            lv_conns_14_0=ruleConnector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalViewRule());
            					}
            					add(
            						current,
            						"conns",
            						lv_conns_14_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Connector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:210:3: (otherlv_15= ',' ( (lv_conns_16_0= ruleConnector ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAfvl.g:211:4: otherlv_15= ',' ( (lv_conns_16_0= ruleConnector ) )
            	    {
            	    otherlv_15=(Token)match(input,16,FOLLOW_11); 

            	    				newLeafNode(otherlv_15, grammarAccess.getFunctionalViewAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalAfvl.g:215:4: ( (lv_conns_16_0= ruleConnector ) )
            	    // InternalAfvl.g:216:5: (lv_conns_16_0= ruleConnector )
            	    {
            	    // InternalAfvl.g:216:5: (lv_conns_16_0= ruleConnector )
            	    // InternalAfvl.g:217:6: lv_conns_16_0= ruleConnector
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionalViewAccess().getConnsConnectorParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_conns_16_0=ruleConnector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFunctionalViewRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conns",
            	    							lv_conns_16_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Connector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_17=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_17, grammarAccess.getFunctionalViewAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_18=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getFunctionalViewAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionalView"


    // $ANTLR start "entryRuleConnector"
    // InternalAfvl.g:247:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalAfvl.g:247:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalAfvl.g:248:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalAfvl.g:254:1: ruleConnector returns [EObject current=null] : (this_Stream_0= ruleStream | this_Adaptor_1= ruleAdaptor | this_Distributor_2= ruleDistributor | this_Event_3= ruleEvent | this_ProcedureCall_4= ruleProcedureCall ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        EObject this_Stream_0 = null;

        EObject this_Adaptor_1 = null;

        EObject this_Distributor_2 = null;

        EObject this_Event_3 = null;

        EObject this_ProcedureCall_4 = null;



        	enterRule();

        try {
            // InternalAfvl.g:260:2: ( (this_Stream_0= ruleStream | this_Adaptor_1= ruleAdaptor | this_Distributor_2= ruleDistributor | this_Event_3= ruleEvent | this_ProcedureCall_4= ruleProcedureCall ) )
            // InternalAfvl.g:261:2: (this_Stream_0= ruleStream | this_Adaptor_1= ruleAdaptor | this_Distributor_2= ruleDistributor | this_Event_3= ruleEvent | this_ProcedureCall_4= ruleProcedureCall )
            {
            // InternalAfvl.g:261:2: (this_Stream_0= ruleStream | this_Adaptor_1= ruleAdaptor | this_Distributor_2= ruleDistributor | this_Event_3= ruleEvent | this_ProcedureCall_4= ruleProcedureCall )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt3=1;
                }
                break;
            case 33:
                {
                alt3=2;
                }
                break;
            case 34:
                {
                alt3=3;
                }
                break;
            case 35:
                {
                alt3=4;
                }
                break;
            case 36:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAfvl.g:262:3: this_Stream_0= ruleStream
                    {

                    			newCompositeNode(grammarAccess.getConnectorAccess().getStreamParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Stream_0=ruleStream();

                    state._fsp--;


                    			current = this_Stream_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAfvl.g:271:3: this_Adaptor_1= ruleAdaptor
                    {

                    			newCompositeNode(grammarAccess.getConnectorAccess().getAdaptorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Adaptor_1=ruleAdaptor();

                    state._fsp--;


                    			current = this_Adaptor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAfvl.g:280:3: this_Distributor_2= ruleDistributor
                    {

                    			newCompositeNode(grammarAccess.getConnectorAccess().getDistributorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Distributor_2=ruleDistributor();

                    state._fsp--;


                    			current = this_Distributor_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAfvl.g:289:3: this_Event_3= ruleEvent
                    {

                    			newCompositeNode(grammarAccess.getConnectorAccess().getEventParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Event_3=ruleEvent();

                    state._fsp--;


                    			current = this_Event_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAfvl.g:298:3: this_ProcedureCall_4= ruleProcedureCall
                    {

                    			newCompositeNode(grammarAccess.getConnectorAccess().getProcedureCallParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcedureCall_4=ruleProcedureCall();

                    state._fsp--;


                    			current = this_ProcedureCall_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleComponent"
    // InternalAfvl.g:310:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalAfvl.g:310:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalAfvl.g:311:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalAfvl.g:317:1: ruleComponent returns [EObject current=null] : (this_Transformer_0= ruleTransformer | this_Estimator_1= ruleEstimator | this_Ingestor_2= ruleIngestor | this_Sink_3= ruleSink ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Transformer_0 = null;

        EObject this_Estimator_1 = null;

        EObject this_Ingestor_2 = null;

        EObject this_Sink_3 = null;



        	enterRule();

        try {
            // InternalAfvl.g:323:2: ( (this_Transformer_0= ruleTransformer | this_Estimator_1= ruleEstimator | this_Ingestor_2= ruleIngestor | this_Sink_3= ruleSink ) )
            // InternalAfvl.g:324:2: (this_Transformer_0= ruleTransformer | this_Estimator_1= ruleEstimator | this_Ingestor_2= ruleIngestor | this_Sink_3= ruleSink )
            {
            // InternalAfvl.g:324:2: (this_Transformer_0= ruleTransformer | this_Estimator_1= ruleEstimator | this_Ingestor_2= ruleIngestor | this_Sink_3= ruleSink )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt4=1;
                }
                break;
            case 41:
                {
                alt4=2;
                }
                break;
            case 42:
                {
                alt4=3;
                }
                break;
            case 46:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalAfvl.g:325:3: this_Transformer_0= ruleTransformer
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getTransformerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Transformer_0=ruleTransformer();

                    state._fsp--;


                    			current = this_Transformer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAfvl.g:334:3: this_Estimator_1= ruleEstimator
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getEstimatorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Estimator_1=ruleEstimator();

                    state._fsp--;


                    			current = this_Estimator_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAfvl.g:343:3: this_Ingestor_2= ruleIngestor
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getIngestorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ingestor_2=ruleIngestor();

                    state._fsp--;


                    			current = this_Ingestor_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAfvl.g:352:3: this_Sink_3= ruleSink
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getSinkParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sink_3=ruleSink();

                    state._fsp--;


                    			current = this_Sink_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleEString"
    // InternalAfvl.g:364:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAfvl.g:364:47: (iv_ruleEString= ruleEString EOF )
            // InternalAfvl.g:365:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalAfvl.g:371:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:377:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAfvl.g:378:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAfvl.g:378:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAfvl.g:379:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAfvl.g:387:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePort"
    // InternalAfvl.g:398:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalAfvl.g:398:45: (iv_rulePort= rulePort EOF )
            // InternalAfvl.g:399:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalAfvl.g:405:1: rulePort returns [EObject current=null] : ( () otherlv_1= 'Port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= rulePortType ) )? (otherlv_5= 'fields' otherlv_6= ':' otherlv_7= '{' ( (lv_fields_8_0= ruleField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleField ) ) )* otherlv_11= '}' )? ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_type_4_0 = null;

        EObject lv_fields_8_0 = null;

        EObject lv_fields_10_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:411:2: ( ( () otherlv_1= 'Port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= rulePortType ) )? (otherlv_5= 'fields' otherlv_6= ':' otherlv_7= '{' ( (lv_fields_8_0= ruleField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleField ) ) )* otherlv_11= '}' )? ) )
            // InternalAfvl.g:412:2: ( () otherlv_1= 'Port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= rulePortType ) )? (otherlv_5= 'fields' otherlv_6= ':' otherlv_7= '{' ( (lv_fields_8_0= ruleField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleField ) ) )* otherlv_11= '}' )? )
            {
            // InternalAfvl.g:412:2: ( () otherlv_1= 'Port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= rulePortType ) )? (otherlv_5= 'fields' otherlv_6= ':' otherlv_7= '{' ( (lv_fields_8_0= ruleField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleField ) ) )* otherlv_11= '}' )? )
            // InternalAfvl.g:413:3: () otherlv_1= 'Port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= rulePortType ) )? (otherlv_5= 'fields' otherlv_6= ':' otherlv_7= '{' ( (lv_fields_8_0= ruleField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleField ) ) )* otherlv_11= '}' )?
            {
            // InternalAfvl.g:413:3: ()
            // InternalAfvl.g:414:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPortAccess().getPortAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPortAccess().getPortKeyword_1());
            		
            // InternalAfvl.g:424:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAfvl.g:425:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAfvl.g:425:4: (lv_name_2_0= RULE_ID )
            // InternalAfvl.g:426:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getPortAccess().getColonKeyword_3());
            		
            // InternalAfvl.g:446:3: ( (lv_type_4_0= rulePortType ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=54 && LA6_0<=55)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAfvl.g:447:4: (lv_type_4_0= rulePortType )
                    {
                    // InternalAfvl.g:447:4: (lv_type_4_0= rulePortType )
                    // InternalAfvl.g:448:5: lv_type_4_0= rulePortType
                    {

                    					newCompositeNode(grammarAccess.getPortAccess().getTypePortTypeEnumRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_type_4_0=rulePortType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPortRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_4_0,
                    						"co.edu.uniandes.accordant_fv.Afvl.PortType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAfvl.g:465:3: (otherlv_5= 'fields' otherlv_6= ':' otherlv_7= '{' ( (lv_fields_8_0= ruleField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleField ) ) )* otherlv_11= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAfvl.g:466:4: otherlv_5= 'fields' otherlv_6= ':' otherlv_7= '{' ( (lv_fields_8_0= ruleField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleField ) ) )* otherlv_11= '}'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getPortAccess().getFieldsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getPortAccess().getColonKeyword_5_1());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getPortAccess().getLeftCurlyBracketKeyword_5_2());
                    			
                    // InternalAfvl.g:478:4: ( (lv_fields_8_0= ruleField ) )
                    // InternalAfvl.g:479:5: (lv_fields_8_0= ruleField )
                    {
                    // InternalAfvl.g:479:5: (lv_fields_8_0= ruleField )
                    // InternalAfvl.g:480:6: lv_fields_8_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getPortAccess().getFieldsFieldParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_fields_8_0=ruleField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPortRule());
                    						}
                    						add(
                    							current,
                    							"fields",
                    							lv_fields_8_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.Field");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAfvl.g:497:4: (otherlv_9= ',' ( (lv_fields_10_0= ruleField ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalAfvl.g:498:5: otherlv_9= ',' ( (lv_fields_10_0= ruleField ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getPortAccess().getCommaKeyword_5_4_0());
                    	    				
                    	    // InternalAfvl.g:502:5: ( (lv_fields_10_0= ruleField ) )
                    	    // InternalAfvl.g:503:6: (lv_fields_10_0= ruleField )
                    	    {
                    	    // InternalAfvl.g:503:6: (lv_fields_10_0= ruleField )
                    	    // InternalAfvl.g:504:7: lv_fields_10_0= ruleField
                    	    {

                    	    							newCompositeNode(grammarAccess.getPortAccess().getFieldsFieldParserRuleCall_5_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_fields_10_0=ruleField();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPortRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fields",
                    	    								lv_fields_10_0,
                    	    								"co.edu.uniandes.accordant_fv.Afvl.Field");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getPortAccess().getRightCurlyBracketKeyword_5_5());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleRole"
    // InternalAfvl.g:531:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalAfvl.g:531:45: (iv_ruleRole= ruleRole EOF )
            // InternalAfvl.g:532:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalAfvl.g:538:1: ruleRole returns [EObject current=null] : ( () otherlv_1= 'Role' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleRoleType ) )? otherlv_5= '->' ( (otherlv_6= RULE_ID ) )? ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:544:2: ( ( () otherlv_1= 'Role' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleRoleType ) )? otherlv_5= '->' ( (otherlv_6= RULE_ID ) )? ) )
            // InternalAfvl.g:545:2: ( () otherlv_1= 'Role' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleRoleType ) )? otherlv_5= '->' ( (otherlv_6= RULE_ID ) )? )
            {
            // InternalAfvl.g:545:2: ( () otherlv_1= 'Role' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleRoleType ) )? otherlv_5= '->' ( (otherlv_6= RULE_ID ) )? )
            // InternalAfvl.g:546:3: () otherlv_1= 'Role' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleRoleType ) )? otherlv_5= '->' ( (otherlv_6= RULE_ID ) )?
            {
            // InternalAfvl.g:546:3: ()
            // InternalAfvl.g:547:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleAccess().getRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getRoleKeyword_1());
            		
            // InternalAfvl.g:557:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAfvl.g:558:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAfvl.g:558:4: (lv_name_2_0= RULE_ID )
            // InternalAfvl.g:559:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getColonKeyword_3());
            		
            // InternalAfvl.g:579:3: ( (lv_type_4_0= ruleRoleType ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=56 && LA9_0<=57)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAfvl.g:580:4: (lv_type_4_0= ruleRoleType )
                    {
                    // InternalAfvl.g:580:4: (lv_type_4_0= ruleRoleType )
                    // InternalAfvl.g:581:5: lv_type_4_0= ruleRoleType
                    {

                    					newCompositeNode(grammarAccess.getRoleAccess().getTypeRoleTypeEnumRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_type_4_0=ruleRoleType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRoleRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_4_0,
                    						"co.edu.uniandes.accordant_fv.Afvl.RoleType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalAfvl.g:602:3: ( (otherlv_6= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAfvl.g:603:4: (otherlv_6= RULE_ID )
                    {
                    // InternalAfvl.g:603:4: (otherlv_6= RULE_ID )
                    // InternalAfvl.g:604:5: otherlv_6= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRoleRule());
                    					}
                    				
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getRoleAccess().getPortPortCrossReference_6_0());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleStream"
    // InternalAfvl.g:619:1: entryRuleStream returns [EObject current=null] : iv_ruleStream= ruleStream EOF ;
    public final EObject entryRuleStream() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStream = null;


        try {
            // InternalAfvl.g:619:47: (iv_ruleStream= ruleStream EOF )
            // InternalAfvl.g:620:2: iv_ruleStream= ruleStream EOF
            {
             newCompositeNode(grammarAccess.getStreamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStream=ruleStream();

            state._fsp--;

             current =iv_ruleStream; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStream"


    // $ANTLR start "ruleStream"
    // InternalAfvl.g:626:1: ruleStream returns [EObject current=null] : (otherlv_0= 'Stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' ) ;
    public final EObject ruleStream() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Enumerator lv_delivery_5_0 = null;

        Enumerator lv_synct_8_0 = null;

        Enumerator lv_notification_11_0 = null;

        Enumerator lv_buffering_14_0 = null;

        Enumerator lv_throughput_17_0 = null;

        AntlrDatatypeRuleToken lv_props_20_0 = null;

        EObject lv_roles_27_0 = null;

        EObject lv_roles_29_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:632:2: ( (otherlv_0= 'Stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' ) )
            // InternalAfvl.g:633:2: (otherlv_0= 'Stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' )
            {
            // InternalAfvl.g:633:2: (otherlv_0= 'Stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' )
            // InternalAfvl.g:634:3: otherlv_0= 'Stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStreamAccess().getStreamKeyword_0());
            		
            // InternalAfvl.g:638:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:639:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:639:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:640:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStreamAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStreamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getStreamAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:660:3: (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAfvl.g:661:4: otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getStreamAccess().getDeliveryKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getStreamAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:669:4: ( (lv_delivery_5_0= ruleDeliveryGuarantee ) )
                    // InternalAfvl.g:670:5: (lv_delivery_5_0= ruleDeliveryGuarantee )
                    {
                    // InternalAfvl.g:670:5: (lv_delivery_5_0= ruleDeliveryGuarantee )
                    // InternalAfvl.g:671:6: lv_delivery_5_0= ruleDeliveryGuarantee
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getDeliveryDeliveryGuaranteeEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_delivery_5_0=ruleDeliveryGuarantee();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStreamRule());
                    						}
                    						set(
                    							current,
                    							"delivery",
                    							lv_delivery_5_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.DeliveryGuarantee");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:689:3: (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAfvl.g:690:4: otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getStreamAccess().getSyncKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getStreamAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:698:4: ( (lv_synct_8_0= ruleSyncType ) )
                    // InternalAfvl.g:699:5: (lv_synct_8_0= ruleSyncType )
                    {
                    // InternalAfvl.g:699:5: (lv_synct_8_0= ruleSyncType )
                    // InternalAfvl.g:700:6: lv_synct_8_0= ruleSyncType
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getSynctSyncTypeEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_synct_8_0=ruleSyncType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStreamRule());
                    						}
                    						set(
                    							current,
                    							"synct",
                    							lv_synct_8_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.SyncType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:718:3: (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAfvl.g:719:4: otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) )
                    {
                    otherlv_9=(Token)match(input,27,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getStreamAccess().getNotificationKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_24); 

                    				newLeafNode(otherlv_10, grammarAccess.getStreamAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:727:4: ( (lv_notification_11_0= ruleNotificationModel ) )
                    // InternalAfvl.g:728:5: (lv_notification_11_0= ruleNotificationModel )
                    {
                    // InternalAfvl.g:728:5: (lv_notification_11_0= ruleNotificationModel )
                    // InternalAfvl.g:729:6: lv_notification_11_0= ruleNotificationModel
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getNotificationNotificationModelEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_notification_11_0=ruleNotificationModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStreamRule());
                    						}
                    						set(
                    							current,
                    							"notification",
                    							lv_notification_11_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.NotificationModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:747:3: (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAfvl.g:748:4: otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) )
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getStreamAccess().getBufferingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_26); 

                    				newLeafNode(otherlv_13, grammarAccess.getStreamAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:756:4: ( (lv_buffering_14_0= ruleBuffering ) )
                    // InternalAfvl.g:757:5: (lv_buffering_14_0= ruleBuffering )
                    {
                    // InternalAfvl.g:757:5: (lv_buffering_14_0= ruleBuffering )
                    // InternalAfvl.g:758:6: lv_buffering_14_0= ruleBuffering
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getBufferingBufferingEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_buffering_14_0=ruleBuffering();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStreamRule());
                    						}
                    						set(
                    							current,
                    							"buffering",
                    							lv_buffering_14_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.Buffering");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:776:3: (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAfvl.g:777:4: otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) )
                    {
                    otherlv_15=(Token)match(input,29,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getStreamAccess().getThroughputKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_28); 

                    				newLeafNode(otherlv_16, grammarAccess.getStreamAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:785:4: ( (lv_throughput_17_0= ruleThroughput ) )
                    // InternalAfvl.g:786:5: (lv_throughput_17_0= ruleThroughput )
                    {
                    // InternalAfvl.g:786:5: (lv_throughput_17_0= ruleThroughput )
                    // InternalAfvl.g:787:6: lv_throughput_17_0= ruleThroughput
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getThroughputThroughputEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_throughput_17_0=ruleThroughput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStreamRule());
                    						}
                    						set(
                    							current,
                    							"throughput",
                    							lv_throughput_17_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.Throughput");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:805:3: (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAfvl.g:806:4: otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getStreamAccess().getPropsKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,20,FOLLOW_30); 

                    				newLeafNode(otherlv_19, grammarAccess.getStreamAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:814:4: ( (lv_props_20_0= ruleEString ) )
                    // InternalAfvl.g:815:5: (lv_props_20_0= ruleEString )
                    {
                    // InternalAfvl.g:815:5: (lv_props_20_0= ruleEString )
                    // InternalAfvl.g:816:6: lv_props_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getPropsEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_props_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStreamRule());
                    						}
                    						set(
                    							current,
                    							"props",
                    							lv_props_20_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:834:3: (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAfvl.g:835:4: otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) )
                    {
                    otherlv_21=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getStreamAccess().getDecisionKeyword_9_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getStreamAccess().getColonKeyword_9_1());
                    			
                    // InternalAfvl.g:843:4: ( (otherlv_23= RULE_ID ) )
                    // InternalAfvl.g:844:5: (otherlv_23= RULE_ID )
                    {
                    // InternalAfvl.g:844:5: (otherlv_23= RULE_ID )
                    // InternalAfvl.g:845:6: otherlv_23= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStreamRule());
                    						}
                    					
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_32); 

                    						newLeafNode(otherlv_23, grammarAccess.getStreamAccess().getDecisionArchDecisionCrossReference_9_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_24, grammarAccess.getStreamAccess().getRolesKeyword_10());
            		
            otherlv_25=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_25, grammarAccess.getStreamAccess().getColonKeyword_11());
            		
            otherlv_26=(Token)match(input,14,FOLLOW_33); 

            			newLeafNode(otherlv_26, grammarAccess.getStreamAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalAfvl.g:869:3: ( (lv_roles_27_0= ruleRole ) )
            // InternalAfvl.g:870:4: (lv_roles_27_0= ruleRole )
            {
            // InternalAfvl.g:870:4: (lv_roles_27_0= ruleRole )
            // InternalAfvl.g:871:5: lv_roles_27_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getStreamAccess().getRolesRoleParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_9);
            lv_roles_27_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStreamRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_27_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:888:3: (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAfvl.g:889:4: otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) )
            	    {
            	    otherlv_28=(Token)match(input,16,FOLLOW_33); 

            	    				newLeafNode(otherlv_28, grammarAccess.getStreamAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalAfvl.g:893:4: ( (lv_roles_29_0= ruleRole ) )
            	    // InternalAfvl.g:894:5: (lv_roles_29_0= ruleRole )
            	    {
            	    // InternalAfvl.g:894:5: (lv_roles_29_0= ruleRole )
            	    // InternalAfvl.g:895:6: lv_roles_29_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getStreamAccess().getRolesRoleParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_roles_29_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStreamRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_29_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_30=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_30, grammarAccess.getStreamAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_31=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getStreamAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStream"


    // $ANTLR start "entryRuleAdaptor"
    // InternalAfvl.g:925:1: entryRuleAdaptor returns [EObject current=null] : iv_ruleAdaptor= ruleAdaptor EOF ;
    public final EObject entryRuleAdaptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptor = null;


        try {
            // InternalAfvl.g:925:48: (iv_ruleAdaptor= ruleAdaptor EOF )
            // InternalAfvl.g:926:2: iv_ruleAdaptor= ruleAdaptor EOF
            {
             newCompositeNode(grammarAccess.getAdaptorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdaptor=ruleAdaptor();

            state._fsp--;

             current =iv_ruleAdaptor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdaptor"


    // $ANTLR start "ruleAdaptor"
    // InternalAfvl.g:932:1: ruleAdaptor returns [EObject current=null] : (otherlv_0= 'Adaptor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) )? ) (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= '{' ( (lv_roles_26_0= ruleRole ) ) (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )* otherlv_29= '}' otherlv_30= '}' ) ;
    public final EObject ruleAdaptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Enumerator lv_delivery_5_0 = null;

        Enumerator lv_synct_8_0 = null;

        Enumerator lv_notification_11_0 = null;

        Enumerator lv_buffering_14_0 = null;

        Enumerator lv_throughput_17_0 = null;

        AntlrDatatypeRuleToken lv_props_20_0 = null;

        EObject lv_roles_26_0 = null;

        EObject lv_roles_28_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:938:2: ( (otherlv_0= 'Adaptor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) )? ) (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= '{' ( (lv_roles_26_0= ruleRole ) ) (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )* otherlv_29= '}' otherlv_30= '}' ) )
            // InternalAfvl.g:939:2: (otherlv_0= 'Adaptor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) )? ) (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= '{' ( (lv_roles_26_0= ruleRole ) ) (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )* otherlv_29= '}' otherlv_30= '}' )
            {
            // InternalAfvl.g:939:2: (otherlv_0= 'Adaptor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) )? ) (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= '{' ( (lv_roles_26_0= ruleRole ) ) (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )* otherlv_29= '}' otherlv_30= '}' )
            // InternalAfvl.g:940:3: otherlv_0= 'Adaptor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) )? ) (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= '{' ( (lv_roles_26_0= ruleRole ) ) (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )* otherlv_29= '}' otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAdaptorAccess().getAdaptorKeyword_0());
            		
            // InternalAfvl.g:944:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:945:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:945:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:946:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAdaptorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdaptorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getAdaptorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:966:3: (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) )? )
            // InternalAfvl.g:967:4: otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) )?
            {
            otherlv_3=(Token)match(input,25,FOLLOW_13); 

            				newLeafNode(otherlv_3, grammarAccess.getAdaptorAccess().getDeliveryKeyword_3_0());
            			
            otherlv_4=(Token)match(input,20,FOLLOW_35); 

            				newLeafNode(otherlv_4, grammarAccess.getAdaptorAccess().getColonKeyword_3_1());
            			
            // InternalAfvl.g:975:4: ( (lv_delivery_5_0= ruleDeliveryGuarantee ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=48 && LA19_0<=51)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAfvl.g:976:5: (lv_delivery_5_0= ruleDeliveryGuarantee )
                    {
                    // InternalAfvl.g:976:5: (lv_delivery_5_0= ruleDeliveryGuarantee )
                    // InternalAfvl.g:977:6: lv_delivery_5_0= ruleDeliveryGuarantee
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getDeliveryDeliveryGuaranteeEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_delivery_5_0=ruleDeliveryGuarantee();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdaptorRule());
                    						}
                    						set(
                    							current,
                    							"delivery",
                    							lv_delivery_5_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.DeliveryGuarantee");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }


            }

            // InternalAfvl.g:995:3: (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAfvl.g:996:4: otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getAdaptorAccess().getSyncKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getAdaptorAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:1004:4: ( (lv_synct_8_0= ruleSyncType ) )
                    // InternalAfvl.g:1005:5: (lv_synct_8_0= ruleSyncType )
                    {
                    // InternalAfvl.g:1005:5: (lv_synct_8_0= ruleSyncType )
                    // InternalAfvl.g:1006:6: lv_synct_8_0= ruleSyncType
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getSynctSyncTypeEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_synct_8_0=ruleSyncType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdaptorRule());
                    						}
                    						set(
                    							current,
                    							"synct",
                    							lv_synct_8_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.SyncType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1024:3: (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAfvl.g:1025:4: otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) )
                    {
                    otherlv_9=(Token)match(input,27,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getAdaptorAccess().getNotificationKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_24); 

                    				newLeafNode(otherlv_10, grammarAccess.getAdaptorAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:1033:4: ( (lv_notification_11_0= ruleNotificationModel ) )
                    // InternalAfvl.g:1034:5: (lv_notification_11_0= ruleNotificationModel )
                    {
                    // InternalAfvl.g:1034:5: (lv_notification_11_0= ruleNotificationModel )
                    // InternalAfvl.g:1035:6: lv_notification_11_0= ruleNotificationModel
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getNotificationNotificationModelEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_notification_11_0=ruleNotificationModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdaptorRule());
                    						}
                    						set(
                    							current,
                    							"notification",
                    							lv_notification_11_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.NotificationModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1053:3: (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAfvl.g:1054:4: otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) )
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getAdaptorAccess().getBufferingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_26); 

                    				newLeafNode(otherlv_13, grammarAccess.getAdaptorAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:1062:4: ( (lv_buffering_14_0= ruleBuffering ) )
                    // InternalAfvl.g:1063:5: (lv_buffering_14_0= ruleBuffering )
                    {
                    // InternalAfvl.g:1063:5: (lv_buffering_14_0= ruleBuffering )
                    // InternalAfvl.g:1064:6: lv_buffering_14_0= ruleBuffering
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getBufferingBufferingEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_buffering_14_0=ruleBuffering();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdaptorRule());
                    						}
                    						set(
                    							current,
                    							"buffering",
                    							lv_buffering_14_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.Buffering");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1082:3: (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAfvl.g:1083:4: otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) )
                    {
                    otherlv_15=(Token)match(input,29,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getAdaptorAccess().getThroughputKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_28); 

                    				newLeafNode(otherlv_16, grammarAccess.getAdaptorAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:1091:4: ( (lv_throughput_17_0= ruleThroughput ) )
                    // InternalAfvl.g:1092:5: (lv_throughput_17_0= ruleThroughput )
                    {
                    // InternalAfvl.g:1092:5: (lv_throughput_17_0= ruleThroughput )
                    // InternalAfvl.g:1093:6: lv_throughput_17_0= ruleThroughput
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getThroughputThroughputEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_throughput_17_0=ruleThroughput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdaptorRule());
                    						}
                    						set(
                    							current,
                    							"throughput",
                    							lv_throughput_17_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.Throughput");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1111:3: (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAfvl.g:1112:4: otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getAdaptorAccess().getPropsKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,20,FOLLOW_30); 

                    				newLeafNode(otherlv_19, grammarAccess.getAdaptorAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:1120:4: ( (lv_props_20_0= ruleEString ) )
                    // InternalAfvl.g:1121:5: (lv_props_20_0= ruleEString )
                    {
                    // InternalAfvl.g:1121:5: (lv_props_20_0= ruleEString )
                    // InternalAfvl.g:1122:6: lv_props_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getPropsEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_props_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdaptorRule());
                    						}
                    						set(
                    							current,
                    							"props",
                    							lv_props_20_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1140:3: (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAfvl.g:1141:4: otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) )
                    {
                    otherlv_21=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getAdaptorAccess().getDecisionKeyword_9_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getAdaptorAccess().getColonKeyword_9_1());
                    			
                    // InternalAfvl.g:1149:4: ( (otherlv_23= RULE_ID ) )
                    // InternalAfvl.g:1150:5: (otherlv_23= RULE_ID )
                    {
                    // InternalAfvl.g:1150:5: (otherlv_23= RULE_ID )
                    // InternalAfvl.g:1151:6: otherlv_23= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAdaptorRule());
                    						}
                    					
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_32); 

                    						newLeafNode(otherlv_23, grammarAccess.getAdaptorAccess().getDecisionArchDecisionCrossReference_9_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_24, grammarAccess.getAdaptorAccess().getRolesKeyword_10());
            		
            otherlv_25=(Token)match(input,14,FOLLOW_33); 

            			newLeafNode(otherlv_25, grammarAccess.getAdaptorAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalAfvl.g:1171:3: ( (lv_roles_26_0= ruleRole ) )
            // InternalAfvl.g:1172:4: (lv_roles_26_0= ruleRole )
            {
            // InternalAfvl.g:1172:4: (lv_roles_26_0= ruleRole )
            // InternalAfvl.g:1173:5: lv_roles_26_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getAdaptorAccess().getRolesRoleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_9);
            lv_roles_26_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdaptorRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_26_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:1190:3: (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==16) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAfvl.g:1191:4: otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) )
            	    {
            	    otherlv_27=(Token)match(input,16,FOLLOW_33); 

            	    				newLeafNode(otherlv_27, grammarAccess.getAdaptorAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalAfvl.g:1195:4: ( (lv_roles_28_0= ruleRole ) )
            	    // InternalAfvl.g:1196:5: (lv_roles_28_0= ruleRole )
            	    {
            	    // InternalAfvl.g:1196:5: (lv_roles_28_0= ruleRole )
            	    // InternalAfvl.g:1197:6: lv_roles_28_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getAdaptorAccess().getRolesRoleParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_roles_28_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdaptorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_28_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_29=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_29, grammarAccess.getAdaptorAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_30=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getAdaptorAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdaptor"


    // $ANTLR start "entryRuleDistributor"
    // InternalAfvl.g:1227:1: entryRuleDistributor returns [EObject current=null] : iv_ruleDistributor= ruleDistributor EOF ;
    public final EObject entryRuleDistributor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistributor = null;


        try {
            // InternalAfvl.g:1227:52: (iv_ruleDistributor= ruleDistributor EOF )
            // InternalAfvl.g:1228:2: iv_ruleDistributor= ruleDistributor EOF
            {
             newCompositeNode(grammarAccess.getDistributorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistributor=ruleDistributor();

            state._fsp--;

             current =iv_ruleDistributor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDistributor"


    // $ANTLR start "ruleDistributor"
    // InternalAfvl.g:1234:1: ruleDistributor returns [EObject current=null] : (otherlv_0= 'Distributor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= '{' ( (lv_roles_26_0= ruleRole ) ) (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )* otherlv_29= '}' otherlv_30= '}' ) ;
    public final EObject ruleDistributor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Enumerator lv_delivery_5_0 = null;

        Enumerator lv_synct_8_0 = null;

        Enumerator lv_notification_11_0 = null;

        Enumerator lv_buffering_14_0 = null;

        Enumerator lv_throughput_17_0 = null;

        AntlrDatatypeRuleToken lv_props_20_0 = null;

        EObject lv_roles_26_0 = null;

        EObject lv_roles_28_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:1240:2: ( (otherlv_0= 'Distributor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= '{' ( (lv_roles_26_0= ruleRole ) ) (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )* otherlv_29= '}' otherlv_30= '}' ) )
            // InternalAfvl.g:1241:2: (otherlv_0= 'Distributor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= '{' ( (lv_roles_26_0= ruleRole ) ) (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )* otherlv_29= '}' otherlv_30= '}' )
            {
            // InternalAfvl.g:1241:2: (otherlv_0= 'Distributor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= '{' ( (lv_roles_26_0= ruleRole ) ) (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )* otherlv_29= '}' otherlv_30= '}' )
            // InternalAfvl.g:1242:3: otherlv_0= 'Distributor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= '{' ( (lv_roles_26_0= ruleRole ) ) (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )* otherlv_29= '}' otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDistributorAccess().getDistributorKeyword_0());
            		
            // InternalAfvl.g:1246:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:1247:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:1247:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:1248:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDistributorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDistributorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getDistributorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:1268:3: (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==25) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAfvl.g:1269:4: otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getDistributorAccess().getDeliveryKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getDistributorAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:1277:4: ( (lv_delivery_5_0= ruleDeliveryGuarantee ) )
                    // InternalAfvl.g:1278:5: (lv_delivery_5_0= ruleDeliveryGuarantee )
                    {
                    // InternalAfvl.g:1278:5: (lv_delivery_5_0= ruleDeliveryGuarantee )
                    // InternalAfvl.g:1279:6: lv_delivery_5_0= ruleDeliveryGuarantee
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getDeliveryDeliveryGuaranteeEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_delivery_5_0=ruleDeliveryGuarantee();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistributorRule());
                    						}
                    						set(
                    							current,
                    							"delivery",
                    							lv_delivery_5_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.DeliveryGuarantee");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1297:3: (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAfvl.g:1298:4: otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getDistributorAccess().getSyncKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getDistributorAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:1306:4: ( (lv_synct_8_0= ruleSyncType ) )
                    // InternalAfvl.g:1307:5: (lv_synct_8_0= ruleSyncType )
                    {
                    // InternalAfvl.g:1307:5: (lv_synct_8_0= ruleSyncType )
                    // InternalAfvl.g:1308:6: lv_synct_8_0= ruleSyncType
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getSynctSyncTypeEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_synct_8_0=ruleSyncType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistributorRule());
                    						}
                    						set(
                    							current,
                    							"synct",
                    							lv_synct_8_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.SyncType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1326:3: (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==27) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAfvl.g:1327:4: otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) )
                    {
                    otherlv_9=(Token)match(input,27,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getDistributorAccess().getNotificationKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_24); 

                    				newLeafNode(otherlv_10, grammarAccess.getDistributorAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:1335:4: ( (lv_notification_11_0= ruleNotificationModel ) )
                    // InternalAfvl.g:1336:5: (lv_notification_11_0= ruleNotificationModel )
                    {
                    // InternalAfvl.g:1336:5: (lv_notification_11_0= ruleNotificationModel )
                    // InternalAfvl.g:1337:6: lv_notification_11_0= ruleNotificationModel
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getNotificationNotificationModelEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_notification_11_0=ruleNotificationModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistributorRule());
                    						}
                    						set(
                    							current,
                    							"notification",
                    							lv_notification_11_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.NotificationModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1355:3: (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAfvl.g:1356:4: otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) )
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getDistributorAccess().getBufferingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_26); 

                    				newLeafNode(otherlv_13, grammarAccess.getDistributorAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:1364:4: ( (lv_buffering_14_0= ruleBuffering ) )
                    // InternalAfvl.g:1365:5: (lv_buffering_14_0= ruleBuffering )
                    {
                    // InternalAfvl.g:1365:5: (lv_buffering_14_0= ruleBuffering )
                    // InternalAfvl.g:1366:6: lv_buffering_14_0= ruleBuffering
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getBufferingBufferingEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_buffering_14_0=ruleBuffering();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistributorRule());
                    						}
                    						set(
                    							current,
                    							"buffering",
                    							lv_buffering_14_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.Buffering");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1384:3: (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==29) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAfvl.g:1385:4: otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) )
                    {
                    otherlv_15=(Token)match(input,29,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getDistributorAccess().getThroughputKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_28); 

                    				newLeafNode(otherlv_16, grammarAccess.getDistributorAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:1393:4: ( (lv_throughput_17_0= ruleThroughput ) )
                    // InternalAfvl.g:1394:5: (lv_throughput_17_0= ruleThroughput )
                    {
                    // InternalAfvl.g:1394:5: (lv_throughput_17_0= ruleThroughput )
                    // InternalAfvl.g:1395:6: lv_throughput_17_0= ruleThroughput
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getThroughputThroughputEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_throughput_17_0=ruleThroughput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistributorRule());
                    						}
                    						set(
                    							current,
                    							"throughput",
                    							lv_throughput_17_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.Throughput");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1413:3: (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAfvl.g:1414:4: otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getDistributorAccess().getPropsKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,20,FOLLOW_30); 

                    				newLeafNode(otherlv_19, grammarAccess.getDistributorAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:1422:4: ( (lv_props_20_0= ruleEString ) )
                    // InternalAfvl.g:1423:5: (lv_props_20_0= ruleEString )
                    {
                    // InternalAfvl.g:1423:5: (lv_props_20_0= ruleEString )
                    // InternalAfvl.g:1424:6: lv_props_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getPropsEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_props_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistributorRule());
                    						}
                    						set(
                    							current,
                    							"props",
                    							lv_props_20_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1442:3: (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAfvl.g:1443:4: otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) )
                    {
                    otherlv_21=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getDistributorAccess().getDecisionKeyword_9_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getDistributorAccess().getColonKeyword_9_1());
                    			
                    // InternalAfvl.g:1451:4: ( (otherlv_23= RULE_ID ) )
                    // InternalAfvl.g:1452:5: (otherlv_23= RULE_ID )
                    {
                    // InternalAfvl.g:1452:5: (otherlv_23= RULE_ID )
                    // InternalAfvl.g:1453:6: otherlv_23= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDistributorRule());
                    						}
                    					
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_32); 

                    						newLeafNode(otherlv_23, grammarAccess.getDistributorAccess().getDecisionArchDecisionCrossReference_9_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_24, grammarAccess.getDistributorAccess().getRolesKeyword_10());
            		
            otherlv_25=(Token)match(input,14,FOLLOW_33); 

            			newLeafNode(otherlv_25, grammarAccess.getDistributorAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalAfvl.g:1473:3: ( (lv_roles_26_0= ruleRole ) )
            // InternalAfvl.g:1474:4: (lv_roles_26_0= ruleRole )
            {
            // InternalAfvl.g:1474:4: (lv_roles_26_0= ruleRole )
            // InternalAfvl.g:1475:5: lv_roles_26_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getDistributorAccess().getRolesRoleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_9);
            lv_roles_26_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistributorRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_26_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:1492:3: (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==16) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAfvl.g:1493:4: otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) )
            	    {
            	    otherlv_27=(Token)match(input,16,FOLLOW_33); 

            	    				newLeafNode(otherlv_27, grammarAccess.getDistributorAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalAfvl.g:1497:4: ( (lv_roles_28_0= ruleRole ) )
            	    // InternalAfvl.g:1498:5: (lv_roles_28_0= ruleRole )
            	    {
            	    // InternalAfvl.g:1498:5: (lv_roles_28_0= ruleRole )
            	    // InternalAfvl.g:1499:6: lv_roles_28_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getDistributorAccess().getRolesRoleParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_roles_28_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDistributorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_28_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_29=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_29, grammarAccess.getDistributorAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_30=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getDistributorAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDistributor"


    // $ANTLR start "entryRuleEvent"
    // InternalAfvl.g:1529:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalAfvl.g:1529:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalAfvl.g:1530:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalAfvl.g:1536:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Enumerator lv_delivery_5_0 = null;

        Enumerator lv_synct_8_0 = null;

        Enumerator lv_notification_11_0 = null;

        Enumerator lv_buffering_14_0 = null;

        Enumerator lv_throughput_17_0 = null;

        AntlrDatatypeRuleToken lv_props_20_0 = null;

        EObject lv_roles_27_0 = null;

        EObject lv_roles_29_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:1542:2: ( (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' ) )
            // InternalAfvl.g:1543:2: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' )
            {
            // InternalAfvl.g:1543:2: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' )
            // InternalAfvl.g:1544:3: otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
            		
            // InternalAfvl.g:1548:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:1549:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:1549:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:1550:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:1570:3: (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==25) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAfvl.g:1571:4: otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getEventAccess().getDeliveryKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getEventAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:1579:4: ( (lv_delivery_5_0= ruleDeliveryGuarantee ) )
                    // InternalAfvl.g:1580:5: (lv_delivery_5_0= ruleDeliveryGuarantee )
                    {
                    // InternalAfvl.g:1580:5: (lv_delivery_5_0= ruleDeliveryGuarantee )
                    // InternalAfvl.g:1581:6: lv_delivery_5_0= ruleDeliveryGuarantee
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getDeliveryDeliveryGuaranteeEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_delivery_5_0=ruleDeliveryGuarantee();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"delivery",
                    							lv_delivery_5_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.DeliveryGuarantee");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1599:3: (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==26) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAfvl.g:1600:4: otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getEventAccess().getSyncKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getEventAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:1608:4: ( (lv_synct_8_0= ruleSyncType ) )
                    // InternalAfvl.g:1609:5: (lv_synct_8_0= ruleSyncType )
                    {
                    // InternalAfvl.g:1609:5: (lv_synct_8_0= ruleSyncType )
                    // InternalAfvl.g:1610:6: lv_synct_8_0= ruleSyncType
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getSynctSyncTypeEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_synct_8_0=ruleSyncType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"synct",
                    							lv_synct_8_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.SyncType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1628:3: (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==27) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAfvl.g:1629:4: otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) )
                    {
                    otherlv_9=(Token)match(input,27,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getEventAccess().getNotificationKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_24); 

                    				newLeafNode(otherlv_10, grammarAccess.getEventAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:1637:4: ( (lv_notification_11_0= ruleNotificationModel ) )
                    // InternalAfvl.g:1638:5: (lv_notification_11_0= ruleNotificationModel )
                    {
                    // InternalAfvl.g:1638:5: (lv_notification_11_0= ruleNotificationModel )
                    // InternalAfvl.g:1639:6: lv_notification_11_0= ruleNotificationModel
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getNotificationNotificationModelEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_notification_11_0=ruleNotificationModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"notification",
                    							lv_notification_11_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.NotificationModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1657:3: (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==28) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAfvl.g:1658:4: otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) )
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getEventAccess().getBufferingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_26); 

                    				newLeafNode(otherlv_13, grammarAccess.getEventAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:1666:4: ( (lv_buffering_14_0= ruleBuffering ) )
                    // InternalAfvl.g:1667:5: (lv_buffering_14_0= ruleBuffering )
                    {
                    // InternalAfvl.g:1667:5: (lv_buffering_14_0= ruleBuffering )
                    // InternalAfvl.g:1668:6: lv_buffering_14_0= ruleBuffering
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getBufferingBufferingEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_buffering_14_0=ruleBuffering();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"buffering",
                    							lv_buffering_14_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.Buffering");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1686:3: (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==29) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAfvl.g:1687:4: otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) )
                    {
                    otherlv_15=(Token)match(input,29,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getEventAccess().getThroughputKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_28); 

                    				newLeafNode(otherlv_16, grammarAccess.getEventAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:1695:4: ( (lv_throughput_17_0= ruleThroughput ) )
                    // InternalAfvl.g:1696:5: (lv_throughput_17_0= ruleThroughput )
                    {
                    // InternalAfvl.g:1696:5: (lv_throughput_17_0= ruleThroughput )
                    // InternalAfvl.g:1697:6: lv_throughput_17_0= ruleThroughput
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getThroughputThroughputEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_throughput_17_0=ruleThroughput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"throughput",
                    							lv_throughput_17_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.Throughput");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1715:3: (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==30) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAfvl.g:1716:4: otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getEventAccess().getPropsKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,20,FOLLOW_30); 

                    				newLeafNode(otherlv_19, grammarAccess.getEventAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:1724:4: ( (lv_props_20_0= ruleEString ) )
                    // InternalAfvl.g:1725:5: (lv_props_20_0= ruleEString )
                    {
                    // InternalAfvl.g:1725:5: (lv_props_20_0= ruleEString )
                    // InternalAfvl.g:1726:6: lv_props_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getPropsEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_props_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"props",
                    							lv_props_20_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1744:3: (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==31) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAfvl.g:1745:4: otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) )
                    {
                    otherlv_21=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getEventAccess().getDecisionKeyword_9_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getEventAccess().getColonKeyword_9_1());
                    			
                    // InternalAfvl.g:1753:4: ( (otherlv_23= RULE_ID ) )
                    // InternalAfvl.g:1754:5: (otherlv_23= RULE_ID )
                    {
                    // InternalAfvl.g:1754:5: (otherlv_23= RULE_ID )
                    // InternalAfvl.g:1755:6: otherlv_23= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    					
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_32); 

                    						newLeafNode(otherlv_23, grammarAccess.getEventAccess().getDecisionArchDecisionCrossReference_9_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_24, grammarAccess.getEventAccess().getRolesKeyword_10());
            		
            otherlv_25=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_25, grammarAccess.getEventAccess().getColonKeyword_11());
            		
            otherlv_26=(Token)match(input,14,FOLLOW_33); 

            			newLeafNode(otherlv_26, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalAfvl.g:1779:3: ( (lv_roles_27_0= ruleRole ) )
            // InternalAfvl.g:1780:4: (lv_roles_27_0= ruleRole )
            {
            // InternalAfvl.g:1780:4: (lv_roles_27_0= ruleRole )
            // InternalAfvl.g:1781:5: lv_roles_27_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getEventAccess().getRolesRoleParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_9);
            lv_roles_27_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_27_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:1798:3: (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==16) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalAfvl.g:1799:4: otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) )
            	    {
            	    otherlv_28=(Token)match(input,16,FOLLOW_33); 

            	    				newLeafNode(otherlv_28, grammarAccess.getEventAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalAfvl.g:1803:4: ( (lv_roles_29_0= ruleRole ) )
            	    // InternalAfvl.g:1804:5: (lv_roles_29_0= ruleRole )
            	    {
            	    // InternalAfvl.g:1804:5: (lv_roles_29_0= ruleRole )
            	    // InternalAfvl.g:1805:6: lv_roles_29_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getEventAccess().getRolesRoleParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_roles_29_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEventRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_29_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_30=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_30, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_31=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleProcedureCall"
    // InternalAfvl.g:1835:1: entryRuleProcedureCall returns [EObject current=null] : iv_ruleProcedureCall= ruleProcedureCall EOF ;
    public final EObject entryRuleProcedureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedureCall = null;


        try {
            // InternalAfvl.g:1835:54: (iv_ruleProcedureCall= ruleProcedureCall EOF )
            // InternalAfvl.g:1836:2: iv_ruleProcedureCall= ruleProcedureCall EOF
            {
             newCompositeNode(grammarAccess.getProcedureCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcedureCall=ruleProcedureCall();

            state._fsp--;

             current =iv_ruleProcedureCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcedureCall"


    // $ANTLR start "ruleProcedureCall"
    // InternalAfvl.g:1842:1: ruleProcedureCall returns [EObject current=null] : (otherlv_0= 'ProcCall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' ) ;
    public final EObject ruleProcedureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Enumerator lv_delivery_5_0 = null;

        Enumerator lv_synct_8_0 = null;

        Enumerator lv_notification_11_0 = null;

        Enumerator lv_buffering_14_0 = null;

        Enumerator lv_throughput_17_0 = null;

        AntlrDatatypeRuleToken lv_props_20_0 = null;

        EObject lv_roles_27_0 = null;

        EObject lv_roles_29_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:1848:2: ( (otherlv_0= 'ProcCall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' ) )
            // InternalAfvl.g:1849:2: (otherlv_0= 'ProcCall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' )
            {
            // InternalAfvl.g:1849:2: (otherlv_0= 'ProcCall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' )
            // InternalAfvl.g:1850:3: otherlv_0= 'ProcCall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcedureCallAccess().getProcCallKeyword_0());
            		
            // InternalAfvl.g:1854:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:1855:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:1855:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:1856:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcedureCallAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcedureCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getProcedureCallAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:1876:3: (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==25) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAfvl.g:1877:4: otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryGuarantee ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getProcedureCallAccess().getDeliveryKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getProcedureCallAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:1885:4: ( (lv_delivery_5_0= ruleDeliveryGuarantee ) )
                    // InternalAfvl.g:1886:5: (lv_delivery_5_0= ruleDeliveryGuarantee )
                    {
                    // InternalAfvl.g:1886:5: (lv_delivery_5_0= ruleDeliveryGuarantee )
                    // InternalAfvl.g:1887:6: lv_delivery_5_0= ruleDeliveryGuarantee
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getDeliveryDeliveryGuaranteeEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_delivery_5_0=ruleDeliveryGuarantee();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcedureCallRule());
                    						}
                    						set(
                    							current,
                    							"delivery",
                    							lv_delivery_5_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.DeliveryGuarantee");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1905:3: (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==26) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAfvl.g:1906:4: otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getProcedureCallAccess().getSyncKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getProcedureCallAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:1914:4: ( (lv_synct_8_0= ruleSyncType ) )
                    // InternalAfvl.g:1915:5: (lv_synct_8_0= ruleSyncType )
                    {
                    // InternalAfvl.g:1915:5: (lv_synct_8_0= ruleSyncType )
                    // InternalAfvl.g:1916:6: lv_synct_8_0= ruleSyncType
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getSynctSyncTypeEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_synct_8_0=ruleSyncType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcedureCallRule());
                    						}
                    						set(
                    							current,
                    							"synct",
                    							lv_synct_8_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.SyncType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1934:3: (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==27) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAfvl.g:1935:4: otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) )
                    {
                    otherlv_9=(Token)match(input,27,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getProcedureCallAccess().getNotificationKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_24); 

                    				newLeafNode(otherlv_10, grammarAccess.getProcedureCallAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:1943:4: ( (lv_notification_11_0= ruleNotificationModel ) )
                    // InternalAfvl.g:1944:5: (lv_notification_11_0= ruleNotificationModel )
                    {
                    // InternalAfvl.g:1944:5: (lv_notification_11_0= ruleNotificationModel )
                    // InternalAfvl.g:1945:6: lv_notification_11_0= ruleNotificationModel
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getNotificationNotificationModelEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_notification_11_0=ruleNotificationModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcedureCallRule());
                    						}
                    						set(
                    							current,
                    							"notification",
                    							lv_notification_11_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.NotificationModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1963:3: (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==28) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAfvl.g:1964:4: otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) )
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getProcedureCallAccess().getBufferingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_26); 

                    				newLeafNode(otherlv_13, grammarAccess.getProcedureCallAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:1972:4: ( (lv_buffering_14_0= ruleBuffering ) )
                    // InternalAfvl.g:1973:5: (lv_buffering_14_0= ruleBuffering )
                    {
                    // InternalAfvl.g:1973:5: (lv_buffering_14_0= ruleBuffering )
                    // InternalAfvl.g:1974:6: lv_buffering_14_0= ruleBuffering
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getBufferingBufferingEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_buffering_14_0=ruleBuffering();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcedureCallRule());
                    						}
                    						set(
                    							current,
                    							"buffering",
                    							lv_buffering_14_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.Buffering");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1992:3: (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==29) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAfvl.g:1993:4: otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) )
                    {
                    otherlv_15=(Token)match(input,29,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getProcedureCallAccess().getThroughputKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_28); 

                    				newLeafNode(otherlv_16, grammarAccess.getProcedureCallAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:2001:4: ( (lv_throughput_17_0= ruleThroughput ) )
                    // InternalAfvl.g:2002:5: (lv_throughput_17_0= ruleThroughput )
                    {
                    // InternalAfvl.g:2002:5: (lv_throughput_17_0= ruleThroughput )
                    // InternalAfvl.g:2003:6: lv_throughput_17_0= ruleThroughput
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getThroughputThroughputEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_throughput_17_0=ruleThroughput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcedureCallRule());
                    						}
                    						set(
                    							current,
                    							"throughput",
                    							lv_throughput_17_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.Throughput");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2021:3: (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==30) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAfvl.g:2022:4: otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getProcedureCallAccess().getPropsKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,20,FOLLOW_30); 

                    				newLeafNode(otherlv_19, grammarAccess.getProcedureCallAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:2030:4: ( (lv_props_20_0= ruleEString ) )
                    // InternalAfvl.g:2031:5: (lv_props_20_0= ruleEString )
                    {
                    // InternalAfvl.g:2031:5: (lv_props_20_0= ruleEString )
                    // InternalAfvl.g:2032:6: lv_props_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getPropsEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_props_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcedureCallRule());
                    						}
                    						set(
                    							current,
                    							"props",
                    							lv_props_20_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2050:3: (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==31) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAfvl.g:2051:4: otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) )
                    {
                    otherlv_21=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getProcedureCallAccess().getDecisionKeyword_9_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getProcedureCallAccess().getColonKeyword_9_1());
                    			
                    // InternalAfvl.g:2059:4: ( (otherlv_23= RULE_ID ) )
                    // InternalAfvl.g:2060:5: (otherlv_23= RULE_ID )
                    {
                    // InternalAfvl.g:2060:5: (otherlv_23= RULE_ID )
                    // InternalAfvl.g:2061:6: otherlv_23= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcedureCallRule());
                    						}
                    					
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_32); 

                    						newLeafNode(otherlv_23, grammarAccess.getProcedureCallAccess().getDecisionArchDecisionCrossReference_9_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_24, grammarAccess.getProcedureCallAccess().getRolesKeyword_10());
            		
            otherlv_25=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_25, grammarAccess.getProcedureCallAccess().getColonKeyword_11());
            		
            otherlv_26=(Token)match(input,14,FOLLOW_33); 

            			newLeafNode(otherlv_26, grammarAccess.getProcedureCallAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalAfvl.g:2085:3: ( (lv_roles_27_0= ruleRole ) )
            // InternalAfvl.g:2086:4: (lv_roles_27_0= ruleRole )
            {
            // InternalAfvl.g:2086:4: (lv_roles_27_0= ruleRole )
            // InternalAfvl.g:2087:5: lv_roles_27_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getProcedureCallAccess().getRolesRoleParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_9);
            lv_roles_27_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedureCallRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_27_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:2104:3: (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==16) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalAfvl.g:2105:4: otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) )
            	    {
            	    otherlv_28=(Token)match(input,16,FOLLOW_33); 

            	    				newLeafNode(otherlv_28, grammarAccess.getProcedureCallAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalAfvl.g:2109:4: ( (lv_roles_29_0= ruleRole ) )
            	    // InternalAfvl.g:2110:5: (lv_roles_29_0= ruleRole )
            	    {
            	    // InternalAfvl.g:2110:5: (lv_roles_29_0= ruleRole )
            	    // InternalAfvl.g:2111:6: lv_roles_29_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getProcedureCallAccess().getRolesRoleParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_roles_29_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProcedureCallRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_29_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_30=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_30, grammarAccess.getProcedureCallAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_31=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getProcedureCallAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcedureCall"


    // $ANTLR start "entryRuleTransformer"
    // InternalAfvl.g:2141:1: entryRuleTransformer returns [EObject current=null] : iv_ruleTransformer= ruleTransformer EOF ;
    public final EObject entryRuleTransformer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformer = null;


        try {
            // InternalAfvl.g:2141:52: (iv_ruleTransformer= ruleTransformer EOF )
            // InternalAfvl.g:2142:2: iv_ruleTransformer= ruleTransformer EOF
            {
             newCompositeNode(grammarAccess.getTransformerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransformer=ruleTransformer();

            state._fsp--;

             current =iv_ruleTransformer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransformer"


    // $ANTLR start "ruleTransformer"
    // InternalAfvl.g:2148:1: ruleTransformer returns [EObject current=null] : (otherlv_0= 'Transformer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'delivery' otherlv_7= ':' ( (lv_delivery_8_0= ruleDeliveryGuarantee ) ) )? (otherlv_9= 'pmml' otherlv_10= ':' ( (lv_pmml_11_0= ruleEString ) ) )? (otherlv_12= 'decision' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= 'ports' otherlv_16= ':' otherlv_17= '{' ( (lv_ports_18_0= rulePort ) ) (otherlv_19= ',' ( (lv_ports_20_0= rulePort ) ) )* otherlv_21= '}' otherlv_22= '}' ) ;
    public final EObject ruleTransformer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Enumerator lv_procModel_5_0 = null;

        Enumerator lv_delivery_8_0 = null;

        AntlrDatatypeRuleToken lv_pmml_11_0 = null;

        EObject lv_ports_18_0 = null;

        EObject lv_ports_20_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:2154:2: ( (otherlv_0= 'Transformer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'delivery' otherlv_7= ':' ( (lv_delivery_8_0= ruleDeliveryGuarantee ) ) )? (otherlv_9= 'pmml' otherlv_10= ':' ( (lv_pmml_11_0= ruleEString ) ) )? (otherlv_12= 'decision' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= 'ports' otherlv_16= ':' otherlv_17= '{' ( (lv_ports_18_0= rulePort ) ) (otherlv_19= ',' ( (lv_ports_20_0= rulePort ) ) )* otherlv_21= '}' otherlv_22= '}' ) )
            // InternalAfvl.g:2155:2: (otherlv_0= 'Transformer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'delivery' otherlv_7= ':' ( (lv_delivery_8_0= ruleDeliveryGuarantee ) ) )? (otherlv_9= 'pmml' otherlv_10= ':' ( (lv_pmml_11_0= ruleEString ) ) )? (otherlv_12= 'decision' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= 'ports' otherlv_16= ':' otherlv_17= '{' ( (lv_ports_18_0= rulePort ) ) (otherlv_19= ',' ( (lv_ports_20_0= rulePort ) ) )* otherlv_21= '}' otherlv_22= '}' )
            {
            // InternalAfvl.g:2155:2: (otherlv_0= 'Transformer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'delivery' otherlv_7= ':' ( (lv_delivery_8_0= ruleDeliveryGuarantee ) ) )? (otherlv_9= 'pmml' otherlv_10= ':' ( (lv_pmml_11_0= ruleEString ) ) )? (otherlv_12= 'decision' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= 'ports' otherlv_16= ':' otherlv_17= '{' ( (lv_ports_18_0= rulePort ) ) (otherlv_19= ',' ( (lv_ports_20_0= rulePort ) ) )* otherlv_21= '}' otherlv_22= '}' )
            // InternalAfvl.g:2156:3: otherlv_0= 'Transformer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'delivery' otherlv_7= ':' ( (lv_delivery_8_0= ruleDeliveryGuarantee ) ) )? (otherlv_9= 'pmml' otherlv_10= ':' ( (lv_pmml_11_0= ruleEString ) ) )? (otherlv_12= 'decision' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= 'ports' otherlv_16= ':' otherlv_17= '{' ( (lv_ports_18_0= rulePort ) ) (otherlv_19= ',' ( (lv_ports_20_0= rulePort ) ) )* otherlv_21= '}' otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransformerAccess().getTransformerKeyword_0());
            		
            // InternalAfvl.g:2160:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:2161:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:2161:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:2162:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTransformerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransformerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getTransformerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:2182:3: (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==38) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAfvl.g:2183:4: otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransformerAccess().getProcModelKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_37); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransformerAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:2191:4: ( (lv_procModel_5_0= ruleProcessingModel ) )
                    // InternalAfvl.g:2192:5: (lv_procModel_5_0= ruleProcessingModel )
                    {
                    // InternalAfvl.g:2192:5: (lv_procModel_5_0= ruleProcessingModel )
                    // InternalAfvl.g:2193:6: lv_procModel_5_0= ruleProcessingModel
                    {

                    						newCompositeNode(grammarAccess.getTransformerAccess().getProcModelProcessingModelEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_procModel_5_0=ruleProcessingModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransformerRule());
                    						}
                    						set(
                    							current,
                    							"procModel",
                    							lv_procModel_5_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.ProcessingModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2211:3: (otherlv_6= 'delivery' otherlv_7= ':' ( (lv_delivery_8_0= ruleDeliveryGuarantee ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==25) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAfvl.g:2212:4: otherlv_6= 'delivery' otherlv_7= ':' ( (lv_delivery_8_0= ruleDeliveryGuarantee ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getTransformerAccess().getDeliveryKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getTransformerAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:2220:4: ( (lv_delivery_8_0= ruleDeliveryGuarantee ) )
                    // InternalAfvl.g:2221:5: (lv_delivery_8_0= ruleDeliveryGuarantee )
                    {
                    // InternalAfvl.g:2221:5: (lv_delivery_8_0= ruleDeliveryGuarantee )
                    // InternalAfvl.g:2222:6: lv_delivery_8_0= ruleDeliveryGuarantee
                    {

                    						newCompositeNode(grammarAccess.getTransformerAccess().getDeliveryDeliveryGuaranteeEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_delivery_8_0=ruleDeliveryGuarantee();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransformerRule());
                    						}
                    						set(
                    							current,
                    							"delivery",
                    							lv_delivery_8_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.DeliveryGuarantee");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2240:3: (otherlv_9= 'pmml' otherlv_10= ':' ( (lv_pmml_11_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==39) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalAfvl.g:2241:4: otherlv_9= 'pmml' otherlv_10= ':' ( (lv_pmml_11_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getTransformerAccess().getPmmlKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_30); 

                    				newLeafNode(otherlv_10, grammarAccess.getTransformerAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:2249:4: ( (lv_pmml_11_0= ruleEString ) )
                    // InternalAfvl.g:2250:5: (lv_pmml_11_0= ruleEString )
                    {
                    // InternalAfvl.g:2250:5: (lv_pmml_11_0= ruleEString )
                    // InternalAfvl.g:2251:6: lv_pmml_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTransformerAccess().getPmmlEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_pmml_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransformerRule());
                    						}
                    						set(
                    							current,
                    							"pmml",
                    							lv_pmml_11_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2269:3: (otherlv_12= 'decision' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==31) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAfvl.g:2270:4: otherlv_12= 'decision' otherlv_13= ':' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_12=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getTransformerAccess().getDecisionKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getTransformerAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:2278:4: ( (otherlv_14= RULE_ID ) )
                    // InternalAfvl.g:2279:5: (otherlv_14= RULE_ID )
                    {
                    // InternalAfvl.g:2279:5: (otherlv_14= RULE_ID )
                    // InternalAfvl.g:2280:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransformerRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_41); 

                    						newLeafNode(otherlv_14, grammarAccess.getTransformerAccess().getDecisionArchDecisionCrossReference_6_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_15, grammarAccess.getTransformerAccess().getPortsKeyword_7());
            		
            otherlv_16=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_16, grammarAccess.getTransformerAccess().getColonKeyword_8());
            		
            otherlv_17=(Token)match(input,14,FOLLOW_42); 

            			newLeafNode(otherlv_17, grammarAccess.getTransformerAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalAfvl.g:2304:3: ( (lv_ports_18_0= rulePort ) )
            // InternalAfvl.g:2305:4: (lv_ports_18_0= rulePort )
            {
            // InternalAfvl.g:2305:4: (lv_ports_18_0= rulePort )
            // InternalAfvl.g:2306:5: lv_ports_18_0= rulePort
            {

            					newCompositeNode(grammarAccess.getTransformerAccess().getPortsPortParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_9);
            lv_ports_18_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransformerRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_18_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:2323:3: (otherlv_19= ',' ( (lv_ports_20_0= rulePort ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==16) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalAfvl.g:2324:4: otherlv_19= ',' ( (lv_ports_20_0= rulePort ) )
            	    {
            	    otherlv_19=(Token)match(input,16,FOLLOW_42); 

            	    				newLeafNode(otherlv_19, grammarAccess.getTransformerAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalAfvl.g:2328:4: ( (lv_ports_20_0= rulePort ) )
            	    // InternalAfvl.g:2329:5: (lv_ports_20_0= rulePort )
            	    {
            	    // InternalAfvl.g:2329:5: (lv_ports_20_0= rulePort )
            	    // InternalAfvl.g:2330:6: lv_ports_20_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getTransformerAccess().getPortsPortParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_ports_20_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTransformerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_20_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_21=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_21, grammarAccess.getTransformerAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_22=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getTransformerAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransformer"


    // $ANTLR start "entryRuleEstimator"
    // InternalAfvl.g:2360:1: entryRuleEstimator returns [EObject current=null] : iv_ruleEstimator= ruleEstimator EOF ;
    public final EObject entryRuleEstimator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEstimator = null;


        try {
            // InternalAfvl.g:2360:50: (iv_ruleEstimator= ruleEstimator EOF )
            // InternalAfvl.g:2361:2: iv_ruleEstimator= ruleEstimator EOF
            {
             newCompositeNode(grammarAccess.getEstimatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEstimator=ruleEstimator();

            state._fsp--;

             current =iv_ruleEstimator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEstimator"


    // $ANTLR start "ruleEstimator"
    // InternalAfvl.g:2367:1: ruleEstimator returns [EObject current=null] : (otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'delivery' otherlv_7= ':' ( (lv_delivery_8_0= ruleDeliveryGuarantee ) ) )? (otherlv_9= 'pmml' otherlv_10= ':' ( (lv_pmml_11_0= ruleEString ) ) )? (otherlv_12= 'decision' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= 'ports' otherlv_16= ':' otherlv_17= '{' ( (lv_ports_18_0= rulePort ) ) (otherlv_19= ',' ( (lv_ports_20_0= rulePort ) ) )* otherlv_21= '}' otherlv_22= '}' ) ;
    public final EObject ruleEstimator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Enumerator lv_procModel_5_0 = null;

        Enumerator lv_delivery_8_0 = null;

        AntlrDatatypeRuleToken lv_pmml_11_0 = null;

        EObject lv_ports_18_0 = null;

        EObject lv_ports_20_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:2373:2: ( (otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'delivery' otherlv_7= ':' ( (lv_delivery_8_0= ruleDeliveryGuarantee ) ) )? (otherlv_9= 'pmml' otherlv_10= ':' ( (lv_pmml_11_0= ruleEString ) ) )? (otherlv_12= 'decision' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= 'ports' otherlv_16= ':' otherlv_17= '{' ( (lv_ports_18_0= rulePort ) ) (otherlv_19= ',' ( (lv_ports_20_0= rulePort ) ) )* otherlv_21= '}' otherlv_22= '}' ) )
            // InternalAfvl.g:2374:2: (otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'delivery' otherlv_7= ':' ( (lv_delivery_8_0= ruleDeliveryGuarantee ) ) )? (otherlv_9= 'pmml' otherlv_10= ':' ( (lv_pmml_11_0= ruleEString ) ) )? (otherlv_12= 'decision' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= 'ports' otherlv_16= ':' otherlv_17= '{' ( (lv_ports_18_0= rulePort ) ) (otherlv_19= ',' ( (lv_ports_20_0= rulePort ) ) )* otherlv_21= '}' otherlv_22= '}' )
            {
            // InternalAfvl.g:2374:2: (otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'delivery' otherlv_7= ':' ( (lv_delivery_8_0= ruleDeliveryGuarantee ) ) )? (otherlv_9= 'pmml' otherlv_10= ':' ( (lv_pmml_11_0= ruleEString ) ) )? (otherlv_12= 'decision' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= 'ports' otherlv_16= ':' otherlv_17= '{' ( (lv_ports_18_0= rulePort ) ) (otherlv_19= ',' ( (lv_ports_20_0= rulePort ) ) )* otherlv_21= '}' otherlv_22= '}' )
            // InternalAfvl.g:2375:3: otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'delivery' otherlv_7= ':' ( (lv_delivery_8_0= ruleDeliveryGuarantee ) ) )? (otherlv_9= 'pmml' otherlv_10= ':' ( (lv_pmml_11_0= ruleEString ) ) )? (otherlv_12= 'decision' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= 'ports' otherlv_16= ':' otherlv_17= '{' ( (lv_ports_18_0= rulePort ) ) (otherlv_19= ',' ( (lv_ports_20_0= rulePort ) ) )* otherlv_21= '}' otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEstimatorAccess().getEstimatorKeyword_0());
            		
            // InternalAfvl.g:2379:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:2380:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:2380:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:2381:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEstimatorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEstimatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getEstimatorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:2401:3: (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==38) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalAfvl.g:2402:4: otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getEstimatorAccess().getProcModelKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_37); 

                    				newLeafNode(otherlv_4, grammarAccess.getEstimatorAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:2410:4: ( (lv_procModel_5_0= ruleProcessingModel ) )
                    // InternalAfvl.g:2411:5: (lv_procModel_5_0= ruleProcessingModel )
                    {
                    // InternalAfvl.g:2411:5: (lv_procModel_5_0= ruleProcessingModel )
                    // InternalAfvl.g:2412:6: lv_procModel_5_0= ruleProcessingModel
                    {

                    						newCompositeNode(grammarAccess.getEstimatorAccess().getProcModelProcessingModelEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_procModel_5_0=ruleProcessingModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEstimatorRule());
                    						}
                    						set(
                    							current,
                    							"procModel",
                    							lv_procModel_5_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.ProcessingModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2430:3: (otherlv_6= 'delivery' otherlv_7= ':' ( (lv_delivery_8_0= ruleDeliveryGuarantee ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==25) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalAfvl.g:2431:4: otherlv_6= 'delivery' otherlv_7= ':' ( (lv_delivery_8_0= ruleDeliveryGuarantee ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getEstimatorAccess().getDeliveryKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getEstimatorAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:2439:4: ( (lv_delivery_8_0= ruleDeliveryGuarantee ) )
                    // InternalAfvl.g:2440:5: (lv_delivery_8_0= ruleDeliveryGuarantee )
                    {
                    // InternalAfvl.g:2440:5: (lv_delivery_8_0= ruleDeliveryGuarantee )
                    // InternalAfvl.g:2441:6: lv_delivery_8_0= ruleDeliveryGuarantee
                    {

                    						newCompositeNode(grammarAccess.getEstimatorAccess().getDeliveryDeliveryGuaranteeEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_delivery_8_0=ruleDeliveryGuarantee();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEstimatorRule());
                    						}
                    						set(
                    							current,
                    							"delivery",
                    							lv_delivery_8_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.DeliveryGuarantee");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2459:3: (otherlv_9= 'pmml' otherlv_10= ':' ( (lv_pmml_11_0= ruleEString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==39) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAfvl.g:2460:4: otherlv_9= 'pmml' otherlv_10= ':' ( (lv_pmml_11_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getEstimatorAccess().getPmmlKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_30); 

                    				newLeafNode(otherlv_10, grammarAccess.getEstimatorAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:2468:4: ( (lv_pmml_11_0= ruleEString ) )
                    // InternalAfvl.g:2469:5: (lv_pmml_11_0= ruleEString )
                    {
                    // InternalAfvl.g:2469:5: (lv_pmml_11_0= ruleEString )
                    // InternalAfvl.g:2470:6: lv_pmml_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEstimatorAccess().getPmmlEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_pmml_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEstimatorRule());
                    						}
                    						set(
                    							current,
                    							"pmml",
                    							lv_pmml_11_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2488:3: (otherlv_12= 'decision' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==31) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalAfvl.g:2489:4: otherlv_12= 'decision' otherlv_13= ':' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_12=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getEstimatorAccess().getDecisionKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getEstimatorAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:2497:4: ( (otherlv_14= RULE_ID ) )
                    // InternalAfvl.g:2498:5: (otherlv_14= RULE_ID )
                    {
                    // InternalAfvl.g:2498:5: (otherlv_14= RULE_ID )
                    // InternalAfvl.g:2499:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEstimatorRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_41); 

                    						newLeafNode(otherlv_14, grammarAccess.getEstimatorAccess().getDecisionArchDecisionCrossReference_6_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_15, grammarAccess.getEstimatorAccess().getPortsKeyword_7());
            		
            otherlv_16=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_16, grammarAccess.getEstimatorAccess().getColonKeyword_8());
            		
            otherlv_17=(Token)match(input,14,FOLLOW_42); 

            			newLeafNode(otherlv_17, grammarAccess.getEstimatorAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalAfvl.g:2523:3: ( (lv_ports_18_0= rulePort ) )
            // InternalAfvl.g:2524:4: (lv_ports_18_0= rulePort )
            {
            // InternalAfvl.g:2524:4: (lv_ports_18_0= rulePort )
            // InternalAfvl.g:2525:5: lv_ports_18_0= rulePort
            {

            					newCompositeNode(grammarAccess.getEstimatorAccess().getPortsPortParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_9);
            lv_ports_18_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEstimatorRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_18_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:2542:3: (otherlv_19= ',' ( (lv_ports_20_0= rulePort ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==16) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalAfvl.g:2543:4: otherlv_19= ',' ( (lv_ports_20_0= rulePort ) )
            	    {
            	    otherlv_19=(Token)match(input,16,FOLLOW_42); 

            	    				newLeafNode(otherlv_19, grammarAccess.getEstimatorAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalAfvl.g:2547:4: ( (lv_ports_20_0= rulePort ) )
            	    // InternalAfvl.g:2548:5: (lv_ports_20_0= rulePort )
            	    {
            	    // InternalAfvl.g:2548:5: (lv_ports_20_0= rulePort )
            	    // InternalAfvl.g:2549:6: lv_ports_20_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getEstimatorAccess().getPortsPortParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_ports_20_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEstimatorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_20_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            otherlv_21=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_21, grammarAccess.getEstimatorAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_22=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getEstimatorAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEstimator"


    // $ANTLR start "entryRuleIngestor"
    // InternalAfvl.g:2579:1: entryRuleIngestor returns [EObject current=null] : iv_ruleIngestor= ruleIngestor EOF ;
    public final EObject entryRuleIngestor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngestor = null;


        try {
            // InternalAfvl.g:2579:49: (iv_ruleIngestor= ruleIngestor EOF )
            // InternalAfvl.g:2580:2: iv_ruleIngestor= ruleIngestor EOF
            {
             newCompositeNode(grammarAccess.getIngestorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngestor=ruleIngestor();

            state._fsp--;

             current =iv_ruleIngestor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIngestor"


    // $ANTLR start "ruleIngestor"
    // InternalAfvl.g:2586:1: ruleIngestor returns [EObject current=null] : (otherlv_0= 'Ingestor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAccessType ) ) (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )? (otherlv_9= 'delivery' otherlv_10= ':' ( (lv_delivery_11_0= ruleDeliveryGuarantee ) ) )? (otherlv_12= 'conn' otherlv_13= ':' ( (lv_conn_14_0= ruleEString ) ) )? (otherlv_15= 'format' otherlv_16= ':' ( (lv_format_17_0= ruleEString ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'ports' otherlv_25= ':' otherlv_26= '{' ( (lv_ports_27_0= rulePort ) ) (otherlv_28= ',' ( (lv_ports_29_0= rulePort ) ) )* otherlv_30= '}' otherlv_31= '}' ) ;
    public final EObject ruleIngestor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Enumerator lv_type_5_0 = null;

        Enumerator lv_procModel_8_0 = null;

        Enumerator lv_delivery_11_0 = null;

        AntlrDatatypeRuleToken lv_conn_14_0 = null;

        AntlrDatatypeRuleToken lv_format_17_0 = null;

        AntlrDatatypeRuleToken lv_props_20_0 = null;

        EObject lv_ports_27_0 = null;

        EObject lv_ports_29_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:2592:2: ( (otherlv_0= 'Ingestor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAccessType ) ) (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )? (otherlv_9= 'delivery' otherlv_10= ':' ( (lv_delivery_11_0= ruleDeliveryGuarantee ) ) )? (otherlv_12= 'conn' otherlv_13= ':' ( (lv_conn_14_0= ruleEString ) ) )? (otherlv_15= 'format' otherlv_16= ':' ( (lv_format_17_0= ruleEString ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'ports' otherlv_25= ':' otherlv_26= '{' ( (lv_ports_27_0= rulePort ) ) (otherlv_28= ',' ( (lv_ports_29_0= rulePort ) ) )* otherlv_30= '}' otherlv_31= '}' ) )
            // InternalAfvl.g:2593:2: (otherlv_0= 'Ingestor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAccessType ) ) (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )? (otherlv_9= 'delivery' otherlv_10= ':' ( (lv_delivery_11_0= ruleDeliveryGuarantee ) ) )? (otherlv_12= 'conn' otherlv_13= ':' ( (lv_conn_14_0= ruleEString ) ) )? (otherlv_15= 'format' otherlv_16= ':' ( (lv_format_17_0= ruleEString ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'ports' otherlv_25= ':' otherlv_26= '{' ( (lv_ports_27_0= rulePort ) ) (otherlv_28= ',' ( (lv_ports_29_0= rulePort ) ) )* otherlv_30= '}' otherlv_31= '}' )
            {
            // InternalAfvl.g:2593:2: (otherlv_0= 'Ingestor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAccessType ) ) (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )? (otherlv_9= 'delivery' otherlv_10= ':' ( (lv_delivery_11_0= ruleDeliveryGuarantee ) ) )? (otherlv_12= 'conn' otherlv_13= ':' ( (lv_conn_14_0= ruleEString ) ) )? (otherlv_15= 'format' otherlv_16= ':' ( (lv_format_17_0= ruleEString ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'ports' otherlv_25= ':' otherlv_26= '{' ( (lv_ports_27_0= rulePort ) ) (otherlv_28= ',' ( (lv_ports_29_0= rulePort ) ) )* otherlv_30= '}' otherlv_31= '}' )
            // InternalAfvl.g:2594:3: otherlv_0= 'Ingestor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAccessType ) ) (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )? (otherlv_9= 'delivery' otherlv_10= ':' ( (lv_delivery_11_0= ruleDeliveryGuarantee ) ) )? (otherlv_12= 'conn' otherlv_13= ':' ( (lv_conn_14_0= ruleEString ) ) )? (otherlv_15= 'format' otherlv_16= ':' ( (lv_format_17_0= ruleEString ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'ports' otherlv_25= ':' otherlv_26= '{' ( (lv_ports_27_0= rulePort ) ) (otherlv_28= ',' ( (lv_ports_29_0= rulePort ) ) )* otherlv_30= '}' otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIngestorAccess().getIngestorKeyword_0());
            		
            // InternalAfvl.g:2598:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:2599:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:2599:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:2600:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIngestorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIngestorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getIngestorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,43,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getIngestorAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_44); 

            			newLeafNode(otherlv_4, grammarAccess.getIngestorAccess().getColonKeyword_4());
            		
            // InternalAfvl.g:2628:3: ( (lv_type_5_0= ruleAccessType ) )
            // InternalAfvl.g:2629:4: (lv_type_5_0= ruleAccessType )
            {
            // InternalAfvl.g:2629:4: (lv_type_5_0= ruleAccessType )
            // InternalAfvl.g:2630:5: lv_type_5_0= ruleAccessType
            {

            					newCompositeNode(grammarAccess.getIngestorAccess().getTypeAccessTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_45);
            lv_type_5_0=ruleAccessType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIngestorRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"co.edu.uniandes.accordant_fv.Afvl.AccessType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:2647:3: (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==38) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalAfvl.g:2648:4: otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getIngestorAccess().getProcModelKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_37); 

                    				newLeafNode(otherlv_7, grammarAccess.getIngestorAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:2656:4: ( (lv_procModel_8_0= ruleProcessingModel ) )
                    // InternalAfvl.g:2657:5: (lv_procModel_8_0= ruleProcessingModel )
                    {
                    // InternalAfvl.g:2657:5: (lv_procModel_8_0= ruleProcessingModel )
                    // InternalAfvl.g:2658:6: lv_procModel_8_0= ruleProcessingModel
                    {

                    						newCompositeNode(grammarAccess.getIngestorAccess().getProcModelProcessingModelEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_procModel_8_0=ruleProcessingModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngestorRule());
                    						}
                    						set(
                    							current,
                    							"procModel",
                    							lv_procModel_8_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.ProcessingModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2676:3: (otherlv_9= 'delivery' otherlv_10= ':' ( (lv_delivery_11_0= ruleDeliveryGuarantee ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==25) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalAfvl.g:2677:4: otherlv_9= 'delivery' otherlv_10= ':' ( (lv_delivery_11_0= ruleDeliveryGuarantee ) )
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getIngestorAccess().getDeliveryKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_20); 

                    				newLeafNode(otherlv_10, grammarAccess.getIngestorAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:2685:4: ( (lv_delivery_11_0= ruleDeliveryGuarantee ) )
                    // InternalAfvl.g:2686:5: (lv_delivery_11_0= ruleDeliveryGuarantee )
                    {
                    // InternalAfvl.g:2686:5: (lv_delivery_11_0= ruleDeliveryGuarantee )
                    // InternalAfvl.g:2687:6: lv_delivery_11_0= ruleDeliveryGuarantee
                    {

                    						newCompositeNode(grammarAccess.getIngestorAccess().getDeliveryDeliveryGuaranteeEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_delivery_11_0=ruleDeliveryGuarantee();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngestorRule());
                    						}
                    						set(
                    							current,
                    							"delivery",
                    							lv_delivery_11_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.DeliveryGuarantee");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2705:3: (otherlv_12= 'conn' otherlv_13= ':' ( (lv_conn_14_0= ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==44) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAfvl.g:2706:4: otherlv_12= 'conn' otherlv_13= ':' ( (lv_conn_14_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,44,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getIngestorAccess().getConnKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_30); 

                    				newLeafNode(otherlv_13, grammarAccess.getIngestorAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:2714:4: ( (lv_conn_14_0= ruleEString ) )
                    // InternalAfvl.g:2715:5: (lv_conn_14_0= ruleEString )
                    {
                    // InternalAfvl.g:2715:5: (lv_conn_14_0= ruleEString )
                    // InternalAfvl.g:2716:6: lv_conn_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIngestorAccess().getConnEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_conn_14_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngestorRule());
                    						}
                    						set(
                    							current,
                    							"conn",
                    							lv_conn_14_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2734:3: (otherlv_15= 'format' otherlv_16= ':' ( (lv_format_17_0= ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==45) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalAfvl.g:2735:4: otherlv_15= 'format' otherlv_16= ':' ( (lv_format_17_0= ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,45,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getIngestorAccess().getFormatKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_30); 

                    				newLeafNode(otherlv_16, grammarAccess.getIngestorAccess().getColonKeyword_9_1());
                    			
                    // InternalAfvl.g:2743:4: ( (lv_format_17_0= ruleEString ) )
                    // InternalAfvl.g:2744:5: (lv_format_17_0= ruleEString )
                    {
                    // InternalAfvl.g:2744:5: (lv_format_17_0= ruleEString )
                    // InternalAfvl.g:2745:6: lv_format_17_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIngestorAccess().getFormatEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_format_17_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngestorRule());
                    						}
                    						set(
                    							current,
                    							"format",
                    							lv_format_17_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2763:3: (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==30) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalAfvl.g:2764:4: otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getIngestorAccess().getPropsKeyword_10_0());
                    			
                    otherlv_19=(Token)match(input,20,FOLLOW_30); 

                    				newLeafNode(otherlv_19, grammarAccess.getIngestorAccess().getColonKeyword_10_1());
                    			
                    // InternalAfvl.g:2772:4: ( (lv_props_20_0= ruleEString ) )
                    // InternalAfvl.g:2773:5: (lv_props_20_0= ruleEString )
                    {
                    // InternalAfvl.g:2773:5: (lv_props_20_0= ruleEString )
                    // InternalAfvl.g:2774:6: lv_props_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIngestorAccess().getPropsEStringParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_props_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngestorRule());
                    						}
                    						set(
                    							current,
                    							"props",
                    							lv_props_20_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2792:3: (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==31) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalAfvl.g:2793:4: otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) )
                    {
                    otherlv_21=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getIngestorAccess().getDecisionKeyword_11_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getIngestorAccess().getColonKeyword_11_1());
                    			
                    // InternalAfvl.g:2801:4: ( (otherlv_23= RULE_ID ) )
                    // InternalAfvl.g:2802:5: (otherlv_23= RULE_ID )
                    {
                    // InternalAfvl.g:2802:5: (otherlv_23= RULE_ID )
                    // InternalAfvl.g:2803:6: otherlv_23= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIngestorRule());
                    						}
                    					
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_41); 

                    						newLeafNode(otherlv_23, grammarAccess.getIngestorAccess().getDecisionArchDecisionCrossReference_11_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_24, grammarAccess.getIngestorAccess().getPortsKeyword_12());
            		
            otherlv_25=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_25, grammarAccess.getIngestorAccess().getColonKeyword_13());
            		
            otherlv_26=(Token)match(input,14,FOLLOW_42); 

            			newLeafNode(otherlv_26, grammarAccess.getIngestorAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalAfvl.g:2827:3: ( (lv_ports_27_0= rulePort ) )
            // InternalAfvl.g:2828:4: (lv_ports_27_0= rulePort )
            {
            // InternalAfvl.g:2828:4: (lv_ports_27_0= rulePort )
            // InternalAfvl.g:2829:5: lv_ports_27_0= rulePort
            {

            					newCompositeNode(grammarAccess.getIngestorAccess().getPortsPortParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_9);
            lv_ports_27_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIngestorRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_27_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:2846:3: (otherlv_28= ',' ( (lv_ports_29_0= rulePort ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==16) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalAfvl.g:2847:4: otherlv_28= ',' ( (lv_ports_29_0= rulePort ) )
            	    {
            	    otherlv_28=(Token)match(input,16,FOLLOW_42); 

            	    				newLeafNode(otherlv_28, grammarAccess.getIngestorAccess().getCommaKeyword_16_0());
            	    			
            	    // InternalAfvl.g:2851:4: ( (lv_ports_29_0= rulePort ) )
            	    // InternalAfvl.g:2852:5: (lv_ports_29_0= rulePort )
            	    {
            	    // InternalAfvl.g:2852:5: (lv_ports_29_0= rulePort )
            	    // InternalAfvl.g:2853:6: lv_ports_29_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getIngestorAccess().getPortsPortParserRuleCall_16_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_ports_29_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIngestorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_29_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_30=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_30, grammarAccess.getIngestorAccess().getRightCurlyBracketKeyword_17());
            		
            otherlv_31=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getIngestorAccess().getRightCurlyBracketKeyword_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIngestor"


    // $ANTLR start "entryRuleSink"
    // InternalAfvl.g:2883:1: entryRuleSink returns [EObject current=null] : iv_ruleSink= ruleSink EOF ;
    public final EObject entryRuleSink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSink = null;


        try {
            // InternalAfvl.g:2883:45: (iv_ruleSink= ruleSink EOF )
            // InternalAfvl.g:2884:2: iv_ruleSink= ruleSink EOF
            {
             newCompositeNode(grammarAccess.getSinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSink=ruleSink();

            state._fsp--;

             current =iv_ruleSink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSink"


    // $ANTLR start "ruleSink"
    // InternalAfvl.g:2890:1: ruleSink returns [EObject current=null] : (otherlv_0= 'Sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAccessType ) ) (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )? (otherlv_9= 'delivery' otherlv_10= ':' ( (lv_delivery_11_0= ruleDeliveryGuarantee ) ) )? (otherlv_12= 'conn' otherlv_13= ':' ( (lv_conn_14_0= ruleEString ) ) )? (otherlv_15= 'format' otherlv_16= ':' ( (lv_format_17_0= ruleEString ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'ports' otherlv_25= ':' otherlv_26= '{' ( (lv_ports_27_0= rulePort ) ) (otherlv_28= ',' ( (lv_ports_29_0= rulePort ) ) )* otherlv_30= '}' otherlv_31= '}' ) ;
    public final EObject ruleSink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Enumerator lv_type_5_0 = null;

        Enumerator lv_procModel_8_0 = null;

        Enumerator lv_delivery_11_0 = null;

        AntlrDatatypeRuleToken lv_conn_14_0 = null;

        AntlrDatatypeRuleToken lv_format_17_0 = null;

        AntlrDatatypeRuleToken lv_props_20_0 = null;

        EObject lv_ports_27_0 = null;

        EObject lv_ports_29_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:2896:2: ( (otherlv_0= 'Sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAccessType ) ) (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )? (otherlv_9= 'delivery' otherlv_10= ':' ( (lv_delivery_11_0= ruleDeliveryGuarantee ) ) )? (otherlv_12= 'conn' otherlv_13= ':' ( (lv_conn_14_0= ruleEString ) ) )? (otherlv_15= 'format' otherlv_16= ':' ( (lv_format_17_0= ruleEString ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'ports' otherlv_25= ':' otherlv_26= '{' ( (lv_ports_27_0= rulePort ) ) (otherlv_28= ',' ( (lv_ports_29_0= rulePort ) ) )* otherlv_30= '}' otherlv_31= '}' ) )
            // InternalAfvl.g:2897:2: (otherlv_0= 'Sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAccessType ) ) (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )? (otherlv_9= 'delivery' otherlv_10= ':' ( (lv_delivery_11_0= ruleDeliveryGuarantee ) ) )? (otherlv_12= 'conn' otherlv_13= ':' ( (lv_conn_14_0= ruleEString ) ) )? (otherlv_15= 'format' otherlv_16= ':' ( (lv_format_17_0= ruleEString ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'ports' otherlv_25= ':' otherlv_26= '{' ( (lv_ports_27_0= rulePort ) ) (otherlv_28= ',' ( (lv_ports_29_0= rulePort ) ) )* otherlv_30= '}' otherlv_31= '}' )
            {
            // InternalAfvl.g:2897:2: (otherlv_0= 'Sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAccessType ) ) (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )? (otherlv_9= 'delivery' otherlv_10= ':' ( (lv_delivery_11_0= ruleDeliveryGuarantee ) ) )? (otherlv_12= 'conn' otherlv_13= ':' ( (lv_conn_14_0= ruleEString ) ) )? (otherlv_15= 'format' otherlv_16= ':' ( (lv_format_17_0= ruleEString ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'ports' otherlv_25= ':' otherlv_26= '{' ( (lv_ports_27_0= rulePort ) ) (otherlv_28= ',' ( (lv_ports_29_0= rulePort ) ) )* otherlv_30= '}' otherlv_31= '}' )
            // InternalAfvl.g:2898:3: otherlv_0= 'Sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAccessType ) ) (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )? (otherlv_9= 'delivery' otherlv_10= ':' ( (lv_delivery_11_0= ruleDeliveryGuarantee ) ) )? (otherlv_12= 'conn' otherlv_13= ':' ( (lv_conn_14_0= ruleEString ) ) )? (otherlv_15= 'format' otherlv_16= ':' ( (lv_format_17_0= ruleEString ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'ports' otherlv_25= ':' otherlv_26= '{' ( (lv_ports_27_0= rulePort ) ) (otherlv_28= ',' ( (lv_ports_29_0= rulePort ) ) )* otherlv_30= '}' otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSinkAccess().getSinkKeyword_0());
            		
            // InternalAfvl.g:2902:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:2903:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:2903:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:2904:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSinkAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getSinkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,43,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getSinkAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_44); 

            			newLeafNode(otherlv_4, grammarAccess.getSinkAccess().getColonKeyword_4());
            		
            // InternalAfvl.g:2932:3: ( (lv_type_5_0= ruleAccessType ) )
            // InternalAfvl.g:2933:4: (lv_type_5_0= ruleAccessType )
            {
            // InternalAfvl.g:2933:4: (lv_type_5_0= ruleAccessType )
            // InternalAfvl.g:2934:5: lv_type_5_0= ruleAccessType
            {

            					newCompositeNode(grammarAccess.getSinkAccess().getTypeAccessTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_45);
            lv_type_5_0=ruleAccessType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSinkRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"co.edu.uniandes.accordant_fv.Afvl.AccessType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:2951:3: (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==38) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalAfvl.g:2952:4: otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getSinkAccess().getProcModelKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_37); 

                    				newLeafNode(otherlv_7, grammarAccess.getSinkAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:2960:4: ( (lv_procModel_8_0= ruleProcessingModel ) )
                    // InternalAfvl.g:2961:5: (lv_procModel_8_0= ruleProcessingModel )
                    {
                    // InternalAfvl.g:2961:5: (lv_procModel_8_0= ruleProcessingModel )
                    // InternalAfvl.g:2962:6: lv_procModel_8_0= ruleProcessingModel
                    {

                    						newCompositeNode(grammarAccess.getSinkAccess().getProcModelProcessingModelEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_procModel_8_0=ruleProcessingModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSinkRule());
                    						}
                    						set(
                    							current,
                    							"procModel",
                    							lv_procModel_8_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.ProcessingModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2980:3: (otherlv_9= 'delivery' otherlv_10= ':' ( (lv_delivery_11_0= ruleDeliveryGuarantee ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==25) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalAfvl.g:2981:4: otherlv_9= 'delivery' otherlv_10= ':' ( (lv_delivery_11_0= ruleDeliveryGuarantee ) )
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getSinkAccess().getDeliveryKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_20); 

                    				newLeafNode(otherlv_10, grammarAccess.getSinkAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:2989:4: ( (lv_delivery_11_0= ruleDeliveryGuarantee ) )
                    // InternalAfvl.g:2990:5: (lv_delivery_11_0= ruleDeliveryGuarantee )
                    {
                    // InternalAfvl.g:2990:5: (lv_delivery_11_0= ruleDeliveryGuarantee )
                    // InternalAfvl.g:2991:6: lv_delivery_11_0= ruleDeliveryGuarantee
                    {

                    						newCompositeNode(grammarAccess.getSinkAccess().getDeliveryDeliveryGuaranteeEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_delivery_11_0=ruleDeliveryGuarantee();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSinkRule());
                    						}
                    						set(
                    							current,
                    							"delivery",
                    							lv_delivery_11_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.DeliveryGuarantee");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:3009:3: (otherlv_12= 'conn' otherlv_13= ':' ( (lv_conn_14_0= ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==44) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalAfvl.g:3010:4: otherlv_12= 'conn' otherlv_13= ':' ( (lv_conn_14_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,44,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getSinkAccess().getConnKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_30); 

                    				newLeafNode(otherlv_13, grammarAccess.getSinkAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:3018:4: ( (lv_conn_14_0= ruleEString ) )
                    // InternalAfvl.g:3019:5: (lv_conn_14_0= ruleEString )
                    {
                    // InternalAfvl.g:3019:5: (lv_conn_14_0= ruleEString )
                    // InternalAfvl.g:3020:6: lv_conn_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSinkAccess().getConnEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_conn_14_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSinkRule());
                    						}
                    						set(
                    							current,
                    							"conn",
                    							lv_conn_14_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:3038:3: (otherlv_15= 'format' otherlv_16= ':' ( (lv_format_17_0= ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==45) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalAfvl.g:3039:4: otherlv_15= 'format' otherlv_16= ':' ( (lv_format_17_0= ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,45,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getSinkAccess().getFormatKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_30); 

                    				newLeafNode(otherlv_16, grammarAccess.getSinkAccess().getColonKeyword_9_1());
                    			
                    // InternalAfvl.g:3047:4: ( (lv_format_17_0= ruleEString ) )
                    // InternalAfvl.g:3048:5: (lv_format_17_0= ruleEString )
                    {
                    // InternalAfvl.g:3048:5: (lv_format_17_0= ruleEString )
                    // InternalAfvl.g:3049:6: lv_format_17_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSinkAccess().getFormatEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_format_17_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSinkRule());
                    						}
                    						set(
                    							current,
                    							"format",
                    							lv_format_17_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:3067:3: (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==30) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalAfvl.g:3068:4: otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getSinkAccess().getPropsKeyword_10_0());
                    			
                    otherlv_19=(Token)match(input,20,FOLLOW_30); 

                    				newLeafNode(otherlv_19, grammarAccess.getSinkAccess().getColonKeyword_10_1());
                    			
                    // InternalAfvl.g:3076:4: ( (lv_props_20_0= ruleEString ) )
                    // InternalAfvl.g:3077:5: (lv_props_20_0= ruleEString )
                    {
                    // InternalAfvl.g:3077:5: (lv_props_20_0= ruleEString )
                    // InternalAfvl.g:3078:6: lv_props_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSinkAccess().getPropsEStringParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_props_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSinkRule());
                    						}
                    						set(
                    							current,
                    							"props",
                    							lv_props_20_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:3096:3: (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==31) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalAfvl.g:3097:4: otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) )
                    {
                    otherlv_21=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getSinkAccess().getDecisionKeyword_11_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getSinkAccess().getColonKeyword_11_1());
                    			
                    // InternalAfvl.g:3105:4: ( (otherlv_23= RULE_ID ) )
                    // InternalAfvl.g:3106:5: (otherlv_23= RULE_ID )
                    {
                    // InternalAfvl.g:3106:5: (otherlv_23= RULE_ID )
                    // InternalAfvl.g:3107:6: otherlv_23= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSinkRule());
                    						}
                    					
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_41); 

                    						newLeafNode(otherlv_23, grammarAccess.getSinkAccess().getDecisionArchDecisionCrossReference_11_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_24, grammarAccess.getSinkAccess().getPortsKeyword_12());
            		
            otherlv_25=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_25, grammarAccess.getSinkAccess().getColonKeyword_13());
            		
            otherlv_26=(Token)match(input,14,FOLLOW_42); 

            			newLeafNode(otherlv_26, grammarAccess.getSinkAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalAfvl.g:3131:3: ( (lv_ports_27_0= rulePort ) )
            // InternalAfvl.g:3132:4: (lv_ports_27_0= rulePort )
            {
            // InternalAfvl.g:3132:4: (lv_ports_27_0= rulePort )
            // InternalAfvl.g:3133:5: lv_ports_27_0= rulePort
            {

            					newCompositeNode(grammarAccess.getSinkAccess().getPortsPortParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_9);
            lv_ports_27_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSinkRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_27_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:3150:3: (otherlv_28= ',' ( (lv_ports_29_0= rulePort ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==16) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalAfvl.g:3151:4: otherlv_28= ',' ( (lv_ports_29_0= rulePort ) )
            	    {
            	    otherlv_28=(Token)match(input,16,FOLLOW_42); 

            	    				newLeafNode(otherlv_28, grammarAccess.getSinkAccess().getCommaKeyword_16_0());
            	    			
            	    // InternalAfvl.g:3155:4: ( (lv_ports_29_0= rulePort ) )
            	    // InternalAfvl.g:3156:5: (lv_ports_29_0= rulePort )
            	    {
            	    // InternalAfvl.g:3156:5: (lv_ports_29_0= rulePort )
            	    // InternalAfvl.g:3157:6: lv_ports_29_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getSinkAccess().getPortsPortParserRuleCall_16_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_ports_29_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSinkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_29_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            otherlv_30=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_30, grammarAccess.getSinkAccess().getRightCurlyBracketKeyword_17());
            		
            otherlv_31=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getSinkAccess().getRightCurlyBracketKeyword_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSink"


    // $ANTLR start "entryRuleField"
    // InternalAfvl.g:3187:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalAfvl.g:3187:46: (iv_ruleField= ruleField EOF )
            // InternalAfvl.g:3188:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalAfvl.g:3194:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_dtype_2_0= ruleEString ) ) otherlv_3= 'order' ( (lv_order_4_0= ruleTOSHORT ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_dtype_2_0 = null;

        AntlrDatatypeRuleToken lv_order_4_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:3200:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_dtype_2_0= ruleEString ) ) otherlv_3= 'order' ( (lv_order_4_0= ruleTOSHORT ) ) ) )
            // InternalAfvl.g:3201:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_dtype_2_0= ruleEString ) ) otherlv_3= 'order' ( (lv_order_4_0= ruleTOSHORT ) ) )
            {
            // InternalAfvl.g:3201:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_dtype_2_0= ruleEString ) ) otherlv_3= 'order' ( (lv_order_4_0= ruleTOSHORT ) ) )
            // InternalAfvl.g:3202:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_dtype_2_0= ruleEString ) ) otherlv_3= 'order' ( (lv_order_4_0= ruleTOSHORT ) )
            {
            // InternalAfvl.g:3202:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAfvl.g:3203:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAfvl.g:3203:4: (lv_name_0_0= RULE_ID )
            // InternalAfvl.g:3204:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
            		
            // InternalAfvl.g:3224:3: ( (lv_dtype_2_0= ruleEString ) )
            // InternalAfvl.g:3225:4: (lv_dtype_2_0= ruleEString )
            {
            // InternalAfvl.g:3225:4: (lv_dtype_2_0= ruleEString )
            // InternalAfvl.g:3226:5: lv_dtype_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getDtypeEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_50);
            lv_dtype_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"dtype",
            						lv_dtype_2_0,
            						"co.edu.uniandes.accordant_fv.Afvl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,47,FOLLOW_51); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getOrderKeyword_3());
            		
            // InternalAfvl.g:3247:3: ( (lv_order_4_0= ruleTOSHORT ) )
            // InternalAfvl.g:3248:4: (lv_order_4_0= ruleTOSHORT )
            {
            // InternalAfvl.g:3248:4: (lv_order_4_0= ruleTOSHORT )
            // InternalAfvl.g:3249:5: lv_order_4_0= ruleTOSHORT
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getOrderTOSHORTParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_order_4_0=ruleTOSHORT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"order",
            						lv_order_4_0,
            						"co.edu.uniandes.accordant_fv.Afvl.TOSHORT");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleTOSHORT"
    // InternalAfvl.g:3270:1: entryRuleTOSHORT returns [String current=null] : iv_ruleTOSHORT= ruleTOSHORT EOF ;
    public final String entryRuleTOSHORT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTOSHORT = null;


        try {
            // InternalAfvl.g:3270:47: (iv_ruleTOSHORT= ruleTOSHORT EOF )
            // InternalAfvl.g:3271:2: iv_ruleTOSHORT= ruleTOSHORT EOF
            {
             newCompositeNode(grammarAccess.getTOSHORTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTOSHORT=ruleTOSHORT();

            state._fsp--;

             current =iv_ruleTOSHORT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTOSHORT"


    // $ANTLR start "ruleTOSHORT"
    // InternalAfvl.g:3277:1: ruleTOSHORT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleTOSHORT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalAfvl.g:3283:2: (this_INT_0= RULE_INT )
            // InternalAfvl.g:3284:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getTOSHORTAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTOSHORT"


    // $ANTLR start "ruleDeliveryGuarantee"
    // InternalAfvl.g:3294:1: ruleDeliveryGuarantee returns [Enumerator current=null] : ( (enumLiteral_0= 'BEST_EFFORT' ) | (enumLiteral_1= 'AT_LEAST_ONCE' ) | (enumLiteral_2= 'AT_MOST_ONCE' ) | (enumLiteral_3= 'EXACTLY_ONCE' ) ) ;
    public final Enumerator ruleDeliveryGuarantee() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAfvl.g:3300:2: ( ( (enumLiteral_0= 'BEST_EFFORT' ) | (enumLiteral_1= 'AT_LEAST_ONCE' ) | (enumLiteral_2= 'AT_MOST_ONCE' ) | (enumLiteral_3= 'EXACTLY_ONCE' ) ) )
            // InternalAfvl.g:3301:2: ( (enumLiteral_0= 'BEST_EFFORT' ) | (enumLiteral_1= 'AT_LEAST_ONCE' ) | (enumLiteral_2= 'AT_MOST_ONCE' ) | (enumLiteral_3= 'EXACTLY_ONCE' ) )
            {
            // InternalAfvl.g:3301:2: ( (enumLiteral_0= 'BEST_EFFORT' ) | (enumLiteral_1= 'AT_LEAST_ONCE' ) | (enumLiteral_2= 'AT_MOST_ONCE' ) | (enumLiteral_3= 'EXACTLY_ONCE' ) )
            int alt75=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt75=1;
                }
                break;
            case 49:
                {
                alt75=2;
                }
                break;
            case 50:
                {
                alt75=3;
                }
                break;
            case 51:
                {
                alt75=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalAfvl.g:3302:3: (enumLiteral_0= 'BEST_EFFORT' )
                    {
                    // InternalAfvl.g:3302:3: (enumLiteral_0= 'BEST_EFFORT' )
                    // InternalAfvl.g:3303:4: enumLiteral_0= 'BEST_EFFORT'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getDeliveryGuaranteeAccess().getBEST_EFFORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDeliveryGuaranteeAccess().getBEST_EFFORTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:3310:3: (enumLiteral_1= 'AT_LEAST_ONCE' )
                    {
                    // InternalAfvl.g:3310:3: (enumLiteral_1= 'AT_LEAST_ONCE' )
                    // InternalAfvl.g:3311:4: enumLiteral_1= 'AT_LEAST_ONCE'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getDeliveryGuaranteeAccess().getAT_LEAST_ONCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDeliveryGuaranteeAccess().getAT_LEAST_ONCEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAfvl.g:3318:3: (enumLiteral_2= 'AT_MOST_ONCE' )
                    {
                    // InternalAfvl.g:3318:3: (enumLiteral_2= 'AT_MOST_ONCE' )
                    // InternalAfvl.g:3319:4: enumLiteral_2= 'AT_MOST_ONCE'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getDeliveryGuaranteeAccess().getAT_MOST_ONCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDeliveryGuaranteeAccess().getAT_MOST_ONCEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAfvl.g:3326:3: (enumLiteral_3= 'EXACTLY_ONCE' )
                    {
                    // InternalAfvl.g:3326:3: (enumLiteral_3= 'EXACTLY_ONCE' )
                    // InternalAfvl.g:3327:4: enumLiteral_3= 'EXACTLY_ONCE'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getDeliveryGuaranteeAccess().getEXACTLY_ONCEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDeliveryGuaranteeAccess().getEXACTLY_ONCEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeliveryGuarantee"


    // $ANTLR start "ruleSyncType"
    // InternalAfvl.g:3337:1: ruleSyncType returns [Enumerator current=null] : ( (enumLiteral_0= 'ASYNC' ) | (enumLiteral_1= 'SYNC' ) ) ;
    public final Enumerator ruleSyncType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:3343:2: ( ( (enumLiteral_0= 'ASYNC' ) | (enumLiteral_1= 'SYNC' ) ) )
            // InternalAfvl.g:3344:2: ( (enumLiteral_0= 'ASYNC' ) | (enumLiteral_1= 'SYNC' ) )
            {
            // InternalAfvl.g:3344:2: ( (enumLiteral_0= 'ASYNC' ) | (enumLiteral_1= 'SYNC' ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==52) ) {
                alt76=1;
            }
            else if ( (LA76_0==53) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalAfvl.g:3345:3: (enumLiteral_0= 'ASYNC' )
                    {
                    // InternalAfvl.g:3345:3: (enumLiteral_0= 'ASYNC' )
                    // InternalAfvl.g:3346:4: enumLiteral_0= 'ASYNC'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getSyncTypeAccess().getASYNCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSyncTypeAccess().getASYNCEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:3353:3: (enumLiteral_1= 'SYNC' )
                    {
                    // InternalAfvl.g:3353:3: (enumLiteral_1= 'SYNC' )
                    // InternalAfvl.g:3354:4: enumLiteral_1= 'SYNC'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getSyncTypeAccess().getSYNCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSyncTypeAccess().getSYNCEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSyncType"


    // $ANTLR start "rulePortType"
    // InternalAfvl.g:3364:1: rulePortType returns [Enumerator current=null] : ( (enumLiteral_0= 'REQUIRED' ) | (enumLiteral_1= 'PROVIDED' ) ) ;
    public final Enumerator rulePortType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:3370:2: ( ( (enumLiteral_0= 'REQUIRED' ) | (enumLiteral_1= 'PROVIDED' ) ) )
            // InternalAfvl.g:3371:2: ( (enumLiteral_0= 'REQUIRED' ) | (enumLiteral_1= 'PROVIDED' ) )
            {
            // InternalAfvl.g:3371:2: ( (enumLiteral_0= 'REQUIRED' ) | (enumLiteral_1= 'PROVIDED' ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==54) ) {
                alt77=1;
            }
            else if ( (LA77_0==55) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalAfvl.g:3372:3: (enumLiteral_0= 'REQUIRED' )
                    {
                    // InternalAfvl.g:3372:3: (enumLiteral_0= 'REQUIRED' )
                    // InternalAfvl.g:3373:4: enumLiteral_0= 'REQUIRED'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getPortTypeAccess().getREQUIREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPortTypeAccess().getREQUIREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:3380:3: (enumLiteral_1= 'PROVIDED' )
                    {
                    // InternalAfvl.g:3380:3: (enumLiteral_1= 'PROVIDED' )
                    // InternalAfvl.g:3381:4: enumLiteral_1= 'PROVIDED'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getPortTypeAccess().getPROVIDEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPortTypeAccess().getPROVIDEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePortType"


    // $ANTLR start "ruleRoleType"
    // InternalAfvl.g:3391:1: ruleRoleType returns [Enumerator current=null] : ( (enumLiteral_0= 'OUT' ) | (enumLiteral_1= 'IN' ) ) ;
    public final Enumerator ruleRoleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:3397:2: ( ( (enumLiteral_0= 'OUT' ) | (enumLiteral_1= 'IN' ) ) )
            // InternalAfvl.g:3398:2: ( (enumLiteral_0= 'OUT' ) | (enumLiteral_1= 'IN' ) )
            {
            // InternalAfvl.g:3398:2: ( (enumLiteral_0= 'OUT' ) | (enumLiteral_1= 'IN' ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==56) ) {
                alt78=1;
            }
            else if ( (LA78_0==57) ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalAfvl.g:3399:3: (enumLiteral_0= 'OUT' )
                    {
                    // InternalAfvl.g:3399:3: (enumLiteral_0= 'OUT' )
                    // InternalAfvl.g:3400:4: enumLiteral_0= 'OUT'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getOUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRoleTypeAccess().getOUTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:3407:3: (enumLiteral_1= 'IN' )
                    {
                    // InternalAfvl.g:3407:3: (enumLiteral_1= 'IN' )
                    // InternalAfvl.g:3408:4: enumLiteral_1= 'IN'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRoleTypeAccess().getINEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoleType"


    // $ANTLR start "ruleNotificationModel"
    // InternalAfvl.g:3418:1: ruleNotificationModel returns [Enumerator current=null] : ( (enumLiteral_0= 'POLLED' ) | (enumLiteral_1= 'PUBSUB' ) | (enumLiteral_2= 'QUEUED' ) | (enumLiteral_3= 'CENTRAL' ) ) ;
    public final Enumerator ruleNotificationModel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAfvl.g:3424:2: ( ( (enumLiteral_0= 'POLLED' ) | (enumLiteral_1= 'PUBSUB' ) | (enumLiteral_2= 'QUEUED' ) | (enumLiteral_3= 'CENTRAL' ) ) )
            // InternalAfvl.g:3425:2: ( (enumLiteral_0= 'POLLED' ) | (enumLiteral_1= 'PUBSUB' ) | (enumLiteral_2= 'QUEUED' ) | (enumLiteral_3= 'CENTRAL' ) )
            {
            // InternalAfvl.g:3425:2: ( (enumLiteral_0= 'POLLED' ) | (enumLiteral_1= 'PUBSUB' ) | (enumLiteral_2= 'QUEUED' ) | (enumLiteral_3= 'CENTRAL' ) )
            int alt79=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt79=1;
                }
                break;
            case 59:
                {
                alt79=2;
                }
                break;
            case 60:
                {
                alt79=3;
                }
                break;
            case 61:
                {
                alt79=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalAfvl.g:3426:3: (enumLiteral_0= 'POLLED' )
                    {
                    // InternalAfvl.g:3426:3: (enumLiteral_0= 'POLLED' )
                    // InternalAfvl.g:3427:4: enumLiteral_0= 'POLLED'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getNotificationModelAccess().getPOLLEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNotificationModelAccess().getPOLLEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:3434:3: (enumLiteral_1= 'PUBSUB' )
                    {
                    // InternalAfvl.g:3434:3: (enumLiteral_1= 'PUBSUB' )
                    // InternalAfvl.g:3435:4: enumLiteral_1= 'PUBSUB'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getNotificationModelAccess().getPUBSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNotificationModelAccess().getPUBSUBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAfvl.g:3442:3: (enumLiteral_2= 'QUEUED' )
                    {
                    // InternalAfvl.g:3442:3: (enumLiteral_2= 'QUEUED' )
                    // InternalAfvl.g:3443:4: enumLiteral_2= 'QUEUED'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getNotificationModelAccess().getQUEUEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNotificationModelAccess().getQUEUEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAfvl.g:3450:3: (enumLiteral_3= 'CENTRAL' )
                    {
                    // InternalAfvl.g:3450:3: (enumLiteral_3= 'CENTRAL' )
                    // InternalAfvl.g:3451:4: enumLiteral_3= 'CENTRAL'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getNotificationModelAccess().getCENTRALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNotificationModelAccess().getCENTRALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotificationModel"


    // $ANTLR start "ruleBuffering"
    // InternalAfvl.g:3461:1: ruleBuffering returns [Enumerator current=null] : ( (enumLiteral_0= 'BUFFERED' ) | (enumLiteral_1= 'UNBUFFERED' ) ) ;
    public final Enumerator ruleBuffering() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:3467:2: ( ( (enumLiteral_0= 'BUFFERED' ) | (enumLiteral_1= 'UNBUFFERED' ) ) )
            // InternalAfvl.g:3468:2: ( (enumLiteral_0= 'BUFFERED' ) | (enumLiteral_1= 'UNBUFFERED' ) )
            {
            // InternalAfvl.g:3468:2: ( (enumLiteral_0= 'BUFFERED' ) | (enumLiteral_1= 'UNBUFFERED' ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==62) ) {
                alt80=1;
            }
            else if ( (LA80_0==63) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalAfvl.g:3469:3: (enumLiteral_0= 'BUFFERED' )
                    {
                    // InternalAfvl.g:3469:3: (enumLiteral_0= 'BUFFERED' )
                    // InternalAfvl.g:3470:4: enumLiteral_0= 'BUFFERED'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getBufferingAccess().getBUFFEREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBufferingAccess().getBUFFEREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:3477:3: (enumLiteral_1= 'UNBUFFERED' )
                    {
                    // InternalAfvl.g:3477:3: (enumLiteral_1= 'UNBUFFERED' )
                    // InternalAfvl.g:3478:4: enumLiteral_1= 'UNBUFFERED'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getBufferingAccess().getUNBUFFEREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBufferingAccess().getUNBUFFEREDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuffering"


    // $ANTLR start "ruleThroughput"
    // InternalAfvl.g:3488:1: ruleThroughput returns [Enumerator current=null] : ( (enumLiteral_0= 'ATOMIC' ) | (enumLiteral_1= 'HIGH_ORDER' ) ) ;
    public final Enumerator ruleThroughput() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:3494:2: ( ( (enumLiteral_0= 'ATOMIC' ) | (enumLiteral_1= 'HIGH_ORDER' ) ) )
            // InternalAfvl.g:3495:2: ( (enumLiteral_0= 'ATOMIC' ) | (enumLiteral_1= 'HIGH_ORDER' ) )
            {
            // InternalAfvl.g:3495:2: ( (enumLiteral_0= 'ATOMIC' ) | (enumLiteral_1= 'HIGH_ORDER' ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==64) ) {
                alt81=1;
            }
            else if ( (LA81_0==65) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalAfvl.g:3496:3: (enumLiteral_0= 'ATOMIC' )
                    {
                    // InternalAfvl.g:3496:3: (enumLiteral_0= 'ATOMIC' )
                    // InternalAfvl.g:3497:4: enumLiteral_0= 'ATOMIC'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getThroughputAccess().getATOMICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getThroughputAccess().getATOMICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:3504:3: (enumLiteral_1= 'HIGH_ORDER' )
                    {
                    // InternalAfvl.g:3504:3: (enumLiteral_1= 'HIGH_ORDER' )
                    // InternalAfvl.g:3505:4: enumLiteral_1= 'HIGH_ORDER'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getThroughputAccess().getHIGH_ORDEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getThroughputAccess().getHIGH_ORDEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThroughput"


    // $ANTLR start "ruleProcessingModel"
    // InternalAfvl.g:3515:1: ruleProcessingModel returns [Enumerator current=null] : ( (enumLiteral_0= 'STREAM' ) | (enumLiteral_1= 'BATCH' ) | (enumLiteral_2= 'MICROBATCH' ) ) ;
    public final Enumerator ruleProcessingModel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAfvl.g:3521:2: ( ( (enumLiteral_0= 'STREAM' ) | (enumLiteral_1= 'BATCH' ) | (enumLiteral_2= 'MICROBATCH' ) ) )
            // InternalAfvl.g:3522:2: ( (enumLiteral_0= 'STREAM' ) | (enumLiteral_1= 'BATCH' ) | (enumLiteral_2= 'MICROBATCH' ) )
            {
            // InternalAfvl.g:3522:2: ( (enumLiteral_0= 'STREAM' ) | (enumLiteral_1= 'BATCH' ) | (enumLiteral_2= 'MICROBATCH' ) )
            int alt82=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt82=1;
                }
                break;
            case 67:
                {
                alt82=2;
                }
                break;
            case 68:
                {
                alt82=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalAfvl.g:3523:3: (enumLiteral_0= 'STREAM' )
                    {
                    // InternalAfvl.g:3523:3: (enumLiteral_0= 'STREAM' )
                    // InternalAfvl.g:3524:4: enumLiteral_0= 'STREAM'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getProcessingModelAccess().getSTREAMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProcessingModelAccess().getSTREAMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:3531:3: (enumLiteral_1= 'BATCH' )
                    {
                    // InternalAfvl.g:3531:3: (enumLiteral_1= 'BATCH' )
                    // InternalAfvl.g:3532:4: enumLiteral_1= 'BATCH'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getProcessingModelAccess().getBATCHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProcessingModelAccess().getBATCHEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAfvl.g:3539:3: (enumLiteral_2= 'MICROBATCH' )
                    {
                    // InternalAfvl.g:3539:3: (enumLiteral_2= 'MICROBATCH' )
                    // InternalAfvl.g:3540:4: enumLiteral_2= 'MICROBATCH'
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getProcessingModelAccess().getMICROBATCHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getProcessingModelAccess().getMICROBATCHEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessingModel"


    // $ANTLR start "ruleAccessType"
    // InternalAfvl.g:3550:1: ruleAccessType returns [Enumerator current=null] : ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'FILESYSTEM' ) | (enumLiteral_3= 'HDFS' ) ) ;
    public final Enumerator ruleAccessType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAfvl.g:3556:2: ( ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'FILESYSTEM' ) | (enumLiteral_3= 'HDFS' ) ) )
            // InternalAfvl.g:3557:2: ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'FILESYSTEM' ) | (enumLiteral_3= 'HDFS' ) )
            {
            // InternalAfvl.g:3557:2: ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'FILESYSTEM' ) | (enumLiteral_3= 'HDFS' ) )
            int alt83=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt83=1;
                }
                break;
            case 70:
                {
                alt83=2;
                }
                break;
            case 71:
                {
                alt83=3;
                }
                break;
            case 72:
                {
                alt83=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalAfvl.g:3558:3: (enumLiteral_0= 'HTTP' )
                    {
                    // InternalAfvl.g:3558:3: (enumLiteral_0= 'HTTP' )
                    // InternalAfvl.g:3559:4: enumLiteral_0= 'HTTP'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getAccessTypeAccess().getHTTPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessTypeAccess().getHTTPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:3566:3: (enumLiteral_1= 'DATABASE' )
                    {
                    // InternalAfvl.g:3566:3: (enumLiteral_1= 'DATABASE' )
                    // InternalAfvl.g:3567:4: enumLiteral_1= 'DATABASE'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getAccessTypeAccess().getDATABASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessTypeAccess().getDATABASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAfvl.g:3574:3: (enumLiteral_2= 'FILESYSTEM' )
                    {
                    // InternalAfvl.g:3574:3: (enumLiteral_2= 'FILESYSTEM' )
                    // InternalAfvl.g:3575:4: enumLiteral_2= 'FILESYSTEM'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getAccessTypeAccess().getFILESYSTEMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAccessTypeAccess().getFILESYSTEMEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAfvl.g:3582:3: (enumLiteral_3= 'HDFS' )
                    {
                    // InternalAfvl.g:3582:3: (enumLiteral_3= 'HDFS' )
                    // InternalAfvl.g:3583:4: enumLiteral_3= 'HDFS'
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getAccessTypeAccess().getHDFSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAccessTypeAccess().getHDFSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccessType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000462000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001E01000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00C0000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0300000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000001FE000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000F000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000001FC000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000001F8000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x3C00000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000001F0000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000F0001FC000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000001C082000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000018082000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000018080000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000010080000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00003140C2000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00003100C2000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00003100C0000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00002100C0000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00000100C0000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000040L});

}