package Event;
import java.util.ArrayList;
import java.util.List;

public class ScoreSource {
    private List<ScoreListener> listeners = new ArrayList<>();

    public void addScoreListener(ScoreListener listener) {
        listeners.add(listener);
    }

    public void removeScoreListener(ScoreListener listener) {
        listeners.remove(listener);
    }

    public void setScoreLine(String score) {
        // สร้าง Event object
        ScoreEvent event = new ScoreEvent(this, score);
        // แจ้งเตือนไปยัง Listener ทุกคน
        for (ScoreListener listener : listeners) {
            listener.scoreChange(event);
        }
    }
}