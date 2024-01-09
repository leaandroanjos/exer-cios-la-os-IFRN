package br.com.leandro;


public class Somatorio {

    public static void main(String args[]){

        int soma = 0;

        long produto = 1;

        for (int i = 1; i <=30; i++){
            if (i%2 != 0) {
                soma += i;
            } else {
                produto = produto*i;
            }
        }

        System.out.println("A soma dos ímpares entre 0 e 30 é: " + soma);
        System.out.println("O produto dos pares entre 0 e 30 é: " + produto);

    }

}
