// import java.util.*;
// class Codex{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.print("Enter decimal number: ");
//         int bi=sc.nextInt();
//         int sum=0,mod;
//         for(int i=0;i<String.valueOf(bi).length();i++){
//             bi=bi%10;
//             mod=bi;
//             int po=(int)Math.pow(2, i);
//             sum=sum+(mod*po);
//         }
//         if(sum>=0 && sum<=9){
//             System.out.println("Hexadecimal num: "+sum);
//         }else{
//             char hexa = (char)sum;
//             System.out.println("Hexadecimal num: "+sum);
//         }
//     }
// }