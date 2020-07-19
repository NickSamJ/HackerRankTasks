public class CircularArrayRotation {
    public static void main(String[] args) {
        int[] arrToRotate = {1, 2, 3, 4};
        // 3, --> 4 <--, 1, 2

        // 5 3 4, 4 5 3, 3 4 5
        int rotations = 2;
        int[] queries = {1};
        int[] res = circularArrayRotation(arrToRotate, rotations, queries);

        for (int i: res){
            System.out.println(i);
        }
    }

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] res = new int[queries.length];
        int shift = k >= a.length ? k % a.length : k;

        for(int i = 0; i < queries.length; i++){
            int expPos = queries[i] - shift;
            int oldIndex = expPos < 0 ? a.length + expPos : expPos;

            res[i] = a[oldIndex];
        }
        return res;
    }
}
