import java.math.BigInteger;
import java.util.Scanner;

public class BigNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            BigInteger factorial = BigInteger.ONE;
            for (int i = 2; i <= n; i++) {
                BigInteger num = BigInteger.valueOf(i);
                factorial = factorial.multiply(num);
            }

            String[] cadena = factorial.toString().split("");
            int suma = 0;
            for (int j = 0; j < cadena.length; j++) {
                int dig = Integer.parseInt(cadena[j]);
                suma += dig;
            }
            System.out.println(suma);

        }
        sc.close();
    }
}