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

//    int[] scores={10,10,10,10,10,10,10,10,10,10,10,10,10};
//    BowlingGame bowlingGame=new BowlingGame();
//        for (int i = 0; i < scores.length; i++) {
//        bowlingGame.add(scores[i]);
//    }
//    int result = bowlingGame.scoreForFrame(10);
    public int sum(int[] score){
        BowlingGame bowlingGame = new BowlingGame();
        if (score.length ==0||score ==null){
            throw new RuntimeException();
        }
        for (int i = 0; i < score.length; i++) {
            bowlingGame.add(score[i]);
        }
        int sum = bowlingGame.scoreForFrame(10);
        return sum;
    }
}
