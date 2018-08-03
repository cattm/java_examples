
public class FibAndFizz {
	
	public static void fibToNumber(int number) {
		int fib1 = 1;
		int fib2 = 1;

		System.out.printf("Fib series for %d is :\n", number);
		System.out.printf(" %d ", fib1);
		System.out.printf(" %d ", fib2);
		
		for (int i = 2; i < number; i++) {
			int fib = fib1 + fib2;
			System.out.printf(" %d ", fib);
			fib1 = fib2;
			fib2 = fib;
		}
	}
	
	public static int getRecursivFib(int n) {
		if ((n ==1) || (n == 2)) return 1;
		
		return getRecursivFib(n -1) + getRecursivFib(n - 2);
	}

	
	public static void fibToRecurseNum(int number) {
		System.out.printf("\n Fib series for %d (using recursion) is :\n", number);
		
		for (int i = 1; i < number; i++)
			System.out.printf(" %d ", getRecursivFib(i));
	}
	
	public static void DoFizzbuzz(int n) {
		System.out.printf("\n Fizzbuzz serise for %d is :\n", n);
		for (int i = 1; i <= n; i++){
			if (i % (15) == 0 ) System.out.printf(" FizzBuzz ");
			else if (i % 5 == 0) System.out.printf(" Buzz ");
			else if (i % 3 == 0) System.out.printf(" Fizz ");
			else System.out.printf(" %d ", i);
		}
		
	}
	public static void main(String[] args) {
		fibToNumber(20);
		fibToRecurseNum(12);
		DoFizzbuzz(31);

	}

}
