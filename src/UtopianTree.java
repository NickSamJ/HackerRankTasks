public class UtopianTree {
    public static void main(String[] args) {
        int[] testCases = {0, 1, 4};
        for (int testCase :
        testCases){
            System.out.println(utopianTree(testCase));
        }

    }
    static int utopianTree(int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            if(i%2 == 0){
                res *= 2;
            }else{
                res++;
            }
        }
        return res;
    }
    
}
