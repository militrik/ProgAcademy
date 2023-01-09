package sample73;

public class PlayerTask implements Runnable {
    private PlaySong ps;
    private String text;

    public PlayerTask(PlaySong ps, String text) {
        super();
        this.ps = ps;
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            ps.playSong(text);
        }


    }

}