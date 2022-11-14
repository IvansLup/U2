import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random() ;
        int randomInt = rnd.nextInt(10);

        int skaitlis;
        System.out.println("Pamēģini uzminēt skaitli no 1 līdz 10, bet tev ir tikai viena iespēja, good luck!" ) ;

        skaitlis = scan.nextInt();

        if (skaitlis == randomInt) {
            System.out.println("WOW, no pirmās reizes, apbrīnojumi!");

        } else if (skaitlis > rnd.nextInt()){
            System.out.println("Sorry, nav īstais, ir pa daudz! Pamēģini no jauna!");
        }
        else {
            System.out.println("Sorry, nav īstais, ir pa maz! Pamēģini no jauna!");

        }
    }
}