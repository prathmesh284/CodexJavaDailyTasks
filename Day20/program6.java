import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.print("Enter array elements: ");
        for(int j=0;j<arr.length;j++){
            arr[j]=sc.nextInt();
        }
        int small=arr[0];
        for(int i=1;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        System.out.println("Smallest element: "+ small);
    }
}