public class SmartPhone implements Camera,MusicPlayer {
    @Override
    public void takephoto() {
        System.out.println(" Photo Taken");
    }

    @Override
    public void playMusic() {
        System.out.println(" Music Played ");
    }
}
