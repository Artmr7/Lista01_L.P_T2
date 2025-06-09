package quest1.quest1_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Palindromo palindromo = new Palindromo();
        String palindromoString;
        System.out.print("\nDigite uma palavra: ");
        palindromoString = entrada.next();
        System.out.print("\nA palavra" + palindromo.verificarPalindromo(palindromoString));
        entrada.close();
    }
}