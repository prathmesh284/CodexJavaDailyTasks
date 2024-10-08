class Codex{
    public static void main(String[] args) {
        char a='A',b=a;
        for(int i=4;i>0;i--){
            a=b++;
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;a++;
            }
            System.out.println();
        }
    }
}