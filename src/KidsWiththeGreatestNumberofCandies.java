import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max =0 ;
        ArrayList<Boolean> result = new ArrayList<Boolean>(candies.length);
        for (int i =0; i < candies.length; i++){
            if (candies[i] >= max)
                max = candies[i];
        }
        for (int i =0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}
