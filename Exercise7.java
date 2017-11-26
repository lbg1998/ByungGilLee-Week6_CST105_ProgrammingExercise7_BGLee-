/**
 * My name is Byung Gil Lee, and it is my own work.
 */
public class Exercise7 {
	public static boolean isPrime(int n) {
		int[] divisors = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79
				, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181
				, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293
				, 307, 311, 313}; //divide by prime numbers lower than square root 100000 which is 316
		boolean prime = false;
		if (n == 1 || n == 0) {
			prime = false;
		} else {
			for (int i = 0; i < divisors.length; i++) {
				if (n % divisors[i] == 0 && n != divisors[i]) {
					prime = false;
					break;
				} else {
					prime = true;
				}
			}
		}
		return prime;
	}
	public static boolean isPalindrome(int n) {
		char[] digits = Integer.toString(n).toCharArray();
		boolean palindrome = false;
		int count = 0;
		if (digits.length == 1) {
			palindrome = true;
		} else if (digits.length % 2 == 0) {
			for (int i = digits.length - 1; i >= digits.length / 2; i--) {
				if (digits[count] == digits[i]) {
					palindrome = true;
					count++;
				} else {
					palindrome = false;
					break;
				}
			}
		} else {
			for (int j = digits.length - 1; j >= (digits.length - 1) / 2; j--) {
				if (digits[count] == digits[j]) {
					palindrome = true;
					count++;
				} else {
					palindrome = false;
					break;
			}
		}
		}
		return palindrome;
	}
	public static void main(String[] args) {
		System.out.println("Palindromic Primes:");
		for (int i = 1; i <= 100000; i++) {
			if (isPrime(i) && isPalindrome(i)) {
				System.out.println(i);
			}
		}
	}
}