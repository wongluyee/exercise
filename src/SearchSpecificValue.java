
public class SearchSpecificValue {

	public static void main(String[] args) {
		int[] intArray = new int[10];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1;
		}

		int targetValue = 6;
		int targetPosition = 0;
		
		// adding second condition so we won't run past the end of the array when targetValue is not found among the array elements
		while((intArray[targetPosition]) != targetValue && (targetPosition < intArray.length)) {
			targetPosition++;
		}
		
		System.out.println(targetPosition);

	}

}
