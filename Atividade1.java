package aula3;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       System.out.println("Digite o primeiro número:");
       int numero1=scanner.nextInt();
       System.out.println("Digite o segundo número:");
       int numero2=scanner.nextInt();
       double divisao=(numero1+numero2)/4;
       System.out.println(divisao);
       scanner.close();
    }
}
