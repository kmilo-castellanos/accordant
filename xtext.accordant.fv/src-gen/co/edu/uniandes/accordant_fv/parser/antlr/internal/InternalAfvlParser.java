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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FunctionalView'", "'use'", "'inputPackage'", "'{'", "'Components'", "','", "'}'", "'Connectors'", "'Port'", "':'", "'Role'", "'->'", "'Stream'", "'delivery'", "'synct'", "'notification'", "'buffering'", "'throughput'", "'roles'", "'sensitivityPoint'", "'Adaptor'", "'Distributor'", "'sync'", "'Event'", "'ProcCall'", "'Transformer'", "'procModel'", "'pmml'", "'ports'", "'Estimator'", "'Ingestor'", "'conn'", "'format'", "'props'", "'Sink'", "'BEST_EFFORT'", "'AT_LEAST_ONE'", "'AT_MOST_ONE'", "'EXACTLY_ONE'", "'ASYNC'", "'SYNC'", "'REQUIRED'", "'PROVIDED'", "'OUT'", "'IN'", "'POLLED'", "'PUBSUB'", "'QUEUED'", "'CENTRAL'", "'BUFFERED'", "'UNBUFFERED'", "'ATOMIC'", "'HIGH_ORDER'", "'STREAM'", "'BATCH'", "'MICROBATCH'"
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
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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
    // InternalAfvl.g:72:1: ruleFunctionalView returns [EObject current=null] : (otherlv_0= 'FunctionalView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'use' otherlv_3= 'inputPackage' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'Components' otherlv_7= '{' ( (lv_comps_8_0= ruleComponent ) ) (otherlv_9= ',' ( (lv_comps_10_0= ruleComponent ) ) )* otherlv_11= '}' otherlv_12= 'Connectors' otherlv_13= '{' ( (lv_conns_14_0= ruleConnector ) ) (otherlv_15= ',' ( (lv_conns_16_0= ruleConnector ) ) )* otherlv_17= '}' otherlv_18= '}' ) ;
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
            // InternalAfvl.g:78:2: ( (otherlv_0= 'FunctionalView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'use' otherlv_3= 'inputPackage' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'Components' otherlv_7= '{' ( (lv_comps_8_0= ruleComponent ) ) (otherlv_9= ',' ( (lv_comps_10_0= ruleComponent ) ) )* otherlv_11= '}' otherlv_12= 'Connectors' otherlv_13= '{' ( (lv_conns_14_0= ruleConnector ) ) (otherlv_15= ',' ( (lv_conns_16_0= ruleConnector ) ) )* otherlv_17= '}' otherlv_18= '}' ) )
            // InternalAfvl.g:79:2: (otherlv_0= 'FunctionalView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'use' otherlv_3= 'inputPackage' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'Components' otherlv_7= '{' ( (lv_comps_8_0= ruleComponent ) ) (otherlv_9= ',' ( (lv_comps_10_0= ruleComponent ) ) )* otherlv_11= '}' otherlv_12= 'Connectors' otherlv_13= '{' ( (lv_conns_14_0= ruleConnector ) ) (otherlv_15= ',' ( (lv_conns_16_0= ruleConnector ) ) )* otherlv_17= '}' otherlv_18= '}' )
            {
            // InternalAfvl.g:79:2: (otherlv_0= 'FunctionalView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'use' otherlv_3= 'inputPackage' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'Components' otherlv_7= '{' ( (lv_comps_8_0= ruleComponent ) ) (otherlv_9= ',' ( (lv_comps_10_0= ruleComponent ) ) )* otherlv_11= '}' otherlv_12= 'Connectors' otherlv_13= '{' ( (lv_conns_14_0= ruleConnector ) ) (otherlv_15= ',' ( (lv_conns_16_0= ruleConnector ) ) )* otherlv_17= '}' otherlv_18= '}' )
            // InternalAfvl.g:80:3: otherlv_0= 'FunctionalView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'use' otherlv_3= 'inputPackage' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'Components' otherlv_7= '{' ( (lv_comps_8_0= ruleComponent ) ) (otherlv_9= ',' ( (lv_comps_10_0= ruleComponent ) ) )* otherlv_11= '}' otherlv_12= 'Connectors' otherlv_13= '{' ( (lv_conns_14_0= ruleConnector ) ) (otherlv_15= ',' ( (lv_conns_16_0= ruleConnector ) ) )* otherlv_17= '}' otherlv_18= '}'
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

            			newLeafNode(otherlv_3, grammarAccess.getFunctionalViewAccess().getInputPackageKeyword_3());
            		
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

            					newLeafNode(otherlv_4, grammarAccess.getFunctionalViewAccess().getIpackageInputPackageCrossReference_4_0());
            				

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
            case 31:
                {
                alt3=2;
                }
                break;
            case 32:
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
    // InternalAfvl.g:564:1: ruleStream returns [EObject current=null] : ( () otherlv_1= 'Stream' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' (otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) ) )? otherlv_29= '}' ) ;
    public final EObject ruleStream() throws RecognitionException {
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
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Enumerator lv_delivery_6_0 = null;

        Enumerator lv_synct_9_0 = null;

        Enumerator lv_notification_12_0 = null;

        Enumerator lv_buffering_15_0 = null;

        Enumerator lv_throughput_18_0 = null;

        EObject lv_roles_22_0 = null;

        EObject lv_roles_24_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:570:2: ( ( () otherlv_1= 'Stream' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' (otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) ) )? otherlv_29= '}' ) )
            // InternalAfvl.g:571:2: ( () otherlv_1= 'Stream' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' (otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) ) )? otherlv_29= '}' )
            {
            // InternalAfvl.g:571:2: ( () otherlv_1= 'Stream' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' (otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) ) )? otherlv_29= '}' )
            // InternalAfvl.g:572:3: () otherlv_1= 'Stream' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' (otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) ) )? otherlv_29= '}'
            {
            // InternalAfvl.g:572:3: ()
            // InternalAfvl.g:573:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStreamAccess().getStreamAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStreamAccess().getStreamKeyword_1());
            		
            // InternalAfvl.g:583:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAfvl.g:584:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAfvl.g:584:4: (lv_name_2_0= RULE_ID )
            // InternalAfvl.g:585:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getStreamAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStreamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getStreamAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAfvl.g:605:3: (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAfvl.g:606:4: otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getStreamAccess().getDeliveryKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getStreamAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:614:4: ( (lv_delivery_6_0= ruleDeliveryModel ) )
                    // InternalAfvl.g:615:5: (lv_delivery_6_0= ruleDeliveryModel )
                    {
                    // InternalAfvl.g:615:5: (lv_delivery_6_0= ruleDeliveryModel )
                    // InternalAfvl.g:616:6: lv_delivery_6_0= ruleDeliveryModel
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getDeliveryDeliveryModelEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_delivery_6_0=ruleDeliveryModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStreamRule());
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

            // InternalAfvl.g:634:3: (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAfvl.g:635:4: otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getStreamAccess().getSynctKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,20,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getStreamAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:643:4: ( (lv_synct_9_0= ruleSyncType ) )
                    // InternalAfvl.g:644:5: (lv_synct_9_0= ruleSyncType )
                    {
                    // InternalAfvl.g:644:5: (lv_synct_9_0= ruleSyncType )
                    // InternalAfvl.g:645:6: lv_synct_9_0= ruleSyncType
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getSynctSyncTypeEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_synct_9_0=ruleSyncType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStreamRule());
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

            // InternalAfvl.g:663:3: (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAfvl.g:664:4: otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getStreamAccess().getNotificationKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,20,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getStreamAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:672:4: ( (lv_notification_12_0= ruleNotificationModel ) )
                    // InternalAfvl.g:673:5: (lv_notification_12_0= ruleNotificationModel )
                    {
                    // InternalAfvl.g:673:5: (lv_notification_12_0= ruleNotificationModel )
                    // InternalAfvl.g:674:6: lv_notification_12_0= ruleNotificationModel
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getNotificationNotificationModelEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_notification_12_0=ruleNotificationModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStreamRule());
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

            // InternalAfvl.g:692:3: (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAfvl.g:693:4: otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) )
                    {
                    otherlv_13=(Token)match(input,27,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getStreamAccess().getBufferingKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_14, grammarAccess.getStreamAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:701:4: ( (lv_buffering_15_0= ruleBuffering ) )
                    // InternalAfvl.g:702:5: (lv_buffering_15_0= ruleBuffering )
                    {
                    // InternalAfvl.g:702:5: (lv_buffering_15_0= ruleBuffering )
                    // InternalAfvl.g:703:6: lv_buffering_15_0= ruleBuffering
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getBufferingBufferingEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_buffering_15_0=ruleBuffering();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStreamRule());
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

            // InternalAfvl.g:721:3: (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAfvl.g:722:4: otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) )
                    {
                    otherlv_16=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getStreamAccess().getThroughputKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,20,FOLLOW_27); 

                    				newLeafNode(otherlv_17, grammarAccess.getStreamAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:730:4: ( (lv_throughput_18_0= ruleThroughput ) )
                    // InternalAfvl.g:731:5: (lv_throughput_18_0= ruleThroughput )
                    {
                    // InternalAfvl.g:731:5: (lv_throughput_18_0= ruleThroughput )
                    // InternalAfvl.g:732:6: lv_throughput_18_0= ruleThroughput
                    {

                    						newCompositeNode(grammarAccess.getStreamAccess().getThroughputThroughputEnumRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_throughput_18_0=ruleThroughput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStreamRule());
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

            otherlv_19=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_19, grammarAccess.getStreamAccess().getRolesKeyword_9());
            		
            otherlv_20=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_20, grammarAccess.getStreamAccess().getColonKeyword_10());
            		
            otherlv_21=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_21, grammarAccess.getStreamAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalAfvl.g:762:3: ( (lv_roles_22_0= ruleRole ) )
            // InternalAfvl.g:763:4: (lv_roles_22_0= ruleRole )
            {
            // InternalAfvl.g:763:4: (lv_roles_22_0= ruleRole )
            // InternalAfvl.g:764:5: lv_roles_22_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getStreamAccess().getRolesRoleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalAfvl.g:781:3: (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAfvl.g:782:4: otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) )
            	    {
            	    otherlv_23=(Token)match(input,16,FOLLOW_29); 

            	    				newLeafNode(otherlv_23, grammarAccess.getStreamAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalAfvl.g:786:4: ( (lv_roles_24_0= ruleRole ) )
            	    // InternalAfvl.g:787:5: (lv_roles_24_0= ruleRole )
            	    {
            	    // InternalAfvl.g:787:5: (lv_roles_24_0= ruleRole )
            	    // InternalAfvl.g:788:6: lv_roles_24_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getStreamAccess().getRolesRoleParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_roles_24_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStreamRule());
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
            	    break loop14;
                }
            } while (true);

            otherlv_25=(Token)match(input,17,FOLLOW_30); 

            			newLeafNode(otherlv_25, grammarAccess.getStreamAccess().getRightCurlyBracketKeyword_14());
            		
            // InternalAfvl.g:810:3: (otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAfvl.g:811:4: otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) )
                    {
                    otherlv_26=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_26, grammarAccess.getStreamAccess().getSensitivityPointKeyword_15_0());
                    			
                    otherlv_27=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getStreamAccess().getColonKeyword_15_1());
                    			
                    // InternalAfvl.g:819:4: ( (otherlv_28= RULE_ID ) )
                    // InternalAfvl.g:820:5: (otherlv_28= RULE_ID )
                    {
                    // InternalAfvl.g:820:5: (otherlv_28= RULE_ID )
                    // InternalAfvl.g:821:6: otherlv_28= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStreamRule());
                    						}
                    					
                    otherlv_28=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_28, grammarAccess.getStreamAccess().getSpointSensitivityPointCrossReference_15_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_29=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getStreamAccess().getRightCurlyBracketKeyword_16());
            		

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
    // InternalAfvl.g:841:1: entryRuleAdaptor returns [EObject current=null] : iv_ruleAdaptor= ruleAdaptor EOF ;
    public final EObject entryRuleAdaptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptor = null;


        try {
            // InternalAfvl.g:841:48: (iv_ruleAdaptor= ruleAdaptor EOF )
            // InternalAfvl.g:842:2: iv_ruleAdaptor= ruleAdaptor EOF
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
    // InternalAfvl.g:848:1: ruleAdaptor returns [EObject current=null] : ( () otherlv_1= 'Adaptor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) )? ) (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= '{' ( (lv_roles_21_0= ruleRole ) ) (otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) ) )* otherlv_24= '}' (otherlv_25= 'sensitivityPoint' otherlv_26= ':' ( (otherlv_27= RULE_ID ) ) )? otherlv_28= '}' ) ;
    public final EObject ruleAdaptor() throws RecognitionException {
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
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Enumerator lv_delivery_6_0 = null;

        Enumerator lv_synct_9_0 = null;

        Enumerator lv_notification_12_0 = null;

        Enumerator lv_buffering_15_0 = null;

        Enumerator lv_throughput_18_0 = null;

        EObject lv_roles_21_0 = null;

        EObject lv_roles_23_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:854:2: ( ( () otherlv_1= 'Adaptor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) )? ) (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= '{' ( (lv_roles_21_0= ruleRole ) ) (otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) ) )* otherlv_24= '}' (otherlv_25= 'sensitivityPoint' otherlv_26= ':' ( (otherlv_27= RULE_ID ) ) )? otherlv_28= '}' ) )
            // InternalAfvl.g:855:2: ( () otherlv_1= 'Adaptor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) )? ) (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= '{' ( (lv_roles_21_0= ruleRole ) ) (otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) ) )* otherlv_24= '}' (otherlv_25= 'sensitivityPoint' otherlv_26= ':' ( (otherlv_27= RULE_ID ) ) )? otherlv_28= '}' )
            {
            // InternalAfvl.g:855:2: ( () otherlv_1= 'Adaptor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) )? ) (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= '{' ( (lv_roles_21_0= ruleRole ) ) (otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) ) )* otherlv_24= '}' (otherlv_25= 'sensitivityPoint' otherlv_26= ':' ( (otherlv_27= RULE_ID ) ) )? otherlv_28= '}' )
            // InternalAfvl.g:856:3: () otherlv_1= 'Adaptor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) )? ) (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= '{' ( (lv_roles_21_0= ruleRole ) ) (otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) ) )* otherlv_24= '}' (otherlv_25= 'sensitivityPoint' otherlv_26= ':' ( (otherlv_27= RULE_ID ) ) )? otherlv_28= '}'
            {
            // InternalAfvl.g:856:3: ()
            // InternalAfvl.g:857:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAdaptorAccess().getAdaptorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAdaptorAccess().getAdaptorKeyword_1());
            		
            // InternalAfvl.g:867:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAfvl.g:868:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAfvl.g:868:4: (lv_name_2_0= RULE_ID )
            // InternalAfvl.g:869:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAdaptorAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdaptorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getAdaptorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAfvl.g:889:3: (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) )? )
            // InternalAfvl.g:890:4: otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) )?
            {
            otherlv_4=(Token)match(input,24,FOLLOW_13); 

            				newLeafNode(otherlv_4, grammarAccess.getAdaptorAccess().getDeliveryKeyword_4_0());
            			
            otherlv_5=(Token)match(input,20,FOLLOW_32); 

            				newLeafNode(otherlv_5, grammarAccess.getAdaptorAccess().getColonKeyword_4_1());
            			
            // InternalAfvl.g:898:4: ( (lv_delivery_6_0= ruleDeliveryModel ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=46 && LA16_0<=49)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAfvl.g:899:5: (lv_delivery_6_0= ruleDeliveryModel )
                    {
                    // InternalAfvl.g:899:5: (lv_delivery_6_0= ruleDeliveryModel )
                    // InternalAfvl.g:900:6: lv_delivery_6_0= ruleDeliveryModel
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getDeliveryDeliveryModelEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_delivery_6_0=ruleDeliveryModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdaptorRule());
                    						}
                    						set(
                    							current,
                    							"delivery",
                    							lv_delivery_6_0,
                    							"co.edu.uniandes.accordant_fv.Afvl.DeliveryModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }


            }

            // InternalAfvl.g:918:3: (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAfvl.g:919:4: otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getAdaptorAccess().getSynctKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,20,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getAdaptorAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:927:4: ( (lv_synct_9_0= ruleSyncType ) )
                    // InternalAfvl.g:928:5: (lv_synct_9_0= ruleSyncType )
                    {
                    // InternalAfvl.g:928:5: (lv_synct_9_0= ruleSyncType )
                    // InternalAfvl.g:929:6: lv_synct_9_0= ruleSyncType
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getSynctSyncTypeEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_synct_9_0=ruleSyncType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdaptorRule());
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

            // InternalAfvl.g:947:3: (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAfvl.g:948:4: otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getAdaptorAccess().getNotificationKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,20,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getAdaptorAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:956:4: ( (lv_notification_12_0= ruleNotificationModel ) )
                    // InternalAfvl.g:957:5: (lv_notification_12_0= ruleNotificationModel )
                    {
                    // InternalAfvl.g:957:5: (lv_notification_12_0= ruleNotificationModel )
                    // InternalAfvl.g:958:6: lv_notification_12_0= ruleNotificationModel
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getNotificationNotificationModelEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_notification_12_0=ruleNotificationModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdaptorRule());
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

            // InternalAfvl.g:976:3: (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAfvl.g:977:4: otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) )
                    {
                    otherlv_13=(Token)match(input,27,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getAdaptorAccess().getBufferingKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_14, grammarAccess.getAdaptorAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:985:4: ( (lv_buffering_15_0= ruleBuffering ) )
                    // InternalAfvl.g:986:5: (lv_buffering_15_0= ruleBuffering )
                    {
                    // InternalAfvl.g:986:5: (lv_buffering_15_0= ruleBuffering )
                    // InternalAfvl.g:987:6: lv_buffering_15_0= ruleBuffering
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getBufferingBufferingEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_buffering_15_0=ruleBuffering();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdaptorRule());
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

            // InternalAfvl.g:1005:3: (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAfvl.g:1006:4: otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) )
                    {
                    otherlv_16=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getAdaptorAccess().getThroughputKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,20,FOLLOW_27); 

                    				newLeafNode(otherlv_17, grammarAccess.getAdaptorAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:1014:4: ( (lv_throughput_18_0= ruleThroughput ) )
                    // InternalAfvl.g:1015:5: (lv_throughput_18_0= ruleThroughput )
                    {
                    // InternalAfvl.g:1015:5: (lv_throughput_18_0= ruleThroughput )
                    // InternalAfvl.g:1016:6: lv_throughput_18_0= ruleThroughput
                    {

                    						newCompositeNode(grammarAccess.getAdaptorAccess().getThroughputThroughputEnumRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_throughput_18_0=ruleThroughput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdaptorRule());
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

            otherlv_19=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_19, grammarAccess.getAdaptorAccess().getRolesKeyword_9());
            		
            otherlv_20=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_20, grammarAccess.getAdaptorAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalAfvl.g:1042:3: ( (lv_roles_21_0= ruleRole ) )
            // InternalAfvl.g:1043:4: (lv_roles_21_0= ruleRole )
            {
            // InternalAfvl.g:1043:4: (lv_roles_21_0= ruleRole )
            // InternalAfvl.g:1044:5: lv_roles_21_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getAdaptorAccess().getRolesRoleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_9);
            lv_roles_21_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdaptorRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_21_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:1061:3: (otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAfvl.g:1062:4: otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) )
            	    {
            	    otherlv_22=(Token)match(input,16,FOLLOW_29); 

            	    				newLeafNode(otherlv_22, grammarAccess.getAdaptorAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalAfvl.g:1066:4: ( (lv_roles_23_0= ruleRole ) )
            	    // InternalAfvl.g:1067:5: (lv_roles_23_0= ruleRole )
            	    {
            	    // InternalAfvl.g:1067:5: (lv_roles_23_0= ruleRole )
            	    // InternalAfvl.g:1068:6: lv_roles_23_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getAdaptorAccess().getRolesRoleParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_roles_23_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdaptorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_23_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_24=(Token)match(input,17,FOLLOW_30); 

            			newLeafNode(otherlv_24, grammarAccess.getAdaptorAccess().getRightCurlyBracketKeyword_13());
            		
            // InternalAfvl.g:1090:3: (otherlv_25= 'sensitivityPoint' otherlv_26= ':' ( (otherlv_27= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAfvl.g:1091:4: otherlv_25= 'sensitivityPoint' otherlv_26= ':' ( (otherlv_27= RULE_ID ) )
                    {
                    otherlv_25=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_25, grammarAccess.getAdaptorAccess().getSensitivityPointKeyword_14_0());
                    			
                    otherlv_26=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_26, grammarAccess.getAdaptorAccess().getColonKeyword_14_1());
                    			
                    // InternalAfvl.g:1099:4: ( (otherlv_27= RULE_ID ) )
                    // InternalAfvl.g:1100:5: (otherlv_27= RULE_ID )
                    {
                    // InternalAfvl.g:1100:5: (otherlv_27= RULE_ID )
                    // InternalAfvl.g:1101:6: otherlv_27= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAdaptorRule());
                    						}
                    					
                    otherlv_27=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_27, grammarAccess.getAdaptorAccess().getSpointSensitivityPointCrossReference_14_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_28=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getAdaptorAccess().getRightCurlyBracketKeyword_15());
            		

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
    // InternalAfvl.g:1121:1: entryRuleDistributor returns [EObject current=null] : iv_ruleDistributor= ruleDistributor EOF ;
    public final EObject entryRuleDistributor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistributor = null;


        try {
            // InternalAfvl.g:1121:52: (iv_ruleDistributor= ruleDistributor EOF )
            // InternalAfvl.g:1122:2: iv_ruleDistributor= ruleDistributor EOF
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
    // InternalAfvl.g:1128:1: ruleDistributor returns [EObject current=null] : ( () otherlv_1= 'Distributor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'sync' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= '{' ( (lv_roles_21_0= ruleRole ) ) (otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) ) )* otherlv_24= '}' (otherlv_25= 'sensitivityPoint' otherlv_26= ':' ( (otherlv_27= RULE_ID ) ) )? otherlv_28= '}' ) ;
    public final EObject ruleDistributor() throws RecognitionException {
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
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Enumerator lv_delivery_6_0 = null;

        Enumerator lv_synct_9_0 = null;

        Enumerator lv_notification_12_0 = null;

        Enumerator lv_buffering_15_0 = null;

        Enumerator lv_throughput_18_0 = null;

        EObject lv_roles_21_0 = null;

        EObject lv_roles_23_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:1134:2: ( ( () otherlv_1= 'Distributor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'sync' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= '{' ( (lv_roles_21_0= ruleRole ) ) (otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) ) )* otherlv_24= '}' (otherlv_25= 'sensitivityPoint' otherlv_26= ':' ( (otherlv_27= RULE_ID ) ) )? otherlv_28= '}' ) )
            // InternalAfvl.g:1135:2: ( () otherlv_1= 'Distributor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'sync' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= '{' ( (lv_roles_21_0= ruleRole ) ) (otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) ) )* otherlv_24= '}' (otherlv_25= 'sensitivityPoint' otherlv_26= ':' ( (otherlv_27= RULE_ID ) ) )? otherlv_28= '}' )
            {
            // InternalAfvl.g:1135:2: ( () otherlv_1= 'Distributor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'sync' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= '{' ( (lv_roles_21_0= ruleRole ) ) (otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) ) )* otherlv_24= '}' (otherlv_25= 'sensitivityPoint' otherlv_26= ':' ( (otherlv_27= RULE_ID ) ) )? otherlv_28= '}' )
            // InternalAfvl.g:1136:3: () otherlv_1= 'Distributor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'sync' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= '{' ( (lv_roles_21_0= ruleRole ) ) (otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) ) )* otherlv_24= '}' (otherlv_25= 'sensitivityPoint' otherlv_26= ':' ( (otherlv_27= RULE_ID ) ) )? otherlv_28= '}'
            {
            // InternalAfvl.g:1136:3: ()
            // InternalAfvl.g:1137:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDistributorAccess().getDistributorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDistributorAccess().getDistributorKeyword_1());
            		
            // InternalAfvl.g:1147:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAfvl.g:1148:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAfvl.g:1148:4: (lv_name_2_0= RULE_ID )
            // InternalAfvl.g:1149:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDistributorAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDistributorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getDistributorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAfvl.g:1169:3: (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAfvl.g:1170:4: otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getDistributorAccess().getDeliveryKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getDistributorAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:1178:4: ( (lv_delivery_6_0= ruleDeliveryModel ) )
                    // InternalAfvl.g:1179:5: (lv_delivery_6_0= ruleDeliveryModel )
                    {
                    // InternalAfvl.g:1179:5: (lv_delivery_6_0= ruleDeliveryModel )
                    // InternalAfvl.g:1180:6: lv_delivery_6_0= ruleDeliveryModel
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getDeliveryDeliveryModelEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_delivery_6_0=ruleDeliveryModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistributorRule());
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

            // InternalAfvl.g:1198:3: (otherlv_7= 'sync' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAfvl.g:1199:4: otherlv_7= 'sync' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getDistributorAccess().getSyncKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,20,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getDistributorAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:1207:4: ( (lv_synct_9_0= ruleSyncType ) )
                    // InternalAfvl.g:1208:5: (lv_synct_9_0= ruleSyncType )
                    {
                    // InternalAfvl.g:1208:5: (lv_synct_9_0= ruleSyncType )
                    // InternalAfvl.g:1209:6: lv_synct_9_0= ruleSyncType
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getSynctSyncTypeEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_synct_9_0=ruleSyncType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistributorRule());
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

            // InternalAfvl.g:1227:3: (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAfvl.g:1228:4: otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getDistributorAccess().getNotificationKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,20,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getDistributorAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:1236:4: ( (lv_notification_12_0= ruleNotificationModel ) )
                    // InternalAfvl.g:1237:5: (lv_notification_12_0= ruleNotificationModel )
                    {
                    // InternalAfvl.g:1237:5: (lv_notification_12_0= ruleNotificationModel )
                    // InternalAfvl.g:1238:6: lv_notification_12_0= ruleNotificationModel
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getNotificationNotificationModelEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_notification_12_0=ruleNotificationModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistributorRule());
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

            // InternalAfvl.g:1256:3: (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAfvl.g:1257:4: otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) )
                    {
                    otherlv_13=(Token)match(input,27,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getDistributorAccess().getBufferingKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_14, grammarAccess.getDistributorAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:1265:4: ( (lv_buffering_15_0= ruleBuffering ) )
                    // InternalAfvl.g:1266:5: (lv_buffering_15_0= ruleBuffering )
                    {
                    // InternalAfvl.g:1266:5: (lv_buffering_15_0= ruleBuffering )
                    // InternalAfvl.g:1267:6: lv_buffering_15_0= ruleBuffering
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getBufferingBufferingEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_buffering_15_0=ruleBuffering();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistributorRule());
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

            // InternalAfvl.g:1285:3: (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAfvl.g:1286:4: otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) )
                    {
                    otherlv_16=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getDistributorAccess().getThroughputKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,20,FOLLOW_27); 

                    				newLeafNode(otherlv_17, grammarAccess.getDistributorAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:1294:4: ( (lv_throughput_18_0= ruleThroughput ) )
                    // InternalAfvl.g:1295:5: (lv_throughput_18_0= ruleThroughput )
                    {
                    // InternalAfvl.g:1295:5: (lv_throughput_18_0= ruleThroughput )
                    // InternalAfvl.g:1296:6: lv_throughput_18_0= ruleThroughput
                    {

                    						newCompositeNode(grammarAccess.getDistributorAccess().getThroughputThroughputEnumRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_throughput_18_0=ruleThroughput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistributorRule());
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

            otherlv_19=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_19, grammarAccess.getDistributorAccess().getRolesKeyword_9());
            		
            otherlv_20=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_20, grammarAccess.getDistributorAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalAfvl.g:1322:3: ( (lv_roles_21_0= ruleRole ) )
            // InternalAfvl.g:1323:4: (lv_roles_21_0= ruleRole )
            {
            // InternalAfvl.g:1323:4: (lv_roles_21_0= ruleRole )
            // InternalAfvl.g:1324:5: lv_roles_21_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getDistributorAccess().getRolesRoleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_9);
            lv_roles_21_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistributorRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_21_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:1341:3: (otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==16) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAfvl.g:1342:4: otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) )
            	    {
            	    otherlv_22=(Token)match(input,16,FOLLOW_29); 

            	    				newLeafNode(otherlv_22, grammarAccess.getDistributorAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalAfvl.g:1346:4: ( (lv_roles_23_0= ruleRole ) )
            	    // InternalAfvl.g:1347:5: (lv_roles_23_0= ruleRole )
            	    {
            	    // InternalAfvl.g:1347:5: (lv_roles_23_0= ruleRole )
            	    // InternalAfvl.g:1348:6: lv_roles_23_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getDistributorAccess().getRolesRoleParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_roles_23_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDistributorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_23_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_24=(Token)match(input,17,FOLLOW_30); 

            			newLeafNode(otherlv_24, grammarAccess.getDistributorAccess().getRightCurlyBracketKeyword_13());
            		
            // InternalAfvl.g:1370:3: (otherlv_25= 'sensitivityPoint' otherlv_26= ':' ( (otherlv_27= RULE_ID ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAfvl.g:1371:4: otherlv_25= 'sensitivityPoint' otherlv_26= ':' ( (otherlv_27= RULE_ID ) )
                    {
                    otherlv_25=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_25, grammarAccess.getDistributorAccess().getSensitivityPointKeyword_14_0());
                    			
                    otherlv_26=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_26, grammarAccess.getDistributorAccess().getColonKeyword_14_1());
                    			
                    // InternalAfvl.g:1379:4: ( (otherlv_27= RULE_ID ) )
                    // InternalAfvl.g:1380:5: (otherlv_27= RULE_ID )
                    {
                    // InternalAfvl.g:1380:5: (otherlv_27= RULE_ID )
                    // InternalAfvl.g:1381:6: otherlv_27= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDistributorRule());
                    						}
                    					
                    otherlv_27=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_27, grammarAccess.getDistributorAccess().getSpointSensitivityPointCrossReference_14_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_28=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getDistributorAccess().getRightCurlyBracketKeyword_15());
            		

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
    // InternalAfvl.g:1401:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalAfvl.g:1401:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalAfvl.g:1402:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalAfvl.g:1408:1: ruleEvent returns [EObject current=null] : ( () otherlv_1= 'Event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' (otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) ) )? otherlv_29= '}' ) ;
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
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Enumerator lv_delivery_6_0 = null;

        Enumerator lv_synct_9_0 = null;

        Enumerator lv_notification_12_0 = null;

        Enumerator lv_buffering_15_0 = null;

        Enumerator lv_throughput_18_0 = null;

        EObject lv_roles_22_0 = null;

        EObject lv_roles_24_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:1414:2: ( ( () otherlv_1= 'Event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' (otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) ) )? otherlv_29= '}' ) )
            // InternalAfvl.g:1415:2: ( () otherlv_1= 'Event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' (otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) ) )? otherlv_29= '}' )
            {
            // InternalAfvl.g:1415:2: ( () otherlv_1= 'Event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' (otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) ) )? otherlv_29= '}' )
            // InternalAfvl.g:1416:3: () otherlv_1= 'Event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' (otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) ) )? otherlv_29= '}'
            {
            // InternalAfvl.g:1416:3: ()
            // InternalAfvl.g:1417:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
            		
            // InternalAfvl.g:1427:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAfvl.g:1428:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAfvl.g:1428:4: (lv_name_2_0= RULE_ID )
            // InternalAfvl.g:1429:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAfvl.g:1449:3: (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==24) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAfvl.g:1450:4: otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getEventAccess().getDeliveryKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getEventAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:1458:4: ( (lv_delivery_6_0= ruleDeliveryModel ) )
                    // InternalAfvl.g:1459:5: (lv_delivery_6_0= ruleDeliveryModel )
                    {
                    // InternalAfvl.g:1459:5: (lv_delivery_6_0= ruleDeliveryModel )
                    // InternalAfvl.g:1460:6: lv_delivery_6_0= ruleDeliveryModel
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getDeliveryDeliveryModelEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
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

            // InternalAfvl.g:1478:3: (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==25) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAfvl.g:1479:4: otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getEventAccess().getSynctKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,20,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getEventAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:1487:4: ( (lv_synct_9_0= ruleSyncType ) )
                    // InternalAfvl.g:1488:5: (lv_synct_9_0= ruleSyncType )
                    {
                    // InternalAfvl.g:1488:5: (lv_synct_9_0= ruleSyncType )
                    // InternalAfvl.g:1489:6: lv_synct_9_0= ruleSyncType
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getSynctSyncTypeEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_22);
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

            // InternalAfvl.g:1507:3: (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAfvl.g:1508:4: otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getEventAccess().getNotificationKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,20,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getEventAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:1516:4: ( (lv_notification_12_0= ruleNotificationModel ) )
                    // InternalAfvl.g:1517:5: (lv_notification_12_0= ruleNotificationModel )
                    {
                    // InternalAfvl.g:1517:5: (lv_notification_12_0= ruleNotificationModel )
                    // InternalAfvl.g:1518:6: lv_notification_12_0= ruleNotificationModel
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getNotificationNotificationModelEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_24);
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

            // InternalAfvl.g:1536:3: (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAfvl.g:1537:4: otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) )
                    {
                    otherlv_13=(Token)match(input,27,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getEventAccess().getBufferingKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_14, grammarAccess.getEventAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:1545:4: ( (lv_buffering_15_0= ruleBuffering ) )
                    // InternalAfvl.g:1546:5: (lv_buffering_15_0= ruleBuffering )
                    {
                    // InternalAfvl.g:1546:5: (lv_buffering_15_0= ruleBuffering )
                    // InternalAfvl.g:1547:6: lv_buffering_15_0= ruleBuffering
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getBufferingBufferingEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_26);
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

            // InternalAfvl.g:1565:3: (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAfvl.g:1566:4: otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) )
                    {
                    otherlv_16=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getEventAccess().getThroughputKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,20,FOLLOW_27); 

                    				newLeafNode(otherlv_17, grammarAccess.getEventAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:1574:4: ( (lv_throughput_18_0= ruleThroughput ) )
                    // InternalAfvl.g:1575:5: (lv_throughput_18_0= ruleThroughput )
                    {
                    // InternalAfvl.g:1575:5: (lv_throughput_18_0= ruleThroughput )
                    // InternalAfvl.g:1576:6: lv_throughput_18_0= ruleThroughput
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getThroughputThroughputEnumRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

            otherlv_19=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_19, grammarAccess.getEventAccess().getRolesKeyword_9());
            		
            otherlv_20=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_20, grammarAccess.getEventAccess().getColonKeyword_10());
            		
            otherlv_21=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_21, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalAfvl.g:1606:3: ( (lv_roles_22_0= ruleRole ) )
            // InternalAfvl.g:1607:4: (lv_roles_22_0= ruleRole )
            {
            // InternalAfvl.g:1607:4: (lv_roles_22_0= ruleRole )
            // InternalAfvl.g:1608:5: lv_roles_22_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getEventAccess().getRolesRoleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalAfvl.g:1625:3: (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==16) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAfvl.g:1626:4: otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) )
            	    {
            	    otherlv_23=(Token)match(input,16,FOLLOW_29); 

            	    				newLeafNode(otherlv_23, grammarAccess.getEventAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalAfvl.g:1630:4: ( (lv_roles_24_0= ruleRole ) )
            	    // InternalAfvl.g:1631:5: (lv_roles_24_0= ruleRole )
            	    {
            	    // InternalAfvl.g:1631:5: (lv_roles_24_0= ruleRole )
            	    // InternalAfvl.g:1632:6: lv_roles_24_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getEventAccess().getRolesRoleParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
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
            	    break loop35;
                }
            } while (true);

            otherlv_25=(Token)match(input,17,FOLLOW_30); 

            			newLeafNode(otherlv_25, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_14());
            		
            // InternalAfvl.g:1654:3: (otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==30) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAfvl.g:1655:4: otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) )
                    {
                    otherlv_26=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_26, grammarAccess.getEventAccess().getSensitivityPointKeyword_15_0());
                    			
                    otherlv_27=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getEventAccess().getColonKeyword_15_1());
                    			
                    // InternalAfvl.g:1663:4: ( (otherlv_28= RULE_ID ) )
                    // InternalAfvl.g:1664:5: (otherlv_28= RULE_ID )
                    {
                    // InternalAfvl.g:1664:5: (otherlv_28= RULE_ID )
                    // InternalAfvl.g:1665:6: otherlv_28= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    					
                    otherlv_28=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_28, grammarAccess.getEventAccess().getSpointSensitivityPointCrossReference_15_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_29=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_16());
            		

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
    // InternalAfvl.g:1685:1: entryRuleProcedureCall returns [EObject current=null] : iv_ruleProcedureCall= ruleProcedureCall EOF ;
    public final EObject entryRuleProcedureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedureCall = null;


        try {
            // InternalAfvl.g:1685:54: (iv_ruleProcedureCall= ruleProcedureCall EOF )
            // InternalAfvl.g:1686:2: iv_ruleProcedureCall= ruleProcedureCall EOF
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
    // InternalAfvl.g:1692:1: ruleProcedureCall returns [EObject current=null] : ( () otherlv_1= 'ProcCall' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' (otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) ) )? otherlv_29= '}' ) ;
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
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Enumerator lv_delivery_6_0 = null;

        Enumerator lv_synct_9_0 = null;

        Enumerator lv_notification_12_0 = null;

        Enumerator lv_buffering_15_0 = null;

        Enumerator lv_throughput_18_0 = null;

        EObject lv_roles_22_0 = null;

        EObject lv_roles_24_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:1698:2: ( ( () otherlv_1= 'ProcCall' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' (otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) ) )? otherlv_29= '}' ) )
            // InternalAfvl.g:1699:2: ( () otherlv_1= 'ProcCall' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' (otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) ) )? otherlv_29= '}' )
            {
            // InternalAfvl.g:1699:2: ( () otherlv_1= 'ProcCall' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' (otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) ) )? otherlv_29= '}' )
            // InternalAfvl.g:1700:3: () otherlv_1= 'ProcCall' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )? (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )? (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )? (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )? (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )? otherlv_19= 'roles' otherlv_20= ':' otherlv_21= '{' ( (lv_roles_22_0= ruleRole ) ) (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )* otherlv_25= '}' (otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) ) )? otherlv_29= '}'
            {
            // InternalAfvl.g:1700:3: ()
            // InternalAfvl.g:1701:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProcedureCallAccess().getProcedureCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProcedureCallAccess().getProcCallKeyword_1());
            		
            // InternalAfvl.g:1711:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAfvl.g:1712:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAfvl.g:1712:4: (lv_name_2_0= RULE_ID )
            // InternalAfvl.g:1713:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getProcedureCallAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAfvl.g:1733:3: (otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==24) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAfvl.g:1734:4: otherlv_4= 'delivery' otherlv_5= ':' ( (lv_delivery_6_0= ruleDeliveryModel ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getProcedureCallAccess().getDeliveryKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getProcedureCallAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:1742:4: ( (lv_delivery_6_0= ruleDeliveryModel ) )
                    // InternalAfvl.g:1743:5: (lv_delivery_6_0= ruleDeliveryModel )
                    {
                    // InternalAfvl.g:1743:5: (lv_delivery_6_0= ruleDeliveryModel )
                    // InternalAfvl.g:1744:6: lv_delivery_6_0= ruleDeliveryModel
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getDeliveryDeliveryModelEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
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

            // InternalAfvl.g:1762:3: (otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==25) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAfvl.g:1763:4: otherlv_7= 'synct' otherlv_8= ':' ( (lv_synct_9_0= ruleSyncType ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getProcedureCallAccess().getSynctKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,20,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getProcedureCallAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:1771:4: ( (lv_synct_9_0= ruleSyncType ) )
                    // InternalAfvl.g:1772:5: (lv_synct_9_0= ruleSyncType )
                    {
                    // InternalAfvl.g:1772:5: (lv_synct_9_0= ruleSyncType )
                    // InternalAfvl.g:1773:6: lv_synct_9_0= ruleSyncType
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getSynctSyncTypeEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_22);
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

            // InternalAfvl.g:1791:3: (otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==26) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAfvl.g:1792:4: otherlv_10= 'notification' otherlv_11= ':' ( (lv_notification_12_0= ruleNotificationModel ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getProcedureCallAccess().getNotificationKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,20,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getProcedureCallAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:1800:4: ( (lv_notification_12_0= ruleNotificationModel ) )
                    // InternalAfvl.g:1801:5: (lv_notification_12_0= ruleNotificationModel )
                    {
                    // InternalAfvl.g:1801:5: (lv_notification_12_0= ruleNotificationModel )
                    // InternalAfvl.g:1802:6: lv_notification_12_0= ruleNotificationModel
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getNotificationNotificationModelEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_24);
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

            // InternalAfvl.g:1820:3: (otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==27) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAfvl.g:1821:4: otherlv_13= 'buffering' otherlv_14= ':' ( (lv_buffering_15_0= ruleBuffering ) )
                    {
                    otherlv_13=(Token)match(input,27,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getProcedureCallAccess().getBufferingKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_14, grammarAccess.getProcedureCallAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:1829:4: ( (lv_buffering_15_0= ruleBuffering ) )
                    // InternalAfvl.g:1830:5: (lv_buffering_15_0= ruleBuffering )
                    {
                    // InternalAfvl.g:1830:5: (lv_buffering_15_0= ruleBuffering )
                    // InternalAfvl.g:1831:6: lv_buffering_15_0= ruleBuffering
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getBufferingBufferingEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_26);
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

            // InternalAfvl.g:1849:3: (otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==28) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAfvl.g:1850:4: otherlv_16= 'throughput' otherlv_17= ':' ( (lv_throughput_18_0= ruleThroughput ) )
                    {
                    otherlv_16=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getProcedureCallAccess().getThroughputKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,20,FOLLOW_27); 

                    				newLeafNode(otherlv_17, grammarAccess.getProcedureCallAccess().getColonKeyword_8_1());
                    			
                    // InternalAfvl.g:1858:4: ( (lv_throughput_18_0= ruleThroughput ) )
                    // InternalAfvl.g:1859:5: (lv_throughput_18_0= ruleThroughput )
                    {
                    // InternalAfvl.g:1859:5: (lv_throughput_18_0= ruleThroughput )
                    // InternalAfvl.g:1860:6: lv_throughput_18_0= ruleThroughput
                    {

                    						newCompositeNode(grammarAccess.getProcedureCallAccess().getThroughputThroughputEnumRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

            otherlv_19=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_19, grammarAccess.getProcedureCallAccess().getRolesKeyword_9());
            		
            otherlv_20=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_20, grammarAccess.getProcedureCallAccess().getColonKeyword_10());
            		
            otherlv_21=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_21, grammarAccess.getProcedureCallAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalAfvl.g:1890:3: ( (lv_roles_22_0= ruleRole ) )
            // InternalAfvl.g:1891:4: (lv_roles_22_0= ruleRole )
            {
            // InternalAfvl.g:1891:4: (lv_roles_22_0= ruleRole )
            // InternalAfvl.g:1892:5: lv_roles_22_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getProcedureCallAccess().getRolesRoleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalAfvl.g:1909:3: (otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==16) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalAfvl.g:1910:4: otherlv_23= ',' ( (lv_roles_24_0= ruleRole ) )
            	    {
            	    otherlv_23=(Token)match(input,16,FOLLOW_29); 

            	    				newLeafNode(otherlv_23, grammarAccess.getProcedureCallAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalAfvl.g:1914:4: ( (lv_roles_24_0= ruleRole ) )
            	    // InternalAfvl.g:1915:5: (lv_roles_24_0= ruleRole )
            	    {
            	    // InternalAfvl.g:1915:5: (lv_roles_24_0= ruleRole )
            	    // InternalAfvl.g:1916:6: lv_roles_24_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getProcedureCallAccess().getRolesRoleParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
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
            	    break loop42;
                }
            } while (true);

            otherlv_25=(Token)match(input,17,FOLLOW_30); 

            			newLeafNode(otherlv_25, grammarAccess.getProcedureCallAccess().getRightCurlyBracketKeyword_14());
            		
            // InternalAfvl.g:1938:3: (otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==30) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAfvl.g:1939:4: otherlv_26= 'sensitivityPoint' otherlv_27= ':' ( (otherlv_28= RULE_ID ) )
                    {
                    otherlv_26=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_26, grammarAccess.getProcedureCallAccess().getSensitivityPointKeyword_15_0());
                    			
                    otherlv_27=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getProcedureCallAccess().getColonKeyword_15_1());
                    			
                    // InternalAfvl.g:1947:4: ( (otherlv_28= RULE_ID ) )
                    // InternalAfvl.g:1948:5: (otherlv_28= RULE_ID )
                    {
                    // InternalAfvl.g:1948:5: (otherlv_28= RULE_ID )
                    // InternalAfvl.g:1949:6: otherlv_28= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcedureCallRule());
                    						}
                    					
                    otherlv_28=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_28, grammarAccess.getProcedureCallAccess().getSpointSensitivityPointCrossReference_15_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_29=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getProcedureCallAccess().getRightCurlyBracketKeyword_16());
            		

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
    // InternalAfvl.g:1969:1: entryRuleTransformer returns [EObject current=null] : iv_ruleTransformer= ruleTransformer EOF ;
    public final EObject entryRuleTransformer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformer = null;


        try {
            // InternalAfvl.g:1969:52: (iv_ruleTransformer= ruleTransformer EOF )
            // InternalAfvl.g:1970:2: iv_ruleTransformer= ruleTransformer EOF
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
    // InternalAfvl.g:1976:1: ruleTransformer returns [EObject current=null] : (otherlv_0= 'Transformer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? (otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}' ) ;
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
            // InternalAfvl.g:1982:2: ( (otherlv_0= 'Transformer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? (otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}' ) )
            // InternalAfvl.g:1983:2: (otherlv_0= 'Transformer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? (otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}' )
            {
            // InternalAfvl.g:1983:2: (otherlv_0= 'Transformer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? (otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}' )
            // InternalAfvl.g:1984:3: otherlv_0= 'Transformer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? (otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransformerAccess().getTransformerKeyword_0());
            		
            // InternalAfvl.g:1988:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:1989:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:1989:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:1990:5: lv_name_1_0= RULE_ID
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
            		
            // InternalAfvl.g:2010:3: (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==37) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAfvl.g:2011:4: otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransformerAccess().getProcModelKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransformerAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:2019:4: ( (lv_procModel_5_0= ruleProcessingModel ) )
                    // InternalAfvl.g:2020:5: (lv_procModel_5_0= ruleProcessingModel )
                    {
                    // InternalAfvl.g:2020:5: (lv_procModel_5_0= ruleProcessingModel )
                    // InternalAfvl.g:2021:6: lv_procModel_5_0= ruleProcessingModel
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

            // InternalAfvl.g:2039:3: (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==38) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAfvl.g:2040:4: otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getTransformerAccess().getPmmlKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_38); 

                    				newLeafNode(otherlv_7, grammarAccess.getTransformerAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:2048:4: ( (lv_pmml_8_0= ruleEString ) )
                    // InternalAfvl.g:2049:5: (lv_pmml_8_0= ruleEString )
                    {
                    // InternalAfvl.g:2049:5: (lv_pmml_8_0= ruleEString )
                    // InternalAfvl.g:2050:6: lv_pmml_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTransformerAccess().getPmmlEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_39);
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

            // InternalAfvl.g:2068:3: (otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==30) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAfvl.g:2069:4: otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getTransformerAccess().getSensitivityPointKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getTransformerAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:2077:4: ( (otherlv_11= RULE_ID ) )
                    // InternalAfvl.g:2078:5: (otherlv_11= RULE_ID )
                    {
                    // InternalAfvl.g:2078:5: (otherlv_11= RULE_ID )
                    // InternalAfvl.g:2079:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransformerRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_40); 

                    						newLeafNode(otherlv_11, grammarAccess.getTransformerAccess().getSpointSensitivityPointCrossReference_5_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getTransformerAccess().getPortsKeyword_6());
            		
            otherlv_13=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_13, grammarAccess.getTransformerAccess().getColonKeyword_7());
            		
            otherlv_14=(Token)match(input,14,FOLLOW_41); 

            			newLeafNode(otherlv_14, grammarAccess.getTransformerAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalAfvl.g:2103:3: ( (lv_ports_15_0= rulePort ) )
            // InternalAfvl.g:2104:4: (lv_ports_15_0= rulePort )
            {
            // InternalAfvl.g:2104:4: (lv_ports_15_0= rulePort )
            // InternalAfvl.g:2105:5: lv_ports_15_0= rulePort
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

            // InternalAfvl.g:2122:3: (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==16) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalAfvl.g:2123:4: otherlv_16= ',' ( (lv_ports_17_0= rulePort ) )
            	    {
            	    otherlv_16=(Token)match(input,16,FOLLOW_41); 

            	    				newLeafNode(otherlv_16, grammarAccess.getTransformerAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalAfvl.g:2127:4: ( (lv_ports_17_0= rulePort ) )
            	    // InternalAfvl.g:2128:5: (lv_ports_17_0= rulePort )
            	    {
            	    // InternalAfvl.g:2128:5: (lv_ports_17_0= rulePort )
            	    // InternalAfvl.g:2129:6: lv_ports_17_0= rulePort
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
            	    break loop47;
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
    // InternalAfvl.g:2159:1: entryRuleEstimator returns [EObject current=null] : iv_ruleEstimator= ruleEstimator EOF ;
    public final EObject entryRuleEstimator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEstimator = null;


        try {
            // InternalAfvl.g:2159:50: (iv_ruleEstimator= ruleEstimator EOF )
            // InternalAfvl.g:2160:2: iv_ruleEstimator= ruleEstimator EOF
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
    // InternalAfvl.g:2166:1: ruleEstimator returns [EObject current=null] : (otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? (otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}' ) ;
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
            // InternalAfvl.g:2172:2: ( (otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? (otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}' ) )
            // InternalAfvl.g:2173:2: (otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? (otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}' )
            {
            // InternalAfvl.g:2173:2: (otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? (otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}' )
            // InternalAfvl.g:2174:3: otherlv_0= 'Estimator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )? (otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEstimatorAccess().getEstimatorKeyword_0());
            		
            // InternalAfvl.g:2178:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:2179:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:2179:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:2180:5: lv_name_1_0= RULE_ID
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
            		
            // InternalAfvl.g:2200:3: (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==37) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAfvl.g:2201:4: otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getEstimatorAccess().getProcModelKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getEstimatorAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:2209:4: ( (lv_procModel_5_0= ruleProcessingModel ) )
                    // InternalAfvl.g:2210:5: (lv_procModel_5_0= ruleProcessingModel )
                    {
                    // InternalAfvl.g:2210:5: (lv_procModel_5_0= ruleProcessingModel )
                    // InternalAfvl.g:2211:6: lv_procModel_5_0= ruleProcessingModel
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

            // InternalAfvl.g:2229:3: (otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==38) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAfvl.g:2230:4: otherlv_6= 'pmml' otherlv_7= ':' ( (lv_pmml_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getEstimatorAccess().getPmmlKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_38); 

                    				newLeafNode(otherlv_7, grammarAccess.getEstimatorAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:2238:4: ( (lv_pmml_8_0= ruleEString ) )
                    // InternalAfvl.g:2239:5: (lv_pmml_8_0= ruleEString )
                    {
                    // InternalAfvl.g:2239:5: (lv_pmml_8_0= ruleEString )
                    // InternalAfvl.g:2240:6: lv_pmml_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEstimatorAccess().getPmmlEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_39);
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

            // InternalAfvl.g:2258:3: (otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==30) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAfvl.g:2259:4: otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getEstimatorAccess().getSensitivityPointKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getEstimatorAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:2267:4: ( (otherlv_11= RULE_ID ) )
                    // InternalAfvl.g:2268:5: (otherlv_11= RULE_ID )
                    {
                    // InternalAfvl.g:2268:5: (otherlv_11= RULE_ID )
                    // InternalAfvl.g:2269:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEstimatorRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_40); 

                    						newLeafNode(otherlv_11, grammarAccess.getEstimatorAccess().getSpointSensitivityPointCrossReference_5_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getEstimatorAccess().getPortsKeyword_6());
            		
            otherlv_13=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_13, grammarAccess.getEstimatorAccess().getColonKeyword_7());
            		
            otherlv_14=(Token)match(input,14,FOLLOW_41); 

            			newLeafNode(otherlv_14, grammarAccess.getEstimatorAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalAfvl.g:2293:3: ( (lv_ports_15_0= rulePort ) )
            // InternalAfvl.g:2294:4: (lv_ports_15_0= rulePort )
            {
            // InternalAfvl.g:2294:4: (lv_ports_15_0= rulePort )
            // InternalAfvl.g:2295:5: lv_ports_15_0= rulePort
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

            // InternalAfvl.g:2312:3: (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==16) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalAfvl.g:2313:4: otherlv_16= ',' ( (lv_ports_17_0= rulePort ) )
            	    {
            	    otherlv_16=(Token)match(input,16,FOLLOW_41); 

            	    				newLeafNode(otherlv_16, grammarAccess.getEstimatorAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalAfvl.g:2317:4: ( (lv_ports_17_0= rulePort ) )
            	    // InternalAfvl.g:2318:5: (lv_ports_17_0= rulePort )
            	    {
            	    // InternalAfvl.g:2318:5: (lv_ports_17_0= rulePort )
            	    // InternalAfvl.g:2319:6: lv_ports_17_0= rulePort
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
            	    break loop51;
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
    // InternalAfvl.g:2349:1: entryRuleIngestor returns [EObject current=null] : iv_ruleIngestor= ruleIngestor EOF ;
    public final EObject entryRuleIngestor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngestor = null;


        try {
            // InternalAfvl.g:2349:49: (iv_ruleIngestor= ruleIngestor EOF )
            // InternalAfvl.g:2350:2: iv_ruleIngestor= ruleIngestor EOF
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
    // InternalAfvl.g:2356:1: ruleIngestor returns [EObject current=null] : (otherlv_0= 'Ingestor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )? (otherlv_9= 'format' otherlv_10= ':' ( (lv_format_11_0= ruleEString ) ) )? (otherlv_12= 'props' otherlv_13= ':' ( (lv_props_14_0= ruleEString ) ) )? (otherlv_15= 'sensitivityPoint' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? otherlv_18= 'ports' otherlv_19= ':' otherlv_20= '{' ( (lv_ports_21_0= rulePort ) ) (otherlv_22= ',' ( (lv_ports_23_0= rulePort ) ) )* otherlv_24= '}' otherlv_25= '}' ) ;
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
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Enumerator lv_procModel_5_0 = null;

        AntlrDatatypeRuleToken lv_conn_8_0 = null;

        AntlrDatatypeRuleToken lv_format_11_0 = null;

        AntlrDatatypeRuleToken lv_props_14_0 = null;

        EObject lv_ports_21_0 = null;

        EObject lv_ports_23_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:2362:2: ( (otherlv_0= 'Ingestor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )? (otherlv_9= 'format' otherlv_10= ':' ( (lv_format_11_0= ruleEString ) ) )? (otherlv_12= 'props' otherlv_13= ':' ( (lv_props_14_0= ruleEString ) ) )? (otherlv_15= 'sensitivityPoint' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? otherlv_18= 'ports' otherlv_19= ':' otherlv_20= '{' ( (lv_ports_21_0= rulePort ) ) (otherlv_22= ',' ( (lv_ports_23_0= rulePort ) ) )* otherlv_24= '}' otherlv_25= '}' ) )
            // InternalAfvl.g:2363:2: (otherlv_0= 'Ingestor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )? (otherlv_9= 'format' otherlv_10= ':' ( (lv_format_11_0= ruleEString ) ) )? (otherlv_12= 'props' otherlv_13= ':' ( (lv_props_14_0= ruleEString ) ) )? (otherlv_15= 'sensitivityPoint' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? otherlv_18= 'ports' otherlv_19= ':' otherlv_20= '{' ( (lv_ports_21_0= rulePort ) ) (otherlv_22= ',' ( (lv_ports_23_0= rulePort ) ) )* otherlv_24= '}' otherlv_25= '}' )
            {
            // InternalAfvl.g:2363:2: (otherlv_0= 'Ingestor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )? (otherlv_9= 'format' otherlv_10= ':' ( (lv_format_11_0= ruleEString ) ) )? (otherlv_12= 'props' otherlv_13= ':' ( (lv_props_14_0= ruleEString ) ) )? (otherlv_15= 'sensitivityPoint' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? otherlv_18= 'ports' otherlv_19= ':' otherlv_20= '{' ( (lv_ports_21_0= rulePort ) ) (otherlv_22= ',' ( (lv_ports_23_0= rulePort ) ) )* otherlv_24= '}' otherlv_25= '}' )
            // InternalAfvl.g:2364:3: otherlv_0= 'Ingestor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )? (otherlv_9= 'format' otherlv_10= ':' ( (lv_format_11_0= ruleEString ) ) )? (otherlv_12= 'props' otherlv_13= ':' ( (lv_props_14_0= ruleEString ) ) )? (otherlv_15= 'sensitivityPoint' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? otherlv_18= 'ports' otherlv_19= ':' otherlv_20= '{' ( (lv_ports_21_0= rulePort ) ) (otherlv_22= ',' ( (lv_ports_23_0= rulePort ) ) )* otherlv_24= '}' otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIngestorAccess().getIngestorKeyword_0());
            		
            // InternalAfvl.g:2368:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:2369:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:2369:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:2370:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getIngestorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:2390:3: (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==37) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAfvl.g:2391:4: otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getIngestorAccess().getProcModelKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getIngestorAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:2399:4: ( (lv_procModel_5_0= ruleProcessingModel ) )
                    // InternalAfvl.g:2400:5: (lv_procModel_5_0= ruleProcessingModel )
                    {
                    // InternalAfvl.g:2400:5: (lv_procModel_5_0= ruleProcessingModel )
                    // InternalAfvl.g:2401:6: lv_procModel_5_0= ruleProcessingModel
                    {

                    						newCompositeNode(grammarAccess.getIngestorAccess().getProcModelProcessingModelEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_43);
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

            // InternalAfvl.g:2419:3: (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==42) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalAfvl.g:2420:4: otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,42,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getIngestorAccess().getConnKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_38); 

                    				newLeafNode(otherlv_7, grammarAccess.getIngestorAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:2428:4: ( (lv_conn_8_0= ruleEString ) )
                    // InternalAfvl.g:2429:5: (lv_conn_8_0= ruleEString )
                    {
                    // InternalAfvl.g:2429:5: (lv_conn_8_0= ruleEString )
                    // InternalAfvl.g:2430:6: lv_conn_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIngestorAccess().getConnEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_44);
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

            // InternalAfvl.g:2448:3: (otherlv_9= 'format' otherlv_10= ':' ( (lv_format_11_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==43) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAfvl.g:2449:4: otherlv_9= 'format' otherlv_10= ':' ( (lv_format_11_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,43,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getIngestorAccess().getFormatKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_38); 

                    				newLeafNode(otherlv_10, grammarAccess.getIngestorAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:2457:4: ( (lv_format_11_0= ruleEString ) )
                    // InternalAfvl.g:2458:5: (lv_format_11_0= ruleEString )
                    {
                    // InternalAfvl.g:2458:5: (lv_format_11_0= ruleEString )
                    // InternalAfvl.g:2459:6: lv_format_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIngestorAccess().getFormatEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_45);
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

            // InternalAfvl.g:2477:3: (otherlv_12= 'props' otherlv_13= ':' ( (lv_props_14_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==44) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalAfvl.g:2478:4: otherlv_12= 'props' otherlv_13= ':' ( (lv_props_14_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,44,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getIngestorAccess().getPropsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_38); 

                    				newLeafNode(otherlv_13, grammarAccess.getIngestorAccess().getColonKeyword_6_1());
                    			
                    // InternalAfvl.g:2486:4: ( (lv_props_14_0= ruleEString ) )
                    // InternalAfvl.g:2487:5: (lv_props_14_0= ruleEString )
                    {
                    // InternalAfvl.g:2487:5: (lv_props_14_0= ruleEString )
                    // InternalAfvl.g:2488:6: lv_props_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIngestorAccess().getPropsEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_39);
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

            // InternalAfvl.g:2506:3: (otherlv_15= 'sensitivityPoint' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==30) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalAfvl.g:2507:4: otherlv_15= 'sensitivityPoint' otherlv_16= ':' ( (otherlv_17= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getIngestorAccess().getSensitivityPointKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getIngestorAccess().getColonKeyword_7_1());
                    			
                    // InternalAfvl.g:2515:4: ( (otherlv_17= RULE_ID ) )
                    // InternalAfvl.g:2516:5: (otherlv_17= RULE_ID )
                    {
                    // InternalAfvl.g:2516:5: (otherlv_17= RULE_ID )
                    // InternalAfvl.g:2517:6: otherlv_17= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIngestorRule());
                    						}
                    					
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_40); 

                    						newLeafNode(otherlv_17, grammarAccess.getIngestorAccess().getSpointSensitivityPointCrossReference_7_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_18, grammarAccess.getIngestorAccess().getPortsKeyword_8());
            		
            otherlv_19=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_19, grammarAccess.getIngestorAccess().getColonKeyword_9());
            		
            otherlv_20=(Token)match(input,14,FOLLOW_41); 

            			newLeafNode(otherlv_20, grammarAccess.getIngestorAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalAfvl.g:2541:3: ( (lv_ports_21_0= rulePort ) )
            // InternalAfvl.g:2542:4: (lv_ports_21_0= rulePort )
            {
            // InternalAfvl.g:2542:4: (lv_ports_21_0= rulePort )
            // InternalAfvl.g:2543:5: lv_ports_21_0= rulePort
            {

            					newCompositeNode(grammarAccess.getIngestorAccess().getPortsPortParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_9);
            lv_ports_21_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIngestorRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_21_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:2560:3: (otherlv_22= ',' ( (lv_ports_23_0= rulePort ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==16) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalAfvl.g:2561:4: otherlv_22= ',' ( (lv_ports_23_0= rulePort ) )
            	    {
            	    otherlv_22=(Token)match(input,16,FOLLOW_41); 

            	    				newLeafNode(otherlv_22, grammarAccess.getIngestorAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalAfvl.g:2565:4: ( (lv_ports_23_0= rulePort ) )
            	    // InternalAfvl.g:2566:5: (lv_ports_23_0= rulePort )
            	    {
            	    // InternalAfvl.g:2566:5: (lv_ports_23_0= rulePort )
            	    // InternalAfvl.g:2567:6: lv_ports_23_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getIngestorAccess().getPortsPortParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_ports_23_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIngestorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_23_0,
            	    							"co.edu.uniandes.accordant_fv.Afvl.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            otherlv_24=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_24, grammarAccess.getIngestorAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_25=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getIngestorAccess().getRightCurlyBracketKeyword_14());
            		

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
    // InternalAfvl.g:2597:1: entryRuleSink returns [EObject current=null] : iv_ruleSink= ruleSink EOF ;
    public final EObject entryRuleSink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSink = null;


        try {
            // InternalAfvl.g:2597:45: (iv_ruleSink= ruleSink EOF )
            // InternalAfvl.g:2598:2: iv_ruleSink= ruleSink EOF
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
    // InternalAfvl.g:2604:1: ruleSink returns [EObject current=null] : (otherlv_0= 'Sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )? (otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}' ) ;
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
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Enumerator lv_procModel_5_0 = null;

        AntlrDatatypeRuleToken lv_conn_8_0 = null;

        EObject lv_ports_15_0 = null;

        EObject lv_ports_17_0 = null;



        	enterRule();

        try {
            // InternalAfvl.g:2610:2: ( (otherlv_0= 'Sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )? (otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}' ) )
            // InternalAfvl.g:2611:2: (otherlv_0= 'Sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )? (otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}' )
            {
            // InternalAfvl.g:2611:2: (otherlv_0= 'Sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )? (otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}' )
            // InternalAfvl.g:2612:3: otherlv_0= 'Sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )? (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )? (otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'ports' otherlv_13= ':' otherlv_14= '{' ( (lv_ports_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )* otherlv_18= '}' otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSinkAccess().getSinkKeyword_0());
            		
            // InternalAfvl.g:2616:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAfvl.g:2617:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAfvl.g:2617:4: (lv_name_1_0= RULE_ID )
            // InternalAfvl.g:2618:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getSinkAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAfvl.g:2638:3: (otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==37) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAfvl.g:2639:4: otherlv_3= 'procModel' otherlv_4= ':' ( (lv_procModel_5_0= ruleProcessingModel ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getSinkAccess().getProcModelKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getSinkAccess().getColonKeyword_3_1());
                    			
                    // InternalAfvl.g:2647:4: ( (lv_procModel_5_0= ruleProcessingModel ) )
                    // InternalAfvl.g:2648:5: (lv_procModel_5_0= ruleProcessingModel )
                    {
                    // InternalAfvl.g:2648:5: (lv_procModel_5_0= ruleProcessingModel )
                    // InternalAfvl.g:2649:6: lv_procModel_5_0= ruleProcessingModel
                    {

                    						newCompositeNode(grammarAccess.getSinkAccess().getProcModelProcessingModelEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_47);
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

            // InternalAfvl.g:2667:3: (otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==42) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalAfvl.g:2668:4: otherlv_6= 'conn' otherlv_7= ':' ( (lv_conn_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,42,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getSinkAccess().getConnKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_38); 

                    				newLeafNode(otherlv_7, grammarAccess.getSinkAccess().getColonKeyword_4_1());
                    			
                    // InternalAfvl.g:2676:4: ( (lv_conn_8_0= ruleEString ) )
                    // InternalAfvl.g:2677:5: (lv_conn_8_0= ruleEString )
                    {
                    // InternalAfvl.g:2677:5: (lv_conn_8_0= ruleEString )
                    // InternalAfvl.g:2678:6: lv_conn_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSinkAccess().getConnEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_39);
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

            // InternalAfvl.g:2696:3: (otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==30) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalAfvl.g:2697:4: otherlv_9= 'sensitivityPoint' otherlv_10= ':' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getSinkAccess().getSensitivityPointKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getSinkAccess().getColonKeyword_5_1());
                    			
                    // InternalAfvl.g:2705:4: ( (otherlv_11= RULE_ID ) )
                    // InternalAfvl.g:2706:5: (otherlv_11= RULE_ID )
                    {
                    // InternalAfvl.g:2706:5: (otherlv_11= RULE_ID )
                    // InternalAfvl.g:2707:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSinkRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_40); 

                    						newLeafNode(otherlv_11, grammarAccess.getSinkAccess().getSpointSensitivityPointCrossReference_5_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getSinkAccess().getPortsKeyword_6());
            		
            otherlv_13=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_13, grammarAccess.getSinkAccess().getColonKeyword_7());
            		
            otherlv_14=(Token)match(input,14,FOLLOW_41); 

            			newLeafNode(otherlv_14, grammarAccess.getSinkAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalAfvl.g:2731:3: ( (lv_ports_15_0= rulePort ) )
            // InternalAfvl.g:2732:4: (lv_ports_15_0= rulePort )
            {
            // InternalAfvl.g:2732:4: (lv_ports_15_0= rulePort )
            // InternalAfvl.g:2733:5: lv_ports_15_0= rulePort
            {

            					newCompositeNode(grammarAccess.getSinkAccess().getPortsPortParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_ports_15_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSinkRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_15_0,
            						"co.edu.uniandes.accordant_fv.Afvl.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAfvl.g:2750:3: (otherlv_16= ',' ( (lv_ports_17_0= rulePort ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==16) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalAfvl.g:2751:4: otherlv_16= ',' ( (lv_ports_17_0= rulePort ) )
            	    {
            	    otherlv_16=(Token)match(input,16,FOLLOW_41); 

            	    				newLeafNode(otherlv_16, grammarAccess.getSinkAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalAfvl.g:2755:4: ( (lv_ports_17_0= rulePort ) )
            	    // InternalAfvl.g:2756:5: (lv_ports_17_0= rulePort )
            	    {
            	    // InternalAfvl.g:2756:5: (lv_ports_17_0= rulePort )
            	    // InternalAfvl.g:2757:6: lv_ports_17_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getSinkAccess().getPortsPortParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_ports_17_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSinkRule());
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
            	    break loop61;
                }
            } while (true);

            otherlv_18=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_18, grammarAccess.getSinkAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_19=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getSinkAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalAfvl.g:2787:1: ruleDeliveryModel returns [Enumerator current=null] : ( (enumLiteral_0= 'BEST_EFFORT' ) | (enumLiteral_1= 'AT_LEAST_ONE' ) | (enumLiteral_2= 'AT_MOST_ONE' ) | (enumLiteral_3= 'EXACTLY_ONE' ) ) ;
    public final Enumerator ruleDeliveryModel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAfvl.g:2793:2: ( ( (enumLiteral_0= 'BEST_EFFORT' ) | (enumLiteral_1= 'AT_LEAST_ONE' ) | (enumLiteral_2= 'AT_MOST_ONE' ) | (enumLiteral_3= 'EXACTLY_ONE' ) ) )
            // InternalAfvl.g:2794:2: ( (enumLiteral_0= 'BEST_EFFORT' ) | (enumLiteral_1= 'AT_LEAST_ONE' ) | (enumLiteral_2= 'AT_MOST_ONE' ) | (enumLiteral_3= 'EXACTLY_ONE' ) )
            {
            // InternalAfvl.g:2794:2: ( (enumLiteral_0= 'BEST_EFFORT' ) | (enumLiteral_1= 'AT_LEAST_ONE' ) | (enumLiteral_2= 'AT_MOST_ONE' ) | (enumLiteral_3= 'EXACTLY_ONE' ) )
            int alt62=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt62=1;
                }
                break;
            case 47:
                {
                alt62=2;
                }
                break;
            case 48:
                {
                alt62=3;
                }
                break;
            case 49:
                {
                alt62=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalAfvl.g:2795:3: (enumLiteral_0= 'BEST_EFFORT' )
                    {
                    // InternalAfvl.g:2795:3: (enumLiteral_0= 'BEST_EFFORT' )
                    // InternalAfvl.g:2796:4: enumLiteral_0= 'BEST_EFFORT'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getDeliveryModelAccess().getBEST_EFFORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDeliveryModelAccess().getBEST_EFFORTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:2803:3: (enumLiteral_1= 'AT_LEAST_ONE' )
                    {
                    // InternalAfvl.g:2803:3: (enumLiteral_1= 'AT_LEAST_ONE' )
                    // InternalAfvl.g:2804:4: enumLiteral_1= 'AT_LEAST_ONE'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getDeliveryModelAccess().getAT_LEAST_ONEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDeliveryModelAccess().getAT_LEAST_ONEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAfvl.g:2811:3: (enumLiteral_2= 'AT_MOST_ONE' )
                    {
                    // InternalAfvl.g:2811:3: (enumLiteral_2= 'AT_MOST_ONE' )
                    // InternalAfvl.g:2812:4: enumLiteral_2= 'AT_MOST_ONE'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getDeliveryModelAccess().getAT_MOST_ONEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDeliveryModelAccess().getAT_MOST_ONEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAfvl.g:2819:3: (enumLiteral_3= 'EXACTLY_ONE' )
                    {
                    // InternalAfvl.g:2819:3: (enumLiteral_3= 'EXACTLY_ONE' )
                    // InternalAfvl.g:2820:4: enumLiteral_3= 'EXACTLY_ONE'
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
    // InternalAfvl.g:2830:1: ruleSyncType returns [Enumerator current=null] : ( (enumLiteral_0= 'ASYNC' ) | (enumLiteral_1= 'SYNC' ) ) ;
    public final Enumerator ruleSyncType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:2836:2: ( ( (enumLiteral_0= 'ASYNC' ) | (enumLiteral_1= 'SYNC' ) ) )
            // InternalAfvl.g:2837:2: ( (enumLiteral_0= 'ASYNC' ) | (enumLiteral_1= 'SYNC' ) )
            {
            // InternalAfvl.g:2837:2: ( (enumLiteral_0= 'ASYNC' ) | (enumLiteral_1= 'SYNC' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==50) ) {
                alt63=1;
            }
            else if ( (LA63_0==51) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalAfvl.g:2838:3: (enumLiteral_0= 'ASYNC' )
                    {
                    // InternalAfvl.g:2838:3: (enumLiteral_0= 'ASYNC' )
                    // InternalAfvl.g:2839:4: enumLiteral_0= 'ASYNC'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getSyncTypeAccess().getASYNCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSyncTypeAccess().getASYNCEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:2846:3: (enumLiteral_1= 'SYNC' )
                    {
                    // InternalAfvl.g:2846:3: (enumLiteral_1= 'SYNC' )
                    // InternalAfvl.g:2847:4: enumLiteral_1= 'SYNC'
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
    // InternalAfvl.g:2857:1: rulePortType returns [Enumerator current=null] : ( (enumLiteral_0= 'REQUIRED' ) | (enumLiteral_1= 'PROVIDED' ) ) ;
    public final Enumerator rulePortType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:2863:2: ( ( (enumLiteral_0= 'REQUIRED' ) | (enumLiteral_1= 'PROVIDED' ) ) )
            // InternalAfvl.g:2864:2: ( (enumLiteral_0= 'REQUIRED' ) | (enumLiteral_1= 'PROVIDED' ) )
            {
            // InternalAfvl.g:2864:2: ( (enumLiteral_0= 'REQUIRED' ) | (enumLiteral_1= 'PROVIDED' ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==52) ) {
                alt64=1;
            }
            else if ( (LA64_0==53) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalAfvl.g:2865:3: (enumLiteral_0= 'REQUIRED' )
                    {
                    // InternalAfvl.g:2865:3: (enumLiteral_0= 'REQUIRED' )
                    // InternalAfvl.g:2866:4: enumLiteral_0= 'REQUIRED'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getPortTypeAccess().getREQUIREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPortTypeAccess().getREQUIREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:2873:3: (enumLiteral_1= 'PROVIDED' )
                    {
                    // InternalAfvl.g:2873:3: (enumLiteral_1= 'PROVIDED' )
                    // InternalAfvl.g:2874:4: enumLiteral_1= 'PROVIDED'
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
    // InternalAfvl.g:2884:1: ruleRoleType returns [Enumerator current=null] : ( (enumLiteral_0= 'OUT' ) | (enumLiteral_1= 'IN' ) ) ;
    public final Enumerator ruleRoleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:2890:2: ( ( (enumLiteral_0= 'OUT' ) | (enumLiteral_1= 'IN' ) ) )
            // InternalAfvl.g:2891:2: ( (enumLiteral_0= 'OUT' ) | (enumLiteral_1= 'IN' ) )
            {
            // InternalAfvl.g:2891:2: ( (enumLiteral_0= 'OUT' ) | (enumLiteral_1= 'IN' ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==54) ) {
                alt65=1;
            }
            else if ( (LA65_0==55) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalAfvl.g:2892:3: (enumLiteral_0= 'OUT' )
                    {
                    // InternalAfvl.g:2892:3: (enumLiteral_0= 'OUT' )
                    // InternalAfvl.g:2893:4: enumLiteral_0= 'OUT'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getOUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRoleTypeAccess().getOUTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:2900:3: (enumLiteral_1= 'IN' )
                    {
                    // InternalAfvl.g:2900:3: (enumLiteral_1= 'IN' )
                    // InternalAfvl.g:2901:4: enumLiteral_1= 'IN'
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
    // InternalAfvl.g:2911:1: ruleNotificationModel returns [Enumerator current=null] : ( (enumLiteral_0= 'POLLED' ) | (enumLiteral_1= 'PUBSUB' ) | (enumLiteral_2= 'QUEUED' ) | (enumLiteral_3= 'CENTRAL' ) ) ;
    public final Enumerator ruleNotificationModel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAfvl.g:2917:2: ( ( (enumLiteral_0= 'POLLED' ) | (enumLiteral_1= 'PUBSUB' ) | (enumLiteral_2= 'QUEUED' ) | (enumLiteral_3= 'CENTRAL' ) ) )
            // InternalAfvl.g:2918:2: ( (enumLiteral_0= 'POLLED' ) | (enumLiteral_1= 'PUBSUB' ) | (enumLiteral_2= 'QUEUED' ) | (enumLiteral_3= 'CENTRAL' ) )
            {
            // InternalAfvl.g:2918:2: ( (enumLiteral_0= 'POLLED' ) | (enumLiteral_1= 'PUBSUB' ) | (enumLiteral_2= 'QUEUED' ) | (enumLiteral_3= 'CENTRAL' ) )
            int alt66=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt66=1;
                }
                break;
            case 57:
                {
                alt66=2;
                }
                break;
            case 58:
                {
                alt66=3;
                }
                break;
            case 59:
                {
                alt66=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalAfvl.g:2919:3: (enumLiteral_0= 'POLLED' )
                    {
                    // InternalAfvl.g:2919:3: (enumLiteral_0= 'POLLED' )
                    // InternalAfvl.g:2920:4: enumLiteral_0= 'POLLED'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getNotificationModelAccess().getPOLLEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNotificationModelAccess().getPOLLEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:2927:3: (enumLiteral_1= 'PUBSUB' )
                    {
                    // InternalAfvl.g:2927:3: (enumLiteral_1= 'PUBSUB' )
                    // InternalAfvl.g:2928:4: enumLiteral_1= 'PUBSUB'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getNotificationModelAccess().getPUBSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNotificationModelAccess().getPUBSUBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAfvl.g:2935:3: (enumLiteral_2= 'QUEUED' )
                    {
                    // InternalAfvl.g:2935:3: (enumLiteral_2= 'QUEUED' )
                    // InternalAfvl.g:2936:4: enumLiteral_2= 'QUEUED'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getNotificationModelAccess().getQUEUEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNotificationModelAccess().getQUEUEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAfvl.g:2943:3: (enumLiteral_3= 'CENTRAL' )
                    {
                    // InternalAfvl.g:2943:3: (enumLiteral_3= 'CENTRAL' )
                    // InternalAfvl.g:2944:4: enumLiteral_3= 'CENTRAL'
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
    // InternalAfvl.g:2954:1: ruleBuffering returns [Enumerator current=null] : ( (enumLiteral_0= 'BUFFERED' ) | (enumLiteral_1= 'UNBUFFERED' ) ) ;
    public final Enumerator ruleBuffering() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:2960:2: ( ( (enumLiteral_0= 'BUFFERED' ) | (enumLiteral_1= 'UNBUFFERED' ) ) )
            // InternalAfvl.g:2961:2: ( (enumLiteral_0= 'BUFFERED' ) | (enumLiteral_1= 'UNBUFFERED' ) )
            {
            // InternalAfvl.g:2961:2: ( (enumLiteral_0= 'BUFFERED' ) | (enumLiteral_1= 'UNBUFFERED' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==60) ) {
                alt67=1;
            }
            else if ( (LA67_0==61) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalAfvl.g:2962:3: (enumLiteral_0= 'BUFFERED' )
                    {
                    // InternalAfvl.g:2962:3: (enumLiteral_0= 'BUFFERED' )
                    // InternalAfvl.g:2963:4: enumLiteral_0= 'BUFFERED'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getBufferingAccess().getBUFFEREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBufferingAccess().getBUFFEREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:2970:3: (enumLiteral_1= 'UNBUFFERED' )
                    {
                    // InternalAfvl.g:2970:3: (enumLiteral_1= 'UNBUFFERED' )
                    // InternalAfvl.g:2971:4: enumLiteral_1= 'UNBUFFERED'
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
    // InternalAfvl.g:2981:1: ruleThroughput returns [Enumerator current=null] : ( (enumLiteral_0= 'ATOMIC' ) | (enumLiteral_1= 'HIGH_ORDER' ) ) ;
    public final Enumerator ruleThroughput() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAfvl.g:2987:2: ( ( (enumLiteral_0= 'ATOMIC' ) | (enumLiteral_1= 'HIGH_ORDER' ) ) )
            // InternalAfvl.g:2988:2: ( (enumLiteral_0= 'ATOMIC' ) | (enumLiteral_1= 'HIGH_ORDER' ) )
            {
            // InternalAfvl.g:2988:2: ( (enumLiteral_0= 'ATOMIC' ) | (enumLiteral_1= 'HIGH_ORDER' ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==62) ) {
                alt68=1;
            }
            else if ( (LA68_0==63) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalAfvl.g:2989:3: (enumLiteral_0= 'ATOMIC' )
                    {
                    // InternalAfvl.g:2989:3: (enumLiteral_0= 'ATOMIC' )
                    // InternalAfvl.g:2990:4: enumLiteral_0= 'ATOMIC'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getThroughputAccess().getATOMICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getThroughputAccess().getATOMICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:2997:3: (enumLiteral_1= 'HIGH_ORDER' )
                    {
                    // InternalAfvl.g:2997:3: (enumLiteral_1= 'HIGH_ORDER' )
                    // InternalAfvl.g:2998:4: enumLiteral_1= 'HIGH_ORDER'
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
    // InternalAfvl.g:3008:1: ruleProcessingModel returns [Enumerator current=null] : ( (enumLiteral_0= 'STREAM' ) | (enumLiteral_1= 'BATCH' ) | (enumLiteral_2= 'MICROBATCH' ) ) ;
    public final Enumerator ruleProcessingModel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAfvl.g:3014:2: ( ( (enumLiteral_0= 'STREAM' ) | (enumLiteral_1= 'BATCH' ) | (enumLiteral_2= 'MICROBATCH' ) ) )
            // InternalAfvl.g:3015:2: ( (enumLiteral_0= 'STREAM' ) | (enumLiteral_1= 'BATCH' ) | (enumLiteral_2= 'MICROBATCH' ) )
            {
            // InternalAfvl.g:3015:2: ( (enumLiteral_0= 'STREAM' ) | (enumLiteral_1= 'BATCH' ) | (enumLiteral_2= 'MICROBATCH' ) )
            int alt69=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt69=1;
                }
                break;
            case 65:
                {
                alt69=2;
                }
                break;
            case 66:
                {
                alt69=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalAfvl.g:3016:3: (enumLiteral_0= 'STREAM' )
                    {
                    // InternalAfvl.g:3016:3: (enumLiteral_0= 'STREAM' )
                    // InternalAfvl.g:3017:4: enumLiteral_0= 'STREAM'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getProcessingModelAccess().getSTREAMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProcessingModelAccess().getSTREAMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAfvl.g:3024:3: (enumLiteral_1= 'BATCH' )
                    {
                    // InternalAfvl.g:3024:3: (enumLiteral_1= 'BATCH' )
                    // InternalAfvl.g:3025:4: enumLiteral_1= 'BATCH'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getProcessingModelAccess().getBATCHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProcessingModelAccess().getBATCHEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAfvl.g:3032:3: (enumLiteral_2= 'MICROBATCH' )
                    {
                    // InternalAfvl.g:3032:3: (enumLiteral_2= 'MICROBATCH' )
                    // InternalAfvl.g:3033:4: enumLiteral_2= 'MICROBATCH'
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000D80800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00C0000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000003E000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0F00000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0003C0003E000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000023D000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000023C000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000E040000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000C040000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008040000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00001CA040000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00001C8040000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000188040000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000108040000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000004A040000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000048040000000L});

}