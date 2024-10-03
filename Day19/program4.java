class Codex{
    public static void main(String[] args){
        int a,b=7;
        for(int i=1;i<=4;i++){
            a=b;
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a--;
                if(j==1){
                    b--;
                }
            }
            System.out.println();
        }
    }
}
