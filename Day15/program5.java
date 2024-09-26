import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd num: ");
        int num2=sc.nextInt();
        System.out.print("Enter 3rd num: ");
        int num3=sc.nextInt();
        if(num1<num2 && num1<num2){
            System.out.println("The Minimun number is "+num1);
            if(num2<num3){
                System.out.println("The Maximum number is "+num3);
            }else{
                System.out.println("The Maximum number is "+num2);
            }
        }else if(num2<num1 && num2<num3){
            System.out.println("The Minimun number is "+num2);
            if(num1<num3){
                System.out.println("The Maximum number is "+num3);
            }else{
                System.out.println("The Maximum number is "+num1);
            }
        }else{
            System.out.println("The Minimun number is "+num3);
            if(num1<num2){
                System.out.println("The Maximum number is "+num2);
            }else{
                System.out.println("The Maximum number is "+num1);
            }
        }
    }
}