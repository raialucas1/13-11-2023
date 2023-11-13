package aula3;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("Digite o ano do seu nascimento :");
        int nascimento=scanner.nextInt();

        System.out.println("A sua idade é:"+(2023-nascimento));
    }
}
