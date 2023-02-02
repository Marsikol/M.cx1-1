
import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String howMuchFriendsOnline = "23";
        System.out.println(howMuchFriendsOnline);

        final int NUM = 6;
        System.out.println(NUM);

        String word = "Play my frends";
        System.out.println(word);

        System.out.println(NUM + " " + word);



        if (NUM < 0) {
            System.out.println("Go to picnic");
        } else if (NUM > 0) {
            System.out.println("Go to Cafe");
        }else {
            System.out.println("Вы сохранили ноль");
        }



        Scanner input = new Scanner(System.in);
        System.out.println("Ведите своё имя ");
        String name = input.next();


        System.out.println("здздравствуйте создатель ; "+name);

    }
}
