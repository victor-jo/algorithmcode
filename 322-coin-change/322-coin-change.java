class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount < 1) {
            return 0;
        }
        
        Deque<Integer> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
        
        queue.addFirst(amount);
        visited.add(amount);
        
        int level = 1;
        
        while (!queue.isEmpty()) {
            int size = queue.size();        
            while (size-- > 0) {
                int here = queue.removeLast();
                
                for (int coin : coins) {
                    int value = here - coin;
                    
                    if (value == 0) {
                        return level;
                    }
                
                    if (value < 0) {
                        continue;
                    }
                    
                    if (!visited.contains(value)) {
                        queue.addFirst(value);
                        visited.add(value);
                    }
                }
            }
            level += 1;
        }
        
        return -1;
    }
}