import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scores {

    public Map totalScore(String points) {

        //Map<String,Integer> totalPoints = new HashMap<String,Integer>();



        Map<Player,Integer> totalPoints = new HashMap<Player,Integer>();

        for (int i = 0; i < points.length(); i++) {

            Character c = points.charAt(i);

            Player player = new Player(c);

            if(player.getId().equals(c)){
                totalPoints.put(player, 1);
            }

          /*  if (c.equals('a')){

                totalPoints.put("a", 1);

            } else if (c.equals('b')) {

                totalPoints.put("b", 1);

            } else if (c.equals('c')) {

                totalPoints.put("c", 1);

            } else if (c.equals('d')) {

                totalPoints.put("d", 1);

            } else if (c.equals('e')) {

                totalPoints.put("e", 1);
            }*/

        }

        return totalPoints;

    }
}
