package br.com.leandro;

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double num1 = s.nextDouble();
        System.out.println("Digite o segundo número");
        double num2 = s.nextDouble();

        if (num1 == num2) {
            System.out.println("Ele são iguais");
        } else if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else {
            System.out.println("O maior número é: " + num2);
        }

    }

}
