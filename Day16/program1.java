import java.util.*;
class Codex{
    public static void main(String[] args) {
        int count=0;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a=sc.nextInt();
        for(int i=a/2;i>0;i--){
            if(a%i==0){
                count=count+i;
            }
        }
        if(count==a){
            System.out.println(a+" is a Perfect number.");
        }else{
            System.out.println(a+" is not a Perfect number.");
        }
    }
}