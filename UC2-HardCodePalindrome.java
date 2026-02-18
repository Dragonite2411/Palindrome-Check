//version 1.0
//author : Adnan Abdullah
//usecase 2:Print a Hardcoded Palindrome Result
public class UseCase2PalindromeCheckerApp { // [cite: 84]
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome?: " + isPalindrome);
    }
}
