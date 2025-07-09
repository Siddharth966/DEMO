import java.util.Scanner;

public class MidChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        int len = str.length();
        if (len % 2 == 0) {
            System.out.println("Middle characters: " + str.charAt(len/2 - 1) + str.charAt(len/2));
        } else {
            System.out.println("Middle character: " + str.charAt(len/2));
        }
    }
}
