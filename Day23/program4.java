class Codex{
    public static void main(String[] args) {
        char b='a';
        for(int i=4;i>=1;i--){
            char a=b;
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
            b++;b++;
        }
    }
}