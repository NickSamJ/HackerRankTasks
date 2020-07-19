public class Kangaroo {
    public static void main(String[] args) {
//        String res = kangaroo(0, 3, 4, 2);
        String res = kangaroo(0, 2,5, 3);

        System.out.println(res);
    }
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int[] kangProgress1 = {0, x1};
        int[] kangProgress2 = {0, x2};
        int initialFirstKangooId = x1 > x2 ? 1 : 2;
        int currentSecondKangooId = initialFirstKangooId == 1 ? 2 : 1;
        while(initialFirstKangooId != currentSecondKangooId){
            kangProgress1[0]++;
            kangProgress2[0]++;
            kangProgress1[1] += v1;
            kangProgress2[1] += v2;

            if(kangProgress1[1] == kangProgress2[1]){
                return "YES";
            }
            currentSecondKangooId = kangProgress1[1] > kangProgress2[1] ? 2 : 1;
        }

        return "NO";

    }
}

