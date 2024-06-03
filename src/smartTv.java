public class smartTv {

    static boolean ligada = false;
    static int canal = 1;
    static int volume = 25;

    public static void mudarCanal(int novoCanal ){
        canal = novoCanal;
    }

    public static void aumentarCanal(){
        canal++;
    }
    public static void diminuirCanal(){
        canal--;
    }

    public static void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public static void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
    public static void ligar(){
        ligada=true;
    }
    public static void desligar(){
        ligada = false;
    }

}
