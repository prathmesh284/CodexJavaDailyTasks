import java.util.*;
class Codex{
    public static void main(String[] args) {
        int min,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st num: ");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd num: ");
        int num2=sc.nextInt();
        if(num1<num2){
            min=num1;
            max=num2;
            System.out.println("Min of series is "+min);
            System.out.println("Max of series is "+max);
        }else{
            min=num2;
            max=num1;
            System.out.println("Min of series is "+min);
            System.out.println("Max of series is "+max);
        }
        System.err.print("Series of odd numbers ranging between "+min+" & "+max+" is: ");
        for(int i=min;i<=max;i++){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
    }
}