import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any num: ");
        int num=sc.nextInt();
        int a=1;
        for(int i=1;i<100;i++){
            System.out.print(a+" ");
            a=a+num;
        }
    }
}