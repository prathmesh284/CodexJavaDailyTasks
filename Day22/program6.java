import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.print("Enterv element to find in array: ");
        int f=sc.nextInt();
        System.out.print("Elements in copy of array:");
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(f==arr[i]){
                found=true;
            }
        }
        if(found==true){
            System.out.print(f +" Found");
        }else{
            System.out.print(f +" Not Found");
        }
    }
}