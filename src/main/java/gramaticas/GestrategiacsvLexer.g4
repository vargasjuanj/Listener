lexer grammar GestrategiacsvLexer;
// import GestrategiacsvFragments;
@header {
//package ...

}
TEXTO: ~[,\n\r"]+;   //~ cualquier cosa que no sea
INTRO: [\n\r]+;
//agarrar cualquier cosa que este entre comillas dobles, excepto una comilla doble al final, que es la de cierre
CADENA :  '"' ('""'|~'"')* '"' {setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));}; //quito las comillas iniciales y finales. Establesco un texto con setText,  obtengo el valor del token y lo modifico con substring. Luego reemplazo con un replace aquellos datos que no necesite para el primer elemento ($1) que tengo del token.Este código java se inserta en el Lexer.java como una accion. Si hay una acción se mira si hay para cadena, y si existe ejecuto tal sentencia. Edito el valor del lexema.
SEPARADOR: ',';


