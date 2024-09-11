class Codex{
    public static void main(String[] args) {
        int a=7;
        for(int i=1;i<=4;i++){
            int count=a;
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                a=count;
                count--;
            }
            System.out.println();
        }
    }
}