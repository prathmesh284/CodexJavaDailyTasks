class Codex{
    public static void main(String[] args) {
        int count=5;
        for(int i=1;i<=4;i++){
            int a=count;
            for(int j=4;j>=i;j--){
                System.out.print(a+" ");
                a--;
            }
            System.out.println();
            count--;
        }
    }
}