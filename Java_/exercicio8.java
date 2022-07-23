public class exercicio8{
    public static void main(String args[]){
        double k1,k2,k3,k4,k5;

        k1 = Double.parseDouble(args[0]);
        k2 = Double.parseDouble(args[1]);

        k3 = k1 / k2;
        k4 = k1 * k3;
        k5 = k1 + k2 + k3 + k4;

        System.out.printf("%s, %s, %s", k3,k4,k5);
    }
}