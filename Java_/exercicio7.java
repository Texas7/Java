public class exercicio7 {
    public static void main(String args[]){
        int X1, X2, X3, X4, X5;

        X1 = Integer.parseInt(args[0]);
        X2 = Integer.parseInt(args[1]);

        X3 = X1 + X2;
        X4 = X1 * X2;
        X5 = X4 / X2;

        System.out.printf("%d, %d, %d", X3, X4, X5);

    } 
    
}
