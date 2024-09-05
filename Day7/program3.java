class Codex{
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=4;i++){
            if(count>0){
                for(int k=1;k<=count;k++){
                    System.out.print("  ");
                }
            }
            for(int j=4;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
            count++;
        }
    }
}