// Generated from org\example\Syntactic.g4 by ANTLR 4.12.0
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SyntacticParser}.
 */
public interface SyntacticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SyntacticParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SyntacticParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(SyntacticParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(SyntacticParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#declara}.
	 * @param ctx the parse tree
	 */
	void enterDeclara(SyntacticParser.DeclaraContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#declara}.
	 * @param ctx the parse tree
	 */
	void exitDeclara(SyntacticParser.DeclaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#dvar}.
	 * @param ctx the parse tree
	 */
	void enterDvar(SyntacticParser.DvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#dvar}.
	 * @param ctx the parse tree
	 */
	void exitDvar(SyntacticParser.DvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void enterTipo_var(SyntacticParser.Tipo_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void exitTipo_var(SyntacticParser.Tipo_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void enterVariaveis(SyntacticParser.VariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void exitVariaveis(SyntacticParser.VariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void enterMais_var(SyntacticParser.Mais_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void exitMais_var(SyntacticParser.Mais_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#mais_dc}.
	 * @param ctx the parse tree
	 */
	void enterMais_dc(SyntacticParser.Mais_dcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#mais_dc}.
	 * @param ctx the parse tree
	 */
	void exitMais_dc(SyntacticParser.Mais_dcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#cont_dc}.
	 * @param ctx the parse tree
	 */
	void enterCont_dc(SyntacticParser.Cont_dcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#cont_dc}.
	 * @param ctx the parse tree
	 */
	void exitCont_dc(SyntacticParser.Cont_dcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#sentencas}.
	 * @param ctx the parse tree
	 */
	void enterSentencas(SyntacticParser.SentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#sentencas}.
	 * @param ctx the parse tree
	 */
	void exitSentencas(SyntacticParser.SentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#mais_sentencas}.
	 * @param ctx the parse tree
	 */
	void enterMais_sentencas(SyntacticParser.Mais_sentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#mais_sentencas}.
	 * @param ctx the parse tree
	 */
	void exitMais_sentencas(SyntacticParser.Mais_sentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#cont_sentencas}.
	 * @param ctx the parse tree
	 */
	void enterCont_sentencas(SyntacticParser.Cont_sentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#cont_sentencas}.
	 * @param ctx the parse tree
	 */
	void exitCont_sentencas(SyntacticParser.Cont_sentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#var_read}.
	 * @param ctx the parse tree
	 */
	void enterVar_read(SyntacticParser.Var_readContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#var_read}.
	 * @param ctx the parse tree
	 */
	void exitVar_read(SyntacticParser.Var_readContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#mais_var_read}.
	 * @param ctx the parse tree
	 */
	void enterMais_var_read(SyntacticParser.Mais_var_readContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#mais_var_read}.
	 * @param ctx the parse tree
	 */
	void exitMais_var_read(SyntacticParser.Mais_var_readContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#var_write}.
	 * @param ctx the parse tree
	 */
	void enterVar_write(SyntacticParser.Var_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#var_write}.
	 * @param ctx the parse tree
	 */
	void exitVar_write(SyntacticParser.Var_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#mais_var_write}.
	 * @param ctx the parse tree
	 */
	void enterMais_var_write(SyntacticParser.Mais_var_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#mais_var_write}.
	 * @param ctx the parse tree
	 */
	void exitMais_var_write(SyntacticParser.Mais_var_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(SyntacticParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(SyntacticParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(SyntacticParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(SyntacticParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#pfalsa}.
	 * @param ctx the parse tree
	 */
	void enterPfalsa(SyntacticParser.PfalsaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#pfalsa}.
	 * @param ctx the parse tree
	 */
	void exitPfalsa(SyntacticParser.PfalsaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#relacao}.
	 * @param ctx the parse tree
	 */
	void enterRelacao(SyntacticParser.RelacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#relacao}.
	 * @param ctx the parse tree
	 */
	void exitRelacao(SyntacticParser.RelacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(SyntacticParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(SyntacticParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos(SyntacticParser.Outros_termosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos(SyntacticParser.Outros_termosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#op_ad}.
	 * @param ctx the parse tree
	 */
	void enterOp_ad(SyntacticParser.Op_adContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#op_ad}.
	 * @param ctx the parse tree
	 */
	void exitOp_ad(SyntacticParser.Op_adContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(SyntacticParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(SyntacticParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#mais_fatores}.
	 * @param ctx the parse tree
	 */
	void enterMais_fatores(SyntacticParser.Mais_fatoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#mais_fatores}.
	 * @param ctx the parse tree
	 */
	void exitMais_fatores(SyntacticParser.Mais_fatoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#op_mul}.
	 * @param ctx the parse tree
	 */
	void enterOp_mul(SyntacticParser.Op_mulContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#op_mul}.
	 * @param ctx the parse tree
	 */
	void exitOp_mul(SyntacticParser.Op_mulContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(SyntacticParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(SyntacticParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#intnum}.
	 * @param ctx the parse tree
	 */
	void enterIntnum(SyntacticParser.IntnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#intnum}.
	 * @param ctx the parse tree
	 */
	void exitIntnum(SyntacticParser.IntnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(SyntacticParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(SyntacticParser.IdContext ctx);
}