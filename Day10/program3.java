class Codex{
    public static void main(String[] args) {
        int count=4;
        int a=1;
        for(int i=1;i<=4;i++){
            for(int k=1;k<=count-i;k++){
                System.out.print("  ");
            }
            int b=a;
            for(int j=1;j<=i;j++){
                System.out.print(b+" ");
                b--;
            }
            System.out.println();
            a++;
        }
    }
}