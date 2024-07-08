import java.util.Scanner;

public class hm_08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入您的姓名: ");
        String name = scn.nextLine();
        System.out.print("請輸入您的年齡: ");
        int age = scn.nextInt();
        //scn.nextLine();
        System.out.print("請輸入您的城市: ");
        String city = scn.nextLine();
        
        System.out.println("您的姓名是: " + name);
        System.out.println("您的年齡是: " + age);
        System.out.println("您所在的城市是: " + city);
        
        scn.close();
    }
}
