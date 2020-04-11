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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FunctionalView'", "'use'", "'project'", "'{'", "'Components'", "','", "'}'", "'Connectors'", "'Port'", "':'", "'Role'", "'->'", "'Stream'", "'delivery'", "'sync'", "'notification'", "'buffering'", "'throughput'", "'props'", "'decision'", "'roles'", "'Adaptor'", "'Distributor'", "'Event'", "'ProcCall'", "'Transformer'", "'procModel'", "'pmml'", "'ports'", "'Estimator'", "'Ingestor'", "'type'", "'conn'", "'format'", "'Sink'", "'BEST_EFFORT'", "'AT_LEAST_ONE'", "'AT_MOST_ONE'", "'EXACTLY_ONE'", "'ASYNC'", "'SYNC'", "'REQUIRED'", "'PROVIDED'", "'OUT'", "'IN'", "'POLLED'", "'PUBSUB'", "'QUEUED'", "'CENTRAL'", "'BUFFERED'", "'UNBUFFERED'", "'ATOMIC'", "'HIGH_ORDER'", "'STREAM'", "'BATCH'", "'MICROBATCH'", "'HTTP'", "'DATABASE'", "'FILESYSTEM'", "'HDFS'"
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
            case 23:
                {
                alt3=1;
                }
                break;
            case 32:
                {
                alt3=2;
                }
                break;
            case 33:
                {
                alt3=3;
                }
                break;
            case 34:
                {
                alt3=4;
                }
                break;
            case 35:
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
            case 36:
                {
                alt4=1;
                }
                break;
            case 40:
                {
                alt4=2;
                }
                break;
            case 41:
                {
                alt4=3;
                }
                break;
            case 45:
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
    // InternalAfvl.g:405:1: rulePort returns [EObject current=null] : ( () otherlv_1= 'Port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= rulePortType ) )? ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:411:2: ( ( () otherlv_1= 'Port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= rulePortType ) )? ) )
            // InternalAfvl.g:412:2: ( () otherlv_1= 'Port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= rulePortType ) )? )
            {
            // InternalAfvl.g:412:2: ( () otherlv_1= 'Port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= rulePortType ) )? )
            // InternalAfvl.g:413:3: () otherlv_1= 'Port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= rulePortType ) )?
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

            if ( ((LA6_0>=52 && LA6_0<=53)) ) {
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
                    				
                    pushFollow(FOLLOW_2);
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
    // InternalAfvl.g:469:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalAfvl.g:469:45: (iv_ruleRole= ruleRole EOF )
            // InternalAfvl.g:470:2: iv_ruleRole= ruleRole EOF
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
    // InternalAfvl.g:476:1: ruleRole returns [EObject current=null] : ( () otherlv_1= 'Role' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleRoleType ) )? otherlv_5= '->' ( (otherlv_6= RULE_ID ) )? ) ;
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
            // InternalAfvl.g:482:2: ( ( () otherlv_1= 'Role' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleRoleType ) )? otherlv_5= '->' ( (otherlv_6= RULE_ID ) )? ) )
            // InternalAfvl.g:483:2: ( () otherlv_1= 'Role' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleRoleType ) )? otherlv_5= '->' ( (otherlv_6= RULE_ID ) )? )
            {
            // InternalAfvl.g:483:2: ( () otherlv_1= 'Role' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleRoleType ) )? otherlv_5= '->' ( (otherlv_6= RULE_ID ) )? )
            // InternalAfvl.g:484:3: () otherlv_1= 'Role' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleRoleType ) )? otherlv_5= '->' ( (otherlv_6= RULE_ID ) )?
            {
            // InternalAfvl.g:484:3: ()
            // InternalAfvl.g:485:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleAccess().getRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getRoleKeyword_1());
            		
            // InternalAfvl.g:495:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAfvl.g:496:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAfvl.g:496:4: (lv_name_2_0= RULE_ID )
            // InternalAfvl.g:497:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getColonKeyword_3());
            		
            // InternalAfvl.g:517:3: ( (lv_type_4_0= ruleRoleType ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=54 && LA7_0<=55)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAfvl.g:518:4: (lv_type_4_0= ruleRoleType )
                    {
                    // InternalAfvl.g:518:4: (lv_type_4_0= ruleRoleType )
                    // InternalAfvl.g:519:5: lv_type_4_0= ruleRoleType
                    {

                    					newCompositeNode(grammarAccess.getRoleAccess().getTypeRoleTypeEnumRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_16);
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

            otherlv_5=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalAfvl.g:540:3: ( (otherlv_6= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAfvl.g:541:4: (otherlv_6= RULE_ID )
                    {
                    // InternalAfvl.g:541:4: (otherlv_6= RULE_ID )
                    // InternalAfvl.g:542:5: otherlv_6= RULE_ID
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
    // InternalAfvl.g:557:1: entryRuleStream returns [EObject current=null] : iv_ruleStream= ruleStream EOF ;
    public final EObject entryRuleStream() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStream = null;


        try {
            // InternalAfvl.g:557:47: (iv_ruleStream= ruleStream EOF )
            // InternalAfvl.g:558:2: iv_ruleStream= ruleStream EOF
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
    // InternalAfvl.g:564:1: ruleStream returns [EObject current=null] : (otherlv_0= 'Stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' ) ;
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
            // InternalAfvl.g:570:2: ( (otherlv_0= 'Stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' ) )
            // InternalAfvl.g:571:2: (otherlv_0= 'Stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' )
            {
            // InternalAfvl.g:571:2: (otherlv_0= 'Stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' )
            // InternalAfvl.g:572:3: otherlv_0= 'Stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStreamAccess().getStreamKeyword_0());
            		
            // InternalAfvl.g:576:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:577:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:577:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:578:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getStreamAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:598:3: (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAfvl.g:599:4: otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getStreamAccess().getDeliveryKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getStreamAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:607:4: ( (lv_delivery_5_0= ruleDeliveryModel ) )
                    // InternalAfvl.g:608:5: (lv_delivery_5_0= ruleDeliveryModel )
                    {
                    // InternalAfvl.g:608:5: (lv_delivery_5_0= ruleDeliveryModel )
                    // InternalAfvl.g:609:6: lv_delivery_5_0= ruleDeliveryModel
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getDeliveryDeliveryModelEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_delivery_5_0=ruleDeliveryModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStreamRule());
                    						}
                    						set(
                    							current,
                    							"delivery",
                    							lv_delivery_5_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.DeliveryModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:627:3: (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAfvl.g:628:4: otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getStreamAccess().getSyncKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getStreamAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:636:4: ( (lv_synct_8_0= ruleSyncType ) )
                    // InternalAfvl.g:637:5: (lv_synct_8_0= ruleSyncType )
                    {
                    // InternalAfvl.g:637:5: (lv_synct_8_0= ruleSyncType )
                    // InternalAfvl.g:638:6: lv_synct_8_0= ruleSyncType
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getSynctSyncTypeEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_22);
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

            // InternalAfvl.g:656:3: (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAfvl.g:657:4: otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) )
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getStreamAccess().getNotificationKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getStreamAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:665:4: ( (lv_notification_11_0= ruleNotificationModel ) )
                    // InternalAfvl.g:666:5: (lv_notification_11_0= ruleNotificationModel )
                    {
                    // InternalAfvl.g:666:5: (lv_notification_11_0= ruleNotificationModel )
                    // InternalAfvl.g:667:6: lv_notification_11_0= ruleNotificationModel
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getNotificationNotificationModelEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_24);
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

            // InternalAfvl.g:685:3: (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAfvl.g:686:4: otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getStreamAccess().getBufferingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_13, grammarAccess.getStreamAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:694:4: ( (lv_buffering_14_0= ruleBuffering ) )
                    // InternalAfvl.g:695:5: (lv_buffering_14_0= ruleBuffering )
                    {
                    // InternalAfvl.g:695:5: (lv_buffering_14_0= ruleBuffering )
                    // InternalAfvl.g:696:6: lv_buffering_14_0= ruleBuffering
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getBufferingBufferingEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_26);
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

            // InternalAfvl.g:714:3: (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAfvl.g:715:4: otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) )
                    {
                    otherlv_15=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getStreamAccess().getThroughputKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_27); 

                    				newLeafNode(otherlv_16, grammarAccess.getStreamAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:723:4: ( (lv_throughput_17_0= ruleThroughput ) )
                    // InternalAfvl.g:724:5: (lv_throughput_17_0= ruleThroughput )
                    {
                    // InternalAfvl.g:724:5: (lv_throughput_17_0= ruleThroughput )
                    // InternalAfvl.g:725:6: lv_throughput_17_0= ruleThroughput
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getThroughputThroughputEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

            // InternalAfvl.g:743:3: (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAfvl.g:744:4: otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,29,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getStreamAccess().getPropsKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,20,FOLLOW_29); 

                    				newLeafNode(otherlv_19, grammarAccess.getStreamAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:752:4: ( (lv_props_20_0= ruleEString ) )
                    // InternalAfvl.g:753:5: (lv_props_20_0= ruleEString )
                    {
                    // InternalAfvl.g:753:5: (lv_props_20_0= ruleEString )
                    // InternalAfvl.g:754:6: lv_props_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getPropsEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

            // InternalAfvl.g:772:3: (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAfvl.g:773:4: otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) )
                    {
                    otherlv_21=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getStreamAccess().getDecisionKeyword_9_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getStreamAccess().getColonKeyword_9_1());
                    			
                    // InternalAfvl.g:781:4: ( (otherlv_23= RULE_ID ) )
                    // InternalAfvl.g:782:5: (otherlv_23= RULE_ID )
                    {
                    // InternalAfvl.g:782:5: (otherlv_23= RULE_ID )
                    // InternalAfvl.g:783:6: otherlv_23= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStreamRule());
                    						}
                    					
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_31); 

                    						newLeafNode(otherlv_23, grammarAccess.getStreamAccess().getDecisionArchDecisionCrossReference_9_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_24, grammarAccess.getStreamAccess().getRolesKeyword_10());
            		
            otherlv_25=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_25, grammarAccess.getStreamAccess().getColonKeyword_11());
            		
            otherlv_26=(Token)match(input,14,FOLLOW_32); 

            			newLeafNode(otherlv_26, grammarAccess.getStreamAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalAfvl.g:807:3: ( (lv_roles_27_0= ruleRole ) )
            // InternalAfvl.g:808:4: (lv_roles_27_0= ruleRole )
            {
            // InternalAfvl.g:808:4: (lv_roles_27_0= ruleRole )
            // InternalAfvl.g:809:5: lv_roles_27_0= ruleRole
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

            // InternalAfvl.g:826:3: (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAfvl.g:827:4: otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) )
            	    {
            	    otherlv_28=(Token)match(input,16,FOLLOW_32); 

            	    				newLeafNode(otherlv_28, grammarAccess.getStreamAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalAfvl.g:831:4: ( (lv_roles_29_0= ruleRole ) )
            	    // InternalAfvl.g:832:5: (lv_roles_29_0= ruleRole )
            	    {
            	    // InternalAfvl.g:832:5: (lv_roles_29_0= ruleRole )
            	    // InternalAfvl.g:833:6: lv_roles_29_0= ruleRole
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
            	    break loop16;
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
    // InternalAfvl.g:863:1: entryRuleAdaptor returns [EObject current=null] : iv_ruleAdaptor= ruleAdaptor EOF ;
    public final EObject entryRuleAdaptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptor = null;


        try {
            // InternalAfvl.g:863:48: (iv_ruleAdaptor= ruleAdaptor EOF )
            // InternalAfvl.g:864:2: iv_ruleAdaptor= ruleAdaptor EOF
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
    // InternalAfvl.g:870:1: ruleAdaptor returns [EObject current=null] : (otherlv_0= 'Adaptor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) )? ) (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= '{' ( (lv_roles_26_0= ruleRole ) ) (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )* otherlv_29= '}' otherlv_30= '}' ) ;
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
            // InternalAfvl.g:876:2: ( (otherlv_0= 'Adaptor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) )? ) (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= '{' ( (lv_roles_26_0= ruleRole ) ) (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )* otherlv_29= '}' otherlv_30= '}' ) )
            // InternalAfvl.g:877:2: (otherlv_0= 'Adaptor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) )? ) (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= '{' ( (lv_roles_26_0= ruleRole ) ) (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )* otherlv_29= '}' otherlv_30= '}' )
            {
            // InternalAfvl.g:877:2: (otherlv_0= 'Adaptor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) )? ) (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= '{' ( (lv_roles_26_0= ruleRole ) ) (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )* otherlv_29= '}' otherlv_30= '}' )
            // InternalAfvl.g:878:3: otherlv_0= 'Adaptor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) )? ) (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= '{' ( (lv_roles_26_0= ruleRole ) ) (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )* otherlv_29= '}' otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAdaptorAccess().getAdaptorKeyword_0());
            		
            // InternalAfvl.g:882:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:883:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:883:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:884:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getAdaptorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:904:3: (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) )? )
            // InternalAfvl.g:905:4: otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) )?
            {
            otherlv_3=(Token)match(input,24,FOLLOW_13); 

            				newLeafNode(otherlv_3, grammarAccess.getAdaptorAccess().getDeliveryKeyword_3_0());
            			
            otherlv_4=(Token)match(input,20,FOLLOW_34); 

            				newLeafNode(otherlv_4, grammarAccess.getAdaptorAccess().getColonKeyword_3_1());
            			
            // InternalAfvl.g:913:4: ( (lv_delivery_5_0= ruleDeliveryModel ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=46 && LA17_0<=49)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAfvl.g:914:5: (lv_delivery_5_0= ruleDeliveryModel )
                    {
                    // InternalAfvl.g:914:5: (lv_delivery_5_0= ruleDeliveryModel )
                    // InternalAfvl.g:915:6: lv_delivery_5_0= ruleDeliveryModel
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getDeliveryDeliveryModelEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_delivery_5_0=ruleDeliveryModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdaptorRule());
                    						}
                    						set(
                    							current,
                    							"delivery",
                    							lv_delivery_5_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.DeliveryModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }


            }

            // InternalAfvl.g:933:3: (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAfvl.g:934:4: otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getAdaptorAccess().getSyncKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getAdaptorAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:942:4: ( (lv_synct_8_0= ruleSyncType ) )
                    // InternalAfvl.g:943:5: (lv_synct_8_0= ruleSyncType )
                    {
                    // InternalAfvl.g:943:5: (lv_synct_8_0= ruleSyncType )
                    // InternalAfvl.g:944:6: lv_synct_8_0= ruleSyncType
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getSynctSyncTypeEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_22);
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

            // InternalAfvl.g:962:3: (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAfvl.g:963:4: otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) )
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getAdaptorAccess().getNotificationKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getAdaptorAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:971:4: ( (lv_notification_11_0= ruleNotificationModel ) )
                    // InternalAfvl.g:972:5: (lv_notification_11_0= ruleNotificationModel )
                    {
                    // InternalAfvl.g:972:5: (lv_notification_11_0= ruleNotificationModel )
                    // InternalAfvl.g:973:6: lv_notification_11_0= ruleNotificationModel
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getNotificationNotificationModelEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_24);
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

            // InternalAfvl.g:991:3: (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAfvl.g:992:4: otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getAdaptorAccess().getBufferingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_13, grammarAccess.getAdaptorAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:1000:4: ( (lv_buffering_14_0= ruleBuffering ) )
                    // InternalAfvl.g:1001:5: (lv_buffering_14_0= ruleBuffering )
                    {
                    // InternalAfvl.g:1001:5: (lv_buffering_14_0= ruleBuffering )
                    // InternalAfvl.g:1002:6: lv_buffering_14_0= ruleBuffering
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getBufferingBufferingEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_26);
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

            // InternalAfvl.g:1020:3: (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAfvl.g:1021:4: otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) )
                    {
                    otherlv_15=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getAdaptorAccess().getThroughputKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_27); 

                    				newLeafNode(otherlv_16, grammarAccess.getAdaptorAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:1029:4: ( (lv_throughput_17_0= ruleThroughput ) )
                    // InternalAfvl.g:1030:5: (lv_throughput_17_0= ruleThroughput )
                    {
                    // InternalAfvl.g:1030:5: (lv_throughput_17_0= ruleThroughput )
                    // InternalAfvl.g:1031:6: lv_throughput_17_0= ruleThroughput
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getThroughputThroughputEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

            // InternalAfvl.g:1049:3: (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAfvl.g:1050:4: otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,29,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getAdaptorAccess().getPropsKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,20,FOLLOW_29); 

                    				newLeafNode(otherlv_19, grammarAccess.getAdaptorAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:1058:4: ( (lv_props_20_0= ruleEString ) )
                    // InternalAfvl.g:1059:5: (lv_props_20_0= ruleEString )
                    {
                    // InternalAfvl.g:1059:5: (lv_props_20_0= ruleEString )
                    // InternalAfvl.g:1060:6: lv_props_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getPropsEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

            // InternalAfvl.g:1078:3: (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAfvl.g:1079:4: otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) )
                    {
                    otherlv_21=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getAdaptorAccess().getDecisionKeyword_9_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getAdaptorAccess().getColonKeyword_9_1());
                    			
                    // InternalAfvl.g:1087:4: ( (otherlv_23= RULE_ID ) )
                    // InternalAfvl.g:1088:5: (otherlv_23= RULE_ID )
                    {
                    // InternalAfvl.g:1088:5: (otherlv_23= RULE_ID )
                    // InternalAfvl.g:1089:6: otherlv_23= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAdaptorRule());
                    						}
                    					
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_31); 

                    						newLeafNode(otherlv_23, grammarAccess.getAdaptorAccess().getDecisionArchDecisionCrossReference_9_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_24, grammarAccess.getAdaptorAccess().getRolesKeyword_10());
            		
            otherlv_25=(Token)match(input,14,FOLLOW_32); 

            			newLeafNode(otherlv_25, grammarAccess.getAdaptorAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalAfvl.g:1109:3: ( (lv_roles_26_0= ruleRole ) )
            // InternalAfvl.g:1110:4: (lv_roles_26_0= ruleRole )
            {
            // InternalAfvl.g:1110:4: (lv_roles_26_0= ruleRole )
            // InternalAfvl.g:1111:5: lv_roles_26_0= ruleRole
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

            // InternalAfvl.g:1128:3: (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==16) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAfvl.g:1129:4: otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) )
            	    {
            	    otherlv_27=(Token)match(input,16,FOLLOW_32); 

            	    				newLeafNode(otherlv_27, grammarAccess.getAdaptorAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalAfvl.g:1133:4: ( (lv_roles_28_0= ruleRole ) )
            	    // InternalAfvl.g:1134:5: (lv_roles_28_0= ruleRole )
            	    {
            	    // InternalAfvl.g:1134:5: (lv_roles_28_0= ruleRole )
            	    // InternalAfvl.g:1135:6: lv_roles_28_0= ruleRole
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
            	    break loop24;
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
    // InternalAfvl.g:1165:1: entryRuleDistributor returns [EObject current=null] : iv_ruleDistributor= ruleDistributor EOF ;
    public final EObject entryRuleDistributor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistributor = null;


        try {
            // InternalAfvl.g:1165:52: (iv_ruleDistributor= ruleDistributor EOF )
            // InternalAfvl.g:1166:2: iv_ruleDistributor= ruleDistributor EOF
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
    // InternalAfvl.g:1172:1: ruleDistributor returns [EObject current=null] : (otherlv_0= 'Distributor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= '{' ( (lv_roles_26_0= ruleRole ) ) (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )* otherlv_29= '}' otherlv_30= '}' ) ;
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
            // InternalAfvl.g:1178:2: ( (otherlv_0= 'Distributor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= '{' ( (lv_roles_26_0= ruleRole ) ) (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )* otherlv_29= '}' otherlv_30= '}' ) )
            // InternalAfvl.g:1179:2: (otherlv_0= 'Distributor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= '{' ( (lv_roles_26_0= ruleRole ) ) (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )* otherlv_29= '}' otherlv_30= '}' )
            {
            // InternalAfvl.g:1179:2: (otherlv_0= 'Distributor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= '{' ( (lv_roles_26_0= ruleRole ) ) (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )* otherlv_29= '}' otherlv_30= '}' )
            // InternalAfvl.g:1180:3: otherlv_0= 'Distributor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= '{' ( (lv_roles_26_0= ruleRole ) ) (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )* otherlv_29= '}' otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDistributorAccess().getDistributorKeyword_0());
            		
            // InternalAfvl.g:1184:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:1185:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:1185:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:1186:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getDistributorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:1206:3: (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAfvl.g:1207:4: otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getDistributorAccess().getDeliveryKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getDistributorAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:1215:4: ( (lv_delivery_5_0= ruleDeliveryModel ) )
                    // InternalAfvl.g:1216:5: (lv_delivery_5_0= ruleDeliveryModel )
                    {
                    // InternalAfvl.g:1216:5: (lv_delivery_5_0= ruleDeliveryModel )
                    // InternalAfvl.g:1217:6: lv_delivery_5_0= ruleDeliveryModel
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getDeliveryDeliveryModelEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_delivery_5_0=ruleDeliveryModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistributorRule());
                    						}
                    						set(
                    							current,
                    							"delivery",
                    							lv_delivery_5_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.DeliveryModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1235:3: (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAfvl.g:1236:4: otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getDistributorAccess().getSyncKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getDistributorAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:1244:4: ( (lv_synct_8_0= ruleSyncType ) )
                    // InternalAfvl.g:1245:5: (lv_synct_8_0= ruleSyncType )
                    {
                    // InternalAfvl.g:1245:5: (lv_synct_8_0= ruleSyncType )
                    // InternalAfvl.g:1246:6: lv_synct_8_0= ruleSyncType
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getSynctSyncTypeEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_22);
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

            // InternalAfvl.g:1264:3: (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAfvl.g:1265:4: otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) )
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getDistributorAccess().getNotificationKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getDistributorAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:1273:4: ( (lv_notification_11_0= ruleNotificationModel ) )
                    // InternalAfvl.g:1274:5: (lv_notification_11_0= ruleNotificationModel )
                    {
                    // InternalAfvl.g:1274:5: (lv_notification_11_0= ruleNotificationModel )
                    // InternalAfvl.g:1275:6: lv_notification_11_0= ruleNotificationModel
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getNotificationNotificationModelEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_24);
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

            // InternalAfvl.g:1293:3: (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAfvl.g:1294:4: otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getDistributorAccess().getBufferingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_13, grammarAccess.getDistributorAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:1302:4: ( (lv_buffering_14_0= ruleBuffering ) )
                    // InternalAfvl.g:1303:5: (lv_buffering_14_0= ruleBuffering )
                    {
                    // InternalAfvl.g:1303:5: (lv_buffering_14_0= ruleBuffering )
                    // InternalAfvl.g:1304:6: lv_buffering_14_0= ruleBuffering
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getBufferingBufferingEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_26);
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

            // InternalAfvl.g:1322:3: (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAfvl.g:1323:4: otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) )
                    {
                    otherlv_15=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getDistributorAccess().getThroughputKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_27); 

                    				newLeafNode(otherlv_16, grammarAccess.getDistributorAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:1331:4: ( (lv_throughput_17_0= ruleThroughput ) )
                    // InternalAfvl.g:1332:5: (lv_throughput_17_0= ruleThroughput )
                    {
                    // InternalAfvl.g:1332:5: (lv_throughput_17_0= ruleThroughput )
                    // InternalAfvl.g:1333:6: lv_throughput_17_0= ruleThroughput
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getThroughputThroughputEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

            // InternalAfvl.g:1351:3: (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAfvl.g:1352:4: otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,29,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getDistributorAccess().getPropsKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,20,FOLLOW_29); 

                    				newLeafNode(otherlv_19, grammarAccess.getDistributorAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:1360:4: ( (lv_props_20_0= ruleEString ) )
                    // InternalAfvl.g:1361:5: (lv_props_20_0= ruleEString )
                    {
                    // InternalAfvl.g:1361:5: (lv_props_20_0= ruleEString )
                    // InternalAfvl.g:1362:6: lv_props_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getPropsEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

            // InternalAfvl.g:1380:3: (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==30) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAfvl.g:1381:4: otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) )
                    {
                    otherlv_21=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getDistributorAccess().getDecisionKeyword_9_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getDistributorAccess().getColonKeyword_9_1());
                    			
                    // InternalAfvl.g:1389:4: ( (otherlv_23= RULE_ID ) )
                    // InternalAfvl.g:1390:5: (otherlv_23= RULE_ID )
                    {
                    // InternalAfvl.g:1390:5: (otherlv_23= RULE_ID )
                    // InternalAfvl.g:1391:6: otherlv_23= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDistributorRule());
                    						}
                    					
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_31); 

                    						newLeafNode(otherlv_23, grammarAccess.getDistributorAccess().getDecisionArchDecisionCrossReference_9_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_24, grammarAccess.getDistributorAccess().getRolesKeyword_10());
            		
            otherlv_25=(Token)match(input,14,FOLLOW_32); 

            			newLeafNode(otherlv_25, grammarAccess.getDistributorAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalAfvl.g:1411:3: ( (lv_roles_26_0= ruleRole ) )
            // InternalAfvl.g:1412:4: (lv_roles_26_0= ruleRole )
            {
            // InternalAfvl.g:1412:4: (lv_roles_26_0= ruleRole )
            // InternalAfvl.g:1413:5: lv_roles_26_0= ruleRole
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

            // InternalAfvl.g:1430:3: (otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==16) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAfvl.g:1431:4: otherlv_27= ',' ( (lv_roles_28_0= ruleRole ) )
            	    {
            	    otherlv_27=(Token)match(input,16,FOLLOW_32); 

            	    				newLeafNode(otherlv_27, grammarAccess.getDistributorAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalAfvl.g:1435:4: ( (lv_roles_28_0= ruleRole ) )
            	    // InternalAfvl.g:1436:5: (lv_roles_28_0= ruleRole )
            	    {
            	    // InternalAfvl.g:1436:5: (lv_roles_28_0= ruleRole )
            	    // InternalAfvl.g:1437:6: lv_roles_28_0= ruleRole
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
            	    break loop32;
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
    // InternalAfvl.g:1467:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalAfvl.g:1467:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalAfvl.g:1468:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalAfvl.g:1474:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' ) ;
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
            // InternalAfvl.g:1480:2: ( (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' ) )
            // InternalAfvl.g:1481:2: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' )
            {
            // InternalAfvl.g:1481:2: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' )
            // InternalAfvl.g:1482:3: otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
            		
            // InternalAfvl.g:1486:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:1487:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:1487:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:1488:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:1508:3: (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==24) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAfvl.g:1509:4: otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getEventAccess().getDeliveryKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getEventAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:1517:4: ( (lv_delivery_5_0= ruleDeliveryModel ) )
                    // InternalAfvl.g:1518:5: (lv_delivery_5_0= ruleDeliveryModel )
                    {
                    // InternalAfvl.g:1518:5: (lv_delivery_5_0= ruleDeliveryModel )
                    // InternalAfvl.g:1519:6: lv_delivery_5_0= ruleDeliveryModel
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getDeliveryDeliveryModelEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_delivery_5_0=ruleDeliveryModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"delivery",
                    							lv_delivery_5_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.DeliveryModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1537:3: (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==25) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAfvl.g:1538:4: otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getEventAccess().getSyncKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getEventAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:1546:4: ( (lv_synct_8_0= ruleSyncType ) )
                    // InternalAfvl.g:1547:5: (lv_synct_8_0= ruleSyncType )
                    {
                    // InternalAfvl.g:1547:5: (lv_synct_8_0= ruleSyncType )
                    // InternalAfvl.g:1548:6: lv_synct_8_0= ruleSyncType
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getSynctSyncTypeEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_22);
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

            // InternalAfvl.g:1566:3: (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==26) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAfvl.g:1567:4: otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) )
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getEventAccess().getNotificationKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getEventAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:1575:4: ( (lv_notification_11_0= ruleNotificationModel ) )
                    // InternalAfvl.g:1576:5: (lv_notification_11_0= ruleNotificationModel )
                    {
                    // InternalAfvl.g:1576:5: (lv_notification_11_0= ruleNotificationModel )
                    // InternalAfvl.g:1577:6: lv_notification_11_0= ruleNotificationModel
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getNotificationNotificationModelEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_24);
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

            // InternalAfvl.g:1595:3: (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==27) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAfvl.g:1596:4: otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getEventAccess().getBufferingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_13, grammarAccess.getEventAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:1604:4: ( (lv_buffering_14_0= ruleBuffering ) )
                    // InternalAfvl.g:1605:5: (lv_buffering_14_0= ruleBuffering )
                    {
                    // InternalAfvl.g:1605:5: (lv_buffering_14_0= ruleBuffering )
                    // InternalAfvl.g:1606:6: lv_buffering_14_0= ruleBuffering
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getBufferingBufferingEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_26);
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

            // InternalAfvl.g:1624:3: (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==28) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAfvl.g:1625:4: otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) )
                    {
                    otherlv_15=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getEventAccess().getThroughputKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_27); 

                    				newLeafNode(otherlv_16, grammarAccess.getEventAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:1633:4: ( (lv_throughput_17_0= ruleThroughput ) )
                    // InternalAfvl.g:1634:5: (lv_throughput_17_0= ruleThroughput )
                    {
                    // InternalAfvl.g:1634:5: (lv_throughput_17_0= ruleThroughput )
                    // InternalAfvl.g:1635:6: lv_throughput_17_0= ruleThroughput
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getThroughputThroughputEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

            // InternalAfvl.g:1653:3: (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==29) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAfvl.g:1654:4: otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,29,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getEventAccess().getPropsKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,20,FOLLOW_29); 

                    				newLeafNode(otherlv_19, grammarAccess.getEventAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:1662:4: ( (lv_props_20_0= ruleEString ) )
                    // InternalAfvl.g:1663:5: (lv_props_20_0= ruleEString )
                    {
                    // InternalAfvl.g:1663:5: (lv_props_20_0= ruleEString )
                    // InternalAfvl.g:1664:6: lv_props_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getPropsEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

            // InternalAfvl.g:1682:3: (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==30) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAfvl.g:1683:4: otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) )
                    {
                    otherlv_21=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getEventAccess().getDecisionKeyword_9_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getEventAccess().getColonKeyword_9_1());
                    			
                    // InternalAfvl.g:1691:4: ( (otherlv_23= RULE_ID ) )
                    // InternalAfvl.g:1692:5: (otherlv_23= RULE_ID )
                    {
                    // InternalAfvl.g:1692:5: (otherlv_23= RULE_ID )
                    // InternalAfvl.g:1693:6: otherlv_23= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    					
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_31); 

                    						newLeafNode(otherlv_23, grammarAccess.getEventAccess().getDecisionArchDecisionCrossReference_9_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_24, grammarAccess.getEventAccess().getRolesKeyword_10());
            		
            otherlv_25=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_25, grammarAccess.getEventAccess().getColonKeyword_11());
            		
            otherlv_26=(Token)match(input,14,FOLLOW_32); 

            			newLeafNode(otherlv_26, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalAfvl.g:1717:3: ( (lv_roles_27_0= ruleRole ) )
            // InternalAfvl.g:1718:4: (lv_roles_27_0= ruleRole )
            {
            // InternalAfvl.g:1718:4: (lv_roles_27_0= ruleRole )
            // InternalAfvl.g:1719:5: lv_roles_27_0= ruleRole
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

            // InternalAfvl.g:1736:3: (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==16) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAfvl.g:1737:4: otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) )
            	    {
            	    otherlv_28=(Token)match(input,16,FOLLOW_32); 

            	    				newLeafNode(otherlv_28, grammarAccess.getEventAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalAfvl.g:1741:4: ( (lv_roles_29_0= ruleRole ) )
            	    // InternalAfvl.g:1742:5: (lv_roles_29_0= ruleRole )
            	    {
            	    // InternalAfvl.g:1742:5: (lv_roles_29_0= ruleRole )
            	    // InternalAfvl.g:1743:6: lv_roles_29_0= ruleRole
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
            	    break loop40;
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
    // InternalAfvl.g:1773:1: entryRuleProcedureCall returns [EObject current=null] : iv_ruleProcedureCall= ruleProcedureCall EOF ;
    public final EObject entryRuleProcedureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedureCall = null;


        try {
            // InternalAfvl.g:1773:54: (iv_ruleProcedureCall= ruleProcedureCall EOF )
            // InternalAfvl.g:1774:2: iv_ruleProcedureCall= ruleProcedureCall EOF
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
    // InternalAfvl.g:1780:1: ruleProcedureCall returns [EObject current=null] : (otherlv_0= 'ProcCall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' ) ;
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
            // InternalAfvl.g:1786:2: ( (otherlv_0= 'ProcCall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' ) )
            // InternalAfvl.g:1787:2: (otherlv_0= 'ProcCall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' )
            {
            // InternalAfvl.g:1787:2: (otherlv_0= 'ProcCall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}' )
            // InternalAfvl.g:1788:3: otherlv_0= 'ProcCall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )? (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? otherlv_24= 'roles' otherlv_25= ':' otherlv_26= '{' ( (lv_roles_27_0= ruleRole ) ) (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )* otherlv_30= '}' otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcedureCallAccess().getProcCallKeyword_0());
            		
            // InternalAfvl.g:1792:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:1793:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:1793:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:1794:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getProcedureCallAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:1814:3: (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==24) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAfvl.g:1815:4: otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getProcedureCallAccess().getDeliveryKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getProcedureCallAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:1823:4: ( (lv_delivery_5_0= ruleDeliveryModel ) )
                    // InternalAfvl.g:1824:5: (lv_delivery_5_0= ruleDeliveryModel )
                    {
                    // InternalAfvl.g:1824:5: (lv_delivery_5_0= ruleDeliveryModel )
                    // InternalAfvl.g:1825:6: lv_delivery_5_0= ruleDeliveryModel
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getDeliveryDeliveryModelEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_delivery_5_0=ruleDeliveryModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcedureCallRule());
                    						}
                    						set(
                    							current,
                    							"delivery",
                    							lv_delivery_5_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.DeliveryModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1843:3: (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==25) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAfvl.g:1844:4: otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getProcedureCallAccess().getSyncKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getProcedureCallAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:1852:4: ( (lv_synct_8_0= ruleSyncType ) )
                    // InternalAfvl.g:1853:5: (lv_synct_8_0= ruleSyncType )
                    {
                    // InternalAfvl.g:1853:5: (lv_synct_8_0= ruleSyncType )
                    // InternalAfvl.g:1854:6: lv_synct_8_0= ruleSyncType
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getSynctSyncTypeEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_22);
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

            // InternalAfvl.g:1872:3: (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==26) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAfvl.g:1873:4: otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) )
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getProcedureCallAccess().getNotificationKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getProcedureCallAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:1881:4: ( (lv_notification_11_0= ruleNotificationModel ) )
                    // InternalAfvl.g:1882:5: (lv_notification_11_0= ruleNotificationModel )
                    {
                    // InternalAfvl.g:1882:5: (lv_notification_11_0= ruleNotificationModel )
                    // InternalAfvl.g:1883:6: lv_notification_11_0= ruleNotificationModel
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getNotificationNotificationModelEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_24);
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

            // InternalAfvl.g:1901:3: (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==27) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAfvl.g:1902:4: otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getProcedureCallAccess().getBufferingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_13, grammarAccess.getProcedureCallAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:1910:4: ( (lv_buffering_14_0= ruleBuffering ) )
                    // InternalAfvl.g:1911:5: (lv_buffering_14_0= ruleBuffering )
                    {
                    // InternalAfvl.g:1911:5: (lv_buffering_14_0= ruleBuffering )
                    // InternalAfvl.g:1912:6: lv_buffering_14_0= ruleBuffering
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getBufferingBufferingEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_26);
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

            // InternalAfvl.g:1930:3: (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==28) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAfvl.g:1931:4: otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) )
                    {
                    otherlv_15=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getProcedureCallAccess().getThroughputKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_27); 

                    				newLeafNode(otherlv_16, grammarAccess.getProcedureCallAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:1939:4: ( (lv_throughput_17_0= ruleThroughput ) )
                    // InternalAfvl.g:1940:5: (lv_throughput_17_0= ruleThroughput )
                    {
                    // InternalAfvl.g:1940:5: (lv_throughput_17_0= ruleThroughput )
                    // InternalAfvl.g:1941:6: lv_throughput_17_0= ruleThroughput
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getThroughputThroughputEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

            // InternalAfvl.g:1959:3: (otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==29) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAfvl.g:1960:4: otherlv_18= 'props' otherlv_19= ':' ( (lv_props_20_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,29,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getProcedureCallAccess().getPropsKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,20,FOLLOW_29); 

                    				newLeafNode(otherlv_19, grammarAccess.getProcedureCallAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:1968:4: ( (lv_props_20_0= ruleEString ) )
                    // InternalAfvl.g:1969:5: (lv_props_20_0= ruleEString )
                    {
                    // InternalAfvl.g:1969:5: (lv_props_20_0= ruleEString )
                    // InternalAfvl.g:1970:6: lv_props_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getPropsEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

            // InternalAfvl.g:1988:3: (otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==30) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAfvl.g:1989:4: otherlv_21= 'decision' otherlv_22= ':' ( (otherlv_23= RULE_ID ) )
                    {
                    otherlv_21=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getProcedureCallAccess().getDecisionKeyword_9_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getProcedureCallAccess().getColonKeyword_9_1());
                    			
                    // InternalAfvl.g:1997:4: ( (otherlv_23= RULE_ID ) )
                    // InternalAfvl.g:1998:5: (otherlv_23= RULE_ID )
                    {
                    // InternalAfvl.g:1998:5: (otherlv_23= RULE_ID )
                    // InternalAfvl.g:1999:6: otherlv_23= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcedureCallRule());
                    						}
                    					
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_31); 

                    						newLeafNode(otherlv_23, grammarAccess.getProcedureCallAccess().getDecisionArchDecisionCrossReference_9_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_24, grammarAccess.getProcedureCallAccess().getRolesKeyword_10());
            		
            otherlv_25=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_25, grammarAccess.getProcedureCallAccess().getColonKeyword_11());
            		
            otherlv_26=(Token)match(input,14,FOLLOW_32); 

            			newLeafNode(otherlv_26, grammarAccess.getProcedureCallAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalAfvl.g:2023:3: ( (lv_roles_27_0= ruleRole ) )
            // InternalAfvl.g:2024:4: (lv_roles_27_0= ruleRole )
            {
            // InternalAfvl.g:2024:4: (lv_roles_27_0= ruleRole )
            // InternalAfvl.g:2025:5: lv_roles_27_0= ruleRole
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

            // InternalAfvl.g:2042:3: (otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==16) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalAfvl.g:2043:4: otherlv_28= ',' ( (lv_roles_29_0= ruleRole ) )
            	    {
            	    otherlv_28=(Token)match(input,16,FOLLOW_32); 

            	    				newLeafNode(otherlv_28, grammarAccess.getProcedureCallAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalAfvl.g:2047:4: ( (lv_roles_29_0= ruleRole ) )
            	    // InternalAfvl.g:2048:5: (lv_roles_29_0= ruleRole )
            	    {
            	    // InternalAfvl.g:2048:5: (lv_roles_29_0= ruleRole )
            	    // InternalAfvl.g:2049:6: lv_roles_29_0= ruleRole
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
            	    break loop48;
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
    // InternalAfvl.g:2079:1: entryRuleTransformer returns [EObject current=null] : iv_ruleTransformer= ruleTransformer EOF ;
    public final EObject entryRuleTransformer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformer = null;


        try {
            // InternalAfvl.g:2079:52: (iv_ruleTransformer= ruleTransformer EOF )
            // InternalAfvl.g:2080:2: iv_ruleTransformer= ruleTransformer EOF
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
    // InternalAfvl.g:2086:1: ruleTransformer returns [EObject current=null] : (otherlv_0= 'Transformer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? (otherlv_9= 'decision' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}' ) ;
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
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Enumerator lv_procModel_5_0 = null;

        AntlrDatatypeRuleToken lv_pmml_8_0 = null;

        EObject lv_ports_15_0 = null;

        EObject lv_ports_17_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:2092:2: ( (otherlv_0= 'Transformer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? (otherlv_9= 'decision' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}' ) )
            // InternalAfvl.g:2093:2: (otherlv_0= 'Transformer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? (otherlv_9= 'decision' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}' )
            {
            // InternalAfvl.g:2093:2: (otherlv_0= 'Transformer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? (otherlv_9= 'decision' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}' )
            // InternalAfvl.g:2094:3: otherlv_0= 'Transformer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? (otherlv_9= 'decision' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransformerAccess().getTransformerKeyword_0());
            		
            // InternalAfvl.g:2098:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:2099:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:2099:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:2100:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getTransformerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:2120:3: (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==37) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAfvl.g:2121:4: otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransformerAccess().getProcModelKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransformerAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:2129:4: ( (lv_procModel_5_0= ruleProcessingModel ) )
                    // InternalAfvl.g:2130:5: (lv_procModel_5_0= ruleProcessingModel )
                    {
                    // InternalAfvl.g:2130:5: (lv_procModel_5_0= ruleProcessingModel )
                    // InternalAfvl.g:2131:6: lv_procModel_5_0= ruleProcessingModel
                    {

                    						newCompositeNode(grammarAccess.getTransformerAccess().getProcModelProcessingModelEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_37);
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

            // InternalAfvl.g:2149:3: (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==38) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAfvl.g:2150:4: otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getTransformerAccess().getPmmlKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_29); 

                    				newLeafNode(otherlv_7, grammarAccess.getTransformerAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:2158:4: ( (lv_pmml_8_0= ruleEString ) )
                    // InternalAfvl.g:2159:5: (lv_pmml_8_0= ruleEString )
                    {
                    // InternalAfvl.g:2159:5: (lv_pmml_8_0= ruleEString )
                    // InternalAfvl.g:2160:6: lv_pmml_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTransformerAccess().getPmmlEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_pmml_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransformerRule());
                    						}
                    						set(
                    							current,
                    							"pmml",
                    							lv_pmml_8_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2178:3: (otherlv_9= 'decision' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==30) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAfvl.g:2179:4: otherlv_9= 'decision' otherlv_10= ':' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getTransformerAccess().getDecisionKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getTransformerAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:2187:4: ( (otherlv_11= RULE_ID ) )
                    // InternalAfvl.g:2188:5: (otherlv_11= RULE_ID )
                    {
                    // InternalAfvl.g:2188:5: (otherlv_11= RULE_ID )
                    // InternalAfvl.g:2189:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransformerRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_39); 

                    						newLeafNode(otherlv_11, grammarAccess.getTransformerAccess().getDecisionArchDecisionCrossReference_5_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getTransformerAccess().getPortsKeyword_6());
            		
            otherlv_13=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_13, grammarAccess.getTransformerAccess().getColonKeyword_7());
            		
            otherlv_14=(Token)match(input,14,FOLLOW_40); 

            			newLeafNode(otherlv_14, grammarAccess.getTransformerAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalAfvl.g:2213:3: ( (lv_ports_15_0= rulePort ) )
            // InternalAfvl.g:2214:4: (lv_ports_15_0= rulePort )
            {
            // InternalAfvl.g:2214:4: (lv_ports_15_0= rulePort )
            // InternalAfvl.g:2215:5: lv_ports_15_0= rulePort
            {

            					newCompositeNode(grammarAccess.getTransformerAccess().getPortsPortParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_ports_15_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransformerRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_15_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:2232:3: (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==16) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalAfvl.g:2233:4: otherlv_16= ',' ( (lv_ports_17_0= rulePort ) )
            	    {
            	    otherlv_16=(Token)match(input,16,FOLLOW_40); 

            	    				newLeafNode(otherlv_16, grammarAccess.getTransformerAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalAfvl.g:2237:4: ( (lv_ports_17_0= rulePort ) )
            	    // InternalAfvl.g:2238:5: (lv_ports_17_0= rulePort )
            	    {
            	    // InternalAfvl.g:2238:5: (lv_ports_17_0= rulePort )
            	    // InternalAfvl.g:2239:6: lv_ports_17_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getTransformerAccess().getPortsPortParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_ports_17_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTransformerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_17_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_18=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_18, grammarAccess.getTransformerAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_19=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getTransformerAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalAfvl.g:2269:1: entryRuleEstimator returns [EObject current=null] : iv_ruleEstimator= ruleEstimator EOF ;
    public final EObject entryRuleEstimator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEstimator = null;


        try {
            // InternalAfvl.g:2269:50: (iv_ruleEstimator= ruleEstimator EOF )
            // InternalAfvl.g:2270:2: iv_ruleEstimator= ruleEstimator EOF
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
    // InternalAfvl.g:2276:1: ruleEstimator returns [EObject current=null] : (otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? (otherlv_9= 'decision' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}' ) ;
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
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Enumerator lv_procModel_5_0 = null;

        AntlrDatatypeRuleToken lv_pmml_8_0 = null;

        EObject lv_ports_15_0 = null;

        EObject lv_ports_17_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:2282:2: ( (otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? (otherlv_9= 'decision' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}' ) )
            // InternalAfvl.g:2283:2: (otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? (otherlv_9= 'decision' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}' )
            {
            // InternalAfvl.g:2283:2: (otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? (otherlv_9= 'decision' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}' )
            // InternalAfvl.g:2284:3: otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? (otherlv_9= 'decision' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEstimatorAccess().getEstimatorKeyword_0());
            		
            // InternalAfvl.g:2288:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:2289:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:2289:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:2290:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getEstimatorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:2310:3: (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==37) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalAfvl.g:2311:4: otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getEstimatorAccess().getProcModelKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getEstimatorAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:2319:4: ( (lv_procModel_5_0= ruleProcessingModel ) )
                    // InternalAfvl.g:2320:5: (lv_procModel_5_0= ruleProcessingModel )
                    {
                    // InternalAfvl.g:2320:5: (lv_procModel_5_0= ruleProcessingModel )
                    // InternalAfvl.g:2321:6: lv_procModel_5_0= ruleProcessingModel
                    {

                    						newCompositeNode(grammarAccess.getEstimatorAccess().getProcModelProcessingModelEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_37);
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

            // InternalAfvl.g:2339:3: (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==38) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAfvl.g:2340:4: otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getEstimatorAccess().getPmmlKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_29); 

                    				newLeafNode(otherlv_7, grammarAccess.getEstimatorAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:2348:4: ( (lv_pmml_8_0= ruleEString ) )
                    // InternalAfvl.g:2349:5: (lv_pmml_8_0= ruleEString )
                    {
                    // InternalAfvl.g:2349:5: (lv_pmml_8_0= ruleEString )
                    // InternalAfvl.g:2350:6: lv_pmml_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEstimatorAccess().getPmmlEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_pmml_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEstimatorRule());
                    						}
                    						set(
                    							current,
                    							"pmml",
                    							lv_pmml_8_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2368:3: (otherlv_9= 'decision' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==30) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalAfvl.g:2369:4: otherlv_9= 'decision' otherlv_10= ':' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getEstimatorAccess().getDecisionKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getEstimatorAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:2377:4: ( (otherlv_11= RULE_ID ) )
                    // InternalAfvl.g:2378:5: (otherlv_11= RULE_ID )
                    {
                    // InternalAfvl.g:2378:5: (otherlv_11= RULE_ID )
                    // InternalAfvl.g:2379:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEstimatorRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_39); 

                    						newLeafNode(otherlv_11, grammarAccess.getEstimatorAccess().getDecisionArchDecisionCrossReference_5_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getEstimatorAccess().getPortsKeyword_6());
            		
            otherlv_13=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_13, grammarAccess.getEstimatorAccess().getColonKeyword_7());
            		
            otherlv_14=(Token)match(input,14,FOLLOW_40); 

            			newLeafNode(otherlv_14, grammarAccess.getEstimatorAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalAfvl.g:2403:3: ( (lv_ports_15_0= rulePort ) )
            // InternalAfvl.g:2404:4: (lv_ports_15_0= rulePort )
            {
            // InternalAfvl.g:2404:4: (lv_ports_15_0= rulePort )
            // InternalAfvl.g:2405:5: lv_ports_15_0= rulePort
            {

            					newCompositeNode(grammarAccess.getEstimatorAccess().getPortsPortParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_ports_15_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEstimatorRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_15_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:2422:3: (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==16) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalAfvl.g:2423:4: otherlv_16= ',' ( (lv_ports_17_0= rulePort ) )
            	    {
            	    otherlv_16=(Token)match(input,16,FOLLOW_40); 

            	    				newLeafNode(otherlv_16, grammarAccess.getEstimatorAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalAfvl.g:2427:4: ( (lv_ports_17_0= rulePort ) )
            	    // InternalAfvl.g:2428:5: (lv_ports_17_0= rulePort )
            	    {
            	    // InternalAfvl.g:2428:5: (lv_ports_17_0= rulePort )
            	    // InternalAfvl.g:2429:6: lv_ports_17_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getEstimatorAccess().getPortsPortParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_ports_17_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEstimatorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_17_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_18=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_18, grammarAccess.getEstimatorAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_19=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getEstimatorAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalAfvl.g:2459:1: entryRuleIngestor returns [EObject current=null] : iv_ruleIngestor= ruleIngestor EOF ;
    public final EObject entryRuleIngestor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngestor = null;


        try {
            // InternalAfvl.g:2459:49: (iv_ruleIngestor= ruleIngestor EOF )
            // InternalAfvl.g:2460:2: iv_ruleIngestor= ruleIngestor EOF
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
    // InternalAfvl.g:2466:1: ruleIngestor returns [EObject current=null] : (otherlv_0= 'Ingestor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAccessType ) ) (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )? (otherlv_9= 'conn' otherlv_10= ':' ( (lv_conn_11_0= ruleEString ) ) )? (otherlv_12= 'format' otherlv_13= ':' ( (lv_format_14_0= ruleEString ) ) )? (otherlv_15= 'props' otherlv_16= ':' ( (lv_props_17_0= ruleEString ) ) )? (otherlv_18= 'decision' otherlv_19= ':' ( (otherlv_20= RULE_ID ) ) )? otherlv_21= 'ports' otherlv_22= ':' otherlv_23= '{' ( (lv_ports_24_0= rulePort ) ) (otherlv_25= ',' ( (lv_ports_26_0= rulePort ) ) )* otherlv_27= '}' otherlv_28= '}' ) ;
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
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Enumerator lv_type_5_0 = null;

        Enumerator lv_procModel_8_0 = null;

        AntlrDatatypeRuleToken lv_conn_11_0 = null;

        AntlrDatatypeRuleToken lv_format_14_0 = null;

        AntlrDatatypeRuleToken lv_props_17_0 = null;

        EObject lv_ports_24_0 = null;

        EObject lv_ports_26_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:2472:2: ( (otherlv_0= 'Ingestor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAccessType ) ) (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )? (otherlv_9= 'conn' otherlv_10= ':' ( (lv_conn_11_0= ruleEString ) ) )? (otherlv_12= 'format' otherlv_13= ':' ( (lv_format_14_0= ruleEString ) ) )? (otherlv_15= 'props' otherlv_16= ':' ( (lv_props_17_0= ruleEString ) ) )? (otherlv_18= 'decision' otherlv_19= ':' ( (otherlv_20= RULE_ID ) ) )? otherlv_21= 'ports' otherlv_22= ':' otherlv_23= '{' ( (lv_ports_24_0= rulePort ) ) (otherlv_25= ',' ( (lv_ports_26_0= rulePort ) ) )* otherlv_27= '}' otherlv_28= '}' ) )
            // InternalAfvl.g:2473:2: (otherlv_0= 'Ingestor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAccessType ) ) (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )? (otherlv_9= 'conn' otherlv_10= ':' ( (lv_conn_11_0= ruleEString ) ) )? (otherlv_12= 'format' otherlv_13= ':' ( (lv_format_14_0= ruleEString ) ) )? (otherlv_15= 'props' otherlv_16= ':' ( (lv_props_17_0= ruleEString ) ) )? (otherlv_18= 'decision' otherlv_19= ':' ( (otherlv_20= RULE_ID ) ) )? otherlv_21= 'ports' otherlv_22= ':' otherlv_23= '{' ( (lv_ports_24_0= rulePort ) ) (otherlv_25= ',' ( (lv_ports_26_0= rulePort ) ) )* otherlv_27= '}' otherlv_28= '}' )
            {
            // InternalAfvl.g:2473:2: (otherlv_0= 'Ingestor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAccessType ) ) (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )? (otherlv_9= 'conn' otherlv_10= ':' ( (lv_conn_11_0= ruleEString ) ) )? (otherlv_12= 'format' otherlv_13= ':' ( (lv_format_14_0= ruleEString ) ) )? (otherlv_15= 'props' otherlv_16= ':' ( (lv_props_17_0= ruleEString ) ) )? (otherlv_18= 'decision' otherlv_19= ':' ( (otherlv_20= RULE_ID ) ) )? otherlv_21= 'ports' otherlv_22= ':' otherlv_23= '{' ( (lv_ports_24_0= rulePort ) ) (otherlv_25= ',' ( (lv_ports_26_0= rulePort ) ) )* otherlv_27= '}' otherlv_28= '}' )
            // InternalAfvl.g:2474:3: otherlv_0= 'Ingestor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAccessType ) ) (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )? (otherlv_9= 'conn' otherlv_10= ':' ( (lv_conn_11_0= ruleEString ) ) )? (otherlv_12= 'format' otherlv_13= ':' ( (lv_format_14_0= ruleEString ) ) )? (otherlv_15= 'props' otherlv_16= ':' ( (lv_props_17_0= ruleEString ) ) )? (otherlv_18= 'decision' otherlv_19= ':' ( (otherlv_20= RULE_ID ) ) )? otherlv_21= 'ports' otherlv_22= ':' otherlv_23= '{' ( (lv_ports_24_0= rulePort ) ) (otherlv_25= ',' ( (lv_ports_26_0= rulePort ) ) )* otherlv_27= '}' otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIngestorAccess().getIngestorKeyword_0());
            		
            // InternalAfvl.g:2478:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:2479:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:2479:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:2480:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getIngestorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,42,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getIngestorAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_42); 

            			newLeafNode(otherlv_4, grammarAccess.getIngestorAccess().getColonKeyword_4());
            		
            // InternalAfvl.g:2508:3: ( (lv_type_5_0= ruleAccessType ) )
            // InternalAfvl.g:2509:4: (lv_type_5_0= ruleAccessType )
            {
            // InternalAfvl.g:2509:4: (lv_type_5_0= ruleAccessType )
            // InternalAfvl.g:2510:5: lv_type_5_0= ruleAccessType
            {

            					newCompositeNode(grammarAccess.getIngestorAccess().getTypeAccessTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalAfvl.g:2527:3: (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==37) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalAfvl.g:2528:4: otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) )
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getIngestorAccess().getProcModelKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getIngestorAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:2536:4: ( (lv_procModel_8_0= ruleProcessingModel ) )
                    // InternalAfvl.g:2537:5: (lv_procModel_8_0= ruleProcessingModel )
                    {
                    // InternalAfvl.g:2537:5: (lv_procModel_8_0= ruleProcessingModel )
                    // InternalAfvl.g:2538:6: lv_procModel_8_0= ruleProcessingModel
                    {

                    						newCompositeNode(grammarAccess.getIngestorAccess().getProcModelProcessingModelEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_44);
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

            // InternalAfvl.g:2556:3: (otherlv_9= 'conn' otherlv_10= ':' ( (lv_conn_11_0= ruleEString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==43) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAfvl.g:2557:4: otherlv_9= 'conn' otherlv_10= ':' ( (lv_conn_11_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,43,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getIngestorAccess().getConnKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_29); 

                    				newLeafNode(otherlv_10, grammarAccess.getIngestorAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:2565:4: ( (lv_conn_11_0= ruleEString ) )
                    // InternalAfvl.g:2566:5: (lv_conn_11_0= ruleEString )
                    {
                    // InternalAfvl.g:2566:5: (lv_conn_11_0= ruleEString )
                    // InternalAfvl.g:2567:6: lv_conn_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIngestorAccess().getConnEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_conn_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngestorRule());
                    						}
                    						set(
                    							current,
                    							"conn",
                    							lv_conn_11_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2585:3: (otherlv_12= 'format' otherlv_13= ':' ( (lv_format_14_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==44) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalAfvl.g:2586:4: otherlv_12= 'format' otherlv_13= ':' ( (lv_format_14_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,44,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getIngestorAccess().getFormatKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_29); 

                    				newLeafNode(otherlv_13, grammarAccess.getIngestorAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:2594:4: ( (lv_format_14_0= ruleEString ) )
                    // InternalAfvl.g:2595:5: (lv_format_14_0= ruleEString )
                    {
                    // InternalAfvl.g:2595:5: (lv_format_14_0= ruleEString )
                    // InternalAfvl.g:2596:6: lv_format_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIngestorAccess().getFormatEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_format_14_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngestorRule());
                    						}
                    						set(
                    							current,
                    							"format",
                    							lv_format_14_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2614:3: (otherlv_15= 'props' otherlv_16= ':' ( (lv_props_17_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==29) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalAfvl.g:2615:4: otherlv_15= 'props' otherlv_16= ':' ( (lv_props_17_0= ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,29,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getIngestorAccess().getPropsKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getIngestorAccess().getColonKeyword_9_1());
                    			
                    // InternalAfvl.g:2623:4: ( (lv_props_17_0= ruleEString ) )
                    // InternalAfvl.g:2624:5: (lv_props_17_0= ruleEString )
                    {
                    // InternalAfvl.g:2624:5: (lv_props_17_0= ruleEString )
                    // InternalAfvl.g:2625:6: lv_props_17_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIngestorAccess().getPropsEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_props_17_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngestorRule());
                    						}
                    						set(
                    							current,
                    							"props",
                    							lv_props_17_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2643:3: (otherlv_18= 'decision' otherlv_19= ':' ( (otherlv_20= RULE_ID ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==30) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalAfvl.g:2644:4: otherlv_18= 'decision' otherlv_19= ':' ( (otherlv_20= RULE_ID ) )
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getIngestorAccess().getDecisionKeyword_10_0());
                    			
                    otherlv_19=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getIngestorAccess().getColonKeyword_10_1());
                    			
                    // InternalAfvl.g:2652:4: ( (otherlv_20= RULE_ID ) )
                    // InternalAfvl.g:2653:5: (otherlv_20= RULE_ID )
                    {
                    // InternalAfvl.g:2653:5: (otherlv_20= RULE_ID )
                    // InternalAfvl.g:2654:6: otherlv_20= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIngestorRule());
                    						}
                    					
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_39); 

                    						newLeafNode(otherlv_20, grammarAccess.getIngestorAccess().getDecisionArchDecisionCrossReference_10_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_21, grammarAccess.getIngestorAccess().getPortsKeyword_11());
            		
            otherlv_22=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_22, grammarAccess.getIngestorAccess().getColonKeyword_12());
            		
            otherlv_23=(Token)match(input,14,FOLLOW_40); 

            			newLeafNode(otherlv_23, grammarAccess.getIngestorAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalAfvl.g:2678:3: ( (lv_ports_24_0= rulePort ) )
            // InternalAfvl.g:2679:4: (lv_ports_24_0= rulePort )
            {
            // InternalAfvl.g:2679:4: (lv_ports_24_0= rulePort )
            // InternalAfvl.g:2680:5: lv_ports_24_0= rulePort
            {

            					newCompositeNode(grammarAccess.getIngestorAccess().getPortsPortParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_9);
            lv_ports_24_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIngestorRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_24_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:2697:3: (otherlv_25= ',' ( (lv_ports_26_0= rulePort ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==16) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalAfvl.g:2698:4: otherlv_25= ',' ( (lv_ports_26_0= rulePort ) )
            	    {
            	    otherlv_25=(Token)match(input,16,FOLLOW_40); 

            	    				newLeafNode(otherlv_25, grammarAccess.getIngestorAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalAfvl.g:2702:4: ( (lv_ports_26_0= rulePort ) )
            	    // InternalAfvl.g:2703:5: (lv_ports_26_0= rulePort )
            	    {
            	    // InternalAfvl.g:2703:5: (lv_ports_26_0= rulePort )
            	    // InternalAfvl.g:2704:6: lv_ports_26_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getIngestorAccess().getPortsPortParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_ports_26_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIngestorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_26_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            otherlv_27=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_27, grammarAccess.getIngestorAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_28=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getIngestorAccess().getRightCurlyBracketKeyword_17());
            		

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
    // InternalAfvl.g:2734:1: entryRuleSink returns [EObject current=null] : iv_ruleSink= ruleSink EOF ;
    public final EObject entryRuleSink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSink = null;


        try {
            // InternalAfvl.g:2734:45: (iv_ruleSink= ruleSink EOF )
            // InternalAfvl.g:2735:2: iv_ruleSink= ruleSink EOF
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
    // InternalAfvl.g:2741:1: ruleSink returns [EObject current=null] : (otherlv_0= 'Sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAccessType ) ) (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )? (otherlv_9= 'conn' otherlv_10= ':' ( (lv_conn_11_0= ruleEString ) ) )? (otherlv_12= 'format' otherlv_13= ':' ( (lv_format_14_0= ruleEString ) ) )? (otherlv_15= 'props' otherlv_16= ':' ( (lv_props_17_0= ruleEString ) ) )? (otherlv_18= 'decision' otherlv_19= ':' ( (otherlv_20= RULE_ID ) ) )? otherlv_21= 'ports' otherlv_22= ':' otherlv_23= '{' ( (lv_ports_24_0= rulePort ) ) (otherlv_25= ',' ( (lv_ports_26_0= rulePort ) ) )* otherlv_27= '}' otherlv_28= '}' ) ;
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
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Enumerator lv_type_5_0 = null;

        Enumerator lv_procModel_8_0 = null;

        AntlrDatatypeRuleToken lv_conn_11_0 = null;

        AntlrDatatypeRuleToken lv_format_14_0 = null;

        AntlrDatatypeRuleToken lv_props_17_0 = null;

        EObject lv_ports_24_0 = null;

        EObject lv_ports_26_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:2747:2: ( (otherlv_0= 'Sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAccessType ) ) (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )? (otherlv_9= 'conn' otherlv_10= ':' ( (lv_conn_11_0= ruleEString ) ) )? (otherlv_12= 'format' otherlv_13= ':' ( (lv_format_14_0= ruleEString ) ) )? (otherlv_15= 'props' otherlv_16= ':' ( (lv_props_17_0= ruleEString ) ) )? (otherlv_18= 'decision' otherlv_19= ':' ( (otherlv_20= RULE_ID ) ) )? otherlv_21= 'ports' otherlv_22= ':' otherlv_23= '{' ( (lv_ports_24_0= rulePort ) ) (otherlv_25= ',' ( (lv_ports_26_0= rulePort ) ) )* otherlv_27= '}' otherlv_28= '}' ) )
            // InternalAfvl.g:2748:2: (otherlv_0= 'Sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAccessType ) ) (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )? (otherlv_9= 'conn' otherlv_10= ':' ( (lv_conn_11_0= ruleEString ) ) )? (otherlv_12= 'format' otherlv_13= ':' ( (lv_format_14_0= ruleEString ) ) )? (otherlv_15= 'props' otherlv_16= ':' ( (lv_props_17_0= ruleEString ) ) )? (otherlv_18= 'decision' otherlv_19= ':' ( (otherlv_20= RULE_ID ) ) )? otherlv_21= 'ports' otherlv_22= ':' otherlv_23= '{' ( (lv_ports_24_0= rulePort ) ) (otherlv_25= ',' ( (lv_ports_26_0= rulePort ) ) )* otherlv_27= '}' otherlv_28= '}' )
            {
            // InternalAfvl.g:2748:2: (otherlv_0= 'Sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAccessType ) ) (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )? (otherlv_9= 'conn' otherlv_10= ':' ( (lv_conn_11_0= ruleEString ) ) )? (otherlv_12= 'format' otherlv_13= ':' ( (lv_format_14_0= ruleEString ) ) )? (otherlv_15= 'props' otherlv_16= ':' ( (lv_props_17_0= ruleEString ) ) )? (otherlv_18= 'decision' otherlv_19= ':' ( (otherlv_20= RULE_ID ) ) )? otherlv_21= 'ports' otherlv_22= ':' otherlv_23= '{' ( (lv_ports_24_0= rulePort ) ) (otherlv_25= ',' ( (lv_ports_26_0= rulePort ) ) )* otherlv_27= '}' otherlv_28= '}' )
            // InternalAfvl.g:2749:3: otherlv_0= 'Sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAccessType ) ) (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )? (otherlv_9= 'conn' otherlv_10= ':' ( (lv_conn_11_0= ruleEString ) ) )? (otherlv_12= 'format' otherlv_13= ':' ( (lv_format_14_0= ruleEString ) ) )? (otherlv_15= 'props' otherlv_16= ':' ( (lv_props_17_0= ruleEString ) ) )? (otherlv_18= 'decision' otherlv_19= ':' ( (otherlv_20= RULE_ID ) ) )? otherlv_21= 'ports' otherlv_22= ':' otherlv_23= '{' ( (lv_ports_24_0= rulePort ) ) (otherlv_25= ',' ( (lv_ports_26_0= rulePort ) ) )* otherlv_27= '}' otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSinkAccess().getSinkKeyword_0());
            		
            // InternalAfvl.g:2753:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:2754:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:2754:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:2755:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getSinkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,42,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getSinkAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_42); 

            			newLeafNode(otherlv_4, grammarAccess.getSinkAccess().getColonKeyword_4());
            		
            // InternalAfvl.g:2783:3: ( (lv_type_5_0= ruleAccessType ) )
            // InternalAfvl.g:2784:4: (lv_type_5_0= ruleAccessType )
            {
            // InternalAfvl.g:2784:4: (lv_type_5_0= ruleAccessType )
            // InternalAfvl.g:2785:5: lv_type_5_0= ruleAccessType
            {

            					newCompositeNode(grammarAccess.getSinkAccess().getTypeAccessTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalAfvl.g:2802:3: (otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==37) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAfvl.g:2803:4: otherlv_6= 'procModel' otherlv_7= ':' ( (lv_procModel_8_0= ruleProcessingModel ) )
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getSinkAccess().getProcModelKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getSinkAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:2811:4: ( (lv_procModel_8_0= ruleProcessingModel ) )
                    // InternalAfvl.g:2812:5: (lv_procModel_8_0= ruleProcessingModel )
                    {
                    // InternalAfvl.g:2812:5: (lv_procModel_8_0= ruleProcessingModel )
                    // InternalAfvl.g:2813:6: lv_procModel_8_0= ruleProcessingModel
                    {

                    						newCompositeNode(grammarAccess.getSinkAccess().getProcModelProcessingModelEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_44);
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

            // InternalAfvl.g:2831:3: (otherlv_9= 'conn' otherlv_10= ':' ( (lv_conn_11_0= ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==43) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalAfvl.g:2832:4: otherlv_9= 'conn' otherlv_10= ':' ( (lv_conn_11_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,43,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getSinkAccess().getConnKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_29); 

                    				newLeafNode(otherlv_10, grammarAccess.getSinkAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:2840:4: ( (lv_conn_11_0= ruleEString ) )
                    // InternalAfvl.g:2841:5: (lv_conn_11_0= ruleEString )
                    {
                    // InternalAfvl.g:2841:5: (lv_conn_11_0= ruleEString )
                    // InternalAfvl.g:2842:6: lv_conn_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSinkAccess().getConnEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_conn_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSinkRule());
                    						}
                    						set(
                    							current,
                    							"conn",
                    							lv_conn_11_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2860:3: (otherlv_12= 'format' otherlv_13= ':' ( (lv_format_14_0= ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==44) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalAfvl.g:2861:4: otherlv_12= 'format' otherlv_13= ':' ( (lv_format_14_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,44,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getSinkAccess().getFormatKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_29); 

                    				newLeafNode(otherlv_13, grammarAccess.getSinkAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:2869:4: ( (lv_format_14_0= ruleEString ) )
                    // InternalAfvl.g:2870:5: (lv_format_14_0= ruleEString )
                    {
                    // InternalAfvl.g:2870:5: (lv_format_14_0= ruleEString )
                    // InternalAfvl.g:2871:6: lv_format_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSinkAccess().getFormatEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_format_14_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSinkRule());
                    						}
                    						set(
                    							current,
                    							"format",
                    							lv_format_14_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2889:3: (otherlv_15= 'props' otherlv_16= ':' ( (lv_props_17_0= ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==29) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalAfvl.g:2890:4: otherlv_15= 'props' otherlv_16= ':' ( (lv_props_17_0= ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,29,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getSinkAccess().getPropsKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getSinkAccess().getColonKeyword_9_1());
                    			
                    // InternalAfvl.g:2898:4: ( (lv_props_17_0= ruleEString ) )
                    // InternalAfvl.g:2899:5: (lv_props_17_0= ruleEString )
                    {
                    // InternalAfvl.g:2899:5: (lv_props_17_0= ruleEString )
                    // InternalAfvl.g:2900:6: lv_props_17_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSinkAccess().getPropsEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_props_17_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSinkRule());
                    						}
                    						set(
                    							current,
                    							"props",
                    							lv_props_17_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2918:3: (otherlv_18= 'decision' otherlv_19= ':' ( (otherlv_20= RULE_ID ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==30) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalAfvl.g:2919:4: otherlv_18= 'decision' otherlv_19= ':' ( (otherlv_20= RULE_ID ) )
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getSinkAccess().getDecisionKeyword_10_0());
                    			
                    otherlv_19=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getSinkAccess().getColonKeyword_10_1());
                    			
                    // InternalAfvl.g:2927:4: ( (otherlv_20= RULE_ID ) )
                    // InternalAfvl.g:2928:5: (otherlv_20= RULE_ID )
                    {
                    // InternalAfvl.g:2928:5: (otherlv_20= RULE_ID )
                    // InternalAfvl.g:2929:6: otherlv_20= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSinkRule());
                    						}
                    					
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_39); 

                    						newLeafNode(otherlv_20, grammarAccess.getSinkAccess().getDecisionArchDecisionCrossReference_10_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_21, grammarAccess.getSinkAccess().getPortsKeyword_11());
            		
            otherlv_22=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_22, grammarAccess.getSinkAccess().getColonKeyword_12());
            		
            otherlv_23=(Token)match(input,14,FOLLOW_40); 

            			newLeafNode(otherlv_23, grammarAccess.getSinkAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalAfvl.g:2953:3: ( (lv_ports_24_0= rulePort ) )
            // InternalAfvl.g:2954:4: (lv_ports_24_0= rulePort )
            {
            // InternalAfvl.g:2954:4: (lv_ports_24_0= rulePort )
            // InternalAfvl.g:2955:5: lv_ports_24_0= rulePort
            {

            					newCompositeNode(grammarAccess.getSinkAccess().getPortsPortParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_9);
            lv_ports_24_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSinkRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_24_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:2972:3: (otherlv_25= ',' ( (lv_ports_26_0= rulePort ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==16) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalAfvl.g:2973:4: otherlv_25= ',' ( (lv_ports_26_0= rulePort ) )
            	    {
            	    otherlv_25=(Token)match(input,16,FOLLOW_40); 

            	    				newLeafNode(otherlv_25, grammarAccess.getSinkAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalAfvl.g:2977:4: ( (lv_ports_26_0= rulePort ) )
            	    // InternalAfvl.g:2978:5: (lv_ports_26_0= rulePort )
            	    {
            	    // InternalAfvl.g:2978:5: (lv_ports_26_0= rulePort )
            	    // InternalAfvl.g:2979:6: lv_ports_26_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getSinkAccess().getPortsPortParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_ports_26_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSinkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_26_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            otherlv_27=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_27, grammarAccess.getSinkAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_28=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getSinkAccess().getRightCurlyBracketKeyword_17());
            		

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


    // $ANTLR start "ruleDeliveryModel"
    // InternalAfvl.g:3009:1: ruleDeliveryModel returns [Enumerator current=null] : ( (enumLiteral_0= 'BEST_EFFORT' ) | (enumLiteral_1= 'AT_LEAST_ONE' ) | (enumLiteral_2= 'AT_MOST_ONE' ) | (enumLiteral_3= 'EXACTLY_ONE' ) ) ;
    public final Enumerator ruleDeliveryModel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAfvl.g:3015:2: ( ( (enumLiteral_0= 'BEST_EFFORT' ) | (enumLiteral_1= 'AT_LEAST_ONE' ) | (enumLiteral_2= 'AT_MOST_ONE' ) | (enumLiteral_3= 'EXACTLY_ONE' ) ) )
            // InternalAfvl.g:3016:2: ( (enumLiteral_0= 'BEST_EFFORT' ) | (enumLiteral_1= 'AT_LEAST_ONE' ) | (enumLiteral_2= 'AT_MOST_ONE' ) | (enumLiteral_3= 'EXACTLY_ONE' ) )
            {
            // InternalAfvl.g:3016:2: ( (enumLiteral_0= 'BEST_EFFORT' ) | (enumLiteral_1= 'AT_LEAST_ONE' ) | (enumLiteral_2= 'AT_MOST_ONE' ) | (enumLiteral_3= 'EXACTLY_ONE' ) )
            int alt69=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt69=1;
                }
                break;
            case 47:
                {
                alt69=2;
                }
                break;
            case 48:
                {
                alt69=3;
                }
                break;
            case 49:
                {
                alt69=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalAfvl.g:3017:3: (enumLiteral_0= 'BEST_EFFORT' )
                    {
                    // InternalAfvl.g:3017:3: (enumLiteral_0= 'BEST_EFFORT' )
                    // InternalAfvl.g:3018:4: enumLiteral_0= 'BEST_EFFORT'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getDeliveryModelAccess().getBEST_EFFORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDeliveryModelAccess().getBEST_EFFORTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:3025:3: (enumLiteral_1= 'AT_LEAST_ONE' )
                    {
                    // InternalAfvl.g:3025:3: (enumLiteral_1= 'AT_LEAST_ONE' )
                    // InternalAfvl.g:3026:4: enumLiteral_1= 'AT_LEAST_ONE'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getDeliveryModelAccess().getAT_LEAST_ONEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDeliveryModelAccess().getAT_LEAST_ONEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAfvl.g:3033:3: (enumLiteral_2= 'AT_MOST_ONE' )
                    {
                    // InternalAfvl.g:3033:3: (enumLiteral_2= 'AT_MOST_ONE' )
                    // InternalAfvl.g:3034:4: enumLiteral_2= 'AT_MOST_ONE'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getDeliveryModelAccess().getAT_MOST_ONEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDeliveryModelAccess().getAT_MOST_ONEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAfvl.g:3041:3: (enumLiteral_3= 'EXACTLY_ONE' )
                    {
                    // InternalAfvl.g:3041:3: (enumLiteral_3= 'EXACTLY_ONE' )
                    // InternalAfvl.g:3042:4: enumLiteral_3= 'EXACTLY_ONE'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getDeliveryModelAccess().getEXACTLY_ONEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDeliveryModelAccess().getEXACTLY_ONEEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleDeliveryModel"


    // $ANTLR start "ruleSyncType"
    // InternalAfvl.g:3052:1: ruleSyncType returns [Enumerator current=null] : ( (enumLiteral_0= 'ASYNC' ) | (enumLiteral_1= 'SYNC' ) ) ;
    public final Enumerator ruleSyncType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:3058:2: ( ( (enumLiteral_0= 'ASYNC' ) | (enumLiteral_1= 'SYNC' ) ) )
            // InternalAfvl.g:3059:2: ( (enumLiteral_0= 'ASYNC' ) | (enumLiteral_1= 'SYNC' ) )
            {
            // InternalAfvl.g:3059:2: ( (enumLiteral_0= 'ASYNC' ) | (enumLiteral_1= 'SYNC' ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==50) ) {
                alt70=1;
            }
            else if ( (LA70_0==51) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalAfvl.g:3060:3: (enumLiteral_0= 'ASYNC' )
                    {
                    // InternalAfvl.g:3060:3: (enumLiteral_0= 'ASYNC' )
                    // InternalAfvl.g:3061:4: enumLiteral_0= 'ASYNC'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getSyncTypeAccess().getASYNCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSyncTypeAccess().getASYNCEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:3068:3: (enumLiteral_1= 'SYNC' )
                    {
                    // InternalAfvl.g:3068:3: (enumLiteral_1= 'SYNC' )
                    // InternalAfvl.g:3069:4: enumLiteral_1= 'SYNC'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

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
    // InternalAfvl.g:3079:1: rulePortType returns [Enumerator current=null] : ( (enumLiteral_0= 'REQUIRED' ) | (enumLiteral_1= 'PROVIDED' ) ) ;
    public final Enumerator rulePortType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:3085:2: ( ( (enumLiteral_0= 'REQUIRED' ) | (enumLiteral_1= 'PROVIDED' ) ) )
            // InternalAfvl.g:3086:2: ( (enumLiteral_0= 'REQUIRED' ) | (enumLiteral_1= 'PROVIDED' ) )
            {
            // InternalAfvl.g:3086:2: ( (enumLiteral_0= 'REQUIRED' ) | (enumLiteral_1= 'PROVIDED' ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==52) ) {
                alt71=1;
            }
            else if ( (LA71_0==53) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalAfvl.g:3087:3: (enumLiteral_0= 'REQUIRED' )
                    {
                    // InternalAfvl.g:3087:3: (enumLiteral_0= 'REQUIRED' )
                    // InternalAfvl.g:3088:4: enumLiteral_0= 'REQUIRED'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getPortTypeAccess().getREQUIREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPortTypeAccess().getREQUIREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:3095:3: (enumLiteral_1= 'PROVIDED' )
                    {
                    // InternalAfvl.g:3095:3: (enumLiteral_1= 'PROVIDED' )
                    // InternalAfvl.g:3096:4: enumLiteral_1= 'PROVIDED'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

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
    // InternalAfvl.g:3106:1: ruleRoleType returns [Enumerator current=null] : ( (enumLiteral_0= 'OUT' ) | (enumLiteral_1= 'IN' ) ) ;
    public final Enumerator ruleRoleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:3112:2: ( ( (enumLiteral_0= 'OUT' ) | (enumLiteral_1= 'IN' ) ) )
            // InternalAfvl.g:3113:2: ( (enumLiteral_0= 'OUT' ) | (enumLiteral_1= 'IN' ) )
            {
            // InternalAfvl.g:3113:2: ( (enumLiteral_0= 'OUT' ) | (enumLiteral_1= 'IN' ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==54) ) {
                alt72=1;
            }
            else if ( (LA72_0==55) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalAfvl.g:3114:3: (enumLiteral_0= 'OUT' )
                    {
                    // InternalAfvl.g:3114:3: (enumLiteral_0= 'OUT' )
                    // InternalAfvl.g:3115:4: enumLiteral_0= 'OUT'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getOUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRoleTypeAccess().getOUTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:3122:3: (enumLiteral_1= 'IN' )
                    {
                    // InternalAfvl.g:3122:3: (enumLiteral_1= 'IN' )
                    // InternalAfvl.g:3123:4: enumLiteral_1= 'IN'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

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
    // InternalAfvl.g:3133:1: ruleNotificationModel returns [Enumerator current=null] : ( (enumLiteral_0= 'POLLED' ) | (enumLiteral_1= 'PUBSUB' ) | (enumLiteral_2= 'QUEUED' ) | (enumLiteral_3= 'CENTRAL' ) ) ;
    public final Enumerator ruleNotificationModel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAfvl.g:3139:2: ( ( (enumLiteral_0= 'POLLED' ) | (enumLiteral_1= 'PUBSUB' ) | (enumLiteral_2= 'QUEUED' ) | (enumLiteral_3= 'CENTRAL' ) ) )
            // InternalAfvl.g:3140:2: ( (enumLiteral_0= 'POLLED' ) | (enumLiteral_1= 'PUBSUB' ) | (enumLiteral_2= 'QUEUED' ) | (enumLiteral_3= 'CENTRAL' ) )
            {
            // InternalAfvl.g:3140:2: ( (enumLiteral_0= 'POLLED' ) | (enumLiteral_1= 'PUBSUB' ) | (enumLiteral_2= 'QUEUED' ) | (enumLiteral_3= 'CENTRAL' ) )
            int alt73=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt73=1;
                }
                break;
            case 57:
                {
                alt73=2;
                }
                break;
            case 58:
                {
                alt73=3;
                }
                break;
            case 59:
                {
                alt73=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalAfvl.g:3141:3: (enumLiteral_0= 'POLLED' )
                    {
                    // InternalAfvl.g:3141:3: (enumLiteral_0= 'POLLED' )
                    // InternalAfvl.g:3142:4: enumLiteral_0= 'POLLED'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getNotificationModelAccess().getPOLLEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNotificationModelAccess().getPOLLEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:3149:3: (enumLiteral_1= 'PUBSUB' )
                    {
                    // InternalAfvl.g:3149:3: (enumLiteral_1= 'PUBSUB' )
                    // InternalAfvl.g:3150:4: enumLiteral_1= 'PUBSUB'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getNotificationModelAccess().getPUBSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNotificationModelAccess().getPUBSUBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAfvl.g:3157:3: (enumLiteral_2= 'QUEUED' )
                    {
                    // InternalAfvl.g:3157:3: (enumLiteral_2= 'QUEUED' )
                    // InternalAfvl.g:3158:4: enumLiteral_2= 'QUEUED'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getNotificationModelAccess().getQUEUEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNotificationModelAccess().getQUEUEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAfvl.g:3165:3: (enumLiteral_3= 'CENTRAL' )
                    {
                    // InternalAfvl.g:3165:3: (enumLiteral_3= 'CENTRAL' )
                    // InternalAfvl.g:3166:4: enumLiteral_3= 'CENTRAL'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_2); 

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
    // InternalAfvl.g:3176:1: ruleBuffering returns [Enumerator current=null] : ( (enumLiteral_0= 'BUFFERED' ) | (enumLiteral_1= 'UNBUFFERED' ) ) ;
    public final Enumerator ruleBuffering() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:3182:2: ( ( (enumLiteral_0= 'BUFFERED' ) | (enumLiteral_1= 'UNBUFFERED' ) ) )
            // InternalAfvl.g:3183:2: ( (enumLiteral_0= 'BUFFERED' ) | (enumLiteral_1= 'UNBUFFERED' ) )
            {
            // InternalAfvl.g:3183:2: ( (enumLiteral_0= 'BUFFERED' ) | (enumLiteral_1= 'UNBUFFERED' ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==60) ) {
                alt74=1;
            }
            else if ( (LA74_0==61) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalAfvl.g:3184:3: (enumLiteral_0= 'BUFFERED' )
                    {
                    // InternalAfvl.g:3184:3: (enumLiteral_0= 'BUFFERED' )
                    // InternalAfvl.g:3185:4: enumLiteral_0= 'BUFFERED'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getBufferingAccess().getBUFFEREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBufferingAccess().getBUFFEREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:3192:3: (enumLiteral_1= 'UNBUFFERED' )
                    {
                    // InternalAfvl.g:3192:3: (enumLiteral_1= 'UNBUFFERED' )
                    // InternalAfvl.g:3193:4: enumLiteral_1= 'UNBUFFERED'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

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
    // InternalAfvl.g:3203:1: ruleThroughput returns [Enumerator current=null] : ( (enumLiteral_0= 'ATOMIC' ) | (enumLiteral_1= 'HIGH_ORDER' ) ) ;
    public final Enumerator ruleThroughput() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:3209:2: ( ( (enumLiteral_0= 'ATOMIC' ) | (enumLiteral_1= 'HIGH_ORDER' ) ) )
            // InternalAfvl.g:3210:2: ( (enumLiteral_0= 'ATOMIC' ) | (enumLiteral_1= 'HIGH_ORDER' ) )
            {
            // InternalAfvl.g:3210:2: ( (enumLiteral_0= 'ATOMIC' ) | (enumLiteral_1= 'HIGH_ORDER' ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==62) ) {
                alt75=1;
            }
            else if ( (LA75_0==63) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalAfvl.g:3211:3: (enumLiteral_0= 'ATOMIC' )
                    {
                    // InternalAfvl.g:3211:3: (enumLiteral_0= 'ATOMIC' )
                    // InternalAfvl.g:3212:4: enumLiteral_0= 'ATOMIC'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getThroughputAccess().getATOMICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getThroughputAccess().getATOMICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:3219:3: (enumLiteral_1= 'HIGH_ORDER' )
                    {
                    // InternalAfvl.g:3219:3: (enumLiteral_1= 'HIGH_ORDER' )
                    // InternalAfvl.g:3220:4: enumLiteral_1= 'HIGH_ORDER'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

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
    // InternalAfvl.g:3230:1: ruleProcessingModel returns [Enumerator current=null] : ( (enumLiteral_0= 'STREAM' ) | (enumLiteral_1= 'BATCH' ) | (enumLiteral_2= 'MICROBATCH' ) ) ;
    public final Enumerator ruleProcessingModel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAfvl.g:3236:2: ( ( (enumLiteral_0= 'STREAM' ) | (enumLiteral_1= 'BATCH' ) | (enumLiteral_2= 'MICROBATCH' ) ) )
            // InternalAfvl.g:3237:2: ( (enumLiteral_0= 'STREAM' ) | (enumLiteral_1= 'BATCH' ) | (enumLiteral_2= 'MICROBATCH' ) )
            {
            // InternalAfvl.g:3237:2: ( (enumLiteral_0= 'STREAM' ) | (enumLiteral_1= 'BATCH' ) | (enumLiteral_2= 'MICROBATCH' ) )
            int alt76=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt76=1;
                }
                break;
            case 65:
                {
                alt76=2;
                }
                break;
            case 66:
                {
                alt76=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalAfvl.g:3238:3: (enumLiteral_0= 'STREAM' )
                    {
                    // InternalAfvl.g:3238:3: (enumLiteral_0= 'STREAM' )
                    // InternalAfvl.g:3239:4: enumLiteral_0= 'STREAM'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getProcessingModelAccess().getSTREAMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProcessingModelAccess().getSTREAMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:3246:3: (enumLiteral_1= 'BATCH' )
                    {
                    // InternalAfvl.g:3246:3: (enumLiteral_1= 'BATCH' )
                    // InternalAfvl.g:3247:4: enumLiteral_1= 'BATCH'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getProcessingModelAccess().getBATCHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProcessingModelAccess().getBATCHEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAfvl.g:3254:3: (enumLiteral_2= 'MICROBATCH' )
                    {
                    // InternalAfvl.g:3254:3: (enumLiteral_2= 'MICROBATCH' )
                    // InternalAfvl.g:3255:4: enumLiteral_2= 'MICROBATCH'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

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
    // InternalAfvl.g:3265:1: ruleAccessType returns [Enumerator current=null] : ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'FILESYSTEM' ) | (enumLiteral_3= 'HDFS' ) ) ;
    public final Enumerator ruleAccessType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAfvl.g:3271:2: ( ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'FILESYSTEM' ) | (enumLiteral_3= 'HDFS' ) ) )
            // InternalAfvl.g:3272:2: ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'FILESYSTEM' ) | (enumLiteral_3= 'HDFS' ) )
            {
            // InternalAfvl.g:3272:2: ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'FILESYSTEM' ) | (enumLiteral_3= 'HDFS' ) )
            int alt77=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt77=1;
                }
                break;
            case 68:
                {
                alt77=2;
                }
                break;
            case 69:
                {
                alt77=3;
                }
                break;
            case 70:
                {
                alt77=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalAfvl.g:3273:3: (enumLiteral_0= 'HTTP' )
                    {
                    // InternalAfvl.g:3273:3: (enumLiteral_0= 'HTTP' )
                    // InternalAfvl.g:3274:4: enumLiteral_0= 'HTTP'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getAccessTypeAccess().getHTTPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessTypeAccess().getHTTPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:3281:3: (enumLiteral_1= 'DATABASE' )
                    {
                    // InternalAfvl.g:3281:3: (enumLiteral_1= 'DATABASE' )
                    // InternalAfvl.g:3282:4: enumLiteral_1= 'DATABASE'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getAccessTypeAccess().getDATABASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessTypeAccess().getDATABASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAfvl.g:3289:3: (enumLiteral_2= 'FILESYSTEM' )
                    {
                    // InternalAfvl.g:3289:3: (enumLiteral_2= 'FILESYSTEM' )
                    // InternalAfvl.g:3290:4: enumLiteral_2= 'FILESYSTEM'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getAccessTypeAccess().getFILESYSTEMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAccessTypeAccess().getFILESYSTEMEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAfvl.g:3297:3: (enumLiteral_3= 'HDFS' )
                    {
                    // InternalAfvl.g:3297:3: (enumLiteral_3= 'HDFS' )
                    // InternalAfvl.g:3298:4: enumLiteral_3= 'HDFS'
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_2); 

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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000231000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000F00800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00C0000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000FF000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000FE000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000FC000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0F00000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000F8000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0003C000FE000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000E040000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000C040000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008040000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000018A060000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000188060000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000108060000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000008060000000L});

}