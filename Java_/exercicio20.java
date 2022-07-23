public class exercicio20 {
    public static void main(String args[]){
        String sq = "";

        for(int cont3 = 0; cont3 < 5; cont3++){
            for(int cont = 0; cont < 6; cont++){
                if(sq.length() < 6){
                    sq = sq + "*";
                    System.out.println(sq);
                }  
             }            
            for(int cont2 = 0; cont2 < 6; cont2++){
                if(sq.length() > 0){
                    sq = sq.substring(0, sq.length()-1);
                    System.out.println(sq);
                }
            
            }
        }
    }
}
