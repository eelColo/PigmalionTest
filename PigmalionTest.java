import java.util.Arrays;
import java.util.List;

public class PigmalionTest {

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



    public static void main(String[] Args){
        int[] x = {1, 4, 3, 9};
        System.out.println(encontrarSuma(x,8));

    }
}
