package programmers.structure;

import java.util.LinkedHashMap;
import java.util.Map;

public class 캐시 {
//public class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        LinkedHashMap<String, Integer> cache = new LinkedHashMap<>() {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > cacheSize;
            }
        };
        int cacheTime = 0;
        for (String city : cities) {
            String cityLowerCase = city.toLowerCase();
            cacheTime += cache.containsKey(cityLowerCase) ? 1 : 5;
            cache.remove(cityLowerCase);
            cache.put(cityLowerCase, 1);
        }
        return cacheTime;
    }
}
