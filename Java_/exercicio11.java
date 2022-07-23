public class exercicio11{
    public static void main(String args[]){

         if (args[0].equals("a") || args[0].equals("e") || args[0].equals("i") || args[0].equals("o") || args[0].equals("u")){
             System.out.println(args[0] + " e vogal");  
         }
        else{
            System.out.println(args[0] + " nao e volgal");
        }
    }
}