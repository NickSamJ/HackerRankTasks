public class JumpingOnTheCloudsRevisited {
    public static void main(String[] args) {
        int[] list = {1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1};
        int step = 19;
        int res = jumpingOnClouds(list, step);

        System.out.println(res);
    }
    static int jumpingOnClouds(int[] c, int k) {
        int res = c[0] == 0 ? 99 : 97;
        int currentIndex = k;
        if(currentIndex >= c.length){
            currentIndex = currentIndex - c.length;
        }
        while(currentIndex != 0){
            if(c[currentIndex] == 1){
                res -= 3;
            }else {
                res--;
            }
            currentIndex += k;
            if(currentIndex >= c.length){
                currentIndex = currentIndex - c.length;
            }
        }
        return res;
    }
}
