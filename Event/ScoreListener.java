package Event;
import java.util.EventListener;

public interface ScoreListener extends EventListener {
    void scoreChange(ScoreEvent evt);
}