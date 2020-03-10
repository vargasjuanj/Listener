package listener;

import gen.grammar.GestrategiacsvParser;
import gen.grammar.GestrategiacsvParserBaseListener;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ListenerSinRefactorizar  extends GestrategiacsvParserBaseListener {
    public static final String CAMPO_VACIO = "";
     public List<Map<String, String>> filas = new ArrayList<Map<String, String>>();
//Nota : La tabla de simbolo conviene que este en otra clase, con sus metodos y atributos , con proteccion de acceso
// En una clase separada es mejor poner los atributos y tener los metodos añade fila , busca campo. Esto es la forma de meter todo dentro de una clase.


    //Debo ponerles public para poder acceder desde fuera, pero poniendolo acá y no en otra clase pueden tocarme la estructura interna y cargarsela.
    public List<String> nombreCampos; //cabecera

    public List<String> datosFilaActual;


    @Override
    public void enterLinea(GestrategiacsvParser.LineaContext ctx) {

        datosFilaActual = new ArrayList<String>();

    }

    @Override
    public void exitTextoSinComillas(GestrategiacsvParser.TextoSinComillasContext ctx) {

        datosFilaActual.add(ctx.TEXTO().getText());

    }

    @Override
    public void exitStringConComillas(GestrategiacsvParser.StringConComillasContext ctx) {

        datosFilaActual.add(ctx.CADENA().getText());
    }

    @Override
    public void exitCampoVacio(GestrategiacsvParser.CampoVacioContext ctx) {

        datosFilaActual.add(CAMPO_VACIO);
    }

    @Override
    public void exitLinea(GestrategiacsvParser.LineaContext ctx) { //linea cargada
        if(ctx.getParent().getRuleIndex()==GestrategiacsvParser.RULE_cabecera){
            return;
        }


        //Suponemos que es una línea de datos
        //Cada Map representa una fila, y esta asociada con una cabecera. String,String
        Map<String, String> lineatemporal = new LinkedHashMap<String, String>(); //Lista enlazada con nombre de campo y valor de campo.
        int i = 0;
        for (String actual : datosFilaActual) {
            lineatemporal.put(nombreCampos.get(i), actual);
            i++;
        }
        filas.add(lineatemporal);

    }

    @Override
    public void exitCabecera(GestrategiacsvParser.CabeceraContext ctx) {


        nombreCampos= new ArrayList<String>();
        nombreCampos.addAll(datosFilaActual);




    }
}
