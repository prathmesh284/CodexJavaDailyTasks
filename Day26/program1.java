import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int a= sc.nextInt();
        int sum=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
        if(sum>a){
            System.out.println(a+" is abundant");
        }
    }
}