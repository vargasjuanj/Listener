package listener;

import gen.grammar.GestrategiacsvParser;
import gen.grammar.GestrategiacsvParserBaseListener;
import tablasDeSimbolos.TablaDeSimbolos;

/*

Utilizamos java para cargar datos y realizar algún analisis
 */
public class CSVListener_TipoBasico extends GestrategiacsvParserBaseListener {

    private TablaDeSimbolos tablaDeSimbolos = new TablaDeSimbolos();

    public CSVListener_TipoBasico(){}

    public CSVListener_TipoBasico(TablaDeSimbolos tablaDeSimbolos) {
        this.tablaDeSimbolos = tablaDeSimbolos;
    }

    public TablaDeSimbolos getTablaDeSimbolos(){
        return tablaDeSimbolos;
    }


    @Override
    public void enterLinea(GestrategiacsvParser.LineaContext ctx) {
        tablaDeSimbolos.nuevaFila();

    }

    @Override
    public void exitTextoSinComillas(GestrategiacsvParser.TextoSinComillasContext ctx) {
        tablaDeSimbolos.agregarCampo(ctx.TEXTO().getText());

    }

    @Override
    public void exitStringConComillas(GestrategiacsvParser.StringConComillasContext ctx) {
        tablaDeSimbolos.agregarCampo(ctx.CADENA().getText());

    }

    @Override
    public void exitCampoVacio(GestrategiacsvParser.CampoVacioContext ctx) {
        tablaDeSimbolos.agregarCampo("");

    }

    @Override
    public void exitLinea(GestrategiacsvParser.LineaContext ctx) { //linea cargada
        if (ctx.getParent().getRuleIndex() == GestrategiacsvParser.RULE_cabecera) {
            return;
        }
        tablaDeSimbolos.agregarFila();

    }

    @Override
    public void exitCabecera(GestrategiacsvParser.CabeceraContext ctx) {
        tablaDeSimbolos.agregarCabecera();


    }
}

