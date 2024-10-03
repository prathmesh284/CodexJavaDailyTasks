import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            int count=0;
            for(int j=i/2;j>0;j--){
                if(i % j == 0){
                    count=count+j;
                }
            }
            if(count==i){
                System.out.println(i+" ");
            }
        }
    }
}
