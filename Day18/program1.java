class Codex{
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Before Swap");
        System.out.println("Num1= "+a);
        System.out.println("Num2= "+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println();
        System.out.println("After Swap");
        System.out.println("Num1= "+a);
        System.out.println("Num2= "+b);
    }
}