
public class mode {
	// sort method
	public static int[] sort(int[] array) {
		int start = 0;
		int end = array.length - 1;

		for (int i = start + 1; i <= end; i++) {
			for (int j = i; (j > start) && (array[j - 1] > array[j]); j--) {
				int temp = array[j - 1];
				array[j - 1] = array[j];
				array[j] = temp;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		// mode: value that appears most often
		int[] surveyData = { 4, 7, 3, 8, 9, 7, 3, 9, 9, 3, 3, 10 };
		int[] sortedSurveyData = sort(surveyData);

		//		for (int i = 0; i < sortedSurveyData.length; i++) {
		//			System.out.println(sortedSurveyData[i]);
		//		}

		// To hold the most frequently found value so far
		int mostFrequent = 0;
		int highestFrequency = sortedSurveyData[0];
		int currentFrequency = 0;

		// Loop all the numbers in the array
		for (int i = 0; i < sortedSurveyData.length; i++) {
			currentFrequency++;
			// if current number is the last occurrence of a value, and the currentFrequency is higher than highestFrequency,
			// assign currentFrequency value to highestFrequency, then reset currentFrequency to zero.
			if ((i == sortedSurveyData.length - 1) || (sortedSurveyData[i] != sortedSurveyData[i + 1])) {
				if (currentFrequency > highestFrequency) {
					highestFrequency = currentFrequency;
					// Set the mostFrequent to the current value
					mostFrequent = sortedSurveyData[i];
				}
				currentFrequency = 0;
			}
		}
		System.out.println(mostFrequent);
	}

}
