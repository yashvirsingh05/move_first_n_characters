import java.util.Scanner;

public class FisrtCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        if (s.length() < n) {
            System.out.println(s);
        } else {
            System.out.print(s.substring(n));
            for (int i = 0; i < n; i++) {
                System.out.print(s.charAt(i));
            }
        }
    }
}
