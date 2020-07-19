import java.util.ArrayList;
import java.util.Arrays;

public class CutTheSticks {
    public static void main(String[] rgs) {
        int[] arrToProceed = {5, 4, 4, 2, 2, 8};
        int[] res = cutTheSticks(arrToProceed);
        Arrays.stream(res).forEach(System.out::print);
    }

    private static int[] cutTheSticks(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        recursiveCut(arr, result);
        return result.stream().mapToInt(i -> (int)i).toArray();
    }

    private static void recursiveCut(int[] arr, ArrayList<Integer> result) {
        int counter = 0;
        ArrayList<Integer> currArray = new ArrayList<>();
        int min = Arrays.stream(arr).min().orElse(0);
        if(min == 0) {
            return;
        }else{
            for(int i : arr){
                int curVal = i - min;
                if(curVal > 0){
                    currArray.add(curVal);
                }
                 counter++;

            }
            result.add(counter);
            recursiveCut(currArray.stream().mapToInt(i -> (int)i).toArray(), result);
        }
    }
}
