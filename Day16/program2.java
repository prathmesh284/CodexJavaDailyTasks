import java.util.*;
class Codex{
    public static void main(String[] args) {
        int fact=1;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2=sc.nextInt();
        for(int i=num1;i<=num2;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num2+" is "+fact);
    }
}