package br.com.leandro;

import java.util.Scanner;

public class NumeroDecrescente {

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o número");
        int num1 = s.nextInt();

        for (int i = num1; i >= 0; i-- ){
            System.out.println(i);
        }

    }
}
