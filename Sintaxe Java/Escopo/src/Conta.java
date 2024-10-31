public class Conta {

    
        double saldo = 10.0;

        public void sacar(Double valor){
            //variavel local de método
            double novoSaldo = saldo-valor;
        }
    
        public void imprimirSaldo(){
            //disponivel em toda classe
            System.out.println(saldo);
        }
        
    
   
}
