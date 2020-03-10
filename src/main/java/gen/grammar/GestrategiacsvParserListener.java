// Generated from E:/USUARIO/Documents/Intellij-idea-Projects/EstrategiasCSV/src/main/java/gramaticas\GestrategiacsvParser.g4 by ANTLR 4.8
package gen.grammar;

//package ...
//import ;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GestrategiacsvParser}.
 */
public interface GestrategiacsvParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GestrategiacsvParser#csv}.
	 * @param ctx the parse tree
	 */
	void enterCsv(GestrategiacsvParser.CsvContext ctx);
	/**
	 * Exit a parse tree produced by {@link GestrategiacsvParser#csv}.
	 * @param ctx the parse tree
	 */
	void exitCsv(GestrategiacsvParser.CsvContext ctx);
	/**
	 * Enter a parse tree produced by {@link GestrategiacsvParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void enterCabecera(GestrategiacsvParser.CabeceraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GestrategiacsvParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void exitCabecera(GestrategiacsvParser.CabeceraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GestrategiacsvParser#linea}.
	 * @param ctx the parse tree
	 */
	void enterLinea(GestrategiacsvParser.LineaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GestrategiacsvParser#linea}.
	 * @param ctx the parse tree
	 */
	void exitLinea(GestrategiacsvParser.LineaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textoSinComillas}
	 * labeled alternative in {@link GestrategiacsvParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterTextoSinComillas(GestrategiacsvParser.TextoSinComillasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textoSinComillas}
	 * labeled alternative in {@link GestrategiacsvParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitTextoSinComillas(GestrategiacsvParser.TextoSinComillasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringConComillas}
	 * labeled alternative in {@link GestrategiacsvParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterStringConComillas(GestrategiacsvParser.StringConComillasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringConComillas}
	 * labeled alternative in {@link GestrategiacsvParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitStringConComillas(GestrategiacsvParser.StringConComillasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code campoVacio}
	 * labeled alternative in {@link GestrategiacsvParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampoVacio(GestrategiacsvParser.CampoVacioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code campoVacio}
	 * labeled alternative in {@link GestrategiacsvParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampoVacio(GestrategiacsvParser.CampoVacioContext ctx);
}