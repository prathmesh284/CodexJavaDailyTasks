import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.print("Enter any number: ");
        int a=sc.nextInt();
        for(int i=1;i<=7;i++){
            double remainder=a % Math.pow(10, i);
            a=a/10;
            if(remainder%2==0){
                count++;
            }
            if(a<1){
                break;
            }
        }
        System.out.println("The even digits: "+count);
    }
}