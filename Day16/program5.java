import java.util.*;
class Codex{
    public static void main(String[] args) {
        int count=0;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b=sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c=sc.nextInt();
        if(a<b && a<b){
            System.out.println("The Minimum number amongst "+a+","+b+" & "+c+" is "+ a);
        }else if(b<a && b<c){
            System.out.println("The Minimum number amongst "+a+","+b+" & "+c+" is "+ b);
        }else{
            System.out.println("The Minimum number amongst "+a+","+b+" & "+c+" is "+ c);
        }
    }
}