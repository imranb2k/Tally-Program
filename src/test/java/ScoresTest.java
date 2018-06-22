import org.junit.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ScoresTest {

    @Ignore
    @Test
    public void testScores(){

        Map <String, Integer> expected = new HashMap<String, Integer>();
        expected.put("a", 1);
        expected.put("c", 1);
        expected.put("b", 1);
        expected.put("d", 1);
        expected.put("e", 1);

        String scores = "abcde";

        Scores scoresTally = new Scores();

        Map <String, Integer> totalScores = new HashMap<String, Integer>();

        totalScores = scoresTally.totalScore(scores);

      //  totalScores.forEach(( k,v) -> System.out.println(k + " " + v));

        assertThat(totalScores, is(expected));
    }

    @Test
    public void scoresTest2(){

        Player player1 = new Player('a');
        Player player2 = new Player('b');
        Player player3 = new Player('c');
        Player player4 = new Player('d');
        Player player5 = new Player('e');

        Map <Player, Integer> expected = new LinkedHashMap<Player, Integer>();
        expected.put(player1, 1);
        expected.put(player2, 1);
        expected.put(player3, 1);
        expected.put(player4, 1);
        expected.put(player5, 1);

        String scores = "abcde";

        Scores scoresTally = new Scores();

        Map <String, Integer> totalScores = new HashMap<String, Integer>();

        totalScores = scoresTally.totalScore(scores);

        assertThat(totalScores, is(expected.toString()));
    }
}
