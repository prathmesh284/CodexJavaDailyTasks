import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n=sc.nextInt();
        System.out.print("Even numbers: ");
        for(int i=n;i>=0;i--){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}