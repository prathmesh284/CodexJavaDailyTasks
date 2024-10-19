import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number: ");
        int a=sc.nextInt();
        int count=1;
        while(a>1){
            a=a/10;
            count++;
        }
        System.out.println(count);
    }
}