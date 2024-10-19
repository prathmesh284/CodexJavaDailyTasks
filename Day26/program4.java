class Codex{
    public static void main(String[] args) {
        int a=3,b=1,ch1;
        for(int i=1;i<=4;i++){
            if(a>0){
                for(int j=a;j>0;j--){
                    System.out.print("  ");
                }
                a--;
            }
            ch1=b;
            for(int k=1;k<=i;k++){
                if(k==1){
                    System.out.print("= ");
                }else{
                    System.out.print(ch1+" ");
                    ch1++;
                }
            }
            System.out.println();
        }
    }
}