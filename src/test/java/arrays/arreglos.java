package arrays;

public class arreglos {
   public static Integer [] arr1; //= {1,2,3};
    public static Integer [] arr2;// = {7,2,9};
    private int contador;
    public arreglos(int sizeArray){
        this.contador = 0;
        this.arr1 = new Integer[sizeArray];
        this.arr2 = new Integer[sizeArray];
    }
    public void setArr1(int tamaño){
        if(contador < arr1.length){
            arr1[contador] = tamaño;
            contador++;
        }
    }
    public Integer [] getArr1(){
        return arr1;
    }

    public void setArr2(int tamaño){
        if(contador < arr2.length){
            arr2[contador] = tamaño;
            contador++;
        }
    }
    public Integer [] getArr2(){
        return arr2;
    }
}
