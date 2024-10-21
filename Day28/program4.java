class Codex{
    public static void main(String[] args) {
        int a=3;
        char b='A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=a;j++){
                System.out.print("  ");
            }
            a--;
            char c=b;
            for(int k=1;k<=i;k++){
                System.out.print(c+" ");
                c--;
            }
            b++;
            System.out.println();
        }
    }
}