import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PigmalionExamenTecnico {

    /*
    * Función 1, que asume que los recursos son infinitos y no le da importancia al tiempo
    */
    public static boolean encontrarSuma(int[] nums, int sumaRequerida) {
        //Imprime el array otorgado en cuestion
        System.out.println(nums);

        /* Itera sobre el array 2 veces
        * La primera para obtener el primer valor y la segunda para sumarlo contra los demas valores
        * */
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                /*  Si i y j no son iguales y la suma de ambos es igual a la suma requerida imprime true
               *  Esto es para evitar que se sume el mismo indice
               */

                if (i != j && nums[i] + nums[j] == sumaRequerida) {
                    return true;
                }
            }
        //En caso de que no coincida con la suma devuelve false
        }
        return false;
    }


    //funcion mas compleja

    public static boolean encontrarSumaOptimizado(int[] numeros, int sumaRequerida){


        //Inicializamos HashSet para guardar los numeros que ya pasaron y podriamos necesitar
        HashSet<Integer> numsHash = new HashSet<>();


        for(int numeroActual : numeros){
            /*
            Chequeamos la diferencia entre el numero pedido y el actual
            para buscarlo mas adelante en el hashSet
             */
            int diferencia = sumaRequerida - numeroActual;
            //chequea si el hash tiene un valor con la diferencia que falta para alcanzar el objetivo
            if(numsHash.contains(diferencia)){

                return true;
            }
            //agregamos el numero al hash para que mas adelante sea buscado
            numsHash.add(numeroActual);
        }

        return false;
    }

    public static void main(String[] Args){

        //Arrays
        int num[]  = {1,4,3,9};
        int num2[] = {1,2,4,4};
        System.out.println(encontrarSuma(num, 8));
        System.out.println(encontrarSuma(num2, 8));
        //Funcion mejorada con HashSet
        System.out.println(encontrarSumaOptimizado(num, 8));
        System.out.println(encontrarSumaOptimizado(num2, 8));

    }
}
