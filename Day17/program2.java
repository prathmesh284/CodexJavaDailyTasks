import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a=sc.nextInt();
        System.out.println("Second Predecessor:"+ (a-2));
        System.out.println("Second Successor:"+ (a+2));
    }
}