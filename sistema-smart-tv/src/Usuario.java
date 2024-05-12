public class Usuario {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();;
        System.out.println("Volume Atual : " +smartTv.volume);

        System.out.println("TV ligada?" +smartTv.ligada);
        System.out.println("Canal Atual: " +smartTv.canal);
        System.out.println("Volume Atual: " +smartTv.volume);

        SmartTv.ligar();
        System.out.println("Novo Status -> TV ligada?" + SmartTv.ligada);
        
        SmartTv.desligada();   
        System.out.println("Novo Status -> TV ligada?"+ SmartTv.ligada);

    }   
}
