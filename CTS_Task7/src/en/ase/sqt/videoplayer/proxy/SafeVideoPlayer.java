package en.ase.sqt.videoplayer.proxy;

import en.ase.sqt.videoplayer.core.VideoPlayer;
import en.ase.sqt.videoplayer.proxy.abstracts.IVideoPlayer;

import java.lang.reflect.Field;

public class SafeVideoPlayer implements IVideoPlayer {
    private final VideoPlayer videoPlayer;

    public SafeVideoPlayer(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public String playVideo() {
        try {
            Field field = VideoPlayer.class.getDeclaredField("fileName");
            field.setAccessible(true);
            String fileName = (String) field.get(videoPlayer);

            if ("RickRoll.mkv".equals(fileName)) {
                return "Try again later...";
            } else {
                return videoPlayer.playVideo();
            }
        } catch (Exception e) {
            return "Error accessing video.";
        }
    }
}
