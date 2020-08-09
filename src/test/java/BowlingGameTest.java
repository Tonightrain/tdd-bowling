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

    @Test
    void should_return_103_when_time_of_10_add_is_10(){
        int[] scores = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,1,2,2};
        int result = bowlingGame.sum(scores);
        assertEquals(103,result);
    }


}
