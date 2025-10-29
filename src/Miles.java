import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int km = sc.nextInt();
        while (km != 0) {
            km %= 5;
            switch (km) {
                case 0:
                    System.out.println("0.00");
                    break;
                case 1:
                    System.out.println("0.40");
                    break;
                case 2:
                    System.out.println("0.20");
                    break;
                case 3:
                    System.out.println("0.20");
                    break;
                case 4:
                    System.out.println("0.40");
                    break;
            }
            km = sc.nextInt();
        }

        sc.close();
    }
}