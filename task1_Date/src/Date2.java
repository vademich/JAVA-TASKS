import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.FormatStyle;
public class Date2 {
    public void tasking(String date) {

        int[] arr = new int[3];
        String[] words = date.split("-");
        int i = 0;
        for (String word : words) {
            arr[i] = Integer.valueOf(word);
            i++;
        }

        LocalDate anotherSummerDay = LocalDate.of(arr[2], arr[1], arr[0]);
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(anotherSummerDay));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(anotherSummerDay));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(anotherSummerDay));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(anotherSummerDay));

        int[] month = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (arr[2] % 4 == 0) {
            System.out.println("Год високосный");
            month[1] = 29;
        } else {
            System.out.println("Год не високосный");
        }
        System.out.println("Дней в этом месяце - " + month[arr[1] - 1]);

        int[] mmonth = new int[]{6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};//JANUARY-DECEMBER
        int[] yyear = new int[]{6, 0, 1, 2, 4, 5, 6, 0, 2, 3, 4, 5, 0, 1, 2, 3, 5, 6, 0, 1, 3, 4, 5, 6, 1, 2, 3, 4};//1988-2015

        switch((yyear[arr[2] - (arr[2]/28)*28] + mmonth[arr[1]-1] + arr[0]) % 7) {
            case 0: System.out.println("ВС"); break;
            case 1: System.out.println("ПН"); break;
            case 2: System.out.println("ВТ"); break;
            case 3: System.out.println("СР"); break;
            case 4: System.out.println("ЧТ"); break;
            case 5: System.out.println("ПТ"); break;
            case 6: System.out.println("СБ"); break;
        }
    }
}