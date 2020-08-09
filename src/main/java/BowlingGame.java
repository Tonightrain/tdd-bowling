import java.util.Arrays;
import java.util.List;

public class BowlingGame {
    int[] bowlingScore = new int[22];
    int ball=0;
    int score;//分数
    int count=0;
    boolean firstThrow=true;
    public void add(int grade){
        bowlingScore[ball++] = grade;
        isFirstTime(grade);
    }

    public void isFirstTime(int pins){
        if(firstThrow){
            if(pins==10){
                count++;
            }else{
                firstThrow=false;
            }
        }else{
            firstThrow=true;
            count++;
        }
    }

    public int scoreForFrame(int frame){
        int score=0;
        int ball=0;
        for(int count=0;count<frame;count++){
            int firstThrow = bowlingScore[ball++];
            if(firstThrow==10){
                score= score+10+bowlingScore[ball]+bowlingScore [ball+1];
            }else{
                int secondThrow = bowlingScore[ball++];
                int framScore = firstThrow+secondThrow;
                if(framScore==10){
                    score=framScore+bowlingScore[ball]+score;
                }else{
                    score = framScore+score;
                }
            }
        }
        return score;
    }
}
