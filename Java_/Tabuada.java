import java.util.Scanner;

public class Tabuada {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int cont = 0, cont1 = 0;
            int v1,v2, x;

            while(cont != 5){
                System.out.println("1 - Tabuada");
                System.out.println("2 - Raiz");
                System.out.println("3 - Potência");
                System.out.println("4 - Fatorial");
                System.out.println("5 - Sair");
                System.out.println("");
                System.out.println("Digite um valor: ");
                cont = sc.nextInt();

                switch(cont){

                    case 1:
                        System.out.println("1 - adição\n 2 - subtração");
                        cont1 = sc.nextInt();
                        if(cont1 == 1){
                            System.out.println("Primeiro valor: ");
                            v1 = sc.nextInt();
                            System.out.println("Segundo valor: ");
                            v2 = sc.nextInt();

                            System.out.printf("\nResp: "+ (v1 + v2));
                            System.out.println("\n");
                        }
                         if(cont1 == 1){
                            System.out.println("Primeiro valor: ");
                            v1 = sc.nextInt();
                            System.out.println("Segundo valor: ");
                            v2 = sc.nextInt();

                            System.out.printf("\nResp: "+ (v1 + v2));
                            System.out.println("\n");
                        }
                        break;
                    case 2:
                        System.out.println("Valor: ");
                        v1 = sc.nextInt();

                        System.out.printf("\nResp: "+ (Math.sqrt(v1)));
                        System.out.println("\n");
                        break;
                    case 3:
                        System.out.println("Valor 1: ");
                        v1 = sc.nextInt();
                        System.out.println("Elevado a: ");
                        v2 = sc.nextInt();

                        System.out.printf("\nResp: "+ (Math.pow(v1, v2)));
                        System.out.println("\n");
                        break;
                    case 4:
                        System.out.println("Valor para fatorar: ");
                        v1 = sc.nextInt();
                        x = v1;
                        while(x != 1){
                            v1 = v1*(x-1);
                            x--;
                        }
                        System.out.printf("\nResp: "+ v1);
                        System.out.println("\n");
                        break;
                    case 5:
                        System.out.println("Encerrando");
                        break;
                    default:
                        break;
                }       
            }
        }
    
    }
}
