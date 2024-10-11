class Codex {
    public static void main(String[] args) {
        int f[] = new int[10];
        f[0]=0;f[1]=1;
        for(int i=0;i<f.length;i++){
            if(i>=2){
                f[i]=f[i-1]+f[i-2];
            }
            System.out.print(f[i]+" ");
        }
    }
}
