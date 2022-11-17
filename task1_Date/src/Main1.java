import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Date2 date1 = new Date2();

        System.out.print("Введите число: ");//DD-MM-YYYY
        Scanner in = new Scanner(System.in);
        date1.tasking(in.nextLine());
    }
}
