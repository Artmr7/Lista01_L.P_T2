package quest1.quest1_2;

public class Palindromo {
    public String verificarPalindromo(String palindromo) {
        boolean palavraIgualPalindromo = true;
        for (int i = 0, j = palindromo.length() - 1; i < j; i++, j--) {
            if (palindromo.toLowerCase().charAt(i) != palindromo.toLowerCase().charAt(j)) {
                palavraIgualPalindromo = false;
                return " não é um palindromo!";
            }
        }
        return " é um palindromo!";
    }

    public Palindromo() {}
}
