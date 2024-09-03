import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter no.1=");
        int a=s.nextInt();
        System.out.print("Enter no.2=");
        int b=s.nextInt();
        System.out.print("Enter no.3=");
        int c=s.nextInt();
        if(a>b && a>c){
            System.out.print(a+" is lasgest");
        }else if(b>a && b>c){
            System.out.print(b+" is lasgest");
        }else{
            System.out.print(c+" is lasgest");
        }
    }
}