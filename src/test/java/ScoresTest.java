import org.junit.*;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class ScoresTest {


    @Test
    public void scoresTest(){

        String scores = "abcde";

        Scores scoresTally = new Scores();

        Map <String, Integer> totalScores = scoresTally.totalScore(scores);

        assertThat(totalScores.values(), contains(1,1,1,1,1));
    }


    @Test
    public void scoresTest2(){

        String scores = "aabcde";

        Scores scoresTally = new Scores();

        Map <String, Integer> totalScores = scoresTally.totalScore(scores);

        assertThat(totalScores.values(), contains(2,1,1,1,1));
    }

    @Test
    public void scoresTest3(){

        String scores = "aabbbbccdddeeeeee";

        Scores scoresTally = new Scores();

        Map <String, Integer> totalScores = scoresTally.totalScore(scores);

        assertThat(totalScores.values(), contains(2,4,2,3,6));
    }


    @Test
    public void scoresTest4(){

        String scores = "dbbaCEDbdAacCEAadcB";

        Scores scoresTally = new Scores();

        Map <String, Integer> totalScores = scoresTally.totalScore(scores);


        assertThat(totalScores.values(), contains(1,2,0,2,-2));
    }

    @Test
    public void scoresTest5(){

        String scores = "aAbcde";

        Scores scoresTally = new Scores();

        scoresTally.tallyScores2(scores).forEach((k,v) -> System.out.println(k + " " + v));
    }
}
