 /**Multi-Dimensional Arrays

Create main class named MultiArray.   
 Create a method which outputs (prints) 
 all the values in the array.  Call this method 
 from each of the other methods to illustrate the 
 data in the array.  Note:  Be sure to populate, and 
 update the values in the multi-array, and then print the
  contents of the multi-array  (Don't just print the design patterns.)  
  The goal is to practice navigating the multi-array.**/


import java.util.Arrays;
import java.util.Scanner;

public class MultiArray {

	private int[][] data;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiArray array = new MultiArray();
		array.output();
		System.out.println();
		array.patternRow();
		array.output();
		System.out.println();
		array.patternCheckered();
		array.output();
		System.out.println();
		array.userChoice();
		array.output();
		System.out.println();
		array.sumArray();

	}

	//Declare a multi-dimensional array of integers, which is 10 rows of 10 columns ( 10 by 10).

	//In your code, set the initial values to ones’ 
	public MultiArray() {
		data = new int[10][10];

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = 1;

			}

		}
	}

	public void output() {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();

		}
	}

	//Create a method named “patternRow.”  Using control loops, (if , then /  then / else )
	//set the data values to 1’s and 0’s, alternating by rows, such as this:
	public void patternRow() {
		for (int i = 0; i < data.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < data[i].length; j++) {
					data[i][j] = 0;

				}
			} else if (i % 2 == 1) {
				for (int j = 0; j < data[i].length; j++) {
					data[i][j] = 1;

				}
			}
		}
	}

	//Create a method named “patternCheckered.” 
	//This method should set the values to alternative 1’s and 0’s, such as this:
	public void patternCheckered() {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if ((i + j) % 2 == 0) {
					data[i][j] = 0;
				} else {
					data[i][j] = 1;
				}

			}
		}
	}
	
	//Create a method named “userChoice.”  Prompt the user to enter three numbers. 
	//Set the array data to be the sequence of numbers they enter, such as this:

	public void userChoice() {
		System.out.println("Create your own 10 x 10 Array by entering your choice of 3 numbers below!");
		Scanner scan = new Scanner(System.in);
		int userNum = 0;
		int[] userarr = new int[3];

		for (int z = 0; z < 3; z++) {
			System.out.println("Please enter your choice:");
			userNum = scan.nextInt();
			userarr[z] = userNum;

		}
		System.out.println(Arrays.toString(userarr));

		for (int i = 0; i < data.length; i++) {

			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = userarr[(j + i) % userarr.length];

			}

		}

	}

	//Create a method named “sumArray” which sums all the numbers together. 
	//Output totals for each row, and a grand total.
	public void sumArray() {
		int grandSum = 0;
		int rowSum = 0;

		for (int i = 0; i < data.length; i++) {

			for (int j = 0; j < data[i].length; j++) {

				rowSum += data[i][j];
				grandSum += rowSum;

			}
			System.out.println(" Sum of row " + i + ": " + rowSum);

		}
		System.out.println("GRAND SUM: " + grandSum);
	}

}
