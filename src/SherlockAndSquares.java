public class SherlockAndSquares {

    public static void main(String[] args) {
        int a1 = 3;
        int b1 = 9;

        int a2 = 17;
        int b2 = 24;

        int res1 = squares(a1, b1);
        int res2 = squares(a2, b2);

        System.out.println("First result: " + res1);
        System.out.println("Second result: " + res2);
    }

    static int squares(int a, int b) {
        int start = 0;
        int res = 0;
        for(int i = a; i <= b; i++){
            double curVal = Math.sqrt(i);
            if(curVal - (int)curVal == 0){
                start = (int)curVal;
                break;
            }

        }
        int temp = 0;
        while (temp < b && start > 0){
            temp = start * start;
            if( temp <= b){
                start++;
                res++;
            }
        }

        return res;
    }
}
