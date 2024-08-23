import java.util.Arrays;

public class IteratingArrays {
	
	public static void main(String[] arg) {
		double[] lotteryNumbers = {100, 450 ,999, 45}; //new double[5];
		System.out.println(lotteryNumbers[2]); // Indexing starts from 0 for Arrays
		lotteryNumbers[2] = 1500;
		System.out.println(lotteryNumbers[2]);
		
		for (int i = 0; i < lotteryNumbers.length; i++) {
			System.out.println(lotteryNumbers[i]);
		}
		for (int i = lotteryNumbers.length-1; i >= 0; i--) {
			System.out.println(lotteryNumbers[i]);
		}
		for (int i = lotteryNumbers.length-1; i >= 0; i=i-2) {
			System.out.println(lotteryNumbers[i]);
		}
		System.out.println();
		for (double d : lotteryNumbers) {
			System.out.println(d);
		}
		System.out.println();
		
		// Java Streams
		Arrays.stream(lotteryNumbers).forEach(System.out::println);
		
		System.out.println(Arrays.stream(lotteryNumbers).average());
		System.out.println(Arrays.stream(lotteryNumbers).sum());
		
	}
}