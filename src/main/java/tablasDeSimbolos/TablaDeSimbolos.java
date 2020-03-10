package tablasDeSimbolos;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TablaDeSimbolos {
    private List<Map<String, String>> filas = new ArrayList<Map<String, String>>();
    private List<String> nombreCampos;
    private List<String> datosFilaActual;
    public TablaDeSimbolos() {

    }

    public TablaDeSimbolos(List<Map<String, String>> filas, List<String> nombreCampos, List<String> datosFilaActual) {
        this.filas = filas;
        this.nombreCampos = nombreCampos;
        this.datosFilaActual = datosFilaActual;
    }

    public List<Map<String, String>> getFilas() {
        return filas;
    }

    public void setFilas(List<Map<String, String>> filas) {
        this.filas = filas;
    }

    public List<String> getNombreCampos() {
        return nombreCampos;
    }

    public void setNombreCampos(List<String> nombreCampos) {
        this.nombreCampos = nombreCampos;
    }

    public List<String> getDatosFilaActual() {
        return datosFilaActual;
    }

    public void setDatosFilaActual(List<String> datosFilaActual) {
        this.datosFilaActual = datosFilaActual;
    }

    public void nuevaFila(){
        datosFilaActual= new ArrayList<String>();
    }
    public void agregarCampo(String campo){
        datosFilaActual.add(campo);
    }
    public void agregarFila(){
        Map<String, String> lineatemporal = new LinkedHashMap<String, String>();
        int i = 0;
        for (String actual : datosFilaActual) {
            lineatemporal.put(nombreCampos.get(i), actual);
            i++;
        }
        filas.add(lineatemporal);

    }
    public void agregarCabecera(){
        nombreCampos= new ArrayList<String>();
        nombreCampos.addAll(datosFilaActual);
    }

    @Override
    public String toString() {
        return "TablaDeSimbolos{" +
                "filas=" + filas +
                '}';
    }
    public void mostrar(){
        System.out.printf(toString());
    }
}
