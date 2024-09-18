import java.util.Scanner;

class Codex{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd num: ");
        int b = sc.nextInt();
        System.out.print("Enter the sign of Operation: ");
        String c= sc.next();
        char ch=c.charAt(0);
        switch (ch) {
            case '+':
                System.out.println("Addition: "+(a+b));
                break;
            case '-':
                System.out.println("Subtraction: "+(a-b));
                break;
            case '*':
                System.out.println("Multiplication: "+(a*b));
                break;
            case '/':
                System.out.println("Division: "+(a/b));
                break;
            default:
                System.out.println("Enter valid choices");
                break;
        }
    }
}