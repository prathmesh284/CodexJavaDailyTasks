import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int a= sc.nextInt();
        int sum=0;
            for(int j=1;j<a;j++){
                if(a%j==0){
                    sum=sum+j;
                }
            }
            if(sum<a){
                System.out.print(a+" is Deficient Number.");
            }
    }
}