import java.util.*;
class Codex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a=sc.nextInt();
        for(int i=a;i>=0;i--){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        
    }
}
