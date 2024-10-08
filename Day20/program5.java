import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.print("Enter array elements: ");
        for(int j=0;j<arr.length;j++){
            arr[j]=sc.nextInt();
        }
        int large=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        System.out.println("Largest element: "+ large);
    }
}