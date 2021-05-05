package jplag.R;

import jplag.R.grammar.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/*
Esta clase se encarga de implementar los métodos clase RListener que se genera por ANTLR4 de forma que cada vez que se reconozca un Token del lenguaje
se entrará en su "enter<NombredelToken>" y "exit<NombredelToken>" y en caso de ser un token importante (es decir, que sea relevante considerarlo a la hora de identificar plagio)
tan solo tendremos que irnos a su método he implementarlo haciendo un jplagParser.add o un jplagParser.addEnd (en caso de que sea un exit) con el nombre del token que le hayamos 
asociado en RToken.java y RTokenConstants.java .
*/

public class JplagRListener implements RListener,RFilterListener, RTokenConstants {

    private jplag.R.Parser jplagParser;

    public JplagRListener(jplag.R.Parser jplag) {
        jplagParser = jplag;
    }

    @Override
    public void enterProg(RParser.ProgContext ctx){

    }
	
	@Override
	public void exitProg(RParser.ProgContext ctx){

	}
	
	@Override
	public void enterExpr(RParser.ExprContext ctx){

	}
	
	@Override
	public void exitExpr(RParser.ExprContext ctx){

	}
	
	@Override
	public void enterIndex_statement(RParser.Index_statementContext ctx){
		jplagParser.add(INDEX, ctx.getStart());
	}
	
	@Override
	public void exitIndex_statement(RParser.Index_statementContext ctx){

	}
	
	@Override
	public void enterAccess_package(RParser.Access_packageContext ctx){
		jplagParser.add(PACKAGE, ctx.getStart());
	}
	
	@Override
	public void exitAccess_package(RParser.Access_packageContext ctx){

	}
	
	@Override
	public void enterFunction_definition(RParser.Function_definitionContext ctx){
		jplagParser.add(BEGIN_FUNCTION, ctx.getStart());
	}
	
	@Override
	public void exitFunction_definition(RParser.Function_definitionContext ctx){
		jplagParser.addEnd(END_FUNCTION, ctx.getStart());
	}
	
	@Override
	public void enterFunction_call(RParser.Function_callContext ctx){
		jplagParser.add(FUNCTION_CALL, ctx.getStart());
	}
	
	@Override
	public void exitFunction_call(RParser.Function_callContext ctx){

	}
	
	@Override
	public void enterConstant(RParser.ConstantContext ctx){

	}
	
	@Override
	public void exitConstant(RParser.ConstantContext ctx){

	}
	
	@Override
	public void enterConstant_number(RParser.Constant_numberContext ctx){
		jplagParser.add(NUMBER, ctx.getStart());
	}
	
	@Override
	public void exitConstant_number(RParser.Constant_numberContext ctx){

	}
	
	@Override
	public void enterConstant_string(RParser.Constant_stringContext ctx){
		jplagParser.add(STRING, ctx.getStart());
	}
	
	@Override
	public void exitConstant_string(RParser.Constant_stringContext ctx){

	}
	
	@Override
	public void enterConstant_bool(RParser.Constant_boolContext ctx){
		jplagParser.add(BOOL, ctx.getStart());
	}
	
	@Override
	public void exitConstant_bool(RParser.Constant_boolContext ctx){

	}
	
	@Override
	public void enterHelp(RParser.HelpContext ctx){
		jplagParser.add(HELP, ctx.getStart());
	}
	
	@Override
	public void exitHelp(RParser.HelpContext ctx){

	}
	
	@Override
	public void enterIf_statement(RParser.If_statementContext ctx){
		jplagParser.add(IF_BEGIN, ctx.getStart());
	}
	
	@Override
	public void exitIf_statement(RParser.If_statementContext ctx){
		jplagParser.addEnd(IF_END, ctx.getStart());
	}
	
	@Override
	public void enterFor_statement(RParser.For_statementContext ctx){
		jplagParser.add(FOR_BEGIN, ctx.getStart());
	}
	
	@Override
	public void exitFor_statement(RParser.For_statementContext ctx){
		jplagParser.addEnd(FOR_END, ctx.getStart());
	}
	
	@Override
	public void enterWhile_statement(RParser.While_statementContext ctx){
		jplagParser.add(WHILE_BEGIN, ctx.getStart());
	}
	
