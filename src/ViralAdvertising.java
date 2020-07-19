public class ViralAdvertising {
    public static void main(String[] args) {
        System.out.println(viralAdvertising(5));
    }
    static int viralAdvertising(int n) {
        int shared = 5;
        int liked = 0;

        for (int i = 0; i < n; i++) {
            int likedThisDay =  (int)Math.floor(shared/2);
            liked = liked + likedThisDay;
            shared = likedThisDay * 3;
        }
        return liked;
    }


}
