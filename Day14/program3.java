import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any num: ");
        int num1=sc.nextInt();
        for(int i=1;i<=num1;i++){
            if(i%2==0){
                System.out.println("Cube of "+i+" : "+i*i*i+" and Square of "+i+" : "+i*i);
            }
        }
    }
}