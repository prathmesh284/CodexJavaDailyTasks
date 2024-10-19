// import java.util.Scanner;

// class Demo {
// 	public static void bin_oct(long bin) {
// 		int dec = 0, rem, i = 0;
// 		int temp, rem1, j = 0, div;
// 		while(bin != 0) {
// 			rem = (int)(bin % 10);
// 			if(!(rem == 0 || rem == 1)) {
// 				System.out.print("Enter valid bin.");
// 				System.exit(1);
// 			}
// 			dec += rem * Math.pow(2, i);
// 			i++;
// 			bin /= 10;
// 		}
// 		System.out.print("Octal : ");
// 	}
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter bin : ");
// 		long bin = sc.nextLong();
// 		bin_oct(bin);
// 	}
// }

//Remaining