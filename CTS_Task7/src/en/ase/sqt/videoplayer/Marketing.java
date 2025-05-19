package en.ase.sqt.videoplayer;

import en.ase.sqt.videoplayer.core.VideoPlayer;
import en.ase.sqt.videoplayer.proxy.abstracts.IVideoPlayer;
import en.ase.sqt.videoplayer.proxy.SafeVideoPlayer;

public class Marketing {
    public static void main(String[] args) {
        VideoPlayer realVideoPlayer = new VideoPlayer("Kebap marketing.mp4");
        IVideoPlayer player = new SafeVideoPlayer(realVideoPlayer);

        System.out.println(player.playVideo());

        try {
            Thread.sleep(5000);
            System.out.println("Playing: " + player.playVideo());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Done!");
    }
}
