import java.util.ArrayList;
import java.util.Arrays;

public class SequenceEquation {
    public static void main(String[] args) {
        int[] list = {5, 2, 1, 3, 4};

        int[] res = permutationEquation(list);

        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }

    static int[] permutationEquation(int[] p) {
        ArrayList arr = new ArrayList();
        for (int i = 0; i < p.length; i++){
            arr.add(p[i]);
        }
        int[] res = new int[p.length];

        for(int i = 0; i < p.length; i++){
            int j = arr.indexOf(i+1)+1;
            res[i] = arr.indexOf(j) + 1;
        }
        return res;
    }
}
