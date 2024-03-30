import java.util.HashMap;
import java.util.Collections;
import java.util.Map;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Map<String, Integer>> giftMap = new HashMap<>();
        Map<String, Integer> giftScore = new HashMap<>();
        Map<String, Integer> nextGift = new HashMap<>();
        
        for (String friend : friends) {
            giftMap.put(friend, new HashMap<>());
            giftScore.put(friend, 0);
            nextGift.put(friend, 0);
        }
        
        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            String giver = parts[0];
            String receiver = parts[1];
            
            giftMap.get(giver).put(receiver, giftMap.get(giver).getOrDefault(receiver, 0) + 1);
            giftScore.put(giver, giftScore.get(giver) + 1);
            giftScore.put(receiver, giftScore.get(receiver) - 1);
        }
        
        for (String giver : friends) {
            for (String receiver : friends) {
               if (!giver.equals(receiver)) {
                   int giftGiver = giftMap.get(giver).getOrDefault(receiver, 0);
                   int giftReceiver = giftMap.get(receiver).getOrDefault(giver, 0);
                   
                   if (giftGiver > giftReceiver) {
                       nextGift.put(giver, nextGift.get(giver) + 1);
                   } else if (giftGiver == giftReceiver && giftScore.get(giver) > giftScore.get(receiver)) {
                       nextGift.put(giver, nextGift.get(giver) + 1);
                   }
               }
            }
        }        
        
        return Collections.max(nextGift.values());
    }
}