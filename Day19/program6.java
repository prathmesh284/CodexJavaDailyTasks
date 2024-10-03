import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]= new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                System.err.println(arr[i]+" is odd");
            }else{
                System.err.println(arr[i]+" is even");
            }
        }
    }
}