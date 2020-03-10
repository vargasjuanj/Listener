parser grammar GestrategiacsvParser;
options{
tokenVocab = GestrategiacsvLexer;
language = Java;
}
@header{
//package ...
//import ;
}
csv: cabecera linea+;
cabecera: linea;
linea: campo (SEPARADOR campo)* INTRO;
campo:
     TEXTO #textoSinComillas //etiquetar subregla de campo, para que en el fichero java se generen los enganches correspondientes
   | CADENA #stringConComillas
   | #campoVacio  //campo vacio, entre dos comas
    ;

