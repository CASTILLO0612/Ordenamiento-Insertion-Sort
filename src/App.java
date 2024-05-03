public class App {

    public static void InsertionSort (int[]arr){
        int n= arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];//Seleccionamos el elemento a insertar en su posicion correcta
            int j = i-1;
            //Se movieron los elementos mayores que key a una posicion adelante de su posicion
            //actual
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }   
            arr[j+1]=key; //Insertamos key en su posicion correcta
        }
    }
    public static void main(String[] args) throws Exception {
        
        System.out.println("Hola, metodo de ordenamiento por insercion");

        int []arr = {12, 11, 13, 5, 6};

        System.out.println("Arreglo inicial:");
        for (int num : arr) {
        System.out.println(num+" ");  
        }
        
        System.out.println("==============================");
        InsertionSort(arr);//Llamada del metodo de ordenamiento por insercion

        System.out.println("Arreglo ordenado:");
        for (int num : arr) {
            System.out.println(num+" "); 
        }
    }

}
