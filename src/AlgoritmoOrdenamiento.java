/*
* == PROYECTO 1. COMPLEJIDAD COMPUTACIONAL EN LOS ALGORITMOS DE ORDENAMIENTO | EDA II 2025-1. UNIVERSIDAD NACIONAL AUTONOMA DE MEXICO. FACULTAD DE INGENIERIA. == 
 * @autor: Fernando Samuel López Morales 
 * @autor: Luis Adrián González Falcón
 * 
 * Esta clase es la madre de todos los algoritmos de ordenamiento, aquí se definen los métodos y atributos que deben tener los algoritmos de ordenamiento así como la clase Resultado
 * 
 * última modificación: 16/09/2024
 * @version: 1.0, 2024-09-16
 * 
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
abstract class AlgoritmoOrdenamiento{
    protected long operaciones;
    protected long comparaciones;
    protected long intercambios;
    protected int[] arr;
    ArrayList<Resultado> resultados = new ArrayList<Resultado>();
    public AlgoritmoOrdenamiento(int[] arr){
        this.arr = arr.clone();
    }
    public AlgoritmoOrdenamiento(){
    }
    public Resultado calcularOperaciones(){
        operaciones = 0;
        comparaciones = 0;
        intercambios = 0;
        return sort();
    }
    public void inicializarArr(int [] arr) {
        this.arr = arr.clone();
    }
    protected abstract Resultado sort();
}
class Resultado{
    private String ordenadoPor;
    private long operaciones;
    private long comparaciones;
    private long intercambios;
    private int elemOrdenados;
    private int[] resultado;
    public Resultado(String alg, long operaciones, long comparaciones, long intercambios, int[] res, int elementos){
        this.ordenadoPor = alg;
        this.operaciones = operaciones;
        this.comparaciones = comparaciones;
        this.intercambios = intercambios;
        this.resultado = res.clone();
        this.elemOrdenados = elementos;
    }
    public void mostrarResultados(){
        System.out.println("Ordenado por: "+ordenadoPor);
        System.out.println("Operaciones: "+operaciones);
        System.out.println("Comparaciones: "+comparaciones);
        System.out.println("Intercambios: "+intercambios);
        System.out.println("Elementos ordenados: "+elemOrdenados);
        System.out.println("Arreglo ordenado: ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]+" ");
        }
        System.out.println();
    }
    public long operaciones(){
        return operaciones;
    }
    public void escribirOperacionesEnArchivo(){
        try {
            FileWriter archivo = new FileWriter("../data/"+ordenadoPor+".txt", true);
            // archivo.write(ordenadoPor+"\n");
            // archivo.write("Operaciones:\n"+operaciones+"\n");
            // archivo.write("Comparaciones: "+comparaciones+"\n");
            // archivo.write("Intercambios: "+intercambios+"\n");
            archivo.write(elemOrdenados+" "+operaciones+" "+comparaciones+" "+intercambios+"\n");
            // archivo.write("Elementos ordenados: "+elemOrdenados+"\n");
            // archivo.write("Arreglo ordenado: ");
            // for (int i = 0; i < resultado.length; i++) {
            //     archivo.write(resultado[i]+" ");
            // }
            archivo.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }
    }
}
