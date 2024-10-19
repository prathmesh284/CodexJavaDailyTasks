import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr = new int[10];
        int i=0;
        while(i<arr.length){
            arr[i]=sc.nextInt();
            if(arr[i]<0){
                System.out.print("Exited");
                break;
            }
            i++;
        }
    }
}