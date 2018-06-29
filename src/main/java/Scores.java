import com.sun.deploy.util.StringUtils;

import java.util.*;

import static org.apache.commons.lang3.StringUtils.countMatches;

public class Scores {

    public Map totalScore(String points) {

        Player player1 = new Player("a");
        Player player2 = new Player("b");
        Player player3 = new Player("c");
        Player player4 = new Player("d");
        Player player5 = new Player("e");

        Map<String, Integer> totalPoints = new LinkedHashMap<>();

        totalPoints.put(player1.getId(), 0);
        totalPoints.put(player2.getId(), 0);
        totalPoints.put(player3.getId(), 0);
        totalPoints.put(player4.getId(), 0);
        totalPoints.put(player5.getId(), 0);

        for (int i = 0; i < points.length(); i++) {

            char ch = points.charAt(i);
            String c = Character.toString(ch);

            int count = 0;

            if (totalPoints.containsKey(c)) {

                count = totalPoints.get(c) +1;

            } else if (c.contains(c.toUpperCase())) {

                count = totalPoints.get(c.toLowerCase()) -1 ;

            }

            totalPoints.put(c.toLowerCase(), count);

        }

        return totalPoints;

    }

    public Map tallyScores(String points) {

        int count = countMatches(points, "a");

        System.out.println(count);

        Map<String,Integer> totalPoints = new HashMap<>();

        totalPoints.put("a", count);

        return totalPoints;

    }

    public Map tallyScores2(String points) {


        Map<String, Integer> totalPoints = new LinkedHashMap<>();

        totalPoints.put("a", 0);
        totalPoints.put("b", 0);
        totalPoints.put("c", 0);
        totalPoints.put("d", 0);
        totalPoints.put("e", 0);

        totalPoints.forEach((k,v) -> {

            if (points.contains(k)) {

                totalPoints.put(k,totalPoints.get(k)+1);

            } else  {

                totalPoints.put(k,totalPoints.get(k)-1);
            }
          // int count =  -countMatches(points, k.toUpperCase());

         //  totalPoints.put(k,count);


        });

/*

            if (totalPoints.containsKey(c)) {

                count = totalPoints.get(c) +1;

            } else if (c.contains(c.toUpperCase())) {

                count = totalPoints.get(c.toLowerCase()) -1 ;

            }

            totalPoints.put(c.toLowerCase(), count);*/

        return totalPoints;

    }
}
