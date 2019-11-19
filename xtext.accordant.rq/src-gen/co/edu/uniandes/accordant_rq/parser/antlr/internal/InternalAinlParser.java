package co.edu.uniandes.accordant_rq.parser.antlr.internal;

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
import co.edu.uniandes.accordant_rq.services.AinlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAinlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'InputPackage'", "'{'", "'QScenarios'", "','", "'}'", "'analyzedQScenarios'", "'tactics'", "'QS'", "'QA'", "':'", "'stimulus'", "'environment'", "'response'", "'measure'", "'between'", "'and'", "'in'", "'-'", "'.'", "'E'", "'e'", "'AQS'", "'of'", "'reasoning'", "'Sensitivity_Points'", "'SensitivityPoint'", "'isRisk'", "'rationale'", "'code'", "'('", "')'", "'Tactic'", "'viewpoint'", "'THROUGHPUT'", "'LATENCY'", "'DEADLINE'", "'MILLIS'", "'SECONDS'", "'MINUTES'", "'HOURS'", "'TASKS'", "'BYTES'", "'MSGS'", "'AVAILABILITY'", "'PERFORMANCE'", "'MODIFIABILITY'", "'TESTABILITY'", "'SCALABILITY'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
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
    public static final int RULE_ID=4;
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
    public static final int T__20=20;
    public static final int T__21=21;
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


        public InternalAinlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAinlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAinlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAinl.g"; }



     	private AinlGrammarAccess grammarAccess;

        public InternalAinlParser(TokenStream input, AinlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "InputPackage";
       	}

       	@Override
       	protected AinlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleInputPackage"
    // InternalAinl.g:65:1: entryRuleInputPackage returns [EObject current=null] : iv_ruleInputPackage= ruleInputPackage EOF ;
    public final EObject entryRuleInputPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputPackage = null;


        try {
            // InternalAinl.g:65:53: (iv_ruleInputPackage= ruleInputPackage EOF )
            // InternalAinl.g:66:2: iv_ruleInputPackage= ruleInputPackage EOF
            {
             newCompositeNode(grammarAccess.getInputPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputPackage=ruleInputPackage();

            state._fsp--;

             current =iv_ruleInputPackage; 
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
    // $ANTLR end "entryRuleInputPackage"


    // $ANTLR start "ruleInputPackage"
    // InternalAinl.g:72:1: ruleInputPackage returns [EObject current=null] : ( () otherlv_1= 'InputPackage' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'QScenarios' otherlv_5= '{' ( (lv_scenarios_6_0= ruleQScenario ) ) (otherlv_7= ',' ( (lv_scenarios_8_0= ruleQScenario ) ) )* otherlv_9= '}' (otherlv_10= 'analyzedQScenarios' otherlv_11= '{' ( (lv_analyzedQs_12_0= ruleAnalyzedQS ) ) (otherlv_13= ',' ( (lv_analyzedQs_14_0= ruleAnalyzedQS ) ) )* otherlv_15= '}' )? otherlv_16= 'tactics' otherlv_17= '{' ( (lv_tactics_18_0= ruleTactic ) ) (otherlv_19= ',' ( (lv_tactics_20_0= ruleTactic ) ) )* otherlv_21= '}' otherlv_22= '}' ) ;
    public final EObject ruleInputPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_scenarios_6_0 = null;

        EObject lv_scenarios_8_0 = null;

        EObject lv_analyzedQs_12_0 = null;

        EObject lv_analyzedQs_14_0 = null;

        EObject lv_tactics_18_0 = null;

        EObject lv_tactics_20_0 = null;



        	enterRule();

        try {
            // InternalAinl.g:78:2: ( ( () otherlv_1= 'InputPackage' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'QScenarios' otherlv_5= '{' ( (lv_scenarios_6_0= ruleQScenario ) ) (otherlv_7= ',' ( (lv_scenarios_8_0= ruleQScenario ) ) )* otherlv_9= '}' (otherlv_10= 'analyzedQScenarios' otherlv_11= '{' ( (lv_analyzedQs_12_0= ruleAnalyzedQS ) ) (otherlv_13= ',' ( (lv_analyzedQs_14_0= ruleAnalyzedQS ) ) )* otherlv_15= '}' )? otherlv_16= 'tactics' otherlv_17= '{' ( (lv_tactics_18_0= ruleTactic ) ) (otherlv_19= ',' ( (lv_tactics_20_0= ruleTactic ) ) )* otherlv_21= '}' otherlv_22= '}' ) )
            // InternalAinl.g:79:2: ( () otherlv_1= 'InputPackage' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'QScenarios' otherlv_5= '{' ( (lv_scenarios_6_0= ruleQScenario ) ) (otherlv_7= ',' ( (lv_scenarios_8_0= ruleQScenario ) ) )* otherlv_9= '}' (otherlv_10= 'analyzedQScenarios' otherlv_11= '{' ( (lv_analyzedQs_12_0= ruleAnalyzedQS ) ) (otherlv_13= ',' ( (lv_analyzedQs_14_0= ruleAnalyzedQS ) ) )* otherlv_15= '}' )? otherlv_16= 'tactics' otherlv_17= '{' ( (lv_tactics_18_0= ruleTactic ) ) (otherlv_19= ',' ( (lv_tactics_20_0= ruleTactic ) ) )* otherlv_21= '}' otherlv_22= '}' )
            {
            // InternalAinl.g:79:2: ( () otherlv_1= 'InputPackage' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'QScenarios' otherlv_5= '{' ( (lv_scenarios_6_0= ruleQScenario ) ) (otherlv_7= ',' ( (lv_scenarios_8_0= ruleQScenario ) ) )* otherlv_9= '}' (otherlv_10= 'analyzedQScenarios' otherlv_11= '{' ( (lv_analyzedQs_12_0= ruleAnalyzedQS ) ) (otherlv_13= ',' ( (lv_analyzedQs_14_0= ruleAnalyzedQS ) ) )* otherlv_15= '}' )? otherlv_16= 'tactics' otherlv_17= '{' ( (lv_tactics_18_0= ruleTactic ) ) (otherlv_19= ',' ( (lv_tactics_20_0= ruleTactic ) ) )* otherlv_21= '}' otherlv_22= '}' )
            // InternalAinl.g:80:3: () otherlv_1= 'InputPackage' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'QScenarios' otherlv_5= '{' ( (lv_scenarios_6_0= ruleQScenario ) ) (otherlv_7= ',' ( (lv_scenarios_8_0= ruleQScenario ) ) )* otherlv_9= '}' (otherlv_10= 'analyzedQScenarios' otherlv_11= '{' ( (lv_analyzedQs_12_0= ruleAnalyzedQS ) ) (otherlv_13= ',' ( (lv_analyzedQs_14_0= ruleAnalyzedQS ) ) )* otherlv_15= '}' )? otherlv_16= 'tactics' otherlv_17= '{' ( (lv_tactics_18_0= ruleTactic ) ) (otherlv_19= ',' ( (lv_tactics_20_0= ruleTactic ) ) )* otherlv_21= '}' otherlv_22= '}'
            {
            // InternalAinl.g:80:3: ()
            // InternalAinl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputPackageAccess().getInputPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInputPackageAccess().getInputPackageKeyword_1());
            		
            // InternalAinl.g:91:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAinl.g:92:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAinl.g:92:4: (lv_name_2_0= RULE_ID )
            // InternalAinl.g:93:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getInputPackageAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputPackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getInputPackageAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getInputPackageAccess().getQScenariosKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getInputPackageAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalAinl.g:121:3: ( (lv_scenarios_6_0= ruleQScenario ) )
            // InternalAinl.g:122:4: (lv_scenarios_6_0= ruleQScenario )
            {
            // InternalAinl.g:122:4: (lv_scenarios_6_0= ruleQScenario )
            // InternalAinl.g:123:5: lv_scenarios_6_0= ruleQScenario
            {

            					newCompositeNode(grammarAccess.getInputPackageAccess().getScenariosQScenarioParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_scenarios_6_0=ruleQScenario();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputPackageRule());
            					}
            					add(
            						current,
            						"scenarios",
            						lv_scenarios_6_0,
            						"co.edu.uniandes.accordant_rq.Ainl.QScenario");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAinl.g:140:3: (otherlv_7= ',' ( (lv_scenarios_8_0= ruleQScenario ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAinl.g:141:4: otherlv_7= ',' ( (lv_scenarios_8_0= ruleQScenario ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_7, grammarAccess.getInputPackageAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalAinl.g:145:4: ( (lv_scenarios_8_0= ruleQScenario ) )
            	    // InternalAinl.g:146:5: (lv_scenarios_8_0= ruleQScenario )
            	    {
            	    // InternalAinl.g:146:5: (lv_scenarios_8_0= ruleQScenario )
            	    // InternalAinl.g:147:6: lv_scenarios_8_0= ruleQScenario
            	    {

            	    						newCompositeNode(grammarAccess.getInputPackageAccess().getScenariosQScenarioParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_scenarios_8_0=ruleQScenario();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInputPackageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"scenarios",
            	    							lv_scenarios_8_0,
            	    							"co.edu.uniandes.accordant_rq.Ainl.QScenario");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getInputPackageAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalAinl.g:169:3: (otherlv_10= 'analyzedQScenarios' otherlv_11= '{' ( (lv_analyzedQs_12_0= ruleAnalyzedQS ) ) (otherlv_13= ',' ( (lv_analyzedQs_14_0= ruleAnalyzedQS ) ) )* otherlv_15= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAinl.g:170:4: otherlv_10= 'analyzedQScenarios' otherlv_11= '{' ( (lv_analyzedQs_12_0= ruleAnalyzedQS ) ) (otherlv_13= ',' ( (lv_analyzedQs_14_0= ruleAnalyzedQS ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getInputPackageAccess().getAnalyzedQScenariosKeyword_9_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getInputPackageAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalAinl.g:178:4: ( (lv_analyzedQs_12_0= ruleAnalyzedQS ) )
                    // InternalAinl.g:179:5: (lv_analyzedQs_12_0= ruleAnalyzedQS )
                    {
                    // InternalAinl.g:179:5: (lv_analyzedQs_12_0= ruleAnalyzedQS )
                    // InternalAinl.g:180:6: lv_analyzedQs_12_0= ruleAnalyzedQS
                    {

                    						newCompositeNode(grammarAccess.getInputPackageAccess().getAnalyzedQsAnalyzedQSParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_analyzedQs_12_0=ruleAnalyzedQS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputPackageRule());
                    						}
                    						add(
                    							current,
                    							"analyzedQs",
                    							lv_analyzedQs_12_0,
                    							"co.edu.uniandes.accordant_rq.Ainl.AnalyzedQS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAinl.g:197:4: (otherlv_13= ',' ( (lv_analyzedQs_14_0= ruleAnalyzedQS ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalAinl.g:198:5: otherlv_13= ',' ( (lv_analyzedQs_14_0= ruleAnalyzedQS ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getInputPackageAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalAinl.g:202:5: ( (lv_analyzedQs_14_0= ruleAnalyzedQS ) )
                    	    // InternalAinl.g:203:6: (lv_analyzedQs_14_0= ruleAnalyzedQS )
                    	    {
                    	    // InternalAinl.g:203:6: (lv_analyzedQs_14_0= ruleAnalyzedQS )
                    	    // InternalAinl.g:204:7: lv_analyzedQs_14_0= ruleAnalyzedQS
                    	    {

                    	    							newCompositeNode(grammarAccess.getInputPackageAccess().getAnalyzedQsAnalyzedQSParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_analyzedQs_14_0=ruleAnalyzedQS();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInputPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"analyzedQs",
                    	    								lv_analyzedQs_14_0,
                    	    								"co.edu.uniandes.accordant_rq.Ainl.AnalyzedQS");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getInputPackageAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_16, grammarAccess.getInputPackageAccess().getTacticsKeyword_10());
            		
            otherlv_17=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_17, grammarAccess.getInputPackageAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalAinl.g:235:3: ( (lv_tactics_18_0= ruleTactic ) )
            // InternalAinl.g:236:4: (lv_tactics_18_0= ruleTactic )
            {
            // InternalAinl.g:236:4: (lv_tactics_18_0= ruleTactic )
            // InternalAinl.g:237:5: lv_tactics_18_0= ruleTactic
            {

            					newCompositeNode(grammarAccess.getInputPackageAccess().getTacticsTacticParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_7);
            lv_tactics_18_0=ruleTactic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputPackageRule());
            					}
            					add(
            						current,
            						"tactics",
            						lv_tactics_18_0,
            						"co.edu.uniandes.accordant_rq.Ainl.Tactic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAinl.g:254:3: (otherlv_19= ',' ( (lv_tactics_20_0= ruleTactic ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAinl.g:255:4: otherlv_19= ',' ( (lv_tactics_20_0= ruleTactic ) )
            	    {
            	    otherlv_19=(Token)match(input,14,FOLLOW_11); 

            	    				newLeafNode(otherlv_19, grammarAccess.getInputPackageAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalAinl.g:259:4: ( (lv_tactics_20_0= ruleTactic ) )
            	    // InternalAinl.g:260:5: (lv_tactics_20_0= ruleTactic )
            	    {
            	    // InternalAinl.g:260:5: (lv_tactics_20_0= ruleTactic )
            	    // InternalAinl.g:261:6: lv_tactics_20_0= ruleTactic
            	    {

            	    						newCompositeNode(grammarAccess.getInputPackageAccess().getTacticsTacticParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_tactics_20_0=ruleTactic();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInputPackageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tactics",
            	    							lv_tactics_20_0,
            	    							"co.edu.uniandes.accordant_rq.Ainl.Tactic");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_21=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_21, grammarAccess.getInputPackageAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getInputPackageAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleInputPackage"


    // $ANTLR start "entryRuleEString"
    // InternalAinl.g:291:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAinl.g:291:47: (iv_ruleEString= ruleEString EOF )
            // InternalAinl.g:292:2: iv_ruleEString= ruleEString EOF
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
    // InternalAinl.g:298:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAinl.g:304:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAinl.g:305:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAinl.g:305:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalAinl.g:306:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAinl.g:314:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleQScenario"
    // InternalAinl.g:325:1: entryRuleQScenario returns [EObject current=null] : iv_ruleQScenario= ruleQScenario EOF ;
    public final EObject entryRuleQScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQScenario = null;


        try {
            // InternalAinl.g:325:50: (iv_ruleQScenario= ruleQScenario EOF )
            // InternalAinl.g:326:2: iv_ruleQScenario= ruleQScenario EOF
            {
             newCompositeNode(grammarAccess.getQScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQScenario=ruleQScenario();

            state._fsp--;

             current =iv_ruleQScenario; 
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
    // $ANTLR end "entryRuleQScenario"


    // $ANTLR start "ruleQScenario"
    // InternalAinl.g:332:1: ruleQScenario returns [EObject current=null] : (otherlv_0= 'QS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'QA' otherlv_4= ':' ( (lv_qAttribute_5_0= ruleQAttribute ) ) otherlv_6= 'stimulus' otherlv_7= ':' ( (lv_stimulus_8_0= ruleEString ) ) otherlv_9= 'environment' otherlv_10= ':' ( (lv_environment_11_0= ruleEString ) ) otherlv_12= 'response' otherlv_13= ':' ( (lv_response_14_0= ruleEString ) ) otherlv_15= 'measure' otherlv_16= ':' ( (lv_measure_17_0= ruleQAMetric ) ) otherlv_18= 'between' ( (lv_minValue_19_0= ruleEFloat ) ) otherlv_20= 'and' ( (lv_maxValue_21_0= ruleEFloat ) ) otherlv_22= 'in' ( (lv_unit_23_0= ruleMetricUnit ) ) otherlv_24= '}' ) ;
    public final EObject ruleQScenario() throws RecognitionException {
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
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Enumerator lv_qAttribute_5_0 = null;

        AntlrDatatypeRuleToken lv_stimulus_8_0 = null;

        AntlrDatatypeRuleToken lv_environment_11_0 = null;

        AntlrDatatypeRuleToken lv_response_14_0 = null;

        Enumerator lv_measure_17_0 = null;

        AntlrDatatypeRuleToken lv_minValue_19_0 = null;

        AntlrDatatypeRuleToken lv_maxValue_21_0 = null;

        Enumerator lv_unit_23_0 = null;



        	enterRule();

        try {
            // InternalAinl.g:338:2: ( (otherlv_0= 'QS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'QA' otherlv_4= ':' ( (lv_qAttribute_5_0= ruleQAttribute ) ) otherlv_6= 'stimulus' otherlv_7= ':' ( (lv_stimulus_8_0= ruleEString ) ) otherlv_9= 'environment' otherlv_10= ':' ( (lv_environment_11_0= ruleEString ) ) otherlv_12= 'response' otherlv_13= ':' ( (lv_response_14_0= ruleEString ) ) otherlv_15= 'measure' otherlv_16= ':' ( (lv_measure_17_0= ruleQAMetric ) ) otherlv_18= 'between' ( (lv_minValue_19_0= ruleEFloat ) ) otherlv_20= 'and' ( (lv_maxValue_21_0= ruleEFloat ) ) otherlv_22= 'in' ( (lv_unit_23_0= ruleMetricUnit ) ) otherlv_24= '}' ) )
            // InternalAinl.g:339:2: (otherlv_0= 'QS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'QA' otherlv_4= ':' ( (lv_qAttribute_5_0= ruleQAttribute ) ) otherlv_6= 'stimulus' otherlv_7= ':' ( (lv_stimulus_8_0= ruleEString ) ) otherlv_9= 'environment' otherlv_10= ':' ( (lv_environment_11_0= ruleEString ) ) otherlv_12= 'response' otherlv_13= ':' ( (lv_response_14_0= ruleEString ) ) otherlv_15= 'measure' otherlv_16= ':' ( (lv_measure_17_0= ruleQAMetric ) ) otherlv_18= 'between' ( (lv_minValue_19_0= ruleEFloat ) ) otherlv_20= 'and' ( (lv_maxValue_21_0= ruleEFloat ) ) otherlv_22= 'in' ( (lv_unit_23_0= ruleMetricUnit ) ) otherlv_24= '}' )
            {
            // InternalAinl.g:339:2: (otherlv_0= 'QS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'QA' otherlv_4= ':' ( (lv_qAttribute_5_0= ruleQAttribute ) ) otherlv_6= 'stimulus' otherlv_7= ':' ( (lv_stimulus_8_0= ruleEString ) ) otherlv_9= 'environment' otherlv_10= ':' ( (lv_environment_11_0= ruleEString ) ) otherlv_12= 'response' otherlv_13= ':' ( (lv_response_14_0= ruleEString ) ) otherlv_15= 'measure' otherlv_16= ':' ( (lv_measure_17_0= ruleQAMetric ) ) otherlv_18= 'between' ( (lv_minValue_19_0= ruleEFloat ) ) otherlv_20= 'and' ( (lv_maxValue_21_0= ruleEFloat ) ) otherlv_22= 'in' ( (lv_unit_23_0= ruleMetricUnit ) ) otherlv_24= '}' )
            // InternalAinl.g:340:3: otherlv_0= 'QS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'QA' otherlv_4= ':' ( (lv_qAttribute_5_0= ruleQAttribute ) ) otherlv_6= 'stimulus' otherlv_7= ':' ( (lv_stimulus_8_0= ruleEString ) ) otherlv_9= 'environment' otherlv_10= ':' ( (lv_environment_11_0= ruleEString ) ) otherlv_12= 'response' otherlv_13= ':' ( (lv_response_14_0= ruleEString ) ) otherlv_15= 'measure' otherlv_16= ':' ( (lv_measure_17_0= ruleQAMetric ) ) otherlv_18= 'between' ( (lv_minValue_19_0= ruleEFloat ) ) otherlv_20= 'and' ( (lv_maxValue_21_0= ruleEFloat ) ) otherlv_22= 'in' ( (lv_unit_23_0= ruleMetricUnit ) ) otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQScenarioAccess().getQSKeyword_0());
            		
            // InternalAinl.g:344:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAinl.g:345:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAinl.g:345:4: (lv_name_1_0= RULE_ID )
            // InternalAinl.g:346:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getQScenarioAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQScenarioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getQScenarioAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getQScenarioAccess().getQAKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getQScenarioAccess().getColonKeyword_4());
            		
            // InternalAinl.g:374:3: ( (lv_qAttribute_5_0= ruleQAttribute ) )
            // InternalAinl.g:375:4: (lv_qAttribute_5_0= ruleQAttribute )
            {
            // InternalAinl.g:375:4: (lv_qAttribute_5_0= ruleQAttribute )
            // InternalAinl.g:376:5: lv_qAttribute_5_0= ruleQAttribute
            {

            					newCompositeNode(grammarAccess.getQScenarioAccess().getQAttributeQAttributeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_qAttribute_5_0=ruleQAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQScenarioRule());
            					}
            					set(
            						current,
            						"qAttribute",
            						lv_qAttribute_5_0,
            						"co.edu.uniandes.accordant_rq.Ainl.QAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getQScenarioAccess().getStimulusKeyword_6());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getQScenarioAccess().getColonKeyword_7());
            		
            // InternalAinl.g:401:3: ( (lv_stimulus_8_0= ruleEString ) )
            // InternalAinl.g:402:4: (lv_stimulus_8_0= ruleEString )
            {
            // InternalAinl.g:402:4: (lv_stimulus_8_0= ruleEString )
            // InternalAinl.g:403:5: lv_stimulus_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQScenarioAccess().getStimulusEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_18);
            lv_stimulus_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQScenarioRule());
            					}
            					set(
            						current,
            						"stimulus",
            						lv_stimulus_8_0,
            						"co.edu.uniandes.accordant_rq.Ainl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getQScenarioAccess().getEnvironmentKeyword_9());
            		
            otherlv_10=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getQScenarioAccess().getColonKeyword_10());
            		
            // InternalAinl.g:428:3: ( (lv_environment_11_0= ruleEString ) )
            // InternalAinl.g:429:4: (lv_environment_11_0= ruleEString )
            {
            // InternalAinl.g:429:4: (lv_environment_11_0= ruleEString )
            // InternalAinl.g:430:5: lv_environment_11_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQScenarioAccess().getEnvironmentEStringParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_19);
            lv_environment_11_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQScenarioRule());
            					}
            					set(
            						current,
            						"environment",
            						lv_environment_11_0,
            						"co.edu.uniandes.accordant_rq.Ainl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_12, grammarAccess.getQScenarioAccess().getResponseKeyword_12());
            		
            otherlv_13=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_13, grammarAccess.getQScenarioAccess().getColonKeyword_13());
            		
            // InternalAinl.g:455:3: ( (lv_response_14_0= ruleEString ) )
            // InternalAinl.g:456:4: (lv_response_14_0= ruleEString )
            {
            // InternalAinl.g:456:4: (lv_response_14_0= ruleEString )
            // InternalAinl.g:457:5: lv_response_14_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQScenarioAccess().getResponseEStringParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_20);
            lv_response_14_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQScenarioRule());
            					}
            					set(
            						current,
            						"response",
            						lv_response_14_0,
            						"co.edu.uniandes.accordant_rq.Ainl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_15, grammarAccess.getQScenarioAccess().getMeasureKeyword_15());
            		
            otherlv_16=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_16, grammarAccess.getQScenarioAccess().getColonKeyword_16());
            		
            // InternalAinl.g:482:3: ( (lv_measure_17_0= ruleQAMetric ) )
            // InternalAinl.g:483:4: (lv_measure_17_0= ruleQAMetric )
            {
            // InternalAinl.g:483:4: (lv_measure_17_0= ruleQAMetric )
            // InternalAinl.g:484:5: lv_measure_17_0= ruleQAMetric
            {

            					newCompositeNode(grammarAccess.getQScenarioAccess().getMeasureQAMetricEnumRuleCall_17_0());
            				
            pushFollow(FOLLOW_22);
            lv_measure_17_0=ruleQAMetric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQScenarioRule());
            					}
            					set(
            						current,
            						"measure",
            						lv_measure_17_0,
            						"co.edu.uniandes.accordant_rq.Ainl.QAMetric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_18, grammarAccess.getQScenarioAccess().getBetweenKeyword_18());
            		
            // InternalAinl.g:505:3: ( (lv_minValue_19_0= ruleEFloat ) )
            // InternalAinl.g:506:4: (lv_minValue_19_0= ruleEFloat )
            {
            // InternalAinl.g:506:4: (lv_minValue_19_0= ruleEFloat )
            // InternalAinl.g:507:5: lv_minValue_19_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getQScenarioAccess().getMinValueEFloatParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_24);
            lv_minValue_19_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQScenarioRule());
            					}
            					set(
            						current,
            						"minValue",
            						lv_minValue_19_0,
            						"co.edu.uniandes.accordant_rq.Ainl.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_20=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_20, grammarAccess.getQScenarioAccess().getAndKeyword_20());
            		
            // InternalAinl.g:528:3: ( (lv_maxValue_21_0= ruleEFloat ) )
            // InternalAinl.g:529:4: (lv_maxValue_21_0= ruleEFloat )
            {
            // InternalAinl.g:529:4: (lv_maxValue_21_0= ruleEFloat )
            // InternalAinl.g:530:5: lv_maxValue_21_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getQScenarioAccess().getMaxValueEFloatParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_25);
            lv_maxValue_21_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQScenarioRule());
            					}
            					set(
            						current,
            						"maxValue",
            						lv_maxValue_21_0,
            						"co.edu.uniandes.accordant_rq.Ainl.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_22=(Token)match(input,27,FOLLOW_26); 

            			newLeafNode(otherlv_22, grammarAccess.getQScenarioAccess().getInKeyword_22());
            		
            // InternalAinl.g:551:3: ( (lv_unit_23_0= ruleMetricUnit ) )
            // InternalAinl.g:552:4: (lv_unit_23_0= ruleMetricUnit )
            {
            // InternalAinl.g:552:4: (lv_unit_23_0= ruleMetricUnit )
            // InternalAinl.g:553:5: lv_unit_23_0= ruleMetricUnit
            {

            					newCompositeNode(grammarAccess.getQScenarioAccess().getUnitMetricUnitEnumRuleCall_23_0());
            				
            pushFollow(FOLLOW_12);
            lv_unit_23_0=ruleMetricUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQScenarioRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_23_0,
            						"co.edu.uniandes.accordant_rq.Ainl.MetricUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_24=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getQScenarioAccess().getRightCurlyBracketKeyword_24());
            		

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
    // $ANTLR end "ruleQScenario"


    // $ANTLR start "entryRuleEFloat"
    // InternalAinl.g:578:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalAinl.g:578:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalAinl.g:579:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalAinl.g:585:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalAinl.g:591:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalAinl.g:592:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalAinl.g:592:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalAinl.g:593:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalAinl.g:593:3: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAinl.g:594:4: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_27); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalAinl.g:600:3: (this_INT_1= RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAinl.g:601:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_28); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,29,FOLLOW_29); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_30); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalAinl.g:621:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=30 && LA10_0<=31)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAinl.g:622:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalAinl.g:622:4: (kw= 'E' | kw= 'e' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==30) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==31) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalAinl.g:623:5: kw= 'E'
                            {
                            kw=(Token)match(input,30,FOLLOW_31); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAinl.g:629:5: kw= 'e'
                            {
                            kw=(Token)match(input,31,FOLLOW_31); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAinl.g:635:4: (kw= '-' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==28) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalAinl.g:636:5: kw= '-'
                            {
                            kw=(Token)match(input,28,FOLLOW_29); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleAnalyzedQS"
    // InternalAinl.g:654:1: entryRuleAnalyzedQS returns [EObject current=null] : iv_ruleAnalyzedQS= ruleAnalyzedQS EOF ;
    public final EObject entryRuleAnalyzedQS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalyzedQS = null;


        try {
            // InternalAinl.g:654:51: (iv_ruleAnalyzedQS= ruleAnalyzedQS EOF )
            // InternalAinl.g:655:2: iv_ruleAnalyzedQS= ruleAnalyzedQS EOF
            {
             newCompositeNode(grammarAccess.getAnalyzedQSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnalyzedQS=ruleAnalyzedQS();

            state._fsp--;

             current =iv_ruleAnalyzedQS; 
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
    // $ANTLR end "entryRuleAnalyzedQS"


    // $ANTLR start "ruleAnalyzedQS"
    // InternalAinl.g:661:1: ruleAnalyzedQS returns [EObject current=null] : (otherlv_0= 'AQS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'reasoning' otherlv_6= ':' ( (lv_reasoning_7_0= ruleEString ) ) )? (otherlv_8= 'Sensitivity_Points' otherlv_9= '{' ( (lv_sPoints_10_0= ruleSensitivityPoint ) ) otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleAnalyzedQS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_reasoning_7_0 = null;

        EObject lv_sPoints_10_0 = null;



        	enterRule();

        try {
            // InternalAinl.g:667:2: ( (otherlv_0= 'AQS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'reasoning' otherlv_6= ':' ( (lv_reasoning_7_0= ruleEString ) ) )? (otherlv_8= 'Sensitivity_Points' otherlv_9= '{' ( (lv_sPoints_10_0= ruleSensitivityPoint ) ) otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalAinl.g:668:2: (otherlv_0= 'AQS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'reasoning' otherlv_6= ':' ( (lv_reasoning_7_0= ruleEString ) ) )? (otherlv_8= 'Sensitivity_Points' otherlv_9= '{' ( (lv_sPoints_10_0= ruleSensitivityPoint ) ) otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalAinl.g:668:2: (otherlv_0= 'AQS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'reasoning' otherlv_6= ':' ( (lv_reasoning_7_0= ruleEString ) ) )? (otherlv_8= 'Sensitivity_Points' otherlv_9= '{' ( (lv_sPoints_10_0= ruleSensitivityPoint ) ) otherlv_11= '}' )? otherlv_12= '}' )
            // InternalAinl.g:669:3: otherlv_0= 'AQS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'reasoning' otherlv_6= ':' ( (lv_reasoning_7_0= ruleEString ) ) )? (otherlv_8= 'Sensitivity_Points' otherlv_9= '{' ( (lv_sPoints_10_0= ruleSensitivityPoint ) ) otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAnalyzedQSAccess().getAQSKeyword_0());
            		
            // InternalAinl.g:673:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAinl.g:674:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAinl.g:674:4: (lv_name_1_0= RULE_ID )
            // InternalAinl.g:675:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAnalyzedQSAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnalyzedQSRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAnalyzedQSAccess().getOfKeyword_2());
            		
            // InternalAinl.g:695:3: ( (otherlv_3= RULE_ID ) )
            // InternalAinl.g:696:4: (otherlv_3= RULE_ID )
            {
            // InternalAinl.g:696:4: (otherlv_3= RULE_ID )
            // InternalAinl.g:697:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnalyzedQSRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_3, grammarAccess.getAnalyzedQSAccess().getQsQScenarioCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getAnalyzedQSAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalAinl.g:712:3: (otherlv_5= 'reasoning' otherlv_6= ':' ( (lv_reasoning_7_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAinl.g:713:4: otherlv_5= 'reasoning' otherlv_6= ':' ( (lv_reasoning_7_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getAnalyzedQSAccess().getReasoningKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getAnalyzedQSAccess().getColonKeyword_5_1());
                    			
                    // InternalAinl.g:721:4: ( (lv_reasoning_7_0= ruleEString ) )
                    // InternalAinl.g:722:5: (lv_reasoning_7_0= ruleEString )
                    {
                    // InternalAinl.g:722:5: (lv_reasoning_7_0= ruleEString )
                    // InternalAinl.g:723:6: lv_reasoning_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAnalyzedQSAccess().getReasoningEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_reasoning_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnalyzedQSRule());
                    						}
                    						set(
                    							current,
                    							"reasoning",
                    							lv_reasoning_7_0,
                    							"co.edu.uniandes.accordant_rq.Ainl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAinl.g:741:3: (otherlv_8= 'Sensitivity_Points' otherlv_9= '{' ( (lv_sPoints_10_0= ruleSensitivityPoint ) ) otherlv_11= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAinl.g:742:4: otherlv_8= 'Sensitivity_Points' otherlv_9= '{' ( (lv_sPoints_10_0= ruleSensitivityPoint ) ) otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getAnalyzedQSAccess().getSensitivity_PointsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_9, grammarAccess.getAnalyzedQSAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalAinl.g:750:4: ( (lv_sPoints_10_0= ruleSensitivityPoint ) )
                    // InternalAinl.g:751:5: (lv_sPoints_10_0= ruleSensitivityPoint )
                    {
                    // InternalAinl.g:751:5: (lv_sPoints_10_0= ruleSensitivityPoint )
                    // InternalAinl.g:752:6: lv_sPoints_10_0= ruleSensitivityPoint
                    {

                    						newCompositeNode(grammarAccess.getAnalyzedQSAccess().getSPointsSensitivityPointParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_sPoints_10_0=ruleSensitivityPoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnalyzedQSRule());
                    						}
                    						set(
                    							current,
                    							"sPoints",
                    							lv_sPoints_10_0,
                    							"co.edu.uniandes.accordant_rq.Ainl.SensitivityPoint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getAnalyzedQSAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getAnalyzedQSAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAnalyzedQS"


    // $ANTLR start "entryRuleSensitivityPoint"
    // InternalAinl.g:782:1: entryRuleSensitivityPoint returns [EObject current=null] : iv_ruleSensitivityPoint= ruleSensitivityPoint EOF ;
    public final EObject entryRuleSensitivityPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensitivityPoint = null;


        try {
            // InternalAinl.g:782:57: (iv_ruleSensitivityPoint= ruleSensitivityPoint EOF )
            // InternalAinl.g:783:2: iv_ruleSensitivityPoint= ruleSensitivityPoint EOF
            {
             newCompositeNode(grammarAccess.getSensitivityPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensitivityPoint=ruleSensitivityPoint();

            state._fsp--;

             current =iv_ruleSensitivityPoint; 
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
    // $ANTLR end "entryRuleSensitivityPoint"


    // $ANTLR start "ruleSensitivityPoint"
    // InternalAinl.g:789:1: ruleSensitivityPoint returns [EObject current=null] : (otherlv_0= 'SensitivityPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_isRisk_3_0= 'isRisk' ) )? (otherlv_4= 'rationale' otherlv_5= ':' ( (lv_rationale_6_0= ruleEString ) ) )? (otherlv_7= 'code' otherlv_8= ':' ( (lv_code_9_0= ruleEString ) ) )? otherlv_10= 'tactics' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' otherlv_16= '}' ) ;
    public final EObject ruleSensitivityPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_isRisk_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_rationale_6_0 = null;

        AntlrDatatypeRuleToken lv_code_9_0 = null;



        	enterRule();

        try {
            // InternalAinl.g:795:2: ( (otherlv_0= 'SensitivityPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_isRisk_3_0= 'isRisk' ) )? (otherlv_4= 'rationale' otherlv_5= ':' ( (lv_rationale_6_0= ruleEString ) ) )? (otherlv_7= 'code' otherlv_8= ':' ( (lv_code_9_0= ruleEString ) ) )? otherlv_10= 'tactics' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' otherlv_16= '}' ) )
            // InternalAinl.g:796:2: (otherlv_0= 'SensitivityPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_isRisk_3_0= 'isRisk' ) )? (otherlv_4= 'rationale' otherlv_5= ':' ( (lv_rationale_6_0= ruleEString ) ) )? (otherlv_7= 'code' otherlv_8= ':' ( (lv_code_9_0= ruleEString ) ) )? otherlv_10= 'tactics' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' otherlv_16= '}' )
            {
            // InternalAinl.g:796:2: (otherlv_0= 'SensitivityPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_isRisk_3_0= 'isRisk' ) )? (otherlv_4= 'rationale' otherlv_5= ':' ( (lv_rationale_6_0= ruleEString ) ) )? (otherlv_7= 'code' otherlv_8= ':' ( (lv_code_9_0= ruleEString ) ) )? otherlv_10= 'tactics' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' otherlv_16= '}' )
            // InternalAinl.g:797:3: otherlv_0= 'SensitivityPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_isRisk_3_0= 'isRisk' ) )? (otherlv_4= 'rationale' otherlv_5= ':' ( (lv_rationale_6_0= ruleEString ) ) )? (otherlv_7= 'code' otherlv_8= ':' ( (lv_code_9_0= ruleEString ) ) )? otherlv_10= 'tactics' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSensitivityPointAccess().getSensitivityPointKeyword_0());
            		
            // InternalAinl.g:801:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAinl.g:802:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAinl.g:802:4: (lv_name_1_0= RULE_ID )
            // InternalAinl.g:803:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSensitivityPointAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensitivityPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getSensitivityPointAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAinl.g:823:3: ( (lv_isRisk_3_0= 'isRisk' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAinl.g:824:4: (lv_isRisk_3_0= 'isRisk' )
                    {
                    // InternalAinl.g:824:4: (lv_isRisk_3_0= 'isRisk' )
                    // InternalAinl.g:825:5: lv_isRisk_3_0= 'isRisk'
                    {
                    lv_isRisk_3_0=(Token)match(input,37,FOLLOW_37); 

                    					newLeafNode(lv_isRisk_3_0, grammarAccess.getSensitivityPointAccess().getIsRiskIsRiskKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSensitivityPointRule());
                    					}
                    					setWithLastConsumed(current, "isRisk", true, "isRisk");
                    				

                    }


                    }
                    break;

            }

            // InternalAinl.g:837:3: (otherlv_4= 'rationale' otherlv_5= ':' ( (lv_rationale_6_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAinl.g:838:4: otherlv_4= 'rationale' otherlv_5= ':' ( (lv_rationale_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getSensitivityPointAccess().getRationaleKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getSensitivityPointAccess().getColonKeyword_4_1());
                    			
                    // InternalAinl.g:846:4: ( (lv_rationale_6_0= ruleEString ) )
                    // InternalAinl.g:847:5: (lv_rationale_6_0= ruleEString )
                    {
                    // InternalAinl.g:847:5: (lv_rationale_6_0= ruleEString )
                    // InternalAinl.g:848:6: lv_rationale_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSensitivityPointAccess().getRationaleEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_rationale_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensitivityPointRule());
                    						}
                    						set(
                    							current,
                    							"rationale",
                    							lv_rationale_6_0,
                    							"co.edu.uniandes.accordant_rq.Ainl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAinl.g:866:3: (otherlv_7= 'code' otherlv_8= ':' ( (lv_code_9_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAinl.g:867:4: otherlv_7= 'code' otherlv_8= ':' ( (lv_code_9_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getSensitivityPointAccess().getCodeKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getSensitivityPointAccess().getColonKeyword_5_1());
                    			
                    // InternalAinl.g:875:4: ( (lv_code_9_0= ruleEString ) )
                    // InternalAinl.g:876:5: (lv_code_9_0= ruleEString )
                    {
                    // InternalAinl.g:876:5: (lv_code_9_0= ruleEString )
                    // InternalAinl.g:877:6: lv_code_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSensitivityPointAccess().getCodeEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_code_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensitivityPointRule());
                    						}
                    						set(
                    							current,
                    							"code",
                    							lv_code_9_0,
                    							"co.edu.uniandes.accordant_rq.Ainl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_39); 

            			newLeafNode(otherlv_10, grammarAccess.getSensitivityPointAccess().getTacticsKeyword_6());
            		
            otherlv_11=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getSensitivityPointAccess().getLeftParenthesisKeyword_7());
            		
            // InternalAinl.g:903:3: ( (otherlv_12= RULE_ID ) )
            // InternalAinl.g:904:4: (otherlv_12= RULE_ID )
            {
            // InternalAinl.g:904:4: (otherlv_12= RULE_ID )
            // InternalAinl.g:905:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensitivityPointRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(otherlv_12, grammarAccess.getSensitivityPointAccess().getAppliedTacticsTacticCrossReference_8_0());
            				

            }


            }

            // InternalAinl.g:916:3: (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==14) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAinl.g:917:4: otherlv_13= ',' ( (otherlv_14= RULE_ID ) )
            	    {
            	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_13, grammarAccess.getSensitivityPointAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalAinl.g:921:4: ( (otherlv_14= RULE_ID ) )
            	    // InternalAinl.g:922:5: (otherlv_14= RULE_ID )
            	    {
            	    // InternalAinl.g:922:5: (otherlv_14= RULE_ID )
            	    // InternalAinl.g:923:6: otherlv_14= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSensitivityPointRule());
            	    						}
            	    					
            	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_40); 

            	    						newLeafNode(otherlv_14, grammarAccess.getSensitivityPointAccess().getAppliedTacticsTacticCrossReference_9_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_15=(Token)match(input,41,FOLLOW_12); 

            			newLeafNode(otherlv_15, grammarAccess.getSensitivityPointAccess().getRightParenthesisKeyword_10());
            		
            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getSensitivityPointAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleSensitivityPoint"


    // $ANTLR start "entryRuleTactic"
    // InternalAinl.g:947:1: entryRuleTactic returns [EObject current=null] : iv_ruleTactic= ruleTactic EOF ;
    public final EObject entryRuleTactic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTactic = null;


        try {
            // InternalAinl.g:947:47: (iv_ruleTactic= ruleTactic EOF )
            // InternalAinl.g:948:2: iv_ruleTactic= ruleTactic EOF
            {
             newCompositeNode(grammarAccess.getTacticRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTactic=ruleTactic();

            state._fsp--;

             current =iv_ruleTactic; 
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
    // $ANTLR end "entryRuleTactic"


    // $ANTLR start "ruleTactic"
    // InternalAinl.g:954:1: ruleTactic returns [EObject current=null] : ( () otherlv_1= 'Tactic' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'QA' otherlv_5= ':' ( (lv_qAttribute_6_0= ruleQAttribute ) ) )? (otherlv_7= 'rationale' otherlv_8= ':' ( (lv_rationale_9_0= ruleEString ) ) )? (otherlv_10= 'stimulus' otherlv_11= ':' ( (lv_stimulus_12_0= ruleEString ) ) )? (otherlv_13= 'response' otherlv_14= ':' ( (lv_response_15_0= ruleEString ) ) )? (otherlv_16= 'viewpoint' otherlv_17= ':' ( (lv_viewpoint_18_0= ruleEString ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleTactic() throws RecognitionException {
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
        Enumerator lv_qAttribute_6_0 = null;

        AntlrDatatypeRuleToken lv_rationale_9_0 = null;

        AntlrDatatypeRuleToken lv_stimulus_12_0 = null;

        AntlrDatatypeRuleToken lv_response_15_0 = null;

        AntlrDatatypeRuleToken lv_viewpoint_18_0 = null;



        	enterRule();

        try {
            // InternalAinl.g:960:2: ( ( () otherlv_1= 'Tactic' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'QA' otherlv_5= ':' ( (lv_qAttribute_6_0= ruleQAttribute ) ) )? (otherlv_7= 'rationale' otherlv_8= ':' ( (lv_rationale_9_0= ruleEString ) ) )? (otherlv_10= 'stimulus' otherlv_11= ':' ( (lv_stimulus_12_0= ruleEString ) ) )? (otherlv_13= 'response' otherlv_14= ':' ( (lv_response_15_0= ruleEString ) ) )? (otherlv_16= 'viewpoint' otherlv_17= ':' ( (lv_viewpoint_18_0= ruleEString ) ) )? otherlv_19= '}' ) )
            // InternalAinl.g:961:2: ( () otherlv_1= 'Tactic' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'QA' otherlv_5= ':' ( (lv_qAttribute_6_0= ruleQAttribute ) ) )? (otherlv_7= 'rationale' otherlv_8= ':' ( (lv_rationale_9_0= ruleEString ) ) )? (otherlv_10= 'stimulus' otherlv_11= ':' ( (lv_stimulus_12_0= ruleEString ) ) )? (otherlv_13= 'response' otherlv_14= ':' ( (lv_response_15_0= ruleEString ) ) )? (otherlv_16= 'viewpoint' otherlv_17= ':' ( (lv_viewpoint_18_0= ruleEString ) ) )? otherlv_19= '}' )
            {
            // InternalAinl.g:961:2: ( () otherlv_1= 'Tactic' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'QA' otherlv_5= ':' ( (lv_qAttribute_6_0= ruleQAttribute ) ) )? (otherlv_7= 'rationale' otherlv_8= ':' ( (lv_rationale_9_0= ruleEString ) ) )? (otherlv_10= 'stimulus' otherlv_11= ':' ( (lv_stimulus_12_0= ruleEString ) ) )? (otherlv_13= 'response' otherlv_14= ':' ( (lv_response_15_0= ruleEString ) ) )? (otherlv_16= 'viewpoint' otherlv_17= ':' ( (lv_viewpoint_18_0= ruleEString ) ) )? otherlv_19= '}' )
            // InternalAinl.g:962:3: () otherlv_1= 'Tactic' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'QA' otherlv_5= ':' ( (lv_qAttribute_6_0= ruleQAttribute ) ) )? (otherlv_7= 'rationale' otherlv_8= ':' ( (lv_rationale_9_0= ruleEString ) ) )? (otherlv_10= 'stimulus' otherlv_11= ':' ( (lv_stimulus_12_0= ruleEString ) ) )? (otherlv_13= 'response' otherlv_14= ':' ( (lv_response_15_0= ruleEString ) ) )? (otherlv_16= 'viewpoint' otherlv_17= ':' ( (lv_viewpoint_18_0= ruleEString ) ) )? otherlv_19= '}'
            {
            // InternalAinl.g:962:3: ()
            // InternalAinl.g:963:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTacticAccess().getTacticAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTacticAccess().getTacticKeyword_1());
            		
            // InternalAinl.g:973:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAinl.g:974:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAinl.g:974:4: (lv_name_2_0= RULE_ID )
            // InternalAinl.g:975:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTacticAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTacticRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getTacticAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAinl.g:995:3: (otherlv_4= 'QA' otherlv_5= ':' ( (lv_qAttribute_6_0= ruleQAttribute ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAinl.g:996:4: otherlv_4= 'QA' otherlv_5= ':' ( (lv_qAttribute_6_0= ruleQAttribute ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getTacticAccess().getQAKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getTacticAccess().getColonKeyword_4_1());
                    			
                    // InternalAinl.g:1004:4: ( (lv_qAttribute_6_0= ruleQAttribute ) )
                    // InternalAinl.g:1005:5: (lv_qAttribute_6_0= ruleQAttribute )
                    {
                    // InternalAinl.g:1005:5: (lv_qAttribute_6_0= ruleQAttribute )
                    // InternalAinl.g:1006:6: lv_qAttribute_6_0= ruleQAttribute
                    {

                    						newCompositeNode(grammarAccess.getTacticAccess().getQAttributeQAttributeEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_qAttribute_6_0=ruleQAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTacticRule());
                    						}
                    						set(
                    							current,
                    							"qAttribute",
                    							lv_qAttribute_6_0,
                    							"co.edu.uniandes.accordant_rq.Ainl.QAttribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAinl.g:1024:3: (otherlv_7= 'rationale' otherlv_8= ':' ( (lv_rationale_9_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAinl.g:1025:4: otherlv_7= 'rationale' otherlv_8= ':' ( (lv_rationale_9_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getTacticAccess().getRationaleKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getTacticAccess().getColonKeyword_5_1());
                    			
                    // InternalAinl.g:1033:4: ( (lv_rationale_9_0= ruleEString ) )
                    // InternalAinl.g:1034:5: (lv_rationale_9_0= ruleEString )
                    {
                    // InternalAinl.g:1034:5: (lv_rationale_9_0= ruleEString )
                    // InternalAinl.g:1035:6: lv_rationale_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTacticAccess().getRationaleEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_rationale_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTacticRule());
                    						}
                    						set(
                    							current,
                    							"rationale",
                    							lv_rationale_9_0,
                    							"co.edu.uniandes.accordant_rq.Ainl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAinl.g:1053:3: (otherlv_10= 'stimulus' otherlv_11= ':' ( (lv_stimulus_12_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAinl.g:1054:4: otherlv_10= 'stimulus' otherlv_11= ':' ( (lv_stimulus_12_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getTacticAccess().getStimulusKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getTacticAccess().getColonKeyword_6_1());
                    			
                    // InternalAinl.g:1062:4: ( (lv_stimulus_12_0= ruleEString ) )
                    // InternalAinl.g:1063:5: (lv_stimulus_12_0= ruleEString )
                    {
                    // InternalAinl.g:1063:5: (lv_stimulus_12_0= ruleEString )
                    // InternalAinl.g:1064:6: lv_stimulus_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTacticAccess().getStimulusEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_stimulus_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTacticRule());
                    						}
                    						set(
                    							current,
                    							"stimulus",
                    							lv_stimulus_12_0,
                    							"co.edu.uniandes.accordant_rq.Ainl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAinl.g:1082:3: (otherlv_13= 'response' otherlv_14= ':' ( (lv_response_15_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAinl.g:1083:4: otherlv_13= 'response' otherlv_14= ':' ( (lv_response_15_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_13, grammarAccess.getTacticAccess().getResponseKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_14, grammarAccess.getTacticAccess().getColonKeyword_7_1());
                    			
                    // InternalAinl.g:1091:4: ( (lv_response_15_0= ruleEString ) )
                    // InternalAinl.g:1092:5: (lv_response_15_0= ruleEString )
                    {
                    // InternalAinl.g:1092:5: (lv_response_15_0= ruleEString )
                    // InternalAinl.g:1093:6: lv_response_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTacticAccess().getResponseEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_response_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTacticRule());
                    						}
                    						set(
                    							current,
                    							"response",
                    							lv_response_15_0,
                    							"co.edu.uniandes.accordant_rq.Ainl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAinl.g:1111:3: (otherlv_16= 'viewpoint' otherlv_17= ':' ( (lv_viewpoint_18_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAinl.g:1112:4: otherlv_16= 'viewpoint' otherlv_17= ':' ( (lv_viewpoint_18_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,43,FOLLOW_14); 

                    				newLeafNode(otherlv_16, grammarAccess.getTacticAccess().getViewpointKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getTacticAccess().getColonKeyword_8_1());
                    			
                    // InternalAinl.g:1120:4: ( (lv_viewpoint_18_0= ruleEString ) )
                    // InternalAinl.g:1121:5: (lv_viewpoint_18_0= ruleEString )
                    {
                    // InternalAinl.g:1121:5: (lv_viewpoint_18_0= ruleEString )
                    // InternalAinl.g:1122:6: lv_viewpoint_18_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTacticAccess().getViewpointEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_viewpoint_18_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTacticRule());
                    						}
                    						set(
                    							current,
                    							"viewpoint",
                    							lv_viewpoint_18_0,
                    							"co.edu.uniandes.accordant_rq.Ainl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getTacticAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleTactic"


    // $ANTLR start "ruleQAMetric"
    // InternalAinl.g:1148:1: ruleQAMetric returns [Enumerator current=null] : ( (enumLiteral_0= 'THROUGHPUT' ) | (enumLiteral_1= 'LATENCY' ) | (enumLiteral_2= 'DEADLINE' ) ) ;
    public final Enumerator ruleQAMetric() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAinl.g:1154:2: ( ( (enumLiteral_0= 'THROUGHPUT' ) | (enumLiteral_1= 'LATENCY' ) | (enumLiteral_2= 'DEADLINE' ) ) )
            // InternalAinl.g:1155:2: ( (enumLiteral_0= 'THROUGHPUT' ) | (enumLiteral_1= 'LATENCY' ) | (enumLiteral_2= 'DEADLINE' ) )
            {
            // InternalAinl.g:1155:2: ( (enumLiteral_0= 'THROUGHPUT' ) | (enumLiteral_1= 'LATENCY' ) | (enumLiteral_2= 'DEADLINE' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt22=1;
                }
                break;
            case 45:
                {
                alt22=2;
                }
                break;
            case 46:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalAinl.g:1156:3: (enumLiteral_0= 'THROUGHPUT' )
                    {
                    // InternalAinl.g:1156:3: (enumLiteral_0= 'THROUGHPUT' )
                    // InternalAinl.g:1157:4: enumLiteral_0= 'THROUGHPUT'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getQAMetricAccess().getTHROUGHPUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQAMetricAccess().getTHROUGHPUTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAinl.g:1164:3: (enumLiteral_1= 'LATENCY' )
                    {
                    // InternalAinl.g:1164:3: (enumLiteral_1= 'LATENCY' )
                    // InternalAinl.g:1165:4: enumLiteral_1= 'LATENCY'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getQAMetricAccess().getLATENCYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQAMetricAccess().getLATENCYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAinl.g:1172:3: (enumLiteral_2= 'DEADLINE' )
                    {
                    // InternalAinl.g:1172:3: (enumLiteral_2= 'DEADLINE' )
                    // InternalAinl.g:1173:4: enumLiteral_2= 'DEADLINE'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getQAMetricAccess().getDEADLINEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getQAMetricAccess().getDEADLINEEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleQAMetric"


    // $ANTLR start "ruleMetricUnit"
    // InternalAinl.g:1183:1: ruleMetricUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'MILLIS' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'TASKS' ) | (enumLiteral_5= 'BYTES' ) | (enumLiteral_6= 'MSGS' ) ) ;
    public final Enumerator ruleMetricUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalAinl.g:1189:2: ( ( (enumLiteral_0= 'MILLIS' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'TASKS' ) | (enumLiteral_5= 'BYTES' ) | (enumLiteral_6= 'MSGS' ) ) )
            // InternalAinl.g:1190:2: ( (enumLiteral_0= 'MILLIS' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'TASKS' ) | (enumLiteral_5= 'BYTES' ) | (enumLiteral_6= 'MSGS' ) )
            {
            // InternalAinl.g:1190:2: ( (enumLiteral_0= 'MILLIS' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'TASKS' ) | (enumLiteral_5= 'BYTES' ) | (enumLiteral_6= 'MSGS' ) )
            int alt23=7;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt23=1;
                }
                break;
            case 48:
                {
                alt23=2;
                }
                break;
            case 49:
                {
                alt23=3;
                }
                break;
            case 50:
                {
                alt23=4;
                }
                break;
            case 51:
                {
                alt23=5;
                }
                break;
            case 52:
                {
                alt23=6;
                }
                break;
            case 53:
                {
                alt23=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalAinl.g:1191:3: (enumLiteral_0= 'MILLIS' )
                    {
                    // InternalAinl.g:1191:3: (enumLiteral_0= 'MILLIS' )
                    // InternalAinl.g:1192:4: enumLiteral_0= 'MILLIS'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getMetricUnitAccess().getMILLISEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMetricUnitAccess().getMILLISEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAinl.g:1199:3: (enumLiteral_1= 'SECONDS' )
                    {
                    // InternalAinl.g:1199:3: (enumLiteral_1= 'SECONDS' )
                    // InternalAinl.g:1200:4: enumLiteral_1= 'SECONDS'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getMetricUnitAccess().getSECONDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMetricUnitAccess().getSECONDSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAinl.g:1207:3: (enumLiteral_2= 'MINUTES' )
                    {
                    // InternalAinl.g:1207:3: (enumLiteral_2= 'MINUTES' )
                    // InternalAinl.g:1208:4: enumLiteral_2= 'MINUTES'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getMetricUnitAccess().getMINUTESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMetricUnitAccess().getMINUTESEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAinl.g:1215:3: (enumLiteral_3= 'HOURS' )
                    {
                    // InternalAinl.g:1215:3: (enumLiteral_3= 'HOURS' )
                    // InternalAinl.g:1216:4: enumLiteral_3= 'HOURS'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getMetricUnitAccess().getHOURSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMetricUnitAccess().getHOURSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAinl.g:1223:3: (enumLiteral_4= 'TASKS' )
                    {
                    // InternalAinl.g:1223:3: (enumLiteral_4= 'TASKS' )
                    // InternalAinl.g:1224:4: enumLiteral_4= 'TASKS'
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getMetricUnitAccess().getTASKSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMetricUnitAccess().getTASKSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAinl.g:1231:3: (enumLiteral_5= 'BYTES' )
                    {
                    // InternalAinl.g:1231:3: (enumLiteral_5= 'BYTES' )
                    // InternalAinl.g:1232:4: enumLiteral_5= 'BYTES'
                    {
                    enumLiteral_5=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getMetricUnitAccess().getBYTESEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMetricUnitAccess().getBYTESEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAinl.g:1239:3: (enumLiteral_6= 'MSGS' )
                    {
                    // InternalAinl.g:1239:3: (enumLiteral_6= 'MSGS' )
                    // InternalAinl.g:1240:4: enumLiteral_6= 'MSGS'
                    {
                    enumLiteral_6=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getMetricUnitAccess().getMSGSEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMetricUnitAccess().getMSGSEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleMetricUnit"


    // $ANTLR start "ruleQAttribute"
    // InternalAinl.g:1250:1: ruleQAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'AVAILABILITY' ) | (enumLiteral_1= 'PERFORMANCE' ) | (enumLiteral_2= 'MODIFIABILITY' ) | (enumLiteral_3= 'TESTABILITY' ) | (enumLiteral_4= 'SCALABILITY' ) ) ;
    public final Enumerator ruleQAttribute() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalAinl.g:1256:2: ( ( (enumLiteral_0= 'AVAILABILITY' ) | (enumLiteral_1= 'PERFORMANCE' ) | (enumLiteral_2= 'MODIFIABILITY' ) | (enumLiteral_3= 'TESTABILITY' ) | (enumLiteral_4= 'SCALABILITY' ) ) )
            // InternalAinl.g:1257:2: ( (enumLiteral_0= 'AVAILABILITY' ) | (enumLiteral_1= 'PERFORMANCE' ) | (enumLiteral_2= 'MODIFIABILITY' ) | (enumLiteral_3= 'TESTABILITY' ) | (enumLiteral_4= 'SCALABILITY' ) )
            {
            // InternalAinl.g:1257:2: ( (enumLiteral_0= 'AVAILABILITY' ) | (enumLiteral_1= 'PERFORMANCE' ) | (enumLiteral_2= 'MODIFIABILITY' ) | (enumLiteral_3= 'TESTABILITY' ) | (enumLiteral_4= 'SCALABILITY' ) )
            int alt24=5;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt24=1;
                }
                break;
            case 55:
                {
                alt24=2;
                }
                break;
            case 56:
                {
                alt24=3;
                }
                break;
            case 57:
                {
                alt24=4;
                }
                break;
            case 58:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalAinl.g:1258:3: (enumLiteral_0= 'AVAILABILITY' )
                    {
                    // InternalAinl.g:1258:3: (enumLiteral_0= 'AVAILABILITY' )
                    // InternalAinl.g:1259:4: enumLiteral_0= 'AVAILABILITY'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getQAttributeAccess().getAVAILABILITYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQAttributeAccess().getAVAILABILITYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAinl.g:1266:3: (enumLiteral_1= 'PERFORMANCE' )
                    {
                    // InternalAinl.g:1266:3: (enumLiteral_1= 'PERFORMANCE' )
                    // InternalAinl.g:1267:4: enumLiteral_1= 'PERFORMANCE'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getQAttributeAccess().getPERFORMANCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQAttributeAccess().getPERFORMANCEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAinl.g:1274:3: (enumLiteral_2= 'MODIFIABILITY' )
                    {
                    // InternalAinl.g:1274:3: (enumLiteral_2= 'MODIFIABILITY' )
                    // InternalAinl.g:1275:4: enumLiteral_2= 'MODIFIABILITY'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getQAttributeAccess().getMODIFIABILITYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getQAttributeAccess().getMODIFIABILITYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAinl.g:1282:3: (enumLiteral_3= 'TESTABILITY' )
                    {
                    // InternalAinl.g:1282:3: (enumLiteral_3= 'TESTABILITY' )
                    // InternalAinl.g:1283:4: enumLiteral_3= 'TESTABILITY'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getQAttributeAccess().getTESTABILITYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getQAttributeAccess().getTESTABILITYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAinl.g:1290:3: (enumLiteral_4= 'SCALABILITY' )
                    {
                    // InternalAinl.g:1290:3: (enumLiteral_4= 'SCALABILITY' )
                    // InternalAinl.g:1291:4: enumLiteral_4= 'SCALABILITY'
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getQAttributeAccess().getSCALABILITYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getQAttributeAccess().getSCALABILITYEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleQAttribute"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x07C0000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000030000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x003F800000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000C00008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000E000020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000C000020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000004000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000084000A88000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000084000A08000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080000A08000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000808000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000080000008000L});

}