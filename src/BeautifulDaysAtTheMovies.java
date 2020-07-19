public class BeautifulDaysAtTheMovies {

    public static void main(String[] args) {
        int i = 20;
        int j = 23;
        int k = 6;
        int res = beautifulDays(i, j, k);

        System.out.println(res);
    }

    static int beautifulDays(int i, int j, int k) {
        int res = 0;
        for(int c = i; c <= j; c++) {
            if (clearDivision(c, k)) {

                res++;
            };
        };
        return res;
    }

    static boolean clearDivision(int c, int k){
        boolean res = true;
        int reversed = reverseInt(c);
        double divRes = (double)(c - reversed) / (double)k;
        if(divRes % 1 != 0 ){
            res = false;
        }
        return res;
    }

    static int reverseInt(int c ){
        StringBuilder str = new StringBuilder(Integer.toString(c));
        int length = str.length();
        if(length == 1){
            return c;
        }else{
            str = str.reverse();
        }

        return Integer.parseInt(str.toString());
    }

}
