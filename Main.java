import java.util.Scanner;
class Main {

    public static int solve(String s, int i, int j) {

        // Base case: no characters
        if (i > j) {
            return 0;
        }

        // Base case: single character
        if (i == j) {
            return 1;
        }

        // Case 1: characters match
        if (s.charAt(i) == s.charAt(j)) {
            return 2 + solve(s, i + 1, j - 1);
        }

        // Case 2: characters don't match
        else {
            int option1 = solve(s, i + 1, j);   // skip left
            int option2 = solve(s, i, j - 1);   // skip right

            return Math.max(option1, option2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the String :-");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int result = solve(s, 0, s.length() - 1);

        System.out.println("Longest Palindromic Subsequence Length: " + result);
    }
}
