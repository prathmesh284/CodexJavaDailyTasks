import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(i>0 && arr[i]<arr[i-1]){
                System.out.println("Loop is exited with input: "+arr[i]);
                break;
            }
        }
    }
}