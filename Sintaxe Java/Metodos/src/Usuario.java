public class Usuario {
    public static void main(String[] args){
        SmartTv smartTv = new SmartTv();

        System.out.println("Canal Atual? "+smartTv.canal);
        smartTv.mudarCanal(12);
        System.out.println("Novo Canal: "+smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();   

        System.out.println("TV Ligada? "+smartTv.ligada);
        System.out.println("Volume Atual? "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Staus >> TV Ligada? "+smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Staus >> TV Ligada? "+smartTv.ligada);
    }
}
