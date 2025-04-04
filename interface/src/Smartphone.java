public class Smartphone implements VideoPlayer, MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("O smartphones está tocando musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O smartphones está pausando musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("O smartphones está parando musica");
    }

    @Override
    public void playVideo() {
        System.out.println("O smartphones está reproduzindo video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O smartphones está pausando video");
    }

    @Override
    public void stopVideo() {
        System.out.println("O smartphones está parando video");
    }
}
