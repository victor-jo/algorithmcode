# Last updated: 2026. 7. 16. 오전 11:25:19
class Solution:
    def minimumCardPickup(self, cards: List[int]) -> int:
        last_seen = {}
        res = math.inf

        for i, card in enumerate(cards):
            if card in last_seen:
                res = min(res, i - last_seen[card] + 1)
            last_seen[card] = i
                
        return -1 if res == math.inf else res