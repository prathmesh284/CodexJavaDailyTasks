import java.util.*;
class Codex{
    public static void main(String[] args) {
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num=sc.nextInt();
        for(int i=num;i>0;i--){
            fact =fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}