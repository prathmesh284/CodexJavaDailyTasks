class Codex{
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            int count=7;
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count--;
            }
            System.out.println();
        }
    }
}