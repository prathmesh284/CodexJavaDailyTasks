import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Distance (in meter): ");
        int num1=sc.nextInt();
        System.out.print("Enter Time (in sec): ");
        int num2=sc.nextInt();
        System.out.print("The Velocity of a Particle roaming in space is: "+(num1/num2)+"m/s");
    }
}