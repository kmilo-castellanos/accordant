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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FunctionalView'", "'{'", "'Components'", "','", "'}'", "'Connectors'", "'Port'", "':'", "'Role'", "'->'", "'delivery'", "'synct'", "'notification'", "'buffering'", "'throughput'", "'roles'", "'Adaptor'", "'Distributor'", "'sync'", "'Event'", "'ProcCall'", "'Transformer'", "'procModel'", "'pmml'", "'ports'", "'Estimator'", "'Ingestor'", "'conn'", "'format'", "'props'", "'Sink'", "'BEST_EFFORT'", "'AT_LEAST_ONE'", "'AT_MOST_ONE'", "'EXACTLY_ONE'", "'ASYNC'", "'SYNC'", "'REQUIRED'", "'PROVIDED'", "'OUT'", "'IN'", "'POLLED'", "'PUBSUB'", "'QUEUED'", "'CENTRAL'", "'BUFFERED'", "'UNBUFFERED'", "'ATOMIC'", "'HIGH_ORDER'", "'STREAM'", "'BATCH'", "'MICROBATCH'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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
    // InternalAfvl.g:72:1: ruleFunctionalView returns [EObject current=null] : (otherlv_0= 'FunctionalView' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Components' otherlv_4= '{' ( (lv_comps_5_0= ruleComponent ) ) (otherlv_6= ',' ( (lv_comps_7_0= ruleComponent ) ) )* otherlv_8= '}' otherlv_9= 'Connectors' otherlv_10= '{' ( (lv_conns_11_0= ruleConnector ) ) (otherlv_12= ',' ( (lv_conns_13_0= ruleConnector ) ) )* otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleFunctionalView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_comps_5_0 = null;

        EObject lv_comps_7_0 = null;

        EObject lv_conns_11_0 = null;

        EObject lv_conns_13_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:78:2: ( (otherlv_0= 'FunctionalView' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Components' otherlv_4= '{' ( (lv_comps_5_0= ruleComponent ) ) (otherlv_6= ',' ( (lv_comps_7_0= ruleComponent ) ) )* otherlv_8= '}' otherlv_9= 'Connectors' otherlv_10= '{' ( (lv_conns_11_0= ruleConnector ) ) (otherlv_12= ',' ( (lv_conns_13_0= ruleConnector ) ) )* otherlv_14= '}' otherlv_15= '}' ) )
            // InternalAfvl.g:79:2: (otherlv_0= 'FunctionalView' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Components' otherlv_4= '{' ( (lv_comps_5_0= ruleComponent ) ) (otherlv_6= ',' ( (lv_comps_7_0= ruleComponent ) ) )* otherlv_8= '}' otherlv_9= 'Connectors' otherlv_10= '{' ( (lv_conns_11_0= ruleConnector ) ) (otherlv_12= ',' ( (lv_conns_13_0= ruleConnector ) ) )* otherlv_14= '}' otherlv_15= '}' )
            {
            // InternalAfvl.g:79:2: (otherlv_0= 'FunctionalView' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Components' otherlv_4= '{' ( (lv_comps_5_0= ruleComponent ) ) (otherlv_6= ',' ( (lv_comps_7_0= ruleComponent ) ) )* otherlv_8= '}' otherlv_9= 'Connectors' otherlv_10= '{' ( (lv_conns_11_0= ruleConnector ) ) (otherlv_12= ',' ( (lv_conns_13_0= ruleConnector ) ) )* otherlv_14= '}' otherlv_15= '}' )
            // InternalAfvl.g:80:3: otherlv_0= 'FunctionalView' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Components' otherlv_4= '{' ( (lv_comps_5_0= ruleComponent ) ) (otherlv_6= ',' ( (lv_comps_7_0= ruleComponent ) ) )* otherlv_8= '}' otherlv_9= 'Connectors' otherlv_10= '{' ( (lv_conns_11_0= ruleConnector ) ) (otherlv_12= ',' ( (lv_conns_13_0= ruleConnector ) ) )* otherlv_14= '}' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionalViewAccess().getFunctionalViewKeyword_0());
            		
            // InternalAfvl.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAfvl.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalAfvl.g:85:4: (lv_name_1_0= ruleEString )
            // InternalAfvl.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFunctionalViewAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalViewRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"co.edu.uniandes.accordant_fv.Afvl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionalViewAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionalViewAccess().getComponentsKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionalViewAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalAfvl.g:115:3: ( (lv_comps_5_0= ruleComponent ) )
            // InternalAfvl.g:116:4: (lv_comps_5_0= ruleComponent )
            {
            // InternalAfvl.g:116:4: (lv_comps_5_0= ruleComponent )
            // InternalAfvl.g:117:5: lv_comps_5_0= ruleComponent
            {

            					newCompositeNode(grammarAccess.getFunctionalViewAccess().getCompsComponentParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_comps_5_0=ruleComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalViewRule());
            					}
            					add(
            						current,
            						"comps",
            						lv_comps_5_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Component");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:134:3: (otherlv_6= ',' ( (lv_comps_7_0= ruleComponent ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAfvl.g:135:4: otherlv_6= ',' ( (lv_comps_7_0= ruleComponent ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getFunctionalViewAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalAfvl.g:139:4: ( (lv_comps_7_0= ruleComponent ) )
            	    // InternalAfvl.g:140:5: (lv_comps_7_0= ruleComponent )
            	    {
            	    // InternalAfvl.g:140:5: (lv_comps_7_0= ruleComponent )
            	    // InternalAfvl.g:141:6: lv_comps_7_0= ruleComponent
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionalViewAccess().getCompsComponentParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_comps_7_0=ruleComponent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFunctionalViewRule());
            	    						}
            	    						add(
            	    							current,
            	    							"comps",
            	    							lv_comps_7_0,
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

            otherlv_8=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getFunctionalViewAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getFunctionalViewAccess().getConnectorsKeyword_8());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getFunctionalViewAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalAfvl.g:171:3: ( (lv_conns_11_0= ruleConnector ) )
            // InternalAfvl.g:172:4: (lv_conns_11_0= ruleConnector )
            {
            // InternalAfvl.g:172:4: (lv_conns_11_0= ruleConnector )
            // InternalAfvl.g:173:5: lv_conns_11_0= ruleConnector
            {

            					newCompositeNode(grammarAccess.getFunctionalViewAccess().getConnsConnectorParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_7);
            lv_conns_11_0=ruleConnector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalViewRule());
            					}
            					add(
            						current,
            						"conns",
            						lv_conns_11_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Connector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:190:3: (otherlv_12= ',' ( (lv_conns_13_0= ruleConnector ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAfvl.g:191:4: otherlv_12= ',' ( (lv_conns_13_0= ruleConnector ) )
            	    {
            	    otherlv_12=(Token)match(input,14,FOLLOW_9); 

            	    				newLeafNode(otherlv_12, grammarAccess.getFunctionalViewAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalAfvl.g:195:4: ( (lv_conns_13_0= ruleConnector ) )
            	    // InternalAfvl.g:196:5: (lv_conns_13_0= ruleConnector )
            	    {
            	    // InternalAfvl.g:196:5: (lv_conns_13_0= ruleConnector )
            	    // InternalAfvl.g:197:6: lv_conns_13_0= ruleConnector
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionalViewAccess().getConnsConnectorParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_conns_13_0=ruleConnector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFunctionalViewRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conns",
            	    							lv_conns_13_0,
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

            otherlv_14=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_14, grammarAccess.getFunctionalViewAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getFunctionalViewAccess().getRightCurlyBracketKeyword_13());
            		

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
    // InternalAfvl.g:227:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalAfvl.g:227:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalAfvl.g:228:2: iv_ruleConnector= ruleConnector EOF
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
    // InternalAfvl.g:234:1: ruleConnector returns [EObject current=null] : (this_Stream_0= ruleStream | this_Adaptor_1= ruleAdaptor | this_Distributor_2= ruleDistributor | this_Event_3= ruleEvent | this_ProcedureCall_4= ruleProcedureCall ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        EObject this_Stream_0 = null;

        EObject this_Adaptor_1 = null;

        EObject this_Distributor_2 = null;

        EObject this_Event_3 = null;

        EObject this_ProcedureCall_4 = null;



        	enterRule();

        try {
            // InternalAfvl.g:240:2: ( (this_Stream_0= ruleStream | this_Adaptor_1= ruleAdaptor | this_Distributor_2= ruleDistributor | this_Event_3= ruleEvent | this_ProcedureCall_4= ruleProcedureCall ) )
            // InternalAfvl.g:241:2: (this_Stream_0= ruleStream | this_Adaptor_1= ruleAdaptor | this_Distributor_2= ruleDistributor | this_Event_3= ruleEvent | this_ProcedureCall_4= ruleProcedureCall )
            {
            // InternalAfvl.g:241:2: (this_Stream_0= ruleStream | this_Adaptor_1= ruleAdaptor | this_Distributor_2= ruleDistributor | this_Event_3= ruleEvent | this_ProcedureCall_4= ruleProcedureCall )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 27:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            case 30:
                {
                alt3=4;
                }
                break;
            case 31:
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
                    // InternalAfvl.g:242:3: this_Stream_0= ruleStream
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
                    // InternalAfvl.g:251:3: this_Adaptor_1= ruleAdaptor
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
                    // InternalAfvl.g:260:3: this_Distributor_2= ruleDistributor
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
                    // InternalAfvl.g:269:3: this_Event_3= ruleEvent
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
                    // InternalAfvl.g:278:3: this_ProcedureCall_4= ruleProcedureCall
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
    // InternalAfvl.g:290:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalAfvl.g:290:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalAfvl.g:291:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalAfvl.g:297:1: ruleComponent returns [EObject current=null] : (this_Transformer_0= ruleTransformer | this_Estimator_1= ruleEstimator | this_Ingestor_2= ruleIngestor | this_Sink_3= ruleSink ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Transformer_0 = null;

        EObject this_Estimator_1 = null;

        EObject this_Ingestor_2 = null;

        EObject this_Sink_3 = null;



        	enterRule();

        try {
            // InternalAfvl.g:303:2: ( (this_Transformer_0= ruleTransformer | this_Estimator_1= ruleEstimator | this_Ingestor_2= ruleIngestor | this_Sink_3= ruleSink ) )
            // InternalAfvl.g:304:2: (this_Transformer_0= ruleTransformer | this_Estimator_1= ruleEstimator | this_Ingestor_2= ruleIngestor | this_Sink_3= ruleSink )
            {
            // InternalAfvl.g:304:2: (this_Transformer_0= ruleTransformer | this_Estimator_1= ruleEstimator | this_Ingestor_2= ruleIngestor | this_Sink_3= ruleSink )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt4=1;
                }
                break;
            case 36:
                {
                alt4=2;
                }
                break;
            case 37:
                {
                alt4=3;
                }
                break;
            case 41:
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
                    // InternalAfvl.g:305:3: this_Transformer_0= ruleTransformer
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
                    // InternalAfvl.g:314:3: this_Estimator_1= ruleEstimator
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
                    // InternalAfvl.g:323:3: this_Ingestor_2= ruleIngestor
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
                    // InternalAfvl.g:332:3: this_Sink_3= ruleSink
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
    // InternalAfvl.g:344:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAfvl.g:344:47: (iv_ruleEString= ruleEString EOF )
            // InternalAfvl.g:345:2: iv_ruleEString= ruleEString EOF
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
    // InternalAfvl.g:351:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:357:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAfvl.g:358:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAfvl.g:358:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalAfvl.g:359:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAfvl.g:367:3: this_ID_1= RULE_ID
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
    // InternalAfvl.g:378:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalAfvl.g:378:45: (iv_rulePort= rulePort EOF )
            // InternalAfvl.g:379:2: iv_rulePort= rulePort EOF
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
    // InternalAfvl.g:385:1: rulePort returns [EObject current=null] : ( () otherlv_1= 'Port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= rulePortType ) )? ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:391:2: ( ( () otherlv_1= 'Port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= rulePortType ) )? ) )
            // InternalAfvl.g:392:2: ( () otherlv_1= 'Port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= rulePortType ) )? )
            {
            // InternalAfvl.g:392:2: ( () otherlv_1= 'Port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= rulePortType ) )? )
            // InternalAfvl.g:393:3: () otherlv_1= 'Port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= rulePortType ) )?
            {
            // InternalAfvl.g:393:3: ()
            // InternalAfvl.g:394:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPortAccess().getPortAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getPortAccess().getPortKeyword_1());
            		
            // InternalAfvl.g:404:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAfvl.g:405:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAfvl.g:405:4: (lv_name_2_0= RULE_ID )
            // InternalAfvl.g:406:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_3=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getPortAccess().getColonKeyword_3());
            		
            // InternalAfvl.g:426:3: ( (lv_type_4_0= rulePortType ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=48 && LA6_0<=49)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAfvl.g:427:4: (lv_type_4_0= rulePortType )
                    {
                    // InternalAfvl.g:427:4: (lv_type_4_0= rulePortType )
                    // InternalAfvl.g:428:5: lv_type_4_0= rulePortType
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
    // InternalAfvl.g:449:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalAfvl.g:449:45: (iv_ruleRole= ruleRole EOF )
            // InternalAfvl.g:450:2: iv_ruleRole= ruleRole EOF
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
    // InternalAfvl.g:456:1: ruleRole returns [EObject current=null] : ( () otherlv_1= 'Role' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleRoleType ) )? otherlv_5= '->' ( (otherlv_6= RULE_ID ) )? ) ;
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
            // InternalAfvl.g:462:2: ( ( () otherlv_1= 'Role' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleRoleType ) )? otherlv_5= '->' ( (otherlv_6= RULE_ID ) )? ) )
            // InternalAfvl.g:463:2: ( () otherlv_1= 'Role' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleRoleType ) )? otherlv_5= '->' ( (otherlv_6= RULE_ID ) )? )
            {
            // InternalAfvl.g:463:2: ( () otherlv_1= 'Role' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleRoleType ) )? otherlv_5= '->' ( (otherlv_6= RULE_ID ) )? )
            // InternalAfvl.g:464:3: () otherlv_1= 'Role' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleRoleType ) )? otherlv_5= '->' ( (otherlv_6= RULE_ID ) )?
            {
            // InternalAfvl.g:464:3: ()
            // InternalAfvl.g:465:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleAccess().getRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getRoleKeyword_1());
            		
            // InternalAfvl.g:475:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAfvl.g:476:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAfvl.g:476:4: (lv_name_2_0= RULE_ID )
            // InternalAfvl.g:477:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_3=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getColonKeyword_3());
            		
            // InternalAfvl.g:497:3: ( (lv_type_4_0= ruleRoleType ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=50 && LA7_0<=51)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAfvl.g:498:4: (lv_type_4_0= ruleRoleType )
                    {
                    // InternalAfvl.g:498:4: (lv_type_4_0= ruleRoleType )
                    // InternalAfvl.g:499:5: lv_type_4_0= ruleRoleType
                    {

                    					newCompositeNode(grammarAccess.getRoleAccess().getTypeRoleTypeEnumRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_15);
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

            otherlv_5=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalAfvl.g:520:3: ( (otherlv_6= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAfvl.g:521:4: (otherlv_6= RULE_ID )
                    {
                    // InternalAfvl.g:521:4: (otherlv_6= RULE_ID )
                    // InternalAfvl.g:522:5: otherlv_6= RULE_ID
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
    // InternalAfvl.g:537:1: entryRuleStream returns [EObject current=null] : iv_ruleStream= ruleStream EOF ;
    public final EObject entryRuleStream() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStream = null;


        try {
            // InternalAfvl.g:537:47: (iv_ruleStream= ruleStream EOF )
            // InternalAfvl.g:538:2: iv_ruleStream= ruleStream EOF
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
    // InternalAfvl.g:544:1: ruleStream returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'delivery' otherlv_3= ':' ( (lv_delivery_4_0= ruleDeliveryModel ) ) )? (otherlv_5= 'synct' otherlv_6= ':' ( (lv_synct_7_0= ruleSyncType ) ) )? (otherlv_8= 'notification' otherlv_9= ':' ( (lv_notification_10_0= ruleNotificationModel ) ) )? (otherlv_11= 'buffering' otherlv_12= ':' ( (lv_buffering_13_0= ruleBuffering ) ) )? (otherlv_14= 'throughput' otherlv_15= ':' ( (lv_throughput_16_0= ruleThroughput ) ) )? otherlv_17= 'roles' otherlv_18= ':' otherlv_19= '{' ( (lv_roles_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) ) )* otherlv_23= '}' otherlv_24= '}' ) ;
    public final EObject ruleStream() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Enumerator lv_delivery_4_0 = null;

        Enumerator lv_synct_7_0 = null;

        Enumerator lv_notification_10_0 = null;

        Enumerator lv_buffering_13_0 = null;

        Enumerator lv_throughput_16_0 = null;

        EObject lv_roles_20_0 = null;

        EObject lv_roles_22_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:550:2: ( ( () otherlv_1= '{' (otherlv_2= 'delivery' otherlv_3= ':' ( (lv_delivery_4_0= ruleDeliveryModel ) ) )? (otherlv_5= 'synct' otherlv_6= ':' ( (lv_synct_7_0= ruleSyncType ) ) )? (otherlv_8= 'notification' otherlv_9= ':' ( (lv_notification_10_0= ruleNotificationModel ) ) )? (otherlv_11= 'buffering' otherlv_12= ':' ( (lv_buffering_13_0= ruleBuffering ) ) )? (otherlv_14= 'throughput' otherlv_15= ':' ( (lv_throughput_16_0= ruleThroughput ) ) )? otherlv_17= 'roles' otherlv_18= ':' otherlv_19= '{' ( (lv_roles_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) ) )* otherlv_23= '}' otherlv_24= '}' ) )
            // InternalAfvl.g:551:2: ( () otherlv_1= '{' (otherlv_2= 'delivery' otherlv_3= ':' ( (lv_delivery_4_0= ruleDeliveryModel ) ) )? (otherlv_5= 'synct' otherlv_6= ':' ( (lv_synct_7_0= ruleSyncType ) ) )? (otherlv_8= 'notification' otherlv_9= ':' ( (lv_notification_10_0= ruleNotificationModel ) ) )? (otherlv_11= 'buffering' otherlv_12= ':' ( (lv_buffering_13_0= ruleBuffering ) ) )? (otherlv_14= 'throughput' otherlv_15= ':' ( (lv_throughput_16_0= ruleThroughput ) ) )? otherlv_17= 'roles' otherlv_18= ':' otherlv_19= '{' ( (lv_roles_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) ) )* otherlv_23= '}' otherlv_24= '}' )
            {
            // InternalAfvl.g:551:2: ( () otherlv_1= '{' (otherlv_2= 'delivery' otherlv_3= ':' ( (lv_delivery_4_0= ruleDeliveryModel ) ) )? (otherlv_5= 'synct' otherlv_6= ':' ( (lv_synct_7_0= ruleSyncType ) ) )? (otherlv_8= 'notification' otherlv_9= ':' ( (lv_notification_10_0= ruleNotificationModel ) ) )? (otherlv_11= 'buffering' otherlv_12= ':' ( (lv_buffering_13_0= ruleBuffering ) ) )? (otherlv_14= 'throughput' otherlv_15= ':' ( (lv_throughput_16_0= ruleThroughput ) ) )? otherlv_17= 'roles' otherlv_18= ':' otherlv_19= '{' ( (lv_roles_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) ) )* otherlv_23= '}' otherlv_24= '}' )
            // InternalAfvl.g:552:3: () otherlv_1= '{' (otherlv_2= 'delivery' otherlv_3= ':' ( (lv_delivery_4_0= ruleDeliveryModel ) ) )? (otherlv_5= 'synct' otherlv_6= ':' ( (lv_synct_7_0= ruleSyncType ) ) )? (otherlv_8= 'notification' otherlv_9= ':' ( (lv_notification_10_0= ruleNotificationModel ) ) )? (otherlv_11= 'buffering' otherlv_12= ':' ( (lv_buffering_13_0= ruleBuffering ) ) )? (otherlv_14= 'throughput' otherlv_15= ':' ( (lv_throughput_16_0= ruleThroughput ) ) )? otherlv_17= 'roles' otherlv_18= ':' otherlv_19= '{' ( (lv_roles_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) ) )* otherlv_23= '}' otherlv_24= '}'
            {
            // InternalAfvl.g:552:3: ()
            // InternalAfvl.g:553:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStreamAccess().getStreamAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getStreamAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAfvl.g:563:3: (otherlv_2= 'delivery' otherlv_3= ':' ( (lv_delivery_4_0= ruleDeliveryModel ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAfvl.g:564:4: otherlv_2= 'delivery' otherlv_3= ':' ( (lv_delivery_4_0= ruleDeliveryModel ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getStreamAccess().getDeliveryKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,18,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getStreamAccess().getColonKeyword_2_1());
                    			
                    // InternalAfvl.g:572:4: ( (lv_delivery_4_0= ruleDeliveryModel ) )
                    // InternalAfvl.g:573:5: (lv_delivery_4_0= ruleDeliveryModel )
                    {
                    // InternalAfvl.g:573:5: (lv_delivery_4_0= ruleDeliveryModel )
                    // InternalAfvl.g:574:6: lv_delivery_4_0= ruleDeliveryModel
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getDeliveryDeliveryModelEnumRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_delivery_4_0=ruleDeliveryModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStreamRule());
                    						}
                    						set(
                    							current,
                    							"delivery",
                    							lv_delivery_4_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.DeliveryModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:592:3: (otherlv_5= 'synct' otherlv_6= ':' ( (lv_synct_7_0= ruleSyncType ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAfvl.g:593:4: otherlv_5= 'synct' otherlv_6= ':' ( (lv_synct_7_0= ruleSyncType ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getStreamAccess().getSynctKeyword_3_0());
                    			
                    otherlv_6=(Token)match(input,18,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getStreamAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:601:4: ( (lv_synct_7_0= ruleSyncType ) )
                    // InternalAfvl.g:602:5: (lv_synct_7_0= ruleSyncType )
                    {
                    // InternalAfvl.g:602:5: (lv_synct_7_0= ruleSyncType )
                    // InternalAfvl.g:603:6: lv_synct_7_0= ruleSyncType
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getSynctSyncTypeEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_synct_7_0=ruleSyncType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStreamRule());
                    						}
                    						set(
                    							current,
                    							"synct",
                    							lv_synct_7_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.SyncType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:621:3: (otherlv_8= 'notification' otherlv_9= ':' ( (lv_notification_10_0= ruleNotificationModel ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAfvl.g:622:4: otherlv_8= 'notification' otherlv_9= ':' ( (lv_notification_10_0= ruleNotificationModel ) )
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getStreamAccess().getNotificationKeyword_4_0());
                    			
                    otherlv_9=(Token)match(input,18,FOLLOW_22); 

                    				newLeafNode(otherlv_9, grammarAccess.getStreamAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:630:4: ( (lv_notification_10_0= ruleNotificationModel ) )
                    // InternalAfvl.g:631:5: (lv_notification_10_0= ruleNotificationModel )
                    {
                    // InternalAfvl.g:631:5: (lv_notification_10_0= ruleNotificationModel )
                    // InternalAfvl.g:632:6: lv_notification_10_0= ruleNotificationModel
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getNotificationNotificationModelEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_notification_10_0=ruleNotificationModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStreamRule());
                    						}
                    						set(
                    							current,
                    							"notification",
                    							lv_notification_10_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.NotificationModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:650:3: (otherlv_11= 'buffering' otherlv_12= ':' ( (lv_buffering_13_0= ruleBuffering ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAfvl.g:651:4: otherlv_11= 'buffering' otherlv_12= ':' ( (lv_buffering_13_0= ruleBuffering ) )
                    {
                    otherlv_11=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getStreamAccess().getBufferingKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,18,FOLLOW_24); 

                    				newLeafNode(otherlv_12, grammarAccess.getStreamAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:659:4: ( (lv_buffering_13_0= ruleBuffering ) )
                    // InternalAfvl.g:660:5: (lv_buffering_13_0= ruleBuffering )
                    {
                    // InternalAfvl.g:660:5: (lv_buffering_13_0= ruleBuffering )
                    // InternalAfvl.g:661:6: lv_buffering_13_0= ruleBuffering
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getBufferingBufferingEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_buffering_13_0=ruleBuffering();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStreamRule());
                    						}
                    						set(
                    							current,
                    							"buffering",
                    							lv_buffering_13_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.Buffering");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:679:3: (otherlv_14= 'throughput' otherlv_15= ':' ( (lv_throughput_16_0= ruleThroughput ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAfvl.g:680:4: otherlv_14= 'throughput' otherlv_15= ':' ( (lv_throughput_16_0= ruleThroughput ) )
                    {
                    otherlv_14=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getStreamAccess().getThroughputKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,18,FOLLOW_26); 

                    				newLeafNode(otherlv_15, grammarAccess.getStreamAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:688:4: ( (lv_throughput_16_0= ruleThroughput ) )
                    // InternalAfvl.g:689:5: (lv_throughput_16_0= ruleThroughput )
                    {
                    // InternalAfvl.g:689:5: (lv_throughput_16_0= ruleThroughput )
                    // InternalAfvl.g:690:6: lv_throughput_16_0= ruleThroughput
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getThroughputThroughputEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_throughput_16_0=ruleThroughput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStreamRule());
                    						}
                    						set(
                    							current,
                    							"throughput",
                    							lv_throughput_16_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.Throughput");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_17, grammarAccess.getStreamAccess().getRolesKeyword_7());
            		
            otherlv_18=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_18, grammarAccess.getStreamAccess().getColonKeyword_8());
            		
            otherlv_19=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_19, grammarAccess.getStreamAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalAfvl.g:720:3: ( (lv_roles_20_0= ruleRole ) )
            // InternalAfvl.g:721:4: (lv_roles_20_0= ruleRole )
            {
            // InternalAfvl.g:721:4: (lv_roles_20_0= ruleRole )
            // InternalAfvl.g:722:5: lv_roles_20_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getStreamAccess().getRolesRoleParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_7);
            lv_roles_20_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStreamRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_20_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:739:3: (otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAfvl.g:740:4: otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) )
            	    {
            	    otherlv_21=(Token)match(input,14,FOLLOW_28); 

            	    				newLeafNode(otherlv_21, grammarAccess.getStreamAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalAfvl.g:744:4: ( (lv_roles_22_0= ruleRole ) )
            	    // InternalAfvl.g:745:5: (lv_roles_22_0= ruleRole )
            	    {
            	    // InternalAfvl.g:745:5: (lv_roles_22_0= ruleRole )
            	    // InternalAfvl.g:746:6: lv_roles_22_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getStreamAccess().getRolesRoleParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_roles_22_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStreamRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_22_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_23=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_23, grammarAccess.getStreamAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_24=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getStreamAccess().getRightCurlyBracketKeyword_13());
            		

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
    // InternalAfvl.g:776:1: entryRuleAdaptor returns [EObject current=null] : iv_ruleAdaptor= ruleAdaptor EOF ;
    public final EObject entryRuleAdaptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptor = null;


        try {
            // InternalAfvl.g:776:48: (iv_ruleAdaptor= ruleAdaptor EOF )
            // InternalAfvl.g:777:2: iv_ruleAdaptor= ruleAdaptor EOF
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
    // InternalAfvl.g:783:1: ruleAdaptor returns [EObject current=null] : ( () otherlv_1= 'Adaptor' otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) )? ) (otherlv_6= 'synct' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? otherlv_18= 'roles' otherlv_19= '{' ( (lv_roles_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) ) )* otherlv_23= '}' otherlv_24= '}' ) ;
    public final EObject ruleAdaptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
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
        Token otherlv_23=null;
        Token otherlv_24=null;
        Enumerator lv_delivery_5_0 = null;

        Enumerator lv_synct_8_0 = null;

        Enumerator lv_notification_11_0 = null;

        Enumerator lv_buffering_14_0 = null;

        Enumerator lv_throughput_17_0 = null;

        EObject lv_roles_20_0 = null;

        EObject lv_roles_22_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:789:2: ( ( () otherlv_1= 'Adaptor' otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) )? ) (otherlv_6= 'synct' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? otherlv_18= 'roles' otherlv_19= '{' ( (lv_roles_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) ) )* otherlv_23= '}' otherlv_24= '}' ) )
            // InternalAfvl.g:790:2: ( () otherlv_1= 'Adaptor' otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) )? ) (otherlv_6= 'synct' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? otherlv_18= 'roles' otherlv_19= '{' ( (lv_roles_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) ) )* otherlv_23= '}' otherlv_24= '}' )
            {
            // InternalAfvl.g:790:2: ( () otherlv_1= 'Adaptor' otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) )? ) (otherlv_6= 'synct' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? otherlv_18= 'roles' otherlv_19= '{' ( (lv_roles_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) ) )* otherlv_23= '}' otherlv_24= '}' )
            // InternalAfvl.g:791:3: () otherlv_1= 'Adaptor' otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) )? ) (otherlv_6= 'synct' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? otherlv_18= 'roles' otherlv_19= '{' ( (lv_roles_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) ) )* otherlv_23= '}' otherlv_24= '}'
            {
            // InternalAfvl.g:791:3: ()
            // InternalAfvl.g:792:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAdaptorAccess().getAdaptorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAdaptorAccess().getAdaptorKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getAdaptorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:806:3: (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) )? )
            // InternalAfvl.g:807:4: otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) )?
            {
            otherlv_3=(Token)match(input,21,FOLLOW_12); 

            				newLeafNode(otherlv_3, grammarAccess.getAdaptorAccess().getDeliveryKeyword_3_0());
            			
            otherlv_4=(Token)match(input,18,FOLLOW_30); 

            				newLeafNode(otherlv_4, grammarAccess.getAdaptorAccess().getColonKeyword_3_1());
            			
            // InternalAfvl.g:815:4: ( (lv_delivery_5_0= ruleDeliveryModel ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=42 && LA15_0<=45)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAfvl.g:816:5: (lv_delivery_5_0= ruleDeliveryModel )
                    {
                    // InternalAfvl.g:816:5: (lv_delivery_5_0= ruleDeliveryModel )
                    // InternalAfvl.g:817:6: lv_delivery_5_0= ruleDeliveryModel
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getDeliveryDeliveryModelEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_19);
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

            // InternalAfvl.g:835:3: (otherlv_6= 'synct' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAfvl.g:836:4: otherlv_6= 'synct' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getAdaptorAccess().getSynctKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getAdaptorAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:844:4: ( (lv_synct_8_0= ruleSyncType ) )
                    // InternalAfvl.g:845:5: (lv_synct_8_0= ruleSyncType )
                    {
                    // InternalAfvl.g:845:5: (lv_synct_8_0= ruleSyncType )
                    // InternalAfvl.g:846:6: lv_synct_8_0= ruleSyncType
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getSynctSyncTypeEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_21);
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

            // InternalAfvl.g:864:3: (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAfvl.g:865:4: otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getAdaptorAccess().getNotificationKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,18,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getAdaptorAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:873:4: ( (lv_notification_11_0= ruleNotificationModel ) )
                    // InternalAfvl.g:874:5: (lv_notification_11_0= ruleNotificationModel )
                    {
                    // InternalAfvl.g:874:5: (lv_notification_11_0= ruleNotificationModel )
                    // InternalAfvl.g:875:6: lv_notification_11_0= ruleNotificationModel
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getNotificationNotificationModelEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_23);
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

            // InternalAfvl.g:893:3: (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAfvl.g:894:4: otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) )
                    {
                    otherlv_12=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getAdaptorAccess().getBufferingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,18,FOLLOW_24); 

                    				newLeafNode(otherlv_13, grammarAccess.getAdaptorAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:902:4: ( (lv_buffering_14_0= ruleBuffering ) )
                    // InternalAfvl.g:903:5: (lv_buffering_14_0= ruleBuffering )
                    {
                    // InternalAfvl.g:903:5: (lv_buffering_14_0= ruleBuffering )
                    // InternalAfvl.g:904:6: lv_buffering_14_0= ruleBuffering
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getBufferingBufferingEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_25);
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

            // InternalAfvl.g:922:3: (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAfvl.g:923:4: otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) )
                    {
                    otherlv_15=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getAdaptorAccess().getThroughputKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,18,FOLLOW_26); 

                    				newLeafNode(otherlv_16, grammarAccess.getAdaptorAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:931:4: ( (lv_throughput_17_0= ruleThroughput ) )
                    // InternalAfvl.g:932:5: (lv_throughput_17_0= ruleThroughput )
                    {
                    // InternalAfvl.g:932:5: (lv_throughput_17_0= ruleThroughput )
                    // InternalAfvl.g:933:6: lv_throughput_17_0= ruleThroughput
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getThroughputThroughputEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_27);
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

            otherlv_18=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_18, grammarAccess.getAdaptorAccess().getRolesKeyword_8());
            		
            otherlv_19=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_19, grammarAccess.getAdaptorAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalAfvl.g:959:3: ( (lv_roles_20_0= ruleRole ) )
            // InternalAfvl.g:960:4: (lv_roles_20_0= ruleRole )
            {
            // InternalAfvl.g:960:4: (lv_roles_20_0= ruleRole )
            // InternalAfvl.g:961:5: lv_roles_20_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getAdaptorAccess().getRolesRoleParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_7);
            lv_roles_20_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdaptorRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_20_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:978:3: (otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==14) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAfvl.g:979:4: otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) )
            	    {
            	    otherlv_21=(Token)match(input,14,FOLLOW_28); 

            	    				newLeafNode(otherlv_21, grammarAccess.getAdaptorAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalAfvl.g:983:4: ( (lv_roles_22_0= ruleRole ) )
            	    // InternalAfvl.g:984:5: (lv_roles_22_0= ruleRole )
            	    {
            	    // InternalAfvl.g:984:5: (lv_roles_22_0= ruleRole )
            	    // InternalAfvl.g:985:6: lv_roles_22_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getAdaptorAccess().getRolesRoleParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_roles_22_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdaptorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_22_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_23=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_23, grammarAccess.getAdaptorAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_24=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getAdaptorAccess().getRightCurlyBracketKeyword_13());
            		

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
    // InternalAfvl.g:1015:1: entryRuleDistributor returns [EObject current=null] : iv_ruleDistributor= ruleDistributor EOF ;
    public final EObject entryRuleDistributor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistributor = null;


        try {
            // InternalAfvl.g:1015:52: (iv_ruleDistributor= ruleDistributor EOF )
            // InternalAfvl.g:1016:2: iv_ruleDistributor= ruleDistributor EOF
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
    // InternalAfvl.g:1022:1: ruleDistributor returns [EObject current=null] : ( () otherlv_1= 'Distributor' otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? otherlv_18= 'roles' otherlv_19= '{' ( (lv_roles_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) ) )* otherlv_23= '}' otherlv_24= '}' ) ;
    public final EObject ruleDistributor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
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
        Token otherlv_23=null;
        Token otherlv_24=null;
        Enumerator lv_delivery_5_0 = null;

        Enumerator lv_synct_8_0 = null;

        Enumerator lv_notification_11_0 = null;

        Enumerator lv_buffering_14_0 = null;

        Enumerator lv_throughput_17_0 = null;

        EObject lv_roles_20_0 = null;

        EObject lv_roles_22_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:1028:2: ( ( () otherlv_1= 'Distributor' otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? otherlv_18= 'roles' otherlv_19= '{' ( (lv_roles_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) ) )* otherlv_23= '}' otherlv_24= '}' ) )
            // InternalAfvl.g:1029:2: ( () otherlv_1= 'Distributor' otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? otherlv_18= 'roles' otherlv_19= '{' ( (lv_roles_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) ) )* otherlv_23= '}' otherlv_24= '}' )
            {
            // InternalAfvl.g:1029:2: ( () otherlv_1= 'Distributor' otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? otherlv_18= 'roles' otherlv_19= '{' ( (lv_roles_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) ) )* otherlv_23= '}' otherlv_24= '}' )
            // InternalAfvl.g:1030:3: () otherlv_1= 'Distributor' otherlv_2= '{' (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )? (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )? (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )? (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )? (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )? otherlv_18= 'roles' otherlv_19= '{' ( (lv_roles_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) ) )* otherlv_23= '}' otherlv_24= '}'
            {
            // InternalAfvl.g:1030:3: ()
            // InternalAfvl.g:1031:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDistributorAccess().getDistributorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDistributorAccess().getDistributorKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getDistributorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:1045:3: (otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAfvl.g:1046:4: otherlv_3= 'delivery' otherlv_4= ':' ( (lv_delivery_5_0= ruleDeliveryModel ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getDistributorAccess().getDeliveryKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getDistributorAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:1054:4: ( (lv_delivery_5_0= ruleDeliveryModel ) )
                    // InternalAfvl.g:1055:5: (lv_delivery_5_0= ruleDeliveryModel )
                    {
                    // InternalAfvl.g:1055:5: (lv_delivery_5_0= ruleDeliveryModel )
                    // InternalAfvl.g:1056:6: lv_delivery_5_0= ruleDeliveryModel
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getDeliveryDeliveryModelEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_32);
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

            // InternalAfvl.g:1074:3: (otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAfvl.g:1075:4: otherlv_6= 'sync' otherlv_7= ':' ( (lv_synct_8_0= ruleSyncType ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getDistributorAccess().getSyncKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getDistributorAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:1083:4: ( (lv_synct_8_0= ruleSyncType ) )
                    // InternalAfvl.g:1084:5: (lv_synct_8_0= ruleSyncType )
                    {
                    // InternalAfvl.g:1084:5: (lv_synct_8_0= ruleSyncType )
                    // InternalAfvl.g:1085:6: lv_synct_8_0= ruleSyncType
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getSynctSyncTypeEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_21);
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

            // InternalAfvl.g:1103:3: (otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAfvl.g:1104:4: otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotificationModel ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getDistributorAccess().getNotificationKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,18,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getDistributorAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:1112:4: ( (lv_notification_11_0= ruleNotificationModel ) )
                    // InternalAfvl.g:1113:5: (lv_notification_11_0= ruleNotificationModel )
                    {
                    // InternalAfvl.g:1113:5: (lv_notification_11_0= ruleNotificationModel )
                    // InternalAfvl.g:1114:6: lv_notification_11_0= ruleNotificationModel
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getNotificationNotificationModelEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_23);
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

            // InternalAfvl.g:1132:3: (otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAfvl.g:1133:4: otherlv_12= 'buffering' otherlv_13= ':' ( (lv_buffering_14_0= ruleBuffering ) )
                    {
                    otherlv_12=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getDistributorAccess().getBufferingKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,18,FOLLOW_24); 

                    				newLeafNode(otherlv_13, grammarAccess.getDistributorAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:1141:4: ( (lv_buffering_14_0= ruleBuffering ) )
                    // InternalAfvl.g:1142:5: (lv_buffering_14_0= ruleBuffering )
                    {
                    // InternalAfvl.g:1142:5: (lv_buffering_14_0= ruleBuffering )
                    // InternalAfvl.g:1143:6: lv_buffering_14_0= ruleBuffering
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getBufferingBufferingEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_25);
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

            // InternalAfvl.g:1161:3: (otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAfvl.g:1162:4: otherlv_15= 'throughput' otherlv_16= ':' ( (lv_throughput_17_0= ruleThroughput ) )
                    {
                    otherlv_15=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getDistributorAccess().getThroughputKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,18,FOLLOW_26); 

                    				newLeafNode(otherlv_16, grammarAccess.getDistributorAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:1170:4: ( (lv_throughput_17_0= ruleThroughput ) )
                    // InternalAfvl.g:1171:5: (lv_throughput_17_0= ruleThroughput )
                    {
                    // InternalAfvl.g:1171:5: (lv_throughput_17_0= ruleThroughput )
                    // InternalAfvl.g:1172:6: lv_throughput_17_0= ruleThroughput
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getThroughputThroughputEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_27);
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

            otherlv_18=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_18, grammarAccess.getDistributorAccess().getRolesKeyword_8());
            		
            otherlv_19=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_19, grammarAccess.getDistributorAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalAfvl.g:1198:3: ( (lv_roles_20_0= ruleRole ) )
            // InternalAfvl.g:1199:4: (lv_roles_20_0= ruleRole )
            {
            // InternalAfvl.g:1199:4: (lv_roles_20_0= ruleRole )
            // InternalAfvl.g:1200:5: lv_roles_20_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getDistributorAccess().getRolesRoleParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_7);
            lv_roles_20_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistributorRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_20_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:1217:3: (otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==14) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAfvl.g:1218:4: otherlv_21= ',' ( (lv_roles_22_0= ruleRole ) )
            	    {
            	    otherlv_21=(Token)match(input,14,FOLLOW_28); 

            	    				newLeafNode(otherlv_21, grammarAccess.getDistributorAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalAfvl.g:1222:4: ( (lv_roles_22_0= ruleRole ) )
            	    // InternalAfvl.g:1223:5: (lv_roles_22_0= ruleRole )
            	    {
            	    // InternalAfvl.g:1223:5: (lv_roles_22_0= ruleRole )
            	    // InternalAfvl.g:1224:6: lv_roles_22_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getDistributorAccess().getRolesRoleParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_roles_22_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDistributorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_22_0,
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

            otherlv_23=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_23, grammarAccess.getDistributorAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_24=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getDistributorAccess().getRightCurlyBracketKeyword_13());
            		

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
    // InternalAfvl.g:1254:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalAfvl.g:1254:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalAfvl.g:1255:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalAfvl.g:1261:1: ruleEvent returns [EObject current=null] : ( () otherlv_1= 'Event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' otherlv_26= '}' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Enumerator lv_delivery_6_0 = null;

        Enumerator lv_synct_9_0 = null;

        Enumerator lv_notification_12_0 = null;

        Enumerator lv_buffering_15_0 = null;

        Enumerator lv_throughput_18_0 = null;

        EObject lv_roles_22_0 = null;

        EObject lv_roles_24_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:1267:2: ( ( () otherlv_1= 'Event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' otherlv_26= '}' ) )
            // InternalAfvl.g:1268:2: ( () otherlv_1= 'Event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' otherlv_26= '}' )
            {
            // InternalAfvl.g:1268:2: ( () otherlv_1= 'Event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' otherlv_26= '}' )
            // InternalAfvl.g:1269:3: () otherlv_1= 'Event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' otherlv_26= '}'
            {
            // InternalAfvl.g:1269:3: ()
            // InternalAfvl.g:1270:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
            		
            // InternalAfvl.g:1280:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAfvl.g:1281:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAfvl.g:1281:4: (lv_name_2_0= RULE_ID )
            // InternalAfvl.g:1282:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAfvl.g:1302:3: (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==21) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAfvl.g:1303:4: otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getEventAccess().getDeliveryKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getEventAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:1311:4: ( (lv_delivery_6_0= ruleDeliveryModel ) )
                    // InternalAfvl.g:1312:5: (lv_delivery_6_0= ruleDeliveryModel )
                    {
                    // InternalAfvl.g:1312:5: (lv_delivery_6_0= ruleDeliveryModel )
                    // InternalAfvl.g:1313:6: lv_delivery_6_0= ruleDeliveryModel
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getDeliveryDeliveryModelEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_delivery_6_0=ruleDeliveryModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"delivery",
                    							lv_delivery_6_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.DeliveryModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1331:3: (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==22) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAfvl.g:1332:4: otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) )
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getEventAccess().getSynctKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,18,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getEventAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:1340:4: ( (lv_synct_9_0= ruleSyncType ) )
                    // InternalAfvl.g:1341:5: (lv_synct_9_0= ruleSyncType )
                    {
                    // InternalAfvl.g:1341:5: (lv_synct_9_0= ruleSyncType )
                    // InternalAfvl.g:1342:6: lv_synct_9_0= ruleSyncType
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getSynctSyncTypeEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_synct_9_0=ruleSyncType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"synct",
                    							lv_synct_9_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.SyncType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1360:3: (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAfvl.g:1361:4: otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getEventAccess().getNotificationKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,18,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getEventAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:1369:4: ( (lv_notification_12_0= ruleNotificationModel ) )
                    // InternalAfvl.g:1370:5: (lv_notification_12_0= ruleNotificationModel )
                    {
                    // InternalAfvl.g:1370:5: (lv_notification_12_0= ruleNotificationModel )
                    // InternalAfvl.g:1371:6: lv_notification_12_0= ruleNotificationModel
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getNotificationNotificationModelEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_notification_12_0=ruleNotificationModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"notification",
                    							lv_notification_12_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.NotificationModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1389:3: (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==24) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAfvl.g:1390:4: otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) )
                    {
                    otherlv_13=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getEventAccess().getBufferingKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,18,FOLLOW_24); 

                    				newLeafNode(otherlv_14, grammarAccess.getEventAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:1398:4: ( (lv_buffering_15_0= ruleBuffering ) )
                    // InternalAfvl.g:1399:5: (lv_buffering_15_0= ruleBuffering )
                    {
                    // InternalAfvl.g:1399:5: (lv_buffering_15_0= ruleBuffering )
                    // InternalAfvl.g:1400:6: lv_buffering_15_0= ruleBuffering
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getBufferingBufferingEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_buffering_15_0=ruleBuffering();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"buffering",
                    							lv_buffering_15_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.Buffering");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1418:3: (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==25) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAfvl.g:1419:4: otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) )
                    {
                    otherlv_16=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_16, grammarAccess.getEventAccess().getThroughputKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,18,FOLLOW_26); 

                    				newLeafNode(otherlv_17, grammarAccess.getEventAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:1427:4: ( (lv_throughput_18_0= ruleThroughput ) )
                    // InternalAfvl.g:1428:5: (lv_throughput_18_0= ruleThroughput )
                    {
                    // InternalAfvl.g:1428:5: (lv_throughput_18_0= ruleThroughput )
                    // InternalAfvl.g:1429:6: lv_throughput_18_0= ruleThroughput
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getThroughputThroughputEnumRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_throughput_18_0=ruleThroughput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"throughput",
                    							lv_throughput_18_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.Throughput");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_19, grammarAccess.getEventAccess().getRolesKeyword_9());
            		
            otherlv_20=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_20, grammarAccess.getEventAccess().getColonKeyword_10());
            		
            otherlv_21=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_21, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalAfvl.g:1459:3: ( (lv_roles_22_0= ruleRole ) )
            // InternalAfvl.g:1460:4: (lv_roles_22_0= ruleRole )
            {
            // InternalAfvl.g:1460:4: (lv_roles_22_0= ruleRole )
            // InternalAfvl.g:1461:5: lv_roles_22_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getEventAccess().getRolesRoleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_7);
            lv_roles_22_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_22_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:1478:3: (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==14) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAfvl.g:1479:4: otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) )
            	    {
            	    otherlv_23=(Token)match(input,14,FOLLOW_28); 

            	    				newLeafNode(otherlv_23, grammarAccess.getEventAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalAfvl.g:1483:4: ( (lv_roles_24_0= ruleRole ) )
            	    // InternalAfvl.g:1484:5: (lv_roles_24_0= ruleRole )
            	    {
            	    // InternalAfvl.g:1484:5: (lv_roles_24_0= ruleRole )
            	    // InternalAfvl.g:1485:6: lv_roles_24_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getEventAccess().getRolesRoleParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_roles_24_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEventRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_24_0,
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

            otherlv_25=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_25, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_26=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_15());
            		

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
    // InternalAfvl.g:1515:1: entryRuleProcedureCall returns [EObject current=null] : iv_ruleProcedureCall= ruleProcedureCall EOF ;
    public final EObject entryRuleProcedureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedureCall = null;


        try {
            // InternalAfvl.g:1515:54: (iv_ruleProcedureCall= ruleProcedureCall EOF )
            // InternalAfvl.g:1516:2: iv_ruleProcedureCall= ruleProcedureCall EOF
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
    // InternalAfvl.g:1522:1: ruleProcedureCall returns [EObject current=null] : ( () otherlv_1= 'ProcCall' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' otherlv_26= '}' ) ;
    public final EObject ruleProcedureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Enumerator lv_delivery_6_0 = null;

        Enumerator lv_synct_9_0 = null;

        Enumerator lv_notification_12_0 = null;

        Enumerator lv_buffering_15_0 = null;

        Enumerator lv_throughput_18_0 = null;

        EObject lv_roles_22_0 = null;

        EObject lv_roles_24_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:1528:2: ( ( () otherlv_1= 'ProcCall' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' otherlv_26= '}' ) )
            // InternalAfvl.g:1529:2: ( () otherlv_1= 'ProcCall' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' otherlv_26= '}' )
            {
            // InternalAfvl.g:1529:2: ( () otherlv_1= 'ProcCall' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' otherlv_26= '}' )
            // InternalAfvl.g:1530:3: () otherlv_1= 'ProcCall' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' otherlv_26= '}'
            {
            // InternalAfvl.g:1530:3: ()
            // InternalAfvl.g:1531:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProcedureCallAccess().getProcedureCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getProcedureCallAccess().getProcCallKeyword_1());
            		
            // InternalAfvl.g:1541:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAfvl.g:1542:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAfvl.g:1542:4: (lv_name_2_0= RULE_ID )
            // InternalAfvl.g:1543:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getProcedureCallAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcedureCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getProcedureCallAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAfvl.g:1563:3: (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==21) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAfvl.g:1564:4: otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getProcedureCallAccess().getDeliveryKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getProcedureCallAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:1572:4: ( (lv_delivery_6_0= ruleDeliveryModel ) )
                    // InternalAfvl.g:1573:5: (lv_delivery_6_0= ruleDeliveryModel )
                    {
                    // InternalAfvl.g:1573:5: (lv_delivery_6_0= ruleDeliveryModel )
                    // InternalAfvl.g:1574:6: lv_delivery_6_0= ruleDeliveryModel
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getDeliveryDeliveryModelEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_delivery_6_0=ruleDeliveryModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcedureCallRule());
                    						}
                    						set(
                    							current,
                    							"delivery",
                    							lv_delivery_6_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.DeliveryModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1592:3: (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==22) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAfvl.g:1593:4: otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) )
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getProcedureCallAccess().getSynctKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,18,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getProcedureCallAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:1601:4: ( (lv_synct_9_0= ruleSyncType ) )
                    // InternalAfvl.g:1602:5: (lv_synct_9_0= ruleSyncType )
                    {
                    // InternalAfvl.g:1602:5: (lv_synct_9_0= ruleSyncType )
                    // InternalAfvl.g:1603:6: lv_synct_9_0= ruleSyncType
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getSynctSyncTypeEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_synct_9_0=ruleSyncType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcedureCallRule());
                    						}
                    						set(
                    							current,
                    							"synct",
                    							lv_synct_9_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.SyncType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1621:3: (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==23) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAfvl.g:1622:4: otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getProcedureCallAccess().getNotificationKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,18,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getProcedureCallAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:1630:4: ( (lv_notification_12_0= ruleNotificationModel ) )
                    // InternalAfvl.g:1631:5: (lv_notification_12_0= ruleNotificationModel )
                    {
                    // InternalAfvl.g:1631:5: (lv_notification_12_0= ruleNotificationModel )
                    // InternalAfvl.g:1632:6: lv_notification_12_0= ruleNotificationModel
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getNotificationNotificationModelEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_notification_12_0=ruleNotificationModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcedureCallRule());
                    						}
                    						set(
                    							current,
                    							"notification",
                    							lv_notification_12_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.NotificationModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1650:3: (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==24) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAfvl.g:1651:4: otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) )
                    {
                    otherlv_13=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getProcedureCallAccess().getBufferingKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,18,FOLLOW_24); 

                    				newLeafNode(otherlv_14, grammarAccess.getProcedureCallAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:1659:4: ( (lv_buffering_15_0= ruleBuffering ) )
                    // InternalAfvl.g:1660:5: (lv_buffering_15_0= ruleBuffering )
                    {
                    // InternalAfvl.g:1660:5: (lv_buffering_15_0= ruleBuffering )
                    // InternalAfvl.g:1661:6: lv_buffering_15_0= ruleBuffering
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getBufferingBufferingEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_buffering_15_0=ruleBuffering();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcedureCallRule());
                    						}
                    						set(
                    							current,
                    							"buffering",
                    							lv_buffering_15_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.Buffering");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:1679:3: (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==25) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAfvl.g:1680:4: otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) )
                    {
                    otherlv_16=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_16, grammarAccess.getProcedureCallAccess().getThroughputKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,18,FOLLOW_26); 

                    				newLeafNode(otherlv_17, grammarAccess.getProcedureCallAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:1688:4: ( (lv_throughput_18_0= ruleThroughput ) )
                    // InternalAfvl.g:1689:5: (lv_throughput_18_0= ruleThroughput )
                    {
                    // InternalAfvl.g:1689:5: (lv_throughput_18_0= ruleThroughput )
                    // InternalAfvl.g:1690:6: lv_throughput_18_0= ruleThroughput
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getThroughputThroughputEnumRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_throughput_18_0=ruleThroughput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcedureCallRule());
                    						}
                    						set(
                    							current,
                    							"throughput",
                    							lv_throughput_18_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.Throughput");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_19, grammarAccess.getProcedureCallAccess().getRolesKeyword_9());
            		
            otherlv_20=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_20, grammarAccess.getProcedureCallAccess().getColonKeyword_10());
            		
            otherlv_21=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_21, grammarAccess.getProcedureCallAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalAfvl.g:1720:3: ( (lv_roles_22_0= ruleRole ) )
            // InternalAfvl.g:1721:4: (lv_roles_22_0= ruleRole )
            {
            // InternalAfvl.g:1721:4: (lv_roles_22_0= ruleRole )
            // InternalAfvl.g:1722:5: lv_roles_22_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getProcedureCallAccess().getRolesRoleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_7);
            lv_roles_22_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedureCallRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_22_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:1739:3: (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==14) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalAfvl.g:1740:4: otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) )
            	    {
            	    otherlv_23=(Token)match(input,14,FOLLOW_28); 

            	    				newLeafNode(otherlv_23, grammarAccess.getProcedureCallAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalAfvl.g:1744:4: ( (lv_roles_24_0= ruleRole ) )
            	    // InternalAfvl.g:1745:5: (lv_roles_24_0= ruleRole )
            	    {
            	    // InternalAfvl.g:1745:5: (lv_roles_24_0= ruleRole )
            	    // InternalAfvl.g:1746:6: lv_roles_24_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getProcedureCallAccess().getRolesRoleParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_roles_24_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProcedureCallRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_24_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_25=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_25, grammarAccess.getProcedureCallAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_26=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getProcedureCallAccess().getRightCurlyBracketKeyword_15());
            		

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
    // InternalAfvl.g:1776:1: entryRuleTransformer returns [EObject current=null] : iv_ruleTransformer= ruleTransformer EOF ;
    public final EObject entryRuleTransformer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformer = null;


        try {
            // InternalAfvl.g:1776:52: (iv_ruleTransformer= ruleTransformer EOF )
            // InternalAfvl.g:1777:2: iv_ruleTransformer= ruleTransformer EOF
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
    // InternalAfvl.g:1783:1: ruleTransformer returns [EObject current=null] : (otherlv_0= 'Transformer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? otherlv_9= 'ports' otherlv_10= ':' otherlv_11= '{' ( (lv_ports_12_0= rulePort ) ) (otherlv_13= ',' ( (lv_ports_14_0= rulePort ) ) )* otherlv_15= '}' otherlv_16= '}' ) ;
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
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_procModel_5_0 = null;

        AntlrDatatypeRuleToken lv_pmml_8_0 = null;

        EObject lv_ports_12_0 = null;

        EObject lv_ports_14_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:1789:2: ( (otherlv_0= 'Transformer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? otherlv_9= 'ports' otherlv_10= ':' otherlv_11= '{' ( (lv_ports_12_0= rulePort ) ) (otherlv_13= ',' ( (lv_ports_14_0= rulePort ) ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // InternalAfvl.g:1790:2: (otherlv_0= 'Transformer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? otherlv_9= 'ports' otherlv_10= ':' otherlv_11= '{' ( (lv_ports_12_0= rulePort ) ) (otherlv_13= ',' ( (lv_ports_14_0= rulePort ) ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalAfvl.g:1790:2: (otherlv_0= 'Transformer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? otherlv_9= 'ports' otherlv_10= ':' otherlv_11= '{' ( (lv_ports_12_0= rulePort ) ) (otherlv_13= ',' ( (lv_ports_14_0= rulePort ) ) )* otherlv_15= '}' otherlv_16= '}' )
            // InternalAfvl.g:1791:3: otherlv_0= 'Transformer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? otherlv_9= 'ports' otherlv_10= ':' otherlv_11= '{' ( (lv_ports_12_0= rulePort ) ) (otherlv_13= ',' ( (lv_ports_14_0= rulePort ) ) )* otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTransformerAccess().getTransformerKeyword_0());
            		
            // InternalAfvl.g:1795:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:1796:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:1796:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:1797:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getTransformerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:1817:3: (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==33) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAfvl.g:1818:4: otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransformerAccess().getProcModelKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_34); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransformerAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:1826:4: ( (lv_procModel_5_0= ruleProcessingModel ) )
                    // InternalAfvl.g:1827:5: (lv_procModel_5_0= ruleProcessingModel )
                    {
                    // InternalAfvl.g:1827:5: (lv_procModel_5_0= ruleProcessingModel )
                    // InternalAfvl.g:1828:6: lv_procModel_5_0= ruleProcessingModel
                    {

                    						newCompositeNode(grammarAccess.getTransformerAccess().getProcModelProcessingModelEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_35);
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

            // InternalAfvl.g:1846:3: (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==34) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAfvl.g:1847:4: otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getTransformerAccess().getPmmlKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getTransformerAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:1855:4: ( (lv_pmml_8_0= ruleEString ) )
                    // InternalAfvl.g:1856:5: (lv_pmml_8_0= ruleEString )
                    {
                    // InternalAfvl.g:1856:5: (lv_pmml_8_0= ruleEString )
                    // InternalAfvl.g:1857:6: lv_pmml_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTransformerAccess().getPmmlEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_36);
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

            otherlv_9=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getTransformerAccess().getPortsKeyword_5());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getTransformerAccess().getColonKeyword_6());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_11, grammarAccess.getTransformerAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalAfvl.g:1887:3: ( (lv_ports_12_0= rulePort ) )
            // InternalAfvl.g:1888:4: (lv_ports_12_0= rulePort )
            {
            // InternalAfvl.g:1888:4: (lv_ports_12_0= rulePort )
            // InternalAfvl.g:1889:5: lv_ports_12_0= rulePort
            {

            					newCompositeNode(grammarAccess.getTransformerAccess().getPortsPortParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_ports_12_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransformerRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_12_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:1906:3: (otherlv_13= ',' ( (lv_ports_14_0= rulePort ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==14) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAfvl.g:1907:4: otherlv_13= ',' ( (lv_ports_14_0= rulePort ) )
            	    {
            	    otherlv_13=(Token)match(input,14,FOLLOW_37); 

            	    				newLeafNode(otherlv_13, grammarAccess.getTransformerAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalAfvl.g:1911:4: ( (lv_ports_14_0= rulePort ) )
            	    // InternalAfvl.g:1912:5: (lv_ports_14_0= rulePort )
            	    {
            	    // InternalAfvl.g:1912:5: (lv_ports_14_0= rulePort )
            	    // InternalAfvl.g:1913:6: lv_ports_14_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getTransformerAccess().getPortsPortParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_ports_14_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTransformerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_14_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_15=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_15, grammarAccess.getTransformerAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getTransformerAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalAfvl.g:1943:1: entryRuleEstimator returns [EObject current=null] : iv_ruleEstimator= ruleEstimator EOF ;
    public final EObject entryRuleEstimator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEstimator = null;


        try {
            // InternalAfvl.g:1943:50: (iv_ruleEstimator= ruleEstimator EOF )
            // InternalAfvl.g:1944:2: iv_ruleEstimator= ruleEstimator EOF
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
    // InternalAfvl.g:1950:1: ruleEstimator returns [EObject current=null] : (otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? otherlv_9= 'ports' otherlv_10= ':' otherlv_11= '{' ( (lv_ports_12_0= rulePort ) ) (otherlv_13= ',' ( (lv_ports_14_0= rulePort ) ) )* otherlv_15= '}' otherlv_16= '}' ) ;
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
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_procModel_5_0 = null;

        AntlrDatatypeRuleToken lv_pmml_8_0 = null;

        EObject lv_ports_12_0 = null;

        EObject lv_ports_14_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:1956:2: ( (otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? otherlv_9= 'ports' otherlv_10= ':' otherlv_11= '{' ( (lv_ports_12_0= rulePort ) ) (otherlv_13= ',' ( (lv_ports_14_0= rulePort ) ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // InternalAfvl.g:1957:2: (otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? otherlv_9= 'ports' otherlv_10= ':' otherlv_11= '{' ( (lv_ports_12_0= rulePort ) ) (otherlv_13= ',' ( (lv_ports_14_0= rulePort ) ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalAfvl.g:1957:2: (otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? otherlv_9= 'ports' otherlv_10= ':' otherlv_11= '{' ( (lv_ports_12_0= rulePort ) ) (otherlv_13= ',' ( (lv_ports_14_0= rulePort ) ) )* otherlv_15= '}' otherlv_16= '}' )
            // InternalAfvl.g:1958:3: otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? otherlv_9= 'ports' otherlv_10= ':' otherlv_11= '{' ( (lv_ports_12_0= rulePort ) ) (otherlv_13= ',' ( (lv_ports_14_0= rulePort ) ) )* otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEstimatorAccess().getEstimatorKeyword_0());
            		
            // InternalAfvl.g:1962:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:1963:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:1963:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:1964:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getEstimatorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:1984:3: (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==33) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAfvl.g:1985:4: otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getEstimatorAccess().getProcModelKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_34); 

                    				newLeafNode(otherlv_4, grammarAccess.getEstimatorAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:1993:4: ( (lv_procModel_5_0= ruleProcessingModel ) )
                    // InternalAfvl.g:1994:5: (lv_procModel_5_0= ruleProcessingModel )
                    {
                    // InternalAfvl.g:1994:5: (lv_procModel_5_0= ruleProcessingModel )
                    // InternalAfvl.g:1995:6: lv_procModel_5_0= ruleProcessingModel
                    {

                    						newCompositeNode(grammarAccess.getEstimatorAccess().getProcModelProcessingModelEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_35);
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

            // InternalAfvl.g:2013:3: (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==34) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAfvl.g:2014:4: otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getEstimatorAccess().getPmmlKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getEstimatorAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:2022:4: ( (lv_pmml_8_0= ruleEString ) )
                    // InternalAfvl.g:2023:5: (lv_pmml_8_0= ruleEString )
                    {
                    // InternalAfvl.g:2023:5: (lv_pmml_8_0= ruleEString )
                    // InternalAfvl.g:2024:6: lv_pmml_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEstimatorAccess().getPmmlEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_36);
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

            otherlv_9=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getEstimatorAccess().getPortsKeyword_5());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getEstimatorAccess().getColonKeyword_6());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_11, grammarAccess.getEstimatorAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalAfvl.g:2054:3: ( (lv_ports_12_0= rulePort ) )
            // InternalAfvl.g:2055:4: (lv_ports_12_0= rulePort )
            {
            // InternalAfvl.g:2055:4: (lv_ports_12_0= rulePort )
            // InternalAfvl.g:2056:5: lv_ports_12_0= rulePort
            {

            					newCompositeNode(grammarAccess.getEstimatorAccess().getPortsPortParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_ports_12_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEstimatorRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_12_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:2073:3: (otherlv_13= ',' ( (lv_ports_14_0= rulePort ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==14) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalAfvl.g:2074:4: otherlv_13= ',' ( (lv_ports_14_0= rulePort ) )
            	    {
            	    otherlv_13=(Token)match(input,14,FOLLOW_37); 

            	    				newLeafNode(otherlv_13, grammarAccess.getEstimatorAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalAfvl.g:2078:4: ( (lv_ports_14_0= rulePort ) )
            	    // InternalAfvl.g:2079:5: (lv_ports_14_0= rulePort )
            	    {
            	    // InternalAfvl.g:2079:5: (lv_ports_14_0= rulePort )
            	    // InternalAfvl.g:2080:6: lv_ports_14_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getEstimatorAccess().getPortsPortParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_ports_14_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEstimatorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_14_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_15=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_15, grammarAccess.getEstimatorAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getEstimatorAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalAfvl.g:2110:1: entryRuleIngestor returns [EObject current=null] : iv_ruleIngestor= ruleIngestor EOF ;
    public final EObject entryRuleIngestor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngestor = null;


        try {
            // InternalAfvl.g:2110:49: (iv_ruleIngestor= ruleIngestor EOF )
            // InternalAfvl.g:2111:2: iv_ruleIngestor= ruleIngestor EOF
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
    // InternalAfvl.g:2117:1: ruleIngestor returns [EObject current=null] : (otherlv_0= 'Ingestor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )? (otherlv_9= 'format' otherlv_10= ':' ( (lv_format_11_0= ruleEString ) ) )? (otherlv_12= 'props' otherlv_13= ':' ( (lv_props_14_0= ruleEString ) ) )? otherlv_15= 'ports' otherlv_16= ':' otherlv_17= '{' ( (lv_ports_18_0= rulePort ) ) (otherlv_19= ',' ( (lv_ports_20_0= rulePort ) ) )* otherlv_21= '}' otherlv_22= '}' ) ;
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
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Enumerator lv_procModel_5_0 = null;

        AntlrDatatypeRuleToken lv_conn_8_0 = null;

        AntlrDatatypeRuleToken lv_format_11_0 = null;

        AntlrDatatypeRuleToken lv_props_14_0 = null;

        EObject lv_ports_18_0 = null;

        EObject lv_ports_20_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:2123:2: ( (otherlv_0= 'Ingestor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )? (otherlv_9= 'format' otherlv_10= ':' ( (lv_format_11_0= ruleEString ) ) )? (otherlv_12= 'props' otherlv_13= ':' ( (lv_props_14_0= ruleEString ) ) )? otherlv_15= 'ports' otherlv_16= ':' otherlv_17= '{' ( (lv_ports_18_0= rulePort ) ) (otherlv_19= ',' ( (lv_ports_20_0= rulePort ) ) )* otherlv_21= '}' otherlv_22= '}' ) )
            // InternalAfvl.g:2124:2: (otherlv_0= 'Ingestor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )? (otherlv_9= 'format' otherlv_10= ':' ( (lv_format_11_0= ruleEString ) ) )? (otherlv_12= 'props' otherlv_13= ':' ( (lv_props_14_0= ruleEString ) ) )? otherlv_15= 'ports' otherlv_16= ':' otherlv_17= '{' ( (lv_ports_18_0= rulePort ) ) (otherlv_19= ',' ( (lv_ports_20_0= rulePort ) ) )* otherlv_21= '}' otherlv_22= '}' )
            {
            // InternalAfvl.g:2124:2: (otherlv_0= 'Ingestor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )? (otherlv_9= 'format' otherlv_10= ':' ( (lv_format_11_0= ruleEString ) ) )? (otherlv_12= 'props' otherlv_13= ':' ( (lv_props_14_0= ruleEString ) ) )? otherlv_15= 'ports' otherlv_16= ':' otherlv_17= '{' ( (lv_ports_18_0= rulePort ) ) (otherlv_19= ',' ( (lv_ports_20_0= rulePort ) ) )* otherlv_21= '}' otherlv_22= '}' )
            // InternalAfvl.g:2125:3: otherlv_0= 'Ingestor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )? (otherlv_9= 'format' otherlv_10= ':' ( (lv_format_11_0= ruleEString ) ) )? (otherlv_12= 'props' otherlv_13= ':' ( (lv_props_14_0= ruleEString ) ) )? otherlv_15= 'ports' otherlv_16= ':' otherlv_17= '{' ( (lv_ports_18_0= rulePort ) ) (otherlv_19= ',' ( (lv_ports_20_0= rulePort ) ) )* otherlv_21= '}' otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getIngestorAccess().getIngestorKeyword_0());
            		
            // InternalAfvl.g:2129:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:2130:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:2130:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:2131:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getIngestorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:2151:3: (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==33) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAfvl.g:2152:4: otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getIngestorAccess().getProcModelKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_34); 

                    				newLeafNode(otherlv_4, grammarAccess.getIngestorAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:2160:4: ( (lv_procModel_5_0= ruleProcessingModel ) )
                    // InternalAfvl.g:2161:5: (lv_procModel_5_0= ruleProcessingModel )
                    {
                    // InternalAfvl.g:2161:5: (lv_procModel_5_0= ruleProcessingModel )
                    // InternalAfvl.g:2162:6: lv_procModel_5_0= ruleProcessingModel
                    {

                    						newCompositeNode(grammarAccess.getIngestorAccess().getProcModelProcessingModelEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_procModel_5_0=ruleProcessingModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngestorRule());
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

            // InternalAfvl.g:2180:3: (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==38) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAfvl.g:2181:4: otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getIngestorAccess().getConnKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getIngestorAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:2189:4: ( (lv_conn_8_0= ruleEString ) )
                    // InternalAfvl.g:2190:5: (lv_conn_8_0= ruleEString )
                    {
                    // InternalAfvl.g:2190:5: (lv_conn_8_0= ruleEString )
                    // InternalAfvl.g:2191:6: lv_conn_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIngestorAccess().getConnEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_conn_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngestorRule());
                    						}
                    						set(
                    							current,
                    							"conn",
                    							lv_conn_8_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2209:3: (otherlv_9= 'format' otherlv_10= ':' ( (lv_format_11_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==39) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAfvl.g:2210:4: otherlv_9= 'format' otherlv_10= ':' ( (lv_format_11_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getIngestorAccess().getFormatKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getIngestorAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:2218:4: ( (lv_format_11_0= ruleEString ) )
                    // InternalAfvl.g:2219:5: (lv_format_11_0= ruleEString )
                    {
                    // InternalAfvl.g:2219:5: (lv_format_11_0= ruleEString )
                    // InternalAfvl.g:2220:6: lv_format_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIngestorAccess().getFormatEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_format_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngestorRule());
                    						}
                    						set(
                    							current,
                    							"format",
                    							lv_format_11_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAfvl.g:2238:3: (otherlv_12= 'props' otherlv_13= ':' ( (lv_props_14_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==40) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAfvl.g:2239:4: otherlv_12= 'props' otherlv_13= ':' ( (lv_props_14_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,40,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getIngestorAccess().getPropsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getIngestorAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:2247:4: ( (lv_props_14_0= ruleEString ) )
                    // InternalAfvl.g:2248:5: (lv_props_14_0= ruleEString )
                    {
                    // InternalAfvl.g:2248:5: (lv_props_14_0= ruleEString )
                    // InternalAfvl.g:2249:6: lv_props_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIngestorAccess().getPropsEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_props_14_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngestorRule());
                    						}
                    						set(
                    							current,
                    							"props",
                    							lv_props_14_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_15, grammarAccess.getIngestorAccess().getPortsKeyword_7());
            		
            otherlv_16=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_16, grammarAccess.getIngestorAccess().getColonKeyword_8());
            		
            otherlv_17=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_17, grammarAccess.getIngestorAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalAfvl.g:2279:3: ( (lv_ports_18_0= rulePort ) )
            // InternalAfvl.g:2280:4: (lv_ports_18_0= rulePort )
            {
            // InternalAfvl.g:2280:4: (lv_ports_18_0= rulePort )
            // InternalAfvl.g:2281:5: lv_ports_18_0= rulePort
            {

            					newCompositeNode(grammarAccess.getIngestorAccess().getPortsPortParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_7);
            lv_ports_18_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIngestorRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_18_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:2298:3: (otherlv_19= ',' ( (lv_ports_20_0= rulePort ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==14) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalAfvl.g:2299:4: otherlv_19= ',' ( (lv_ports_20_0= rulePort ) )
            	    {
            	    otherlv_19=(Token)match(input,14,FOLLOW_37); 

            	    				newLeafNode(otherlv_19, grammarAccess.getIngestorAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalAfvl.g:2303:4: ( (lv_ports_20_0= rulePort ) )
            	    // InternalAfvl.g:2304:5: (lv_ports_20_0= rulePort )
            	    {
            	    // InternalAfvl.g:2304:5: (lv_ports_20_0= rulePort )
            	    // InternalAfvl.g:2305:6: lv_ports_20_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getIngestorAccess().getPortsPortParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_ports_20_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIngestorRule());
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
            	    break loop49;
                }
            } while (true);

            otherlv_21=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_21, grammarAccess.getIngestorAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getIngestorAccess().getRightCurlyBracketKeyword_13());
            		

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
    // InternalAfvl.g:2335:1: entryRuleSink returns [EObject current=null] : iv_ruleSink= ruleSink EOF ;
    public final EObject entryRuleSink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSink = null;


        try {
            // InternalAfvl.g:2335:45: (iv_ruleSink= ruleSink EOF )
            // InternalAfvl.g:2336:2: iv_ruleSink= ruleSink EOF
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
    // InternalAfvl.g:2342:1: ruleSink returns [EObject current=null] : (otherlv_0= 'Sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )? otherlv_9= 'ports' otherlv_10= ':' otherlv_11= '{' ( (lv_ports_12_0= rulePort ) ) (otherlv_13= ',' ( (lv_ports_14_0= rulePort ) ) )* otherlv_15= '}' otherlv_16= '}' ) ;
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
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_procModel_5_0 = null;

        AntlrDatatypeRuleToken lv_conn_8_0 = null;

        EObject lv_ports_12_0 = null;

        EObject lv_ports_14_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:2348:2: ( (otherlv_0= 'Sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )? otherlv_9= 'ports' otherlv_10= ':' otherlv_11= '{' ( (lv_ports_12_0= rulePort ) ) (otherlv_13= ',' ( (lv_ports_14_0= rulePort ) ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // InternalAfvl.g:2349:2: (otherlv_0= 'Sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )? otherlv_9= 'ports' otherlv_10= ':' otherlv_11= '{' ( (lv_ports_12_0= rulePort ) ) (otherlv_13= ',' ( (lv_ports_14_0= rulePort ) ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalAfvl.g:2349:2: (otherlv_0= 'Sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )? otherlv_9= 'ports' otherlv_10= ':' otherlv_11= '{' ( (lv_ports_12_0= rulePort ) ) (otherlv_13= ',' ( (lv_ports_14_0= rulePort ) ) )* otherlv_15= '}' otherlv_16= '}' )
            // InternalAfvl.g:2350:3: otherlv_0= 'Sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )? otherlv_9= 'ports' otherlv_10= ':' otherlv_11= '{' ( (lv_ports_12_0= rulePort ) ) (otherlv_13= ',' ( (lv_ports_14_0= rulePort ) ) )* otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSinkAccess().getSinkKeyword_0());
            		
            // InternalAfvl.g:2354:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:2355:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:2355:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:2356:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getSinkAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:2376:3: (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==33) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAfvl.g:2377:4: otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getSinkAccess().getProcModelKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_34); 

                    				newLeafNode(otherlv_4, grammarAccess.getSinkAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:2385:4: ( (lv_procModel_5_0= ruleProcessingModel ) )
                    // InternalAfvl.g:2386:5: (lv_procModel_5_0= ruleProcessingModel )
                    {
                    // InternalAfvl.g:2386:5: (lv_procModel_5_0= ruleProcessingModel )
                    // InternalAfvl.g:2387:6: lv_procModel_5_0= ruleProcessingModel
                    {

                    						newCompositeNode(grammarAccess.getSinkAccess().getProcModelProcessingModelEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_procModel_5_0=ruleProcessingModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSinkRule());
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

            // InternalAfvl.g:2405:3: (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==38) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAfvl.g:2406:4: otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getSinkAccess().getConnKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getSinkAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:2414:4: ( (lv_conn_8_0= ruleEString ) )
                    // InternalAfvl.g:2415:5: (lv_conn_8_0= ruleEString )
                    {
                    // InternalAfvl.g:2415:5: (lv_conn_8_0= ruleEString )
                    // InternalAfvl.g:2416:6: lv_conn_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSinkAccess().getConnEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_conn_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSinkRule());
                    						}
                    						set(
                    							current,
                    							"conn",
                    							lv_conn_8_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getSinkAccess().getPortsKeyword_5());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getSinkAccess().getColonKeyword_6());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_11, grammarAccess.getSinkAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalAfvl.g:2446:3: ( (lv_ports_12_0= rulePort ) )
            // InternalAfvl.g:2447:4: (lv_ports_12_0= rulePort )
            {
            // InternalAfvl.g:2447:4: (lv_ports_12_0= rulePort )
            // InternalAfvl.g:2448:5: lv_ports_12_0= rulePort
            {

            					newCompositeNode(grammarAccess.getSinkAccess().getPortsPortParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_ports_12_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSinkRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_12_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:2465:3: (otherlv_13= ',' ( (lv_ports_14_0= rulePort ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==14) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalAfvl.g:2466:4: otherlv_13= ',' ( (lv_ports_14_0= rulePort ) )
            	    {
            	    otherlv_13=(Token)match(input,14,FOLLOW_37); 

            	    				newLeafNode(otherlv_13, grammarAccess.getSinkAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalAfvl.g:2470:4: ( (lv_ports_14_0= rulePort ) )
            	    // InternalAfvl.g:2471:5: (lv_ports_14_0= rulePort )
            	    {
            	    // InternalAfvl.g:2471:5: (lv_ports_14_0= rulePort )
            	    // InternalAfvl.g:2472:6: lv_ports_14_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getSinkAccess().getPortsPortParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_ports_14_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSinkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_14_0,
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

            otherlv_15=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_15, grammarAccess.getSinkAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getSinkAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalAfvl.g:2502:1: ruleDeliveryModel returns [Enumerator current=null] : ( (enumLiteral_0= 'BEST_EFFORT' ) | (enumLiteral_1= 'AT_LEAST_ONE' ) | (enumLiteral_2= 'AT_MOST_ONE' ) | (enumLiteral_3= 'EXACTLY_ONE' ) ) ;
    public final Enumerator ruleDeliveryModel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAfvl.g:2508:2: ( ( (enumLiteral_0= 'BEST_EFFORT' ) | (enumLiteral_1= 'AT_LEAST_ONE' ) | (enumLiteral_2= 'AT_MOST_ONE' ) | (enumLiteral_3= 'EXACTLY_ONE' ) ) )
            // InternalAfvl.g:2509:2: ( (enumLiteral_0= 'BEST_EFFORT' ) | (enumLiteral_1= 'AT_LEAST_ONE' ) | (enumLiteral_2= 'AT_MOST_ONE' ) | (enumLiteral_3= 'EXACTLY_ONE' ) )
            {
            // InternalAfvl.g:2509:2: ( (enumLiteral_0= 'BEST_EFFORT' ) | (enumLiteral_1= 'AT_LEAST_ONE' ) | (enumLiteral_2= 'AT_MOST_ONE' ) | (enumLiteral_3= 'EXACTLY_ONE' ) )
            int alt53=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt53=1;
                }
                break;
            case 43:
                {
                alt53=2;
                }
                break;
            case 44:
                {
                alt53=3;
                }
                break;
            case 45:
                {
                alt53=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalAfvl.g:2510:3: (enumLiteral_0= 'BEST_EFFORT' )
                    {
                    // InternalAfvl.g:2510:3: (enumLiteral_0= 'BEST_EFFORT' )
                    // InternalAfvl.g:2511:4: enumLiteral_0= 'BEST_EFFORT'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getDeliveryModelAccess().getBEST_EFFORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDeliveryModelAccess().getBEST_EFFORTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:2518:3: (enumLiteral_1= 'AT_LEAST_ONE' )
                    {
                    // InternalAfvl.g:2518:3: (enumLiteral_1= 'AT_LEAST_ONE' )
                    // InternalAfvl.g:2519:4: enumLiteral_1= 'AT_LEAST_ONE'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getDeliveryModelAccess().getAT_LEAST_ONEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDeliveryModelAccess().getAT_LEAST_ONEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAfvl.g:2526:3: (enumLiteral_2= 'AT_MOST_ONE' )
                    {
                    // InternalAfvl.g:2526:3: (enumLiteral_2= 'AT_MOST_ONE' )
                    // InternalAfvl.g:2527:4: enumLiteral_2= 'AT_MOST_ONE'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDeliveryModelAccess().getAT_MOST_ONEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDeliveryModelAccess().getAT_MOST_ONEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAfvl.g:2534:3: (enumLiteral_3= 'EXACTLY_ONE' )
                    {
                    // InternalAfvl.g:2534:3: (enumLiteral_3= 'EXACTLY_ONE' )
                    // InternalAfvl.g:2535:4: enumLiteral_3= 'EXACTLY_ONE'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_2); 

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
    // InternalAfvl.g:2545:1: ruleSyncType returns [Enumerator current=null] : ( (enumLiteral_0= 'ASYNC' ) | (enumLiteral_1= 'SYNC' ) ) ;
    public final Enumerator ruleSyncType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:2551:2: ( ( (enumLiteral_0= 'ASYNC' ) | (enumLiteral_1= 'SYNC' ) ) )
            // InternalAfvl.g:2552:2: ( (enumLiteral_0= 'ASYNC' ) | (enumLiteral_1= 'SYNC' ) )
            {
            // InternalAfvl.g:2552:2: ( (enumLiteral_0= 'ASYNC' ) | (enumLiteral_1= 'SYNC' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==46) ) {
                alt54=1;
            }
            else if ( (LA54_0==47) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalAfvl.g:2553:3: (enumLiteral_0= 'ASYNC' )
                    {
                    // InternalAfvl.g:2553:3: (enumLiteral_0= 'ASYNC' )
                    // InternalAfvl.g:2554:4: enumLiteral_0= 'ASYNC'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getSyncTypeAccess().getASYNCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSyncTypeAccess().getASYNCEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:2561:3: (enumLiteral_1= 'SYNC' )
                    {
                    // InternalAfvl.g:2561:3: (enumLiteral_1= 'SYNC' )
                    // InternalAfvl.g:2562:4: enumLiteral_1= 'SYNC'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

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
    // InternalAfvl.g:2572:1: rulePortType returns [Enumerator current=null] : ( (enumLiteral_0= 'REQUIRED' ) | (enumLiteral_1= 'PROVIDED' ) ) ;
    public final Enumerator rulePortType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:2578:2: ( ( (enumLiteral_0= 'REQUIRED' ) | (enumLiteral_1= 'PROVIDED' ) ) )
            // InternalAfvl.g:2579:2: ( (enumLiteral_0= 'REQUIRED' ) | (enumLiteral_1= 'PROVIDED' ) )
            {
            // InternalAfvl.g:2579:2: ( (enumLiteral_0= 'REQUIRED' ) | (enumLiteral_1= 'PROVIDED' ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==48) ) {
                alt55=1;
            }
            else if ( (LA55_0==49) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalAfvl.g:2580:3: (enumLiteral_0= 'REQUIRED' )
                    {
                    // InternalAfvl.g:2580:3: (enumLiteral_0= 'REQUIRED' )
                    // InternalAfvl.g:2581:4: enumLiteral_0= 'REQUIRED'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getPortTypeAccess().getREQUIREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPortTypeAccess().getREQUIREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:2588:3: (enumLiteral_1= 'PROVIDED' )
                    {
                    // InternalAfvl.g:2588:3: (enumLiteral_1= 'PROVIDED' )
                    // InternalAfvl.g:2589:4: enumLiteral_1= 'PROVIDED'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

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
    // InternalAfvl.g:2599:1: ruleRoleType returns [Enumerator current=null] : ( (enumLiteral_0= 'OUT' ) | (enumLiteral_1= 'IN' ) ) ;
    public final Enumerator ruleRoleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:2605:2: ( ( (enumLiteral_0= 'OUT' ) | (enumLiteral_1= 'IN' ) ) )
            // InternalAfvl.g:2606:2: ( (enumLiteral_0= 'OUT' ) | (enumLiteral_1= 'IN' ) )
            {
            // InternalAfvl.g:2606:2: ( (enumLiteral_0= 'OUT' ) | (enumLiteral_1= 'IN' ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==50) ) {
                alt56=1;
            }
            else if ( (LA56_0==51) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalAfvl.g:2607:3: (enumLiteral_0= 'OUT' )
                    {
                    // InternalAfvl.g:2607:3: (enumLiteral_0= 'OUT' )
                    // InternalAfvl.g:2608:4: enumLiteral_0= 'OUT'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getOUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRoleTypeAccess().getOUTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:2615:3: (enumLiteral_1= 'IN' )
                    {
                    // InternalAfvl.g:2615:3: (enumLiteral_1= 'IN' )
                    // InternalAfvl.g:2616:4: enumLiteral_1= 'IN'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

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
    // InternalAfvl.g:2626:1: ruleNotificationModel returns [Enumerator current=null] : ( (enumLiteral_0= 'POLLED' ) | (enumLiteral_1= 'PUBSUB' ) | (enumLiteral_2= 'QUEUED' ) | (enumLiteral_3= 'CENTRAL' ) ) ;
    public final Enumerator ruleNotificationModel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAfvl.g:2632:2: ( ( (enumLiteral_0= 'POLLED' ) | (enumLiteral_1= 'PUBSUB' ) | (enumLiteral_2= 'QUEUED' ) | (enumLiteral_3= 'CENTRAL' ) ) )
            // InternalAfvl.g:2633:2: ( (enumLiteral_0= 'POLLED' ) | (enumLiteral_1= 'PUBSUB' ) | (enumLiteral_2= 'QUEUED' ) | (enumLiteral_3= 'CENTRAL' ) )
            {
            // InternalAfvl.g:2633:2: ( (enumLiteral_0= 'POLLED' ) | (enumLiteral_1= 'PUBSUB' ) | (enumLiteral_2= 'QUEUED' ) | (enumLiteral_3= 'CENTRAL' ) )
            int alt57=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt57=1;
                }
                break;
            case 53:
                {
                alt57=2;
                }
                break;
            case 54:
                {
                alt57=3;
                }
                break;
            case 55:
                {
                alt57=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalAfvl.g:2634:3: (enumLiteral_0= 'POLLED' )
                    {
                    // InternalAfvl.g:2634:3: (enumLiteral_0= 'POLLED' )
                    // InternalAfvl.g:2635:4: enumLiteral_0= 'POLLED'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getNotificationModelAccess().getPOLLEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNotificationModelAccess().getPOLLEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:2642:3: (enumLiteral_1= 'PUBSUB' )
                    {
                    // InternalAfvl.g:2642:3: (enumLiteral_1= 'PUBSUB' )
                    // InternalAfvl.g:2643:4: enumLiteral_1= 'PUBSUB'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getNotificationModelAccess().getPUBSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNotificationModelAccess().getPUBSUBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAfvl.g:2650:3: (enumLiteral_2= 'QUEUED' )
                    {
                    // InternalAfvl.g:2650:3: (enumLiteral_2= 'QUEUED' )
                    // InternalAfvl.g:2651:4: enumLiteral_2= 'QUEUED'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getNotificationModelAccess().getQUEUEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNotificationModelAccess().getQUEUEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAfvl.g:2658:3: (enumLiteral_3= 'CENTRAL' )
                    {
                    // InternalAfvl.g:2658:3: (enumLiteral_3= 'CENTRAL' )
                    // InternalAfvl.g:2659:4: enumLiteral_3= 'CENTRAL'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

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
    // InternalAfvl.g:2669:1: ruleBuffering returns [Enumerator current=null] : ( (enumLiteral_0= 'BUFFERED' ) | (enumLiteral_1= 'UNBUFFERED' ) ) ;
    public final Enumerator ruleBuffering() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:2675:2: ( ( (enumLiteral_0= 'BUFFERED' ) | (enumLiteral_1= 'UNBUFFERED' ) ) )
            // InternalAfvl.g:2676:2: ( (enumLiteral_0= 'BUFFERED' ) | (enumLiteral_1= 'UNBUFFERED' ) )
            {
            // InternalAfvl.g:2676:2: ( (enumLiteral_0= 'BUFFERED' ) | (enumLiteral_1= 'UNBUFFERED' ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==56) ) {
                alt58=1;
            }
            else if ( (LA58_0==57) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalAfvl.g:2677:3: (enumLiteral_0= 'BUFFERED' )
                    {
                    // InternalAfvl.g:2677:3: (enumLiteral_0= 'BUFFERED' )
                    // InternalAfvl.g:2678:4: enumLiteral_0= 'BUFFERED'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getBufferingAccess().getBUFFEREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBufferingAccess().getBUFFEREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:2685:3: (enumLiteral_1= 'UNBUFFERED' )
                    {
                    // InternalAfvl.g:2685:3: (enumLiteral_1= 'UNBUFFERED' )
                    // InternalAfvl.g:2686:4: enumLiteral_1= 'UNBUFFERED'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

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
    // InternalAfvl.g:2696:1: ruleThroughput returns [Enumerator current=null] : ( (enumLiteral_0= 'ATOMIC' ) | (enumLiteral_1= 'HIGH_ORDER' ) ) ;
    public final Enumerator ruleThroughput() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:2702:2: ( ( (enumLiteral_0= 'ATOMIC' ) | (enumLiteral_1= 'HIGH_ORDER' ) ) )
            // InternalAfvl.g:2703:2: ( (enumLiteral_0= 'ATOMIC' ) | (enumLiteral_1= 'HIGH_ORDER' ) )
            {
            // InternalAfvl.g:2703:2: ( (enumLiteral_0= 'ATOMIC' ) | (enumLiteral_1= 'HIGH_ORDER' ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==58) ) {
                alt59=1;
            }
            else if ( (LA59_0==59) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalAfvl.g:2704:3: (enumLiteral_0= 'ATOMIC' )
                    {
                    // InternalAfvl.g:2704:3: (enumLiteral_0= 'ATOMIC' )
                    // InternalAfvl.g:2705:4: enumLiteral_0= 'ATOMIC'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getThroughputAccess().getATOMICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getThroughputAccess().getATOMICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:2712:3: (enumLiteral_1= 'HIGH_ORDER' )
                    {
                    // InternalAfvl.g:2712:3: (enumLiteral_1= 'HIGH_ORDER' )
                    // InternalAfvl.g:2713:4: enumLiteral_1= 'HIGH_ORDER'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

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
    // InternalAfvl.g:2723:1: ruleProcessingModel returns [Enumerator current=null] : ( (enumLiteral_0= 'STREAM' ) | (enumLiteral_1= 'BATCH' ) | (enumLiteral_2= 'MICROBATCH' ) ) ;
    public final Enumerator ruleProcessingModel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAfvl.g:2729:2: ( ( (enumLiteral_0= 'STREAM' ) | (enumLiteral_1= 'BATCH' ) | (enumLiteral_2= 'MICROBATCH' ) ) )
            // InternalAfvl.g:2730:2: ( (enumLiteral_0= 'STREAM' ) | (enumLiteral_1= 'BATCH' ) | (enumLiteral_2= 'MICROBATCH' ) )
            {
            // InternalAfvl.g:2730:2: ( (enumLiteral_0= 'STREAM' ) | (enumLiteral_1= 'BATCH' ) | (enumLiteral_2= 'MICROBATCH' ) )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt60=1;
                }
                break;
            case 61:
                {
                alt60=2;
                }
                break;
            case 62:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalAfvl.g:2731:3: (enumLiteral_0= 'STREAM' )
                    {
                    // InternalAfvl.g:2731:3: (enumLiteral_0= 'STREAM' )
                    // InternalAfvl.g:2732:4: enumLiteral_0= 'STREAM'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getProcessingModelAccess().getSTREAMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProcessingModelAccess().getSTREAMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:2739:3: (enumLiteral_1= 'BATCH' )
                    {
                    // InternalAfvl.g:2739:3: (enumLiteral_1= 'BATCH' )
                    // InternalAfvl.g:2740:4: enumLiteral_1= 'BATCH'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getProcessingModelAccess().getBATCHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProcessingModelAccess().getBATCHEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAfvl.g:2747:3: (enumLiteral_2= 'MICROBATCH' )
                    {
                    // InternalAfvl.g:2747:3: (enumLiteral_2= 'MICROBATCH' )
                    // InternalAfvl.g:2748:4: enumLiteral_2= 'MICROBATCH'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000023100000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000D8001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000C000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000007E00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00003C0007C00000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000027A00000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000027800000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000001CA00000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000001C800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000018800000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000004A00000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000004800000000L});

}