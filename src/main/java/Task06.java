import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Є прямокутник, в якого відома ширина w і висота h. Обчисліть і виведіть в консоль \n" +
                "периметр і площу заданого прямокутника. Висота і ширина прямокутника має задаватися константними \n" +
                "змінними в кодіпрограми.\n");

        System.out.println("Введіть ширину = ");
        double w;
        w = scanner.nextDouble();

        System.out.println("Введіть висоту = ");
        double h;
        h = scanner.nextDouble();

        double pr = 2*w + 2*h;
        double pl = w*h;

        System.out.println("Периметр = " + pr);
        System.out.println("Площа = " + pl);




    }


}
