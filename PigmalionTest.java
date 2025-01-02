import java.util.Arrays;
import java.util.List;

public class PigmalionTest {


    public static boolean encontrarSuma(List<Integer> arr, int sumaRequerida) {

        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i != j && arr.get(i) + arr.get(j) == sumaRequerida) {
                    return true;
                }
            }

        }
        return false;
    }



    public static void main(String[] Args){
        List<Integer> unsoArray = Arrays.asList(1, 4, 3, 9);
        System.out.println(encontrarSuma(unsoArray,8));

    }
}
