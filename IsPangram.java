import java.util.Scanner;

public class IsPangram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the sentence to check pangram or not: ");

        String str = in.nextLine().toLowerCase();
        System.out.println(checkforPangram(str));

    }

    static String checkforPangram(String str) {

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) == ' ')) {
                continue;
            } else {
                return "Not Pangram";

            }
        }
        return "Is Pangram";
    }
}