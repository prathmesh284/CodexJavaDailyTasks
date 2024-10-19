import java.util.*;
class Codex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit of array: ");
        int a=sc.nextInt();
        int f[] = new int[a];
        f[0]=0;f[1]=1;
        for(int i=0;i<f.length;i++){
            if(i>=2){
                f[i]=f[i-1]+f[i-2];
            }
            System.out.print(f[i]+" ");
        }
    }
}
