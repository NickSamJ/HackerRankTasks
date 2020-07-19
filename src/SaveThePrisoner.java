public class SaveThePrisoner {
    // TODO
    public static void main(String[] args) {

        int res1 = saveThePrisoner(5, 2, 1);
        int res2 = saveThePrisoner(5, 2, 2);

        System.out.println("Res1: " + res1);
        System.out.println("Res2: " + res2);
    }

    static int saveThePrisoner(int n, int m, int s) {
        int position = s;
        for (int i = 0; i < m-1; i++) {
            if(position == n) {
                position = 0;
            }
            position++;
        }
        return position;
    }
}
