package co.com.sofka.firstProyectTraining;

import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
        Scanner answerPerson = new Scanner(System.in);

        System.out.println("Ingrese por favor su nombre.");
        String name = answerPerson.nextLine();

        System.out.println("Ingrese por favor su numero de celular.");
        String phone = answerPerson.nextLine();

        System.out.println("Ingrese por favor su edad.");
        Integer age = answerPerson.nextInt();

        System.out.println("Bienvenido señor "+ name +", es un placer para nosotros contar con una persona de " +age+ " años. \n"
                            + "Próximamente nos comunicaremos con usted al numero " +phone+ ". \n"
                            + "Feliz día.");
    }
}
