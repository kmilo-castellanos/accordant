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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Project'", "'{'", "'QScenarios'", "','", "'}'", "'analyzedQScenarios'", "'constraints'", "'tactics'", "'QS'", "'QA'", "':'", "'stimulus'", "'environment'", "'response'", "'measure'", "'between'", "'and'", "'in'", "'-'", "'.'", "'E'", "'e'", "'AQS'", "'of'", "'reasoning'", "'Sensitivity_Points'", "'SensitivityPoint'", "'isRisk'", "'rationale'", "'code'", "'('", "')'", "'Constraint'", "'type'", "'='", "'Tactic'", "'viewpoint'", "'THROUGHPUT'", "'LATENCY'", "'DEADLINE'", "'UPDATETIME'", "'MILLIS'", "'SECONDS'", "'MINUTES'", "'HOURS'", "'TASKS'", "'BYTES'", "'MSGS'", "'AVAILABILITY'", "'PERFORMANCE'", "'MODIFIABILITY'", "'TESTABILITY'", "'SCALABILITY'", "'ARCH_STYLE'", "'CLOUD_PROV'", "'LICENSE'", "'PROC_MODEL'", "'TECH_VENDOR'"
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
        	return "Project";
       	}

       	@Override
       	protected AinlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProject"
    // InternalAinl.g:65:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalAinl.g:65:48: (iv_ruleProject= ruleProject EOF )
            // InternalAinl.g:66:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalAinl.g:72:1: ruleProject returns [EObject current=null] : ( () otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'QScenarios' otherlv_5= '{' ( (lv_scenarios_6_0= ruleQScenario ) ) (otherlv_7= ',' ( (lv_scenarios_8_0= ruleQScenario ) ) )* otherlv_9= '}' (otherlv_10= 'analyzedQScenarios' otherlv_11= '{' ( (lv_analyzedQs_12_0= ruleAnalyzedQS ) ) (otherlv_13= ',' ( (lv_analyzedQs_14_0= ruleAnalyzedQS ) ) )* otherlv_15= '}' )? (otherlv_16= 'constraints' otherlv_17= '{' ( (lv_constraints_18_0= ruleConstraint ) ) (otherlv_19= ',' ( (lv_constraints_20_0= ruleConstraint ) ) )* otherlv_21= '}' )? otherlv_22= 'tactics' otherlv_23= '{' ( (lv_tactics_24_0= ruleTactic ) ) (otherlv_25= ',' ( (lv_tactics_26_0= ruleTactic ) ) )* otherlv_27= '}' otherlv_28= '}' ) ;
    public final EObject ruleProject() throws RecognitionException {
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
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        EObject lv_scenarios_6_0 = null;

        EObject lv_scenarios_8_0 = null;

        EObject lv_analyzedQs_12_0 = null;

        EObject lv_analyzedQs_14_0 = null;

        EObject lv_constraints_18_0 = null;

        EObject lv_constraints_20_0 = null;

        EObject lv_tactics_24_0 = null;

        EObject lv_tactics_26_0 = null;



        	enterRule();

        try {
            // InternalAinl.g:78:2: ( ( () otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'QScenarios' otherlv_5= '{' ( (lv_scenarios_6_0= ruleQScenario ) ) (otherlv_7= ',' ( (lv_scenarios_8_0= ruleQScenario ) ) )* otherlv_9= '}' (otherlv_10= 'analyzedQScenarios' otherlv_11= '{' ( (lv_analyzedQs_12_0= ruleAnalyzedQS ) ) (otherlv_13= ',' ( (lv_analyzedQs_14_0= ruleAnalyzedQS ) ) )* otherlv_15= '}' )? (otherlv_16= 'constraints' otherlv_17= '{' ( (lv_constraints_18_0= ruleConstraint ) ) (otherlv_19= ',' ( (lv_constraints_20_0= ruleConstraint ) ) )* otherlv_21= '}' )? otherlv_22= 'tactics' otherlv_23= '{' ( (lv_tactics_24_0= ruleTactic ) ) (otherlv_25= ',' ( (lv_tactics_26_0= ruleTactic ) ) )* otherlv_27= '}' otherlv_28= '}' ) )
            // InternalAinl.g:79:2: ( () otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'QScenarios' otherlv_5= '{' ( (lv_scenarios_6_0= ruleQScenario ) ) (otherlv_7= ',' ( (lv_scenarios_8_0= ruleQScenario ) ) )* otherlv_9= '}' (otherlv_10= 'analyzedQScenarios' otherlv_11= '{' ( (lv_analyzedQs_12_0= ruleAnalyzedQS ) ) (otherlv_13= ',' ( (lv_analyzedQs_14_0= ruleAnalyzedQS ) ) )* otherlv_15= '}' )? (otherlv_16= 'constraints' otherlv_17= '{' ( (lv_constraints_18_0= ruleConstraint ) ) (otherlv_19= ',' ( (lv_constraints_20_0= ruleConstraint ) ) )* otherlv_21= '}' )? otherlv_22= 'tactics' otherlv_23= '{' ( (lv_tactics_24_0= ruleTactic ) ) (otherlv_25= ',' ( (lv_tactics_26_0= ruleTactic ) ) )* otherlv_27= '}' otherlv_28= '}' )
            {
            // InternalAinl.g:79:2: ( () otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'QScenarios' otherlv_5= '{' ( (lv_scenarios_6_0= ruleQScenario ) ) (otherlv_7= ',' ( (lv_scenarios_8_0= ruleQScenario ) ) )* otherlv_9= '}' (otherlv_10= 'analyzedQScenarios' otherlv_11= '{' ( (lv_analyzedQs_12_0= ruleAnalyzedQS ) ) (otherlv_13= ',' ( (lv_analyzedQs_14_0= ruleAnalyzedQS ) ) )* otherlv_15= '}' )? (otherlv_16= 'constraints' otherlv_17= '{' ( (lv_constraints_18_0= ruleConstraint ) ) (otherlv_19= ',' ( (lv_constraints_20_0= ruleConstraint ) ) )* otherlv_21= '}' )? otherlv_22= 'tactics' otherlv_23= '{' ( (lv_tactics_24_0= ruleTactic ) ) (otherlv_25= ',' ( (lv_tactics_26_0= ruleTactic ) ) )* otherlv_27= '}' otherlv_28= '}' )
            // InternalAinl.g:80:3: () otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'QScenarios' otherlv_5= '{' ( (lv_scenarios_6_0= ruleQScenario ) ) (otherlv_7= ',' ( (lv_scenarios_8_0= ruleQScenario ) ) )* otherlv_9= '}' (otherlv_10= 'analyzedQScenarios' otherlv_11= '{' ( (lv_analyzedQs_12_0= ruleAnalyzedQS ) ) (otherlv_13= ',' ( (lv_analyzedQs_14_0= ruleAnalyzedQS ) ) )* otherlv_15= '}' )? (otherlv_16= 'constraints' otherlv_17= '{' ( (lv_constraints_18_0= ruleConstraint ) ) (otherlv_19= ',' ( (lv_constraints_20_0= ruleConstraint ) ) )* otherlv_21= '}' )? otherlv_22= 'tactics' otherlv_23= '{' ( (lv_tactics_24_0= ruleTactic ) ) (otherlv_25= ',' ( (lv_tactics_26_0= ruleTactic ) ) )* otherlv_27= '}' otherlv_28= '}'
            {
            // InternalAinl.g:80:3: ()
            // InternalAinl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProjectAccess().getProjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectAccess().getProjectKeyword_1());
            		
            // InternalAinl.g:91:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAinl.g:92:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAinl.g:92:4: (lv_name_2_0= RULE_ID )
            // InternalAinl.g:93:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getProjectAccess().getQScenariosKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalAinl.g:121:3: ( (lv_scenarios_6_0= ruleQScenario ) )
            // InternalAinl.g:122:4: (lv_scenarios_6_0= ruleQScenario )
            {
            // InternalAinl.g:122:4: (lv_scenarios_6_0= ruleQScenario )
            // InternalAinl.g:123:5: lv_scenarios_6_0= ruleQScenario
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getScenariosQScenarioParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_scenarios_6_0=ruleQScenario();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
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

            	    				newLeafNode(otherlv_7, grammarAccess.getProjectAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalAinl.g:145:4: ( (lv_scenarios_8_0= ruleQScenario ) )
            	    // InternalAinl.g:146:5: (lv_scenarios_8_0= ruleQScenario )
            	    {
            	    // InternalAinl.g:146:5: (lv_scenarios_8_0= ruleQScenario )
            	    // InternalAinl.g:147:6: lv_scenarios_8_0= ruleQScenario
            	    {

            	    						newCompositeNode(grammarAccess.getProjectAccess().getScenariosQScenarioParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_scenarios_8_0=ruleQScenario();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectRule());
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

            			newLeafNode(otherlv_9, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_8());
            		
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

                    				newLeafNode(otherlv_10, grammarAccess.getProjectAccess().getAnalyzedQScenariosKeyword_9_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalAinl.g:178:4: ( (lv_analyzedQs_12_0= ruleAnalyzedQS ) )
                    // InternalAinl.g:179:5: (lv_analyzedQs_12_0= ruleAnalyzedQS )
                    {
                    // InternalAinl.g:179:5: (lv_analyzedQs_12_0= ruleAnalyzedQS )
                    // InternalAinl.g:180:6: lv_analyzedQs_12_0= ruleAnalyzedQS
                    {

                    						newCompositeNode(grammarAccess.getProjectAccess().getAnalyzedQsAnalyzedQSParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_analyzedQs_12_0=ruleAnalyzedQS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjectRule());
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

                    	    					newLeafNode(otherlv_13, grammarAccess.getProjectAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalAinl.g:202:5: ( (lv_analyzedQs_14_0= ruleAnalyzedQS ) )
                    	    // InternalAinl.g:203:6: (lv_analyzedQs_14_0= ruleAnalyzedQS )
                    	    {
                    	    // InternalAinl.g:203:6: (lv_analyzedQs_14_0= ruleAnalyzedQS )
                    	    // InternalAinl.g:204:7: lv_analyzedQs_14_0= ruleAnalyzedQS
                    	    {

                    	    							newCompositeNode(grammarAccess.getProjectAccess().getAnalyzedQsAnalyzedQSParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_analyzedQs_14_0=ruleAnalyzedQS();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProjectRule());
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

                    				newLeafNode(otherlv_15, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalAinl.g:227:3: (otherlv_16= 'constraints' otherlv_17= '{' ( (lv_constraints_18_0= ruleConstraint ) ) (otherlv_19= ',' ( (lv_constraints_20_0= ruleConstraint ) ) )* otherlv_21= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAinl.g:228:4: otherlv_16= 'constraints' otherlv_17= '{' ( (lv_constraints_18_0= ruleConstraint ) ) (otherlv_19= ',' ( (lv_constraints_20_0= ruleConstraint ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getProjectAccess().getConstraintsKeyword_10_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalAinl.g:236:4: ( (lv_constraints_18_0= ruleConstraint ) )
                    // InternalAinl.g:237:5: (lv_constraints_18_0= ruleConstraint )
                    {
                    // InternalAinl.g:237:5: (lv_constraints_18_0= ruleConstraint )
                    // InternalAinl.g:238:6: lv_constraints_18_0= ruleConstraint
                    {

                    						newCompositeNode(grammarAccess.getProjectAccess().getConstraintsConstraintParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_constraints_18_0=ruleConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjectRule());
                    						}
                    						add(
                    							current,
                    							"constraints",
                    							lv_constraints_18_0,
                    							"co.edu.uniandes.accordant_rq.Ainl.Constraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAinl.g:255:4: (otherlv_19= ',' ( (lv_constraints_20_0= ruleConstraint ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalAinl.g:256:5: otherlv_19= ',' ( (lv_constraints_20_0= ruleConstraint ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getProjectAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalAinl.g:260:5: ( (lv_constraints_20_0= ruleConstraint ) )
                    	    // InternalAinl.g:261:6: (lv_constraints_20_0= ruleConstraint )
                    	    {
                    	    // InternalAinl.g:261:6: (lv_constraints_20_0= ruleConstraint )
                    	    // InternalAinl.g:262:7: lv_constraints_20_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getProjectAccess().getConstraintsConstraintParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_constraints_20_0=ruleConstraint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"constraints",
                    	    								lv_constraints_20_0,
                    	    								"co.edu.uniandes.accordant_rq.Ainl.Constraint");
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

                    				newLeafNode(otherlv_21, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_22, grammarAccess.getProjectAccess().getTacticsKeyword_11());
            		
            otherlv_23=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_23, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalAinl.g:293:3: ( (lv_tactics_24_0= ruleTactic ) )
            // InternalAinl.g:294:4: (lv_tactics_24_0= ruleTactic )
            {
            // InternalAinl.g:294:4: (lv_tactics_24_0= ruleTactic )
            // InternalAinl.g:295:5: lv_tactics_24_0= ruleTactic
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getTacticsTacticParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_7);
            lv_tactics_24_0=ruleTactic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					add(
            						current,
            						"tactics",
            						lv_tactics_24_0,
            						"co.edu.uniandes.accordant_rq.Ainl.Tactic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAinl.g:312:3: (otherlv_25= ',' ( (lv_tactics_26_0= ruleTactic ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAinl.g:313:4: otherlv_25= ',' ( (lv_tactics_26_0= ruleTactic ) )
            	    {
            	    otherlv_25=(Token)match(input,14,FOLLOW_13); 

            	    				newLeafNode(otherlv_25, grammarAccess.getProjectAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalAinl.g:317:4: ( (lv_tactics_26_0= ruleTactic ) )
            	    // InternalAinl.g:318:5: (lv_tactics_26_0= ruleTactic )
            	    {
            	    // InternalAinl.g:318:5: (lv_tactics_26_0= ruleTactic )
            	    // InternalAinl.g:319:6: lv_tactics_26_0= ruleTactic
            	    {

            	    						newCompositeNode(grammarAccess.getProjectAccess().getTacticsTacticParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_tactics_26_0=ruleTactic();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tactics",
            	    							lv_tactics_26_0,
            	    							"co.edu.uniandes.accordant_rq.Ainl.Tactic");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_27=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_27, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_28=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_16());
            		

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleEString"
    // InternalAinl.g:349:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAinl.g:349:47: (iv_ruleEString= ruleEString EOF )
            // InternalAinl.g:350:2: iv_ruleEString= ruleEString EOF
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
    // InternalAinl.g:356:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAinl.g:362:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAinl.g:363:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAinl.g:363:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAinl.g:364:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAinl.g:372:3: this_ID_1= RULE_ID
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
    // InternalAinl.g:383:1: entryRuleQScenario returns [EObject current=null] : iv_ruleQScenario= ruleQScenario EOF ;
    public final EObject entryRuleQScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQScenario = null;


        try {
            // InternalAinl.g:383:50: (iv_ruleQScenario= ruleQScenario EOF )
            // InternalAinl.g:384:2: iv_ruleQScenario= ruleQScenario EOF
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
    // InternalAinl.g:390:1: ruleQScenario returns [EObject current=null] : (otherlv_0= 'QS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'QA' otherlv_4= ':' ( (lv_qAttribute_5_0= ruleQAttribute ) ) otherlv_6= 'stimulus' otherlv_7= ':' ( (lv_stimulus_8_0= ruleEString ) ) otherlv_9= 'environment' otherlv_10= ':' ( (lv_environment_11_0= ruleEString ) ) otherlv_12= 'response' otherlv_13= ':' ( (lv_response_14_0= ruleEString ) ) otherlv_15= 'measure' otherlv_16= ':' ( (lv_measure_17_0= ruleQAMetric ) ) otherlv_18= 'between' ( (lv_minValue_19_0= ruleEFloat ) ) otherlv_20= 'and' ( (lv_maxValue_21_0= ruleEFloat ) ) otherlv_22= 'in' ( (lv_unit_23_0= ruleMetricUnit ) ) otherlv_24= '}' ) ;
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
            // InternalAinl.g:396:2: ( (otherlv_0= 'QS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'QA' otherlv_4= ':' ( (lv_qAttribute_5_0= ruleQAttribute ) ) otherlv_6= 'stimulus' otherlv_7= ':' ( (lv_stimulus_8_0= ruleEString ) ) otherlv_9= 'environment' otherlv_10= ':' ( (lv_environment_11_0= ruleEString ) ) otherlv_12= 'response' otherlv_13= ':' ( (lv_response_14_0= ruleEString ) ) otherlv_15= 'measure' otherlv_16= ':' ( (lv_measure_17_0= ruleQAMetric ) ) otherlv_18= 'between' ( (lv_minValue_19_0= ruleEFloat ) ) otherlv_20= 'and' ( (lv_maxValue_21_0= ruleEFloat ) ) otherlv_22= 'in' ( (lv_unit_23_0= ruleMetricUnit ) ) otherlv_24= '}' ) )
            // InternalAinl.g:397:2: (otherlv_0= 'QS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'QA' otherlv_4= ':' ( (lv_qAttribute_5_0= ruleQAttribute ) ) otherlv_6= 'stimulus' otherlv_7= ':' ( (lv_stimulus_8_0= ruleEString ) ) otherlv_9= 'environment' otherlv_10= ':' ( (lv_environment_11_0= ruleEString ) ) otherlv_12= 'response' otherlv_13= ':' ( (lv_response_14_0= ruleEString ) ) otherlv_15= 'measure' otherlv_16= ':' ( (lv_measure_17_0= ruleQAMetric ) ) otherlv_18= 'between' ( (lv_minValue_19_0= ruleEFloat ) ) otherlv_20= 'and' ( (lv_maxValue_21_0= ruleEFloat ) ) otherlv_22= 'in' ( (lv_unit_23_0= ruleMetricUnit ) ) otherlv_24= '}' )
            {
            // InternalAinl.g:397:2: (otherlv_0= 'QS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'QA' otherlv_4= ':' ( (lv_qAttribute_5_0= ruleQAttribute ) ) otherlv_6= 'stimulus' otherlv_7= ':' ( (lv_stimulus_8_0= ruleEString ) ) otherlv_9= 'environment' otherlv_10= ':' ( (lv_environment_11_0= ruleEString ) ) otherlv_12= 'response' otherlv_13= ':' ( (lv_response_14_0= ruleEString ) ) otherlv_15= 'measure' otherlv_16= ':' ( (lv_measure_17_0= ruleQAMetric ) ) otherlv_18= 'between' ( (lv_minValue_19_0= ruleEFloat ) ) otherlv_20= 'and' ( (lv_maxValue_21_0= ruleEFloat ) ) otherlv_22= 'in' ( (lv_unit_23_0= ruleMetricUnit ) ) otherlv_24= '}' )
            // InternalAinl.g:398:3: otherlv_0= 'QS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'QA' otherlv_4= ':' ( (lv_qAttribute_5_0= ruleQAttribute ) ) otherlv_6= 'stimulus' otherlv_7= ':' ( (lv_stimulus_8_0= ruleEString ) ) otherlv_9= 'environment' otherlv_10= ':' ( (lv_environment_11_0= ruleEString ) ) otherlv_12= 'response' otherlv_13= ':' ( (lv_response_14_0= ruleEString ) ) otherlv_15= 'measure' otherlv_16= ':' ( (lv_measure_17_0= ruleQAMetric ) ) otherlv_18= 'between' ( (lv_minValue_19_0= ruleEFloat ) ) otherlv_20= 'and' ( (lv_maxValue_21_0= ruleEFloat ) ) otherlv_22= 'in' ( (lv_unit_23_0= ruleMetricUnit ) ) otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQScenarioAccess().getQSKeyword_0());
            		
            // InternalAinl.g:402:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAinl.g:403:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAinl.g:403:4: (lv_name_1_0= RULE_ID )
            // InternalAinl.g:404:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getQScenarioAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getQScenarioAccess().getQAKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getQScenarioAccess().getColonKeyword_4());
            		
            // InternalAinl.g:432:3: ( (lv_qAttribute_5_0= ruleQAttribute ) )
            // InternalAinl.g:433:4: (lv_qAttribute_5_0= ruleQAttribute )
            {
            // InternalAinl.g:433:4: (lv_qAttribute_5_0= ruleQAttribute )
            // InternalAinl.g:434:5: lv_qAttribute_5_0= ruleQAttribute
            {

            					newCompositeNode(grammarAccess.getQScenarioAccess().getQAttributeQAttributeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_6=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getQScenarioAccess().getStimulusKeyword_6());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getQScenarioAccess().getColonKeyword_7());
            		
            // InternalAinl.g:459:3: ( (lv_stimulus_8_0= ruleEString ) )
            // InternalAinl.g:460:4: (lv_stimulus_8_0= ruleEString )
            {
            // InternalAinl.g:460:4: (lv_stimulus_8_0= ruleEString )
            // InternalAinl.g:461:5: lv_stimulus_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQScenarioAccess().getStimulusEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_9=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getQScenarioAccess().getEnvironmentKeyword_9());
            		
            otherlv_10=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_10, grammarAccess.getQScenarioAccess().getColonKeyword_10());
            		
            // InternalAinl.g:486:3: ( (lv_environment_11_0= ruleEString ) )
            // InternalAinl.g:487:4: (lv_environment_11_0= ruleEString )
            {
            // InternalAinl.g:487:4: (lv_environment_11_0= ruleEString )
            // InternalAinl.g:488:5: lv_environment_11_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQScenarioAccess().getEnvironmentEStringParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_12=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_12, grammarAccess.getQScenarioAccess().getResponseKeyword_12());
            		
            otherlv_13=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_13, grammarAccess.getQScenarioAccess().getColonKeyword_13());
            		
            // InternalAinl.g:513:3: ( (lv_response_14_0= ruleEString ) )
            // InternalAinl.g:514:4: (lv_response_14_0= ruleEString )
            {
            // InternalAinl.g:514:4: (lv_response_14_0= ruleEString )
            // InternalAinl.g:515:5: lv_response_14_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQScenarioAccess().getResponseEStringParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_15=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_15, grammarAccess.getQScenarioAccess().getMeasureKeyword_15());
            		
            otherlv_16=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_16, grammarAccess.getQScenarioAccess().getColonKeyword_16());
            		
            // InternalAinl.g:540:3: ( (lv_measure_17_0= ruleQAMetric ) )
            // InternalAinl.g:541:4: (lv_measure_17_0= ruleQAMetric )
            {
            // InternalAinl.g:541:4: (lv_measure_17_0= ruleQAMetric )
            // InternalAinl.g:542:5: lv_measure_17_0= ruleQAMetric
            {

            					newCompositeNode(grammarAccess.getQScenarioAccess().getMeasureQAMetricEnumRuleCall_17_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_18=(Token)match(input,26,FOLLOW_25); 

            			newLeafNode(otherlv_18, grammarAccess.getQScenarioAccess().getBetweenKeyword_18());
            		
            // InternalAinl.g:563:3: ( (lv_minValue_19_0= ruleEFloat ) )
            // InternalAinl.g:564:4: (lv_minValue_19_0= ruleEFloat )
            {
            // InternalAinl.g:564:4: (lv_minValue_19_0= ruleEFloat )
            // InternalAinl.g:565:5: lv_minValue_19_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getQScenarioAccess().getMinValueEFloatParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_20=(Token)match(input,27,FOLLOW_25); 

            			newLeafNode(otherlv_20, grammarAccess.getQScenarioAccess().getAndKeyword_20());
            		
            // InternalAinl.g:586:3: ( (lv_maxValue_21_0= ruleEFloat ) )
            // InternalAinl.g:587:4: (lv_maxValue_21_0= ruleEFloat )
            {
            // InternalAinl.g:587:4: (lv_maxValue_21_0= ruleEFloat )
            // InternalAinl.g:588:5: lv_maxValue_21_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getQScenarioAccess().getMaxValueEFloatParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_22=(Token)match(input,28,FOLLOW_28); 

            			newLeafNode(otherlv_22, grammarAccess.getQScenarioAccess().getInKeyword_22());
            		
            // InternalAinl.g:609:3: ( (lv_unit_23_0= ruleMetricUnit ) )
            // InternalAinl.g:610:4: (lv_unit_23_0= ruleMetricUnit )
            {
            // InternalAinl.g:610:4: (lv_unit_23_0= ruleMetricUnit )
            // InternalAinl.g:611:5: lv_unit_23_0= ruleMetricUnit
            {

            					newCompositeNode(grammarAccess.getQScenarioAccess().getUnitMetricUnitEnumRuleCall_23_0());
            				
            pushFollow(FOLLOW_14);
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
    // InternalAinl.g:636:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalAinl.g:636:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalAinl.g:637:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalAinl.g:643:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalAinl.g:649:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalAinl.g:650:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalAinl.g:650:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalAinl.g:651:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalAinl.g:651:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAinl.g:652:4: kw= '-'
                    {
                    kw=(Token)match(input,29,FOLLOW_29); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalAinl.g:658:3: (this_INT_1= RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAinl.g:659:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_30); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,30,FOLLOW_31); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_32); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalAinl.g:679:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=31 && LA12_0<=32)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAinl.g:680:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalAinl.g:680:4: (kw= 'E' | kw= 'e' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==31) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==32) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalAinl.g:681:5: kw= 'E'
                            {
                            kw=(Token)match(input,31,FOLLOW_33); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAinl.g:687:5: kw= 'e'
                            {
                            kw=(Token)match(input,32,FOLLOW_33); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAinl.g:693:4: (kw= '-' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==29) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalAinl.g:694:5: kw= '-'
                            {
                            kw=(Token)match(input,29,FOLLOW_31); 

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
    // InternalAinl.g:712:1: entryRuleAnalyzedQS returns [EObject current=null] : iv_ruleAnalyzedQS= ruleAnalyzedQS EOF ;
    public final EObject entryRuleAnalyzedQS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalyzedQS = null;


        try {
            // InternalAinl.g:712:51: (iv_ruleAnalyzedQS= ruleAnalyzedQS EOF )
            // InternalAinl.g:713:2: iv_ruleAnalyzedQS= ruleAnalyzedQS EOF
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
    // InternalAinl.g:719:1: ruleAnalyzedQS returns [EObject current=null] : (otherlv_0= 'AQS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'reasoning' otherlv_6= ':' ( (lv_reasoning_7_0= ruleEString ) ) )? (otherlv_8= 'Sensitivity_Points' otherlv_9= '{' ( (lv_sPoints_10_0= ruleSensitivityPoint ) ) otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalAinl.g:725:2: ( (otherlv_0= 'AQS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'reasoning' otherlv_6= ':' ( (lv_reasoning_7_0= ruleEString ) ) )? (otherlv_8= 'Sensitivity_Points' otherlv_9= '{' ( (lv_sPoints_10_0= ruleSensitivityPoint ) ) otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalAinl.g:726:2: (otherlv_0= 'AQS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'reasoning' otherlv_6= ':' ( (lv_reasoning_7_0= ruleEString ) ) )? (otherlv_8= 'Sensitivity_Points' otherlv_9= '{' ( (lv_sPoints_10_0= ruleSensitivityPoint ) ) otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalAinl.g:726:2: (otherlv_0= 'AQS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'reasoning' otherlv_6= ':' ( (lv_reasoning_7_0= ruleEString ) ) )? (otherlv_8= 'Sensitivity_Points' otherlv_9= '{' ( (lv_sPoints_10_0= ruleSensitivityPoint ) ) otherlv_11= '}' )? otherlv_12= '}' )
            // InternalAinl.g:727:3: otherlv_0= 'AQS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'reasoning' otherlv_6= ':' ( (lv_reasoning_7_0= ruleEString ) ) )? (otherlv_8= 'Sensitivity_Points' otherlv_9= '{' ( (lv_sPoints_10_0= ruleSensitivityPoint ) ) otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAnalyzedQSAccess().getAQSKeyword_0());
            		
            // InternalAinl.g:731:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAinl.g:732:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAinl.g:732:4: (lv_name_1_0= RULE_ID )
            // InternalAinl.g:733:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

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

            otherlv_2=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAnalyzedQSAccess().getOfKeyword_2());
            		
            // InternalAinl.g:753:3: ( (otherlv_3= RULE_ID ) )
            // InternalAinl.g:754:4: (otherlv_3= RULE_ID )
            {
            // InternalAinl.g:754:4: (otherlv_3= RULE_ID )
            // InternalAinl.g:755:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnalyzedQSRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_3, grammarAccess.getAnalyzedQSAccess().getQsQScenarioCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_4, grammarAccess.getAnalyzedQSAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalAinl.g:770:3: (otherlv_5= 'reasoning' otherlv_6= ':' ( (lv_reasoning_7_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAinl.g:771:4: otherlv_5= 'reasoning' otherlv_6= ':' ( (lv_reasoning_7_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getAnalyzedQSAccess().getReasoningKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getAnalyzedQSAccess().getColonKeyword_5_1());
                    			
                    // InternalAinl.g:779:4: ( (lv_reasoning_7_0= ruleEString ) )
                    // InternalAinl.g:780:5: (lv_reasoning_7_0= ruleEString )
                    {
                    // InternalAinl.g:780:5: (lv_reasoning_7_0= ruleEString )
                    // InternalAinl.g:781:6: lv_reasoning_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAnalyzedQSAccess().getReasoningEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_36);
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

            // InternalAinl.g:799:3: (otherlv_8= 'Sensitivity_Points' otherlv_9= '{' ( (lv_sPoints_10_0= ruleSensitivityPoint ) ) otherlv_11= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAinl.g:800:4: otherlv_8= 'Sensitivity_Points' otherlv_9= '{' ( (lv_sPoints_10_0= ruleSensitivityPoint ) ) otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getAnalyzedQSAccess().getSensitivity_PointsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_37); 

                    				newLeafNode(otherlv_9, grammarAccess.getAnalyzedQSAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalAinl.g:808:4: ( (lv_sPoints_10_0= ruleSensitivityPoint ) )
                    // InternalAinl.g:809:5: (lv_sPoints_10_0= ruleSensitivityPoint )
                    {
                    // InternalAinl.g:809:5: (lv_sPoints_10_0= ruleSensitivityPoint )
                    // InternalAinl.g:810:6: lv_sPoints_10_0= ruleSensitivityPoint
                    {

                    						newCompositeNode(grammarAccess.getAnalyzedQSAccess().getSPointsSensitivityPointParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    otherlv_11=(Token)match(input,15,FOLLOW_14); 

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
    // InternalAinl.g:840:1: entryRuleSensitivityPoint returns [EObject current=null] : iv_ruleSensitivityPoint= ruleSensitivityPoint EOF ;
    public final EObject entryRuleSensitivityPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensitivityPoint = null;


        try {
            // InternalAinl.g:840:57: (iv_ruleSensitivityPoint= ruleSensitivityPoint EOF )
            // InternalAinl.g:841:2: iv_ruleSensitivityPoint= ruleSensitivityPoint EOF
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
    // InternalAinl.g:847:1: ruleSensitivityPoint returns [EObject current=null] : (otherlv_0= 'SensitivityPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_isRisk_3_0= 'isRisk' ) )? (otherlv_4= 'rationale' otherlv_5= ':' ( (lv_rationale_6_0= ruleEString ) ) )? (otherlv_7= 'code' otherlv_8= ':' ( (lv_code_9_0= ruleEString ) ) )? otherlv_10= 'tactics' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' otherlv_16= '}' ) ;
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
            // InternalAinl.g:853:2: ( (otherlv_0= 'SensitivityPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_isRisk_3_0= 'isRisk' ) )? (otherlv_4= 'rationale' otherlv_5= ':' ( (lv_rationale_6_0= ruleEString ) ) )? (otherlv_7= 'code' otherlv_8= ':' ( (lv_code_9_0= ruleEString ) ) )? otherlv_10= 'tactics' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' otherlv_16= '}' ) )
            // InternalAinl.g:854:2: (otherlv_0= 'SensitivityPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_isRisk_3_0= 'isRisk' ) )? (otherlv_4= 'rationale' otherlv_5= ':' ( (lv_rationale_6_0= ruleEString ) ) )? (otherlv_7= 'code' otherlv_8= ':' ( (lv_code_9_0= ruleEString ) ) )? otherlv_10= 'tactics' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' otherlv_16= '}' )
            {
            // InternalAinl.g:854:2: (otherlv_0= 'SensitivityPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_isRisk_3_0= 'isRisk' ) )? (otherlv_4= 'rationale' otherlv_5= ':' ( (lv_rationale_6_0= ruleEString ) ) )? (otherlv_7= 'code' otherlv_8= ':' ( (lv_code_9_0= ruleEString ) ) )? otherlv_10= 'tactics' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' otherlv_16= '}' )
            // InternalAinl.g:855:3: otherlv_0= 'SensitivityPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_isRisk_3_0= 'isRisk' ) )? (otherlv_4= 'rationale' otherlv_5= ':' ( (lv_rationale_6_0= ruleEString ) ) )? (otherlv_7= 'code' otherlv_8= ':' ( (lv_code_9_0= ruleEString ) ) )? otherlv_10= 'tactics' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSensitivityPointAccess().getSensitivityPointKeyword_0());
            		
            // InternalAinl.g:859:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAinl.g:860:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAinl.g:860:4: (lv_name_1_0= RULE_ID )
            // InternalAinl.g:861:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getSensitivityPointAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAinl.g:881:3: ( (lv_isRisk_3_0= 'isRisk' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAinl.g:882:4: (lv_isRisk_3_0= 'isRisk' )
                    {
                    // InternalAinl.g:882:4: (lv_isRisk_3_0= 'isRisk' )
                    // InternalAinl.g:883:5: lv_isRisk_3_0= 'isRisk'
                    {
                    lv_isRisk_3_0=(Token)match(input,38,FOLLOW_39); 

                    					newLeafNode(lv_isRisk_3_0, grammarAccess.getSensitivityPointAccess().getIsRiskIsRiskKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSensitivityPointRule());
                    					}
                    					setWithLastConsumed(current, "isRisk", true, "isRisk");
                    				

                    }


                    }
                    break;

            }

            // InternalAinl.g:895:3: (otherlv_4= 'rationale' otherlv_5= ':' ( (lv_rationale_6_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAinl.g:896:4: otherlv_4= 'rationale' otherlv_5= ':' ( (lv_rationale_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getSensitivityPointAccess().getRationaleKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getSensitivityPointAccess().getColonKeyword_4_1());
                    			
                    // InternalAinl.g:904:4: ( (lv_rationale_6_0= ruleEString ) )
                    // InternalAinl.g:905:5: (lv_rationale_6_0= ruleEString )
                    {
                    // InternalAinl.g:905:5: (lv_rationale_6_0= ruleEString )
                    // InternalAinl.g:906:6: lv_rationale_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSensitivityPointAccess().getRationaleEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_40);
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

            // InternalAinl.g:924:3: (otherlv_7= 'code' otherlv_8= ':' ( (lv_code_9_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==40) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAinl.g:925:4: otherlv_7= 'code' otherlv_8= ':' ( (lv_code_9_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getSensitivityPointAccess().getCodeKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getSensitivityPointAccess().getColonKeyword_5_1());
                    			
                    // InternalAinl.g:933:4: ( (lv_code_9_0= ruleEString ) )
                    // InternalAinl.g:934:5: (lv_code_9_0= ruleEString )
                    {
                    // InternalAinl.g:934:5: (lv_code_9_0= ruleEString )
                    // InternalAinl.g:935:6: lv_code_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSensitivityPointAccess().getCodeEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
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

            otherlv_10=(Token)match(input,18,FOLLOW_41); 

            			newLeafNode(otherlv_10, grammarAccess.getSensitivityPointAccess().getTacticsKeyword_6());
            		
            otherlv_11=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getSensitivityPointAccess().getLeftParenthesisKeyword_7());
            		
            // InternalAinl.g:961:3: ( (otherlv_12= RULE_ID ) )
            // InternalAinl.g:962:4: (otherlv_12= RULE_ID )
            {
            // InternalAinl.g:962:4: (otherlv_12= RULE_ID )
            // InternalAinl.g:963:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensitivityPointRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(otherlv_12, grammarAccess.getSensitivityPointAccess().getAppliedTacticsTacticCrossReference_8_0());
            				

            }


            }

            // InternalAinl.g:974:3: (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAinl.g:975:4: otherlv_13= ',' ( (otherlv_14= RULE_ID ) )
            	    {
            	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_13, grammarAccess.getSensitivityPointAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalAinl.g:979:4: ( (otherlv_14= RULE_ID ) )
            	    // InternalAinl.g:980:5: (otherlv_14= RULE_ID )
            	    {
            	    // InternalAinl.g:980:5: (otherlv_14= RULE_ID )
            	    // InternalAinl.g:981:6: otherlv_14= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSensitivityPointRule());
            	    						}
            	    					
            	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_42); 

            	    						newLeafNode(otherlv_14, grammarAccess.getSensitivityPointAccess().getAppliedTacticsTacticCrossReference_9_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_15=(Token)match(input,42,FOLLOW_14); 

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


    // $ANTLR start "entryRuleConstraint"
    // InternalAinl.g:1005:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalAinl.g:1005:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalAinl.g:1006:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalAinl.g:1012:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'Constraint' ( (lv_code_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleConstraintType ) ) otherlv_6= '=' ( (lv_value_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_code_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalAinl.g:1018:2: ( (otherlv_0= 'Constraint' ( (lv_code_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleConstraintType ) ) otherlv_6= '=' ( (lv_value_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalAinl.g:1019:2: (otherlv_0= 'Constraint' ( (lv_code_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleConstraintType ) ) otherlv_6= '=' ( (lv_value_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalAinl.g:1019:2: (otherlv_0= 'Constraint' ( (lv_code_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleConstraintType ) ) otherlv_6= '=' ( (lv_value_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalAinl.g:1020:3: otherlv_0= 'Constraint' ( (lv_code_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleConstraintType ) ) otherlv_6= '=' ( (lv_value_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalAinl.g:1024:3: ( (lv_code_1_0= RULE_ID ) )
            // InternalAinl.g:1025:4: (lv_code_1_0= RULE_ID )
            {
            // InternalAinl.g:1025:4: (lv_code_1_0= RULE_ID )
            // InternalAinl.g:1026:5: lv_code_1_0= RULE_ID
            {
            lv_code_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_code_1_0, grammarAccess.getConstraintAccess().getCodeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"code",
            						lv_code_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAinl.g:1046:3: (otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleConstraintType ) ) otherlv_6= '=' ( (lv_value_7_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==44) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAinl.g:1047:4: otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleConstraintType ) ) otherlv_6= '=' ( (lv_value_7_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getTypeKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,21,FOLLOW_44); 

                    				newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getColonKeyword_3_1());
                    			
                    // InternalAinl.g:1055:4: ( (lv_type_5_0= ruleConstraintType ) )
                    // InternalAinl.g:1056:5: (lv_type_5_0= ruleConstraintType )
                    {
                    // InternalAinl.g:1056:5: (lv_type_5_0= ruleConstraintType )
                    // InternalAinl.g:1057:6: lv_type_5_0= ruleConstraintType
                    {

                    						newCompositeNode(grammarAccess.getConstraintAccess().getTypeConstraintTypeEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_type_5_0=ruleConstraintType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstraintRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"co.edu.uniandes.accordant_rq.Ainl.ConstraintType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,45,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getConstraintAccess().getEqualsSignKeyword_3_3());
                    			
                    // InternalAinl.g:1078:4: ( (lv_value_7_0= ruleEString ) )
                    // InternalAinl.g:1079:5: (lv_value_7_0= ruleEString )
                    {
                    // InternalAinl.g:1079:5: (lv_value_7_0= ruleEString )
                    // InternalAinl.g:1080:6: lv_value_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConstraintAccess().getValueEStringParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_value_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstraintRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"co.edu.uniandes.accordant_rq.Ainl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleTactic"
    // InternalAinl.g:1106:1: entryRuleTactic returns [EObject current=null] : iv_ruleTactic= ruleTactic EOF ;
    public final EObject entryRuleTactic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTactic = null;


        try {
            // InternalAinl.g:1106:47: (iv_ruleTactic= ruleTactic EOF )
            // InternalAinl.g:1107:2: iv_ruleTactic= ruleTactic EOF
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
    // InternalAinl.g:1113:1: ruleTactic returns [EObject current=null] : ( () otherlv_1= 'Tactic' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'QA' otherlv_5= ':' ( (lv_qAttribute_6_0= ruleQAttribute ) ) )? (otherlv_7= 'rationale' otherlv_8= ':' ( (lv_rationale_9_0= ruleEString ) ) )? (otherlv_10= 'stimulus' otherlv_11= ':' ( (lv_stimulus_12_0= ruleEString ) ) )? (otherlv_13= 'response' otherlv_14= ':' ( (lv_response_15_0= ruleEString ) ) )? (otherlv_16= 'viewpoint' otherlv_17= ':' ( (lv_viewpoint_18_0= ruleEString ) ) )? otherlv_19= '}' ) ;
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
            // InternalAinl.g:1119:2: ( ( () otherlv_1= 'Tactic' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'QA' otherlv_5= ':' ( (lv_qAttribute_6_0= ruleQAttribute ) ) )? (otherlv_7= 'rationale' otherlv_8= ':' ( (lv_rationale_9_0= ruleEString ) ) )? (otherlv_10= 'stimulus' otherlv_11= ':' ( (lv_stimulus_12_0= ruleEString ) ) )? (otherlv_13= 'response' otherlv_14= ':' ( (lv_response_15_0= ruleEString ) ) )? (otherlv_16= 'viewpoint' otherlv_17= ':' ( (lv_viewpoint_18_0= ruleEString ) ) )? otherlv_19= '}' ) )
            // InternalAinl.g:1120:2: ( () otherlv_1= 'Tactic' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'QA' otherlv_5= ':' ( (lv_qAttribute_6_0= ruleQAttribute ) ) )? (otherlv_7= 'rationale' otherlv_8= ':' ( (lv_rationale_9_0= ruleEString ) ) )? (otherlv_10= 'stimulus' otherlv_11= ':' ( (lv_stimulus_12_0= ruleEString ) ) )? (otherlv_13= 'response' otherlv_14= ':' ( (lv_response_15_0= ruleEString ) ) )? (otherlv_16= 'viewpoint' otherlv_17= ':' ( (lv_viewpoint_18_0= ruleEString ) ) )? otherlv_19= '}' )
            {
            // InternalAinl.g:1120:2: ( () otherlv_1= 'Tactic' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'QA' otherlv_5= ':' ( (lv_qAttribute_6_0= ruleQAttribute ) ) )? (otherlv_7= 'rationale' otherlv_8= ':' ( (lv_rationale_9_0= ruleEString ) ) )? (otherlv_10= 'stimulus' otherlv_11= ':' ( (lv_stimulus_12_0= ruleEString ) ) )? (otherlv_13= 'response' otherlv_14= ':' ( (lv_response_15_0= ruleEString ) ) )? (otherlv_16= 'viewpoint' otherlv_17= ':' ( (lv_viewpoint_18_0= ruleEString ) ) )? otherlv_19= '}' )
            // InternalAinl.g:1121:3: () otherlv_1= 'Tactic' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'QA' otherlv_5= ':' ( (lv_qAttribute_6_0= ruleQAttribute ) ) )? (otherlv_7= 'rationale' otherlv_8= ':' ( (lv_rationale_9_0= ruleEString ) ) )? (otherlv_10= 'stimulus' otherlv_11= ':' ( (lv_stimulus_12_0= ruleEString ) ) )? (otherlv_13= 'response' otherlv_14= ':' ( (lv_response_15_0= ruleEString ) ) )? (otherlv_16= 'viewpoint' otherlv_17= ':' ( (lv_viewpoint_18_0= ruleEString ) ) )? otherlv_19= '}'
            {
            // InternalAinl.g:1121:3: ()
            // InternalAinl.g:1122:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTacticAccess().getTacticAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTacticAccess().getTacticKeyword_1());
            		
            // InternalAinl.g:1132:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAinl.g:1133:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAinl.g:1133:4: (lv_name_2_0= RULE_ID )
            // InternalAinl.g:1134:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getTacticAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAinl.g:1154:3: (otherlv_4= 'QA' otherlv_5= ':' ( (lv_qAttribute_6_0= ruleQAttribute ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAinl.g:1155:4: otherlv_4= 'QA' otherlv_5= ':' ( (lv_qAttribute_6_0= ruleQAttribute ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getTacticAccess().getQAKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getTacticAccess().getColonKeyword_4_1());
                    			
                    // InternalAinl.g:1163:4: ( (lv_qAttribute_6_0= ruleQAttribute ) )
                    // InternalAinl.g:1164:5: (lv_qAttribute_6_0= ruleQAttribute )
                    {
                    // InternalAinl.g:1164:5: (lv_qAttribute_6_0= ruleQAttribute )
                    // InternalAinl.g:1165:6: lv_qAttribute_6_0= ruleQAttribute
                    {

                    						newCompositeNode(grammarAccess.getTacticAccess().getQAttributeQAttributeEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_47);
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

            // InternalAinl.g:1183:3: (otherlv_7= 'rationale' otherlv_8= ':' ( (lv_rationale_9_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAinl.g:1184:4: otherlv_7= 'rationale' otherlv_8= ':' ( (lv_rationale_9_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getTacticAccess().getRationaleKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getTacticAccess().getColonKeyword_5_1());
                    			
                    // InternalAinl.g:1192:4: ( (lv_rationale_9_0= ruleEString ) )
                    // InternalAinl.g:1193:5: (lv_rationale_9_0= ruleEString )
                    {
                    // InternalAinl.g:1193:5: (lv_rationale_9_0= ruleEString )
                    // InternalAinl.g:1194:6: lv_rationale_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTacticAccess().getRationaleEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_48);
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

            // InternalAinl.g:1212:3: (otherlv_10= 'stimulus' otherlv_11= ':' ( (lv_stimulus_12_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAinl.g:1213:4: otherlv_10= 'stimulus' otherlv_11= ':' ( (lv_stimulus_12_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getTacticAccess().getStimulusKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getTacticAccess().getColonKeyword_6_1());
                    			
                    // InternalAinl.g:1221:4: ( (lv_stimulus_12_0= ruleEString ) )
                    // InternalAinl.g:1222:5: (lv_stimulus_12_0= ruleEString )
                    {
                    // InternalAinl.g:1222:5: (lv_stimulus_12_0= ruleEString )
                    // InternalAinl.g:1223:6: lv_stimulus_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTacticAccess().getStimulusEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_49);
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

            // InternalAinl.g:1241:3: (otherlv_13= 'response' otherlv_14= ':' ( (lv_response_15_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAinl.g:1242:4: otherlv_13= 'response' otherlv_14= ':' ( (lv_response_15_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getTacticAccess().getResponseKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_14, grammarAccess.getTacticAccess().getColonKeyword_7_1());
                    			
                    // InternalAinl.g:1250:4: ( (lv_response_15_0= ruleEString ) )
                    // InternalAinl.g:1251:5: (lv_response_15_0= ruleEString )
                    {
                    // InternalAinl.g:1251:5: (lv_response_15_0= ruleEString )
                    // InternalAinl.g:1252:6: lv_response_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTacticAccess().getResponseEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_50);
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

            // InternalAinl.g:1270:3: (otherlv_16= 'viewpoint' otherlv_17= ':' ( (lv_viewpoint_18_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==47) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAinl.g:1271:4: otherlv_16= 'viewpoint' otherlv_17= ':' ( (lv_viewpoint_18_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,47,FOLLOW_16); 

                    				newLeafNode(otherlv_16, grammarAccess.getTacticAccess().getViewpointKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_17, grammarAccess.getTacticAccess().getColonKeyword_8_1());
                    			
                    // InternalAinl.g:1279:4: ( (lv_viewpoint_18_0= ruleEString ) )
                    // InternalAinl.g:1280:5: (lv_viewpoint_18_0= ruleEString )
                    {
                    // InternalAinl.g:1280:5: (lv_viewpoint_18_0= ruleEString )
                    // InternalAinl.g:1281:6: lv_viewpoint_18_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTacticAccess().getViewpointEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_14);
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
    // InternalAinl.g:1307:1: ruleQAMetric returns [Enumerator current=null] : ( (enumLiteral_0= 'THROUGHPUT' ) | (enumLiteral_1= 'LATENCY' ) | (enumLiteral_2= 'DEADLINE' ) | (enumLiteral_3= 'UPDATETIME' ) ) ;
    public final Enumerator ruleQAMetric() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAinl.g:1313:2: ( ( (enumLiteral_0= 'THROUGHPUT' ) | (enumLiteral_1= 'LATENCY' ) | (enumLiteral_2= 'DEADLINE' ) | (enumLiteral_3= 'UPDATETIME' ) ) )
            // InternalAinl.g:1314:2: ( (enumLiteral_0= 'THROUGHPUT' ) | (enumLiteral_1= 'LATENCY' ) | (enumLiteral_2= 'DEADLINE' ) | (enumLiteral_3= 'UPDATETIME' ) )
            {
            // InternalAinl.g:1314:2: ( (enumLiteral_0= 'THROUGHPUT' ) | (enumLiteral_1= 'LATENCY' ) | (enumLiteral_2= 'DEADLINE' ) | (enumLiteral_3= 'UPDATETIME' ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt25=1;
                }
                break;
            case 49:
                {
                alt25=2;
                }
                break;
            case 50:
                {
                alt25=3;
                }
                break;
            case 51:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalAinl.g:1315:3: (enumLiteral_0= 'THROUGHPUT' )
                    {
                    // InternalAinl.g:1315:3: (enumLiteral_0= 'THROUGHPUT' )
                    // InternalAinl.g:1316:4: enumLiteral_0= 'THROUGHPUT'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getQAMetricAccess().getTHROUGHPUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQAMetricAccess().getTHROUGHPUTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAinl.g:1323:3: (enumLiteral_1= 'LATENCY' )
                    {
                    // InternalAinl.g:1323:3: (enumLiteral_1= 'LATENCY' )
                    // InternalAinl.g:1324:4: enumLiteral_1= 'LATENCY'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getQAMetricAccess().getLATENCYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQAMetricAccess().getLATENCYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAinl.g:1331:3: (enumLiteral_2= 'DEADLINE' )
                    {
                    // InternalAinl.g:1331:3: (enumLiteral_2= 'DEADLINE' )
                    // InternalAinl.g:1332:4: enumLiteral_2= 'DEADLINE'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getQAMetricAccess().getDEADLINEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getQAMetricAccess().getDEADLINEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAinl.g:1339:3: (enumLiteral_3= 'UPDATETIME' )
                    {
                    // InternalAinl.g:1339:3: (enumLiteral_3= 'UPDATETIME' )
                    // InternalAinl.g:1340:4: enumLiteral_3= 'UPDATETIME'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getQAMetricAccess().getUPDATETIMEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getQAMetricAccess().getUPDATETIMEEnumLiteralDeclaration_3());
                    			

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
    // InternalAinl.g:1350:1: ruleMetricUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'MILLIS' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'TASKS' ) | (enumLiteral_5= 'BYTES' ) | (enumLiteral_6= 'MSGS' ) ) ;
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
            // InternalAinl.g:1356:2: ( ( (enumLiteral_0= 'MILLIS' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'TASKS' ) | (enumLiteral_5= 'BYTES' ) | (enumLiteral_6= 'MSGS' ) ) )
            // InternalAinl.g:1357:2: ( (enumLiteral_0= 'MILLIS' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'TASKS' ) | (enumLiteral_5= 'BYTES' ) | (enumLiteral_6= 'MSGS' ) )
            {
            // InternalAinl.g:1357:2: ( (enumLiteral_0= 'MILLIS' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'TASKS' ) | (enumLiteral_5= 'BYTES' ) | (enumLiteral_6= 'MSGS' ) )
            int alt26=7;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt26=1;
                }
                break;
            case 53:
                {
                alt26=2;
                }
                break;
            case 54:
                {
                alt26=3;
                }
                break;
            case 55:
                {
                alt26=4;
                }
                break;
            case 56:
                {
                alt26=5;
                }
                break;
            case 57:
                {
                alt26=6;
                }
                break;
            case 58:
                {
                alt26=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalAinl.g:1358:3: (enumLiteral_0= 'MILLIS' )
                    {
                    // InternalAinl.g:1358:3: (enumLiteral_0= 'MILLIS' )
                    // InternalAinl.g:1359:4: enumLiteral_0= 'MILLIS'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getMetricUnitAccess().getMILLISEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMetricUnitAccess().getMILLISEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAinl.g:1366:3: (enumLiteral_1= 'SECONDS' )
                    {
                    // InternalAinl.g:1366:3: (enumLiteral_1= 'SECONDS' )
                    // InternalAinl.g:1367:4: enumLiteral_1= 'SECONDS'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getMetricUnitAccess().getSECONDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMetricUnitAccess().getSECONDSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAinl.g:1374:3: (enumLiteral_2= 'MINUTES' )
                    {
                    // InternalAinl.g:1374:3: (enumLiteral_2= 'MINUTES' )
                    // InternalAinl.g:1375:4: enumLiteral_2= 'MINUTES'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getMetricUnitAccess().getMINUTESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMetricUnitAccess().getMINUTESEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAinl.g:1382:3: (enumLiteral_3= 'HOURS' )
                    {
                    // InternalAinl.g:1382:3: (enumLiteral_3= 'HOURS' )
                    // InternalAinl.g:1383:4: enumLiteral_3= 'HOURS'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getMetricUnitAccess().getHOURSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMetricUnitAccess().getHOURSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAinl.g:1390:3: (enumLiteral_4= 'TASKS' )
                    {
                    // InternalAinl.g:1390:3: (enumLiteral_4= 'TASKS' )
                    // InternalAinl.g:1391:4: enumLiteral_4= 'TASKS'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getMetricUnitAccess().getTASKSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMetricUnitAccess().getTASKSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAinl.g:1398:3: (enumLiteral_5= 'BYTES' )
                    {
                    // InternalAinl.g:1398:3: (enumLiteral_5= 'BYTES' )
                    // InternalAinl.g:1399:4: enumLiteral_5= 'BYTES'
                    {
                    enumLiteral_5=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getMetricUnitAccess().getBYTESEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMetricUnitAccess().getBYTESEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAinl.g:1406:3: (enumLiteral_6= 'MSGS' )
                    {
                    // InternalAinl.g:1406:3: (enumLiteral_6= 'MSGS' )
                    // InternalAinl.g:1407:4: enumLiteral_6= 'MSGS'
                    {
                    enumLiteral_6=(Token)match(input,58,FOLLOW_2); 

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
    // InternalAinl.g:1417:1: ruleQAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'AVAILABILITY' ) | (enumLiteral_1= 'PERFORMANCE' ) | (enumLiteral_2= 'MODIFIABILITY' ) | (enumLiteral_3= 'TESTABILITY' ) | (enumLiteral_4= 'SCALABILITY' ) ) ;
    public final Enumerator ruleQAttribute() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalAinl.g:1423:2: ( ( (enumLiteral_0= 'AVAILABILITY' ) | (enumLiteral_1= 'PERFORMANCE' ) | (enumLiteral_2= 'MODIFIABILITY' ) | (enumLiteral_3= 'TESTABILITY' ) | (enumLiteral_4= 'SCALABILITY' ) ) )
            // InternalAinl.g:1424:2: ( (enumLiteral_0= 'AVAILABILITY' ) | (enumLiteral_1= 'PERFORMANCE' ) | (enumLiteral_2= 'MODIFIABILITY' ) | (enumLiteral_3= 'TESTABILITY' ) | (enumLiteral_4= 'SCALABILITY' ) )
            {
            // InternalAinl.g:1424:2: ( (enumLiteral_0= 'AVAILABILITY' ) | (enumLiteral_1= 'PERFORMANCE' ) | (enumLiteral_2= 'MODIFIABILITY' ) | (enumLiteral_3= 'TESTABILITY' ) | (enumLiteral_4= 'SCALABILITY' ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt27=1;
                }
                break;
            case 60:
                {
                alt27=2;
                }
                break;
            case 61:
                {
                alt27=3;
                }
                break;
            case 62:
                {
                alt27=4;
                }
                break;
            case 63:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalAinl.g:1425:3: (enumLiteral_0= 'AVAILABILITY' )
                    {
                    // InternalAinl.g:1425:3: (enumLiteral_0= 'AVAILABILITY' )
                    // InternalAinl.g:1426:4: enumLiteral_0= 'AVAILABILITY'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getQAttributeAccess().getAVAILABILITYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQAttributeAccess().getAVAILABILITYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAinl.g:1433:3: (enumLiteral_1= 'PERFORMANCE' )
                    {
                    // InternalAinl.g:1433:3: (enumLiteral_1= 'PERFORMANCE' )
                    // InternalAinl.g:1434:4: enumLiteral_1= 'PERFORMANCE'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getQAttributeAccess().getPERFORMANCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQAttributeAccess().getPERFORMANCEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAinl.g:1441:3: (enumLiteral_2= 'MODIFIABILITY' )
                    {
                    // InternalAinl.g:1441:3: (enumLiteral_2= 'MODIFIABILITY' )
                    // InternalAinl.g:1442:4: enumLiteral_2= 'MODIFIABILITY'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getQAttributeAccess().getMODIFIABILITYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getQAttributeAccess().getMODIFIABILITYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAinl.g:1449:3: (enumLiteral_3= 'TESTABILITY' )
                    {
                    // InternalAinl.g:1449:3: (enumLiteral_3= 'TESTABILITY' )
                    // InternalAinl.g:1450:4: enumLiteral_3= 'TESTABILITY'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getQAttributeAccess().getTESTABILITYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getQAttributeAccess().getTESTABILITYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAinl.g:1457:3: (enumLiteral_4= 'SCALABILITY' )
                    {
                    // InternalAinl.g:1457:3: (enumLiteral_4= 'SCALABILITY' )
                    // InternalAinl.g:1458:4: enumLiteral_4= 'SCALABILITY'
                    {
                    enumLiteral_4=(Token)match(input,63,FOLLOW_2); 

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


    // $ANTLR start "ruleConstraintType"
    // InternalAinl.g:1468:1: ruleConstraintType returns [Enumerator current=null] : ( (enumLiteral_0= 'ARCH_STYLE' ) | (enumLiteral_1= 'CLOUD_PROV' ) | (enumLiteral_2= 'LICENSE' ) | (enumLiteral_3= 'PROC_MODEL' ) | (enumLiteral_4= 'TECH_VENDOR' ) ) ;
    public final Enumerator ruleConstraintType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalAinl.g:1474:2: ( ( (enumLiteral_0= 'ARCH_STYLE' ) | (enumLiteral_1= 'CLOUD_PROV' ) | (enumLiteral_2= 'LICENSE' ) | (enumLiteral_3= 'PROC_MODEL' ) | (enumLiteral_4= 'TECH_VENDOR' ) ) )
            // InternalAinl.g:1475:2: ( (enumLiteral_0= 'ARCH_STYLE' ) | (enumLiteral_1= 'CLOUD_PROV' ) | (enumLiteral_2= 'LICENSE' ) | (enumLiteral_3= 'PROC_MODEL' ) | (enumLiteral_4= 'TECH_VENDOR' ) )
            {
            // InternalAinl.g:1475:2: ( (enumLiteral_0= 'ARCH_STYLE' ) | (enumLiteral_1= 'CLOUD_PROV' ) | (enumLiteral_2= 'LICENSE' ) | (enumLiteral_3= 'PROC_MODEL' ) | (enumLiteral_4= 'TECH_VENDOR' ) )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt28=1;
                }
                break;
            case 65:
                {
                alt28=2;
                }
                break;
            case 66:
                {
                alt28=3;
                }
                break;
            case 67:
                {
                alt28=4;
                }
                break;
            case 68:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalAinl.g:1476:3: (enumLiteral_0= 'ARCH_STYLE' )
                    {
                    // InternalAinl.g:1476:3: (enumLiteral_0= 'ARCH_STYLE' )
                    // InternalAinl.g:1477:4: enumLiteral_0= 'ARCH_STYLE'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getConstraintTypeAccess().getARCH_STYLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getConstraintTypeAccess().getARCH_STYLEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAinl.g:1484:3: (enumLiteral_1= 'CLOUD_PROV' )
                    {
                    // InternalAinl.g:1484:3: (enumLiteral_1= 'CLOUD_PROV' )
                    // InternalAinl.g:1485:4: enumLiteral_1= 'CLOUD_PROV'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getConstraintTypeAccess().getCLOUD_PROVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getConstraintTypeAccess().getCLOUD_PROVEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAinl.g:1492:3: (enumLiteral_2= 'LICENSE' )
                    {
                    // InternalAinl.g:1492:3: (enumLiteral_2= 'LICENSE' )
                    // InternalAinl.g:1493:4: enumLiteral_2= 'LICENSE'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getConstraintTypeAccess().getLICENSEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getConstraintTypeAccess().getLICENSEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAinl.g:1500:3: (enumLiteral_3= 'PROC_MODEL' )
                    {
                    // InternalAinl.g:1500:3: (enumLiteral_3= 'PROC_MODEL' )
                    // InternalAinl.g:1501:4: enumLiteral_3= 'PROC_MODEL'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getConstraintTypeAccess().getPROC_MODELEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getConstraintTypeAccess().getPROC_MODELEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAinl.g:1508:3: (enumLiteral_4= 'TECH_VENDOR' )
                    {
                    // InternalAinl.g:1508:3: (enumLiteral_4= 'TECH_VENDOR' )
                    // InternalAinl.g:1509:4: enumLiteral_4= 'TECH_VENDOR'
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getConstraintTypeAccess().getTECH_VENDOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getConstraintTypeAccess().getTECH_VENDOREnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleConstraintType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xF800000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000F000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000060000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x07F0000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001800008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000001C000040000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000018000040000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000808001508000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000808001408000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000800001408000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000800001008000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000800000008000L});

}