public class OperadoresRelacionais {

    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 < numero2){ //se true
            System.out.println("A nossa condição é verdadeira");
          }


        
        boolean simNao = numero1==numero2;
        System.out.println("numero1 é igual a numero2? "+simNao);

        simNao = numero1!= numero2;
        System.out.println("numero1 é diferente a numero2? "+simNao);

        simNao = numero1 > numero2;
        System.out.println("numero1 é maior a numero2? "+simNao);

        String nome1 = "Joabe";
        /*String nome2 = "Joabe";
        System.out.println(nome1==nome2);*/

        String nome2 = new String("Joabe");
        System.out.println(nome1.equals(nome2));

    }
    
}
