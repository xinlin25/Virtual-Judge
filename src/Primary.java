import java.math.BigInteger;
import java.util.Scanner;

public class Primary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String entrada = sc.nextLine();

            BigInteger suma = BigInteger.ZERO;

            for (int i = 0; i < entrada.length(); i++) {
                char letra = entrada.charAt(i);
                int ascii = letra;

                ascii = ascii < 97 ? ascii - 38 : ascii - 96;

                suma = suma.add(BigInteger.valueOf(ascii));
            }
            if (suma.isProbablePrime(10) || suma.equals(BigInteger.ONE)) {
                System.out.println("It is a prime word.");
            } else {
                System.out.println("It is not a prime word.");
            }
        }
        sc.close();
    }
}