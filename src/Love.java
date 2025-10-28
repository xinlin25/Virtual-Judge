import java.util.Scanner;

public class Love {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        for (int i = 1; i <= casos; i++) {
            String bin1 = sc.next();
            String bin2 = sc.next();

            int num1 = Integer.parseInt(bin1, 2);
            int num2 = Integer.parseInt(bin2, 2);

            while (num2 != 0) {
                int aux = num2;
                num2 = num1 % num2;
                num1 = aux;
            }

            if (num1 != 1)
                System.out.printf("Pair #" + i + ": All you need is love!\n");
            else
                System.out.printf("Pair #" + i + ": Love is not all you need!\n");
        }

        sc.close();
    }
}