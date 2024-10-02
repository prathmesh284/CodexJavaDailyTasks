import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Date: ");
        int a=sc.nextInt();
        System.out.print("Enter Month: ");
        int b=sc.nextInt();
        System.out.print("Enter Year: ");
        int c=sc.nextInt();

        if(b==1 || b==3 || b==5 || b==7 || b==8 || b==10 || b==12){
            if(a<=31 && a>0){
                System.out.println("Date is Valid");
            }else{
                System.out.println("Date is Invalid");
            }
        }else if(b==4 || b==6 || b==9 || b==11){
            if(a<=30 && a>0){
                System.out.println("Date is Valid");
            }else{
                System.out.println("Date is Invalid");
            }
        }else if(b==2){
            if(c%4==0){
                if(a<=29 && a>0){
                    System.out.println("Date is Valid");
                }else{
                    System.out.println("Date is Invalid");
                }
            }else{
                if(a<=28 && a>0){
                    System.out.println("Date is Valid");
                }else{
                    System.out.println("Date is Invalid");
                }
            } 
        }else{
            System.out.println("Date is Invalid");
        }  
    }
}