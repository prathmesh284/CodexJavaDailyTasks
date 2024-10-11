class Codex{
    public static void main(String[] args) {
        int a=4;
        for(int i=1;i<=4;i++){
            int b=a;
            for(int j=1;j<=4;j++){
                if(j<a){
                    System.out.print("  ");
                }else{
                    System.out.print(b+" ");
                    b++;
                }        
            }
            a--;
            System.out.println();
        }
    }
}