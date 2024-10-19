import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int a= sc.nextInt();
        for(int i=1;i<=a;i++){
            int sum=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum=sum+j;
                }
            }
            if(sum>i){
                System.out.print(i+" ");
            }
        }
    }
}