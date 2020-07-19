import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate {
    public static void main(String[] args) {
//        ArrayList<Integer> list  = new ArrayList<>();
//        List<Integer> list = List.of(1, 2, 1, 3, 2);
        List<Integer> list = List.of(4);

//        int res = birthday(list, 3, 2);
        int res = birthday(list, 4, 1);
        System.out.println(res);
    }
    static int birthday(List<Integer> s, int d, int m) {
        int matches = 0;
        int nWalks = s.size() - m;
        for(int i = 0; i <= nWalks; i++){
            int sum = 0;
            for(int j = 0; j < m; j++){
                sum += s.get(i+j);
            }
            if(sum == d){
                matches++;
            }
        }
        return matches;
    }
}
