import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Dividend: ");
        int a=sc.nextInt();
        System.out.print("Enter Divisor: ");
        int b=sc.nextInt();
        System.out.println("Quotient is: "+(a/b));
        System.out.println("Remainder is: "+(a%b));
    }
}