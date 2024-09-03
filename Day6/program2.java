class Codex{
    public static void main(String[] args) {
        int percentage=81;
        if(percentage<=100 && percentage>90){
            System.out.println("A Grade");
        }else if(percentage<=90 && percentage>80){
            System.out.println("B Grade");
        }else if(percentage<=80 && percentage>70){
            System.out.println("C Grade");
        }else if(percentage<=70 && percentage>60){
            System.out.println("D Grade");
        }else{
            System.out.println("Fail");
        }
    }
}