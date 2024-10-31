public class Incrementacao {
    public static void main(String[] args) {
        //incrementação
        int numero = 5;
        numero++;// -> numero = numero+1;
        System.out.println(--numero);//decrementa e imprime imediatamente
        System.out.println(numero--);//imprime o valor da variável depois decrementa na linha seguinte
        System.out.println(numero); //imprime valor da variavel decrementado

        boolean variavel = true;
        variavel = !variavel;//inverte o valor da varialvel(true -> false)
        System.out.println(!variavel);//imprime o valor da variavel invertendo seu valor(no caso inverte o valor da variavel com valor invertido false -> true)
        System.out.println(variavel);//imprime o valor da variavel com seu valor invertido(true -> false)
    }
}
