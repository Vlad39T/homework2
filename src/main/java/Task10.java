import java.util.Scanner;

public class Task10 {

    public static void main(String[] args){

        System.out.printf("Напишіть програму розрахунку ідеальної ваги до зросту. В\n" +
                "константах зберігаються зріст (height) і вага (weight). Виведіть в\n" +
                "консоль повідомлення про те, скільки кілограм потрібно набрати \n" +
                "або скинути (ідеальна вага = зріст - 110)\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть вагу = ");
        double weight;
        weight = scanner.nextDouble();

        System.out.println("Введіть зріст = ");
        double height;
        height = scanner.nextDouble();

         if (weight==height - 110){
             System.out.println("У вас ідеальна вага до зросту");

         }else if (weight>height - 110) {

             double z = weight - (height - 110);

             System.out.println("Вам потрібно скинути = " + z + " кг" );
         } else if (weight<height - 110)  {

             double x = weight - (height - 110);

             System.out.println("Вам потрібно набрати " + (-x) + " кг");

         } else {
             System.out.println();
         }
    }
}


