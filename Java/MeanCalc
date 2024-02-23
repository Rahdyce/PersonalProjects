package project;
import java.util.Scanner;
public class MeanCalculatorStatistics {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
			int n = Integer.parseInt(args[0]);
			// takes the amount of integers and puts it into the commannd line argument
			int[] array = new int[n];
			// reads user input for the integers
			for(int i = 0; i<n;i++) {
				array[i]= input.nextInt();
				}
			
			System.out.println("The original integers are:" );
				for (int i =0; i<n;i++) {
						System.out.print(array[i]);
							if(i<n-1) {
								System.out.print(",");
					}
				}
				int sum = 0;
				for(int j=0; j<array.length;j++) {
					sum+=array[j];
					}
				System.out.println();
				System.out.println("The sum of the values is: " + sum);
				double mean = (int) sum/array.length;
				System.out.println("The mean is: " + mean);
				}
			 }
		
