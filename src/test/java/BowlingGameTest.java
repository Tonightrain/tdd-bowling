import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {

    @Test
    void should_return_300_when_all_hit(){
        int[] scores={10,10,10,10,10,10,10,10,10,10,10,10,10};
        BowlingGame bowlingGame=new BowlingGame();
        for (int i = 0; i < scores.length; i++) {
            bowlingGame.add(scores[i]);
        }
        int result = bowlingGame.scoreForFrame(10);
        assertEquals(300,result);
    }

    @Test
    void should_return_0_when_No_hit(){
        int[] scores={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        BowlingGame bowlingGame=new BowlingGame();
        for (int i = 0; i < scores.length; i++) {
            bowlingGame.add(scores[i]);
        }
        int result = bowlingGame.scoreForFrame(10);
        assertEquals(0,result);
    }


}
