import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[10];
        System.out.print("Enter elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<0){
                System.out.print("Negative number entered,existing the loop!");
                break;
            }
        }
    }
}