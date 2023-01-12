import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        triangle triangle =new triangle();
        System.out.println("Write a:");
        triangle.a = scanner.nextInt();
        System.out.println("Write b:");
        triangle.b = scanner.nextInt();
        System.out.println("Write c:");
        triangle.c = scanner.nextInt();
        System.out.println("a: "+triangle.a);
        System.out.println("b: "+triangle.b);
        System.out.println("c: "+triangle.c);
        System.out.println("commiiittttt");
        triangle.area();
    }
}