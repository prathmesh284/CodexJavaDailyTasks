import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n=sc.nextInt();
        System.out.print("Odd numbers: ");
        for(int i=n;i>=0;i--){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
    }
}