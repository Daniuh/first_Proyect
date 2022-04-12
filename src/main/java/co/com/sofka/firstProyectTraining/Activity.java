package co.com.sofka.firstProyectTraining;

import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
        Scanner answerPerson = new Scanner(System.in);

        System.out.println("Ingrese por favor su nombre.");
        String answer1 = answerPerson.nextLine();

        System.out.println("Ingrese por favor su numero de celular.");
        String answer2 = answerPerson.nextLine();

        System.out.println("Ingrese por favor su edad.");
        Integer answer3 = answerPerson.nextInt();

        System.out.println("Bienvenido señor "+ answer1 +", es un placer para nosotros contar con una persona de " +answer3+ " años. \n"
                            + "Próximamente nos comunicaremos con usted al numero " +answer2+ ". \n"
                            + "Feliz día.");
    }
}
