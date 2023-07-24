
public class Sort {

	public static void main(String[] args) {
		int intArray[] = { 4, 5, 19, 12, -4, 0, -57, 30987, -287, 1 };
		int start = 0;
		int end = intArray.length - 1;

		/* Outer loop selects the next num to be inserted into our ever-increasing sorted hand.
		 * Loop initializes i to start + 1, 
		 * because we begin by considering whether the second value should come before or after the first.
		 */
		for (int i = start + 1; i <= end; i++) {
			/* Inner loop puts the current value in its correct position 
			 * by repeatedly swapping the current value with its predecessor (previous) until it reaches the correct location.
			 * The loop counter j starts at i, and the loop decrements j so long as we haven't reached the lower end of the array
			 * and haven't yet found the right stopping point for this new value.
			 */
			for (int j = i; (j > start) && (intArray[j - 1] > intArray[j]); j--) {
				// Until then, we use three assignment statements to swap the current value down one position in the array.
				int temp = intArray[j - 1];
				intArray[j - 1] = intArray[j];
				intArray[j] = temp;
			}
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}
