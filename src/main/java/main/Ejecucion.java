package main;
import gen.grammar.GestrategiacsvLexer;
import gen.grammar.GestrategiacsvParser;
import listener.CSVListener_TipoBasico;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import tablasDeSimbolos.TablaDeSimbolos;

import java.io.*;
public class Ejecucion {
    public static void main(String[] args) throws Exception {
String inputFile="datos/datosprueba.csv";
if(args.length>0){
    inputFile=args[0];

}
InputStream is= System.in;
if(inputFile!=null){
    is= new FileInputStream(inputFile);
}

CharStream input = CharStreams.fromStream(is);
GestrategiacsvLexer lexer = new GestrategiacsvLexer(input);
CommonTokenStream tokens = new CommonTokenStream(lexer);
GestrategiacsvParser parser = new GestrategiacsvParser(tokens);
parser.setBuildParseTree(true);
ParseTree tree = parser.csv();

//configuramos el listener
        CSVListener_TipoBasico TB = new CSVListener_TipoBasico();
        ParseTreeWalker walker = new ParseTreeWalker();

        //Recorremos el arbol
        walker.walk(TB,tree);
        TablaDeSimbolos tablaDeSimbolos = TB.getTablaDeSimbolos();
        tablaDeSimbolos.mostrar(); //Lo que muestre debe ser nuestro fichero de datos
    }
}
