class Codex{
    public static void main(String[] args) {
        int a=3,b;
        for(int i=1;i<=4;i++){
            b=a;
            for(int j=1;j<=i;j++){
                System.out.print(b+" ");
                b++;
            }
            System.out.println();
            a--;
        }
    }
}