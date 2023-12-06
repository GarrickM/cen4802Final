package CEN4802Final.CEN4802Final;

import java.util.Locale;
import java.util.Random;
import java.text.NumberFormat;

public class DiceGame {
	static Random rand = new Random();
	static int d4;
	static int d6;
	static int d8;
	static int d10;
	static int d12;
	static int d20;
	static int attempt = 0;
	static int d6count = 0;
	static int d8count = 0;
	static int d10count = 0;
	static int d12count = 0;
	static int d20count = 0;
	
	public static void main(String[] args) {
		
		do {
			attempt++;
			System.out.println("Attempt " + numberFormatter(attempt));
			d4 = rand.nextInt(4) + 1;
			System.out.print(d4);
			if (d4 == 4) {	
				d6count++;
				d6 = rand.nextInt(6) + 1;
				System.out.print(", " + d6);
				if (d6 == 6) {
					d8count++;
					d8 = rand.nextInt(8) + 1;
					System.out.print(", " + d8);
					if (d8 == 8) {
						d10count++;
						d10 = rand.nextInt(10) + 10;
						System.out.print(", " + d10);
						if (d10 == 10) {
							d12count++;
							d12 = rand.nextInt(12) + 1;
							System.out.print(", " + d12);
							if (d12 == 12) {
								d20count++;
								d20 = rand.nextInt(20) + 1;
								System.out.print(", " + d20);
								if (d20 == 20) {
									System.out.print("! You did it!");
								}
							}
						}
					}
				}
			}
		System.out.println("\n");
		} while (d20 < 20);
		System.out.println("Attempts: " + numberFormatter(attempt));
		System.out.println("D6 reached: " + numberFormatter(d6count));
		System.out.println("D8 reached: " + numberFormatter(d8count));
		System.out.println("D10 reached: " + numberFormatter(d10count));
		System.out.println("D12 reached: " + numberFormatter(d12count));
		System.out.println("D20 reached: " + numberFormatter(d20count));
	}
	
	public static String numberFormatter(int i) {
		String format = NumberFormat.getNumberInstance(Locale.US).format(i);
		return format;
	}
}