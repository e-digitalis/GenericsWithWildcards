package testingOtherStuff;

import java.util.Scanner;

public class NextIndexOfString {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		
		String numberString = "5,10,15,25,100,1000";
		
		String nextCase = ",";
		int indexBeginning = 0;
		int indexEnd = 0;
		for (indexBeginning = numberString.indexOf(nextCase); indexBeginning >= 0; indexBeginning = numberString.indexOf(nextCase, indexBeginning + 1)) {
			indexEnd = numberString.indexOf(nextCase, indexBeginning + 1);
			System.out.println("IB: " + indexBeginning);
			System.out.println("IE: " + indexEnd);

			myScanner.close();

		}

	}
}