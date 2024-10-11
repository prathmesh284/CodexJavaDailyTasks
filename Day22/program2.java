import java.util.Scanner;

class Demo {
	public static void bin_dec(long bin) {
		int dec = 0, rem, i = 0;
		while(bin != 0) {
			rem = (int)(bin % 10);
			if(!(rem == 0 || rem == 1)) {
				System.out.println("Enter valid bin.");
				System.exit(1);
			}
			dec += rem * Math.pow(2, i);
			i++;
			bin /= 10;
		}
		System.out.print("Decimal : "+dec);

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter bin : ");
		long bin = sc.nextLong();
		bin_dec(bin);
	}
}