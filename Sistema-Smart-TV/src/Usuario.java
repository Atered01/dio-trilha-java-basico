public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ?" + smartTv.ligada);
       
        System.out.println("Volume Ataual ?" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);

        smartTv.aumetarVolume();
        smartTv.aumetarVolume();
        smartTv.aumetarVolume();
        smartTv.aumetarVolume();
        smartTv.diminuirVolume();
        
        System.out.println("Volume " + smartTv.volume);
        
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        System.out.println("canal " + smartTv.canal);

        smartTv.mudarCanal(22);
        System.out.println("Canal Atual ?" + smartTv.canal);

    }
}
