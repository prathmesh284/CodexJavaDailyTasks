import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter mass: ");
        int mass=sc.nextInt();
        System.out.print("Enter velocity: ");
        int vel=sc.nextInt();
        System.out.println("Kinetic Energy of Object is: "+(0.5*mass*vel*vel));
    }
}