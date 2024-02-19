package mx.edev.design_principles.composing_objects.case1.composition;

// MusicPlayer class using composition with MediaPlayer
class MusicPlayer {
    private MediaPlayer mediaPlayer;

    public MusicPlayer() {
        this.mediaPlayer = new MediaPlayer();
    }

    public void playMusic() {
        System.out.println("Playing music...");
        mediaPlayer.play();
    }
}