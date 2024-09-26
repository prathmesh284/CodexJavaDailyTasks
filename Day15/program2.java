import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd num: ");
        int num2=sc.nextInt();
        if(num1<num2){
            System.out.println("The Minimun number amongst "+num1+" & "+num2+" is "+ num1);
        }else{
            System.out.println("The Minimun number amongst "+num1+" & "+num2+" is "+ num2);
        }
    }
}