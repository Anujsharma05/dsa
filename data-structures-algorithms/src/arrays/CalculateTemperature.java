package arrays;

import java.util.Scanner;

public class CalculateTemperature {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number of days");
		int days = sc.nextInt();

		float[] temps = new float[days];
		float sum = 0;
		
		for (int i = 0; i < temps.length; i++) {
			System.err.println("Enter Day " + (i + 1) + "'s temperature: ");
			temps[i] = sc.nextInt();
			sum = sum + temps[i];
		}
		sc.close();
		
		float avgTemp = sum/(float)days;
		System.err.printf("Average Temp: %.2f", avgTemp);
		System.err.println();
		int count = 0;
		for(int i=0; i<temps.length; i++) {
			if(temps[i] > avgTemp) {
				count++;
			}
		}
		System.err.println(count + " day(s) above average");
	}

}