	@Override
	public void exitWhile_statement(RParser.While_statementContext ctx){
		jplagParser.addEnd(WHILE_END, ctx.getStart());
	}
	
	@Override
	public void enterRepeat_statement(RParser.Repeat_statementContext ctx){
		jplagParser.add(REPEAT_BEGIN, ctx.getStart());
	}
	
	@Override
	public void exitRepeat_statement(RParser.Repeat_statementContext ctx){
		jplagParser.addEnd(REPEAT_END, ctx.getStart());
	}
	
	@Override
	public void enterNext_statement(RParser.Next_statementContext ctx){
		jplagParser.add(NEXT, ctx.getStart());
	}
	
	@Override
	public void exitNext_statement(RParser.Next_statementContext ctx){

	}
	
	@Override
	public void enterBreak_statement(RParser.Break_statementContext ctx){
		jplagParser.add(BREAK, ctx.getStart());
	}
	
	@Override
	public void exitBreak_statement(RParser.Break_statementContext ctx){

	}
	
	@Override
	public void enterCompound_statement(RParser.Compound_statementContext ctx){
		jplagParser.add(COMPOUND_BEGIN, ctx.getStart());
	}
	
	@Override
	public void exitCompound_statement(RParser.Compound_statementContext ctx){
		jplagParser.addEnd(COMPOUND_END, ctx.getStart());
	}
	
	@Override
	public void enterExprlist(RParser.ExprlistContext ctx){

	}
	
	@Override
	public void exitExprlist(RParser.ExprlistContext ctx){

	}
	
	@Override
	public void enterFormlist(RParser.FormlistContext ctx){

	}
	
	@Override
	public void exitFormlist(RParser.FormlistContext ctx){

	}
	
	@Override
	public void enterForm(RParser.FormContext ctx){

	}
	
	@Override
	public void exitForm(RParser.FormContext ctx){

	}
	
	@Override
	public void enterSublist(RParser.SublistContext ctx){

	}
	
	@Override
	public void exitSublist(RParser.SublistContext ctx){

	}
	
	@Override
	public void enterSub(RParser.SubContext ctx){

	}
	
	@Override
	public void exitSub(RParser.SubContext ctx){

	}
	
	@Override
	public void enterAssign_value(RParser.Assign_valueContext ctx){
		jplagParser.add(ASSIGN, ctx.getStart());
	}
	
	@Override
	public void exitAssign_value(RParser.Assign_valueContext ctx){

	}
	
	@Override
	public void enterAssign_func_declaration(RParser.Assign_func_declarationContext ctx){
		jplagParser.add(ASSIGN_FUNC, ctx.getStart());
	}
	
	@Override
	public void exitAssign_func_declaration(RParser.Assign_func_declarationContext ctx){

	}
	
	@Override
	public void enterAssign_value_list(RParser.Assign_value_listContext ctx){
		jplagParser.add(ASSIGN_LIST, ctx.getStart());
	}
	
	@Override
	public void exitAssign_value_list(RParser.Assign_value_listContext ctx){

	}

	
	@Override
	public void enterStream(RFilter.StreamContext ctx){

	}
	
	@Override
	public void exitStream(RFilter.StreamContext ctx){

	}
	
	@Override
	public void enterEat(RFilter.EatContext ctx){

	}
	
	@Override
	public void exitEat(RFilter.EatContext ctx){

	}
	
	@Override
	public void enterElem(RFilter.ElemContext ctx){

	}
	
	@Override
	public void exitElem(RFilter.ElemContext ctx){

	}
	
	@Override
	public void enterAtom(RFilter.AtomContext ctx){

	}
	
	@Override
	public void exitAtom(RFilter.AtomContext ctx){

	}
	
	@Override
	public void enterOp(RFilter.OpContext ctx){

	}
	
	@Override
	public void exitOp(RFilter.OpContext ctx){

	}
	

	@Override
	public void enterEveryRule(ParserRuleContext ctx){

	}
	
	@Override
	public void exitEveryRule(ParserRuleContext ctx){

	}
	
	@Override
	public void visitTerminal(TerminalNode node){
		if (node.getText().equals("=")) {
            jplagParser.add(ASSIGN, node.getSymbol());
        }
	}
	
	@Override
	public void visitErrorNode(ErrorNode node){

	}
}