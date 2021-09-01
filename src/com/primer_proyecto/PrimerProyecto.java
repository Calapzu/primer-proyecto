package com.primer_proyecto;

import java.util.Scanner;

public class PrimerProyecto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String name, numPhone;
        int age;

        System.out.println("Digite su nombre: ");
         name = entrada.nextLine();

        System.out.println("Digite su numero de celular: ");
         numPhone = entrada.next();

        System.out.println("Digite su edad: ");
        age = entrada.nextInt();

        System.out.println("Bienvenido señor "+name+", es un placer para nosotros contar con una persona de "+age+" años.\n" +
                "Próximamente nos comunicaremos con usted al numero "+numPhone+".\n" +
                "Feliz día");
    }
}
