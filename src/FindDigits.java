public class FindDigits {
    public static void main(String[] args) {
        int number = 12;

        int res = findDigits(number);
        System.out.println(res);
    }
    static int findDigits(int n) {
        int res = 0;
        String stringValue = Integer.toString(n);
        for(int i = 0; i < stringValue.length(); i++){
            int currentDigit = Character.getNumericValue(stringValue.charAt(i));
            if(currentDigit != 0){
                if(n % currentDigit == 0){
                    res++;
                }
            }
        }
        return res;
    }
}
