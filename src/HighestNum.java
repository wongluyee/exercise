
public class HighestNum {

	public static void main(String[] args) {
		int intArray[] = { 4, 5, 19, 12, -4, 0, -57, 30987, -287, 1 };
		int highestNum = intArray[0];

		for (int i = 1; i < intArray.length; i++) {
			if (intArray[i] > highestNum) {
				highestNum = intArray[i];
			}
		}
		
		System.out.println(highestNum);

	}

}
