public class SmartTv {
    static boolean ligada=false;
    int canal=1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentar o volume para: " + volume);
    
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuir o volume pra " + volume);

    }
    public static void ligar(){
        ligada=true;
    }
    public static void desligada(){
        ligada=false;
    }



}
