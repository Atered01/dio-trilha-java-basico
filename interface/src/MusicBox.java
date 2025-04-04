public class MusicBox implements MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("A caixa de musica está tocando musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("A caixa de musica está pausando musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("A caixa de musica está parando musica");
    }

}