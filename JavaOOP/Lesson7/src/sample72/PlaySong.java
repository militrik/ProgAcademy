package sample72;

public class PlaySong {
    int songQueue = -1;
    public synchronized  void playSong(String textSong) {
        Thread thr = Thread.currentThread();
        switch (songQueue){
            case 0 -> {
                while (textSong.equals("Hop") ) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }
                }
            }
            case 1-> {
                while (textSong.equals("Hey") ) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }
                }
            }
            case 2-> {
                while (textSong.equals("Lalaley") ) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }
                }
            }
        }

        System.out.print(textSong + " ");
        if(songQueue<2)
            songQueue++;
        else
            songQueue=0;
        notifyAll();
    }

}