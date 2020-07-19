import java.util.Arrays;

public class CountingValleys {
    public static void main(String[] args) {
        String s = "UDDDUDUU";
        int res = countingValleys(s.length(), s);
        System.out.printf("He walked throught %d valleys", res);

    }
    static int countingValleys(int n, String s) {
        int valleys = 0;
        int seaLevel = 0;
        int prevSeaLevel = seaLevel;
        for(String symb: s.split("")){
            if(symb.equals("D")){
                seaLevel--;
            }else if(symb.equals("U")){
                seaLevel++;
            }
            if(seaLevel < 0 && prevSeaLevel == 0){
                valleys ++;
            }
            prevSeaLevel = seaLevel;

        }
        return valleys;
    }
}
