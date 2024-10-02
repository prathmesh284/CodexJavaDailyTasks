import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Odd elements: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.print("Even elements: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}