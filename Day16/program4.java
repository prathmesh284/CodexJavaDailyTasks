class Codex{
    public static void main(String[] args) {
        int count=1;
        for(int i=1;i<=4;i++){
            for(int j=1;i>=j;j++){
                System.out.print(count*count*count+" ");
                count++;
            }
            System.out.println();
        }
    }
}