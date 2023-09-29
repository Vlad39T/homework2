import java.util.Scanner;

public class Task07 {


    public static void main(String[] args){

        System.out.printf("Розробіть програму, яка дозволить обчислити суму вкладу банку \n" +
                "через два роки за встановленим річним відсотком, якщо задана \n" +
                "початкова величина вкладу.\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть суму вкладу = ");
        double x;
        x = scanner.nextDouble();

        System.out.println("Введіть Річний відсоток = ");
        double y;
        y = scanner.nextDouble();


        double sum = x/100 * y*2;
        double sum2 = x+sum;

        System.out.println("Сума вкладу за 2 роки = " + sum2 );



    }
}
