import java.util.Scanner;

class Codex{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter 2nd num: ");
        int b = sc.nextInt();
        System.out.println("Addition of "+(a*a*a)+" & "+(b*b*b)+" is "+(a*a*a + b*b*b));
        System.out.println("Subtraction of "+(a*a)+" & "+(b*b)+" is "+(a*a - b*b));
    }
}