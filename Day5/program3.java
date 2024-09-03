import java.util.*;
class Codex{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any character=");
        String a = s.next();
        char ch = a.charAt(0);
        if( ch == 'a' ||  ch == 'e'  || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.print(ch+" is vowel");
        }else{
            System.out.print(ch+" is consonent");
        }
    }
}