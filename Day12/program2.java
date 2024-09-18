import java.util.Scanner;

class Codex{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter 2nd num: ");
        int b = sc.nextInt();
        float c=a/b;
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+c);
    }
}