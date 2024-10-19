class Codex{
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            int sum=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum=sum+j;
                }
            }
            if(i==sum){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}