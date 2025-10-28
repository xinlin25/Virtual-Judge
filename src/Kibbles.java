import java.util.Scanner;

public class Kibbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < casos; i++) {
            String[] operacion = sc.nextLine().split(" ");
            int n1 = Integer.parseInt(operacion[0], 16);
            int n2 = Integer.parseInt(operacion[2], 16);

            int solucion = 0;
            if (operacion[1].equals("+")) {
                solucion = n1 + n2;
            } else {
                solucion = n1 - n2;
            }

            String num1 = Integer.toBinaryString(n1);
            String num2 = Integer.toBinaryString(n2);

            String ceros = "";
            if (num1.length() < 13) {
                for (int j = num1.length(); j < 13; j++) {
                    ceros += "0";
                }
            }
            String bin1 = ceros + num1;
            ceros = "";

            if (num2.length() < 13) {
                for (int x = num2.length(); x < 13; x++) {
                    ceros += "0";
                }
            }
            String bin2 = ceros + num2;

            System.out.println(bin1 + " " + operacion[1] + " " + bin2 + " = " + solucion);
        }
        sc.close();
    }
}