import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {

    BowlingGame bowlingGame = new BowlingGame();
    @Test
    void should_return_300_when_all_hit(){
        int[] scores={10,10,10,10,10,10,10,10,10,10,10,10,10};
        int result = bowlingGame.sum(scores);
        assertEquals(300,result);
    }

    @Test
    void should_return_0_when_No_hit(){
        int[] scores={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int result = bowlingGame.sum(scores);
        assertEquals(0,result);
    }

    @Test
    void should_throw_exception_when_input_is_null(){
        int[] scores = null;
        assertThrows(RuntimeException.class,()-> bowlingGame.sum(scores));
    }


}
