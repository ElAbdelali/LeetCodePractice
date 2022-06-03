package leetCodeProblems;

public class isPalindrome {

	public static void main(String[] args) {
		int palindrome = 644;

		isPalindrome(palindrome);
	}
	public static boolean isPalindrome(int x) {
        int palindrome = 0;
        int remainder = 0;
        if(x == 0){
            System.out.printf("Is a Palindrome.");
            return true;
        }
        if(x < 0 || x % 10 == 0){
            System.out.printf("Not a Palindrome.");
            return false;
        }
        while(x > palindrome){
            remainder = x % 10;
            x/=10; 
            palindrome = (palindrome * 10) + remainder;
        }
            if(palindrome == x || x == palindrome/10){
                System.out.printf("Is a Palindrome.");
               return true;
            }
            else{
                System.out.printf("Not a Palindrome.");
                return false;
            }
        }

}
