public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7)                                   //if >> condicional simples
        System.out.println("Aprovado");               //else >> condicional composta
        else if(nota >= 5 && nota < 7)                  // if else if >> condicional     
        System.out.println("Prova de Recuperação");   // encadeada
        else
        System.out.println("Reprovado");
    }
    
}
