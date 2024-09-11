abstract class AlgoritmoOrdenamiento{
    final int op_for = 2;
    final int op_ara = 2;
    protected int operaciones;
    protected int[] arr;
    public AlgoritmoOrdenamiento(int[] arr){
        //this.operaciones = 0;
        this.arr = arr.clone();
    }
    public int calcularOperaciones(){
        operaciones = 0;
        ordenar();
        return operaciones;
    }
    protected abstract void ordenar();
}
