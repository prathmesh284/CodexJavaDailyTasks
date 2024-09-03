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
            if(b>c){
                System.out.print(b+" is second largest");
            }else{
                System.out.print(c+" is second largest");
            }
            
        }else if(b>a && b>c){
            if(a>c){
                System.out.print(a+" is second largest");
            }else{
                System.out.print(c+" is second largest");
            }
        }else{
            if(a>b){
                System.out.print(a+" is second largest");
            }else{
                System.out.print(b+" is second largest");
            }
        }
    }
}