import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LibraryFine {
    public static void main(String[] args) {
        int d1 = 1;
        int m1 = 1;
        int y1 = 2015;
        int d2 = 31;
        int m2 = 12;
        int y2 = 2014;

        int fine = libraryFine(d1, m1, y1, d2, m2, y2);

        System.out.println(fine);
    }
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        LocalDate expected = LocalDate.parse(y1 + "-" + (m1 < 10 ? "0" + m1:m1) + "-" + (d1<10 ? "0" + d1: d1));
        LocalDate actual = LocalDate.parse(y2 + "-" + (m2 < 10 ? "0" + m2:m2) + "-" + (d2<10 ? "0" + d2: d2));

        Period diff = Period.between(actual, expected);

        // Book was returned at Time
        if(diff.getYears() <= 0 && diff.getDays() <= 0 && diff.getMonths() <= 0){
            return  0;
        }

        // Book returned at unexpected year
        if(m1 != m2){
            return 10_000;
        }

        if(diff.getMonths() == 0){        // Book returned at the expected Month   but another day
            return 15 * diff.getDays();
        }else{        // Book returned at the expected Year but another month
            return 500 * (m1 - m2);
        }
    }
}
