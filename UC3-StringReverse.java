
//version 1.0
//author : Adnan Abdullah
//usecase 3: Palindrome Check Using String Reverse
public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "madam";
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        boolean isPalindrome = input.equals(reversed);
        System.out.println("Input String: " + input);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}
