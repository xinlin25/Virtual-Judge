import java.util.Scanner;

public class PeterSmoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int cigarros = sc.nextInt();
            int nColillas = sc.nextInt();

            int total = cigarros;
            int colillas = cigarros;

            while (colillas >= nColillas) {
                // cigarros -= nColillas;
                // total++;
                // cigarros++;
                int aux = colillas / nColillas;
                total += aux;
                colillas = aux + (colillas % nColillas);
            }

            System.out.println(total);
        }

        sc.close();
    }
}