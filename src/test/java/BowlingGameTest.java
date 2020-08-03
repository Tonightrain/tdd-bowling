import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class BowlingGameTest {

    @Test
    void should_return_300_when_all_hit(){
        int[][] scores={{10,0,0,0},{10,0,0,0},{10,0,0,0},{10,0,0,0},{10,0,0,0},{10,0,0,0},{10,0,0,0},{10,0,0,0},{10,0,0,0},{10,10,0,0},{10,0,10,0}};
        int result = BowlingGame.sum(scores);
        int expected = 300;
        assertEquals(result,expected);
    }

    @Test
    void should_return_103_when_time_of_10_add_is_10(){
        int[][] scores={{1,2,0,0},{3,4,0,0},{5,6,0,0},{7,8,0,0},{9,10,0,0},{1,2,0,0},{3,4,0,0},{5,6,0,0},{7,8,0,0},{9,1,0,0},{2,0,2,0}};
        int result =BowlingGame.sum(scores);
        int expected = 103;
        assertEquals(result,expected);
    }

    @Test
    void should_return_94_when_time_of_10_add_less_than_10(){
        int[][] scores={{1,2,0,0},{3,4,0,0},{5,6,0,0},{7,8,0,0},{9,10,0,0},{1,2,0,0},{3,4,0,0},{5,6,0,0},{7,8,0,0},{1,2,0,0},{0,0,0,0}};
        int result =BowlingGame.sum(scores);
        int expected = 94;
        assertEquals(result,expected);
    }

    @Test
    void should_throw_exception_when_input_is_null(){
        int[][] scores = null;
        assertThrows(RuntimeException.class,()-> BowlingGame.sum(scores));
    }
}
