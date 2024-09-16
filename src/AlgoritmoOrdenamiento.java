import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
abstract class AlgoritmoOrdenamiento{
    protected long operaciones;
    protected long comparaciones;
    protected long intercambios;
    protected int inserciones;
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
        inserciones = 0;
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
    private int inserciones;
    private int elemOrdenados;
    private int[] resultado;
    public Resultado(String alg, long operaciones, long comparaciones, long intercambios, int inserciones, int[] res, int elementos){
        this.ordenadoPor = alg;
        this.operaciones = operaciones;
        this.comparaciones = comparaciones;
        this.intercambios = intercambios;
        this.inserciones = inserciones;
        this.resultado = res.clone();
        this.elemOrdenados = elementos;
    }
    public void mostrarResultados(){
        System.out.println("Ordenado por: "+ordenadoPor);
        System.out.println("Operaciones: "+operaciones);
        System.out.println("Comparaciones: "+comparaciones);
        System.out.println("Intercambios: "+intercambios);
        System.out.println("Inserciones: "+inserciones);
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
            // archivo.write("Inserciones: "+inserciones+"\n");
            archivo.write(elemOrdenados+" "+operaciones+" "+comparaciones+" "+intercambios+" "+inserciones+"\n");
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
