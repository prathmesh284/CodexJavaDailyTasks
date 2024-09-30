import java.util.*;
class Codex{
    public static void main(String[] args) {
        int fact=1;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter current (I): ");
        int i=sc.nextInt();
        System.out.print("Enter rasistance (R): ");
        int r=sc.nextInt();
        System.out.println("Voltage V = "+(i*r));
    }
}