import java.util.Scanner;

public class hm_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("請輸入華氏溫度: ");
        double fahrenheit = scn.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("攝氏溫度為: " + celsius);
    }
}