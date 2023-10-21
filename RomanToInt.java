import java.util.Scanner;

public class RomanToInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // take a roman Input
        System.out.print("Enter the correct form of Roman number: ");
        String s = in.nextLine();
        int ans = 0, num = 0;
        // iterate input from end to start
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            /*
             * ex: "IV"
             * i) num= 5, ans=0 -> 4*5= 25< 0 -> ans=num(5);
             * ii) num=1 , ans=5 -> 4*1= 4< 5 -> ans -=num(1);
             * final answer is 4="IV"
             */

            if (4 * num < ans)
                ans -= num;
            else
                ans += num;
        }
        System.out.println("Roman-> " + s + " of Integer value is-> " + ans);
    }
}
