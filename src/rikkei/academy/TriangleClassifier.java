package rikkei.academy;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh a: ");
        int a = sc.nextInt();
        System.out.println("Nhập độ dài cạnh b: ");
        int b = sc.nextInt();
        System.out.println("Nhập độ dài cạnh c: ");
        int c = sc.nextInt();
        Triangle(a, b, c);

    }

    public static String Triangle(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            return "không phải tam giác";
        } else {
            if (a + b > c && b + c > a && a + c > b) {
                if (a == b & b == c & c == a) {
                    return "tam giác đều";
                } else if (a == b || b == c || c == a) {
                    return "tam giác cân";
                }
                return "tam giác thường";
            } else return "không phải tam giác";
        }

    }
}
