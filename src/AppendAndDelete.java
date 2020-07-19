import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class AppendAndDelete {
    public static void main(String[] args) {
        String s = "y";
        String t = "yu";
        int k = 2;

        String res = appendAndDelete(s, t, k);
        System.out.println(res);
    }

    static String appendAndDelete(String s, String t, int k) {
        if (s.equals(t)){
            return (k >= s.length() * 2 || k % 2 == 0) ? "Yes" : "No";
        }
        int common = 0;

        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (t.charAt(i) != s.charAt(i))
                break;
            common++;
        }
        int total = (s.length() - common) + (t.length() - common);

        return ((total == k)
                || (total < k && (total - k) % 2 == 0)
                || (total + (2 * common) <= k)) ? "Yes" : "No";

    }
}
