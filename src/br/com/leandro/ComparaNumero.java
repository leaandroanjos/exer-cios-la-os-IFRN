package br.com.leandro;

import java.util.Scanner;

public class ComparaNumero {

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        Double num1 = s.nextDouble();
        System.out.println("Digite o segundo número");
        Double num2 = s.nextDouble();

        if (num1.equals(num2)){
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Os números são diferentes.");
            if (num1 > num2) {
                System.out.println(num1 + " é maior que " + num2);
            } else {
                System.out.println(num2 + " é maior que " + num1);
            }
        }

    }

}
