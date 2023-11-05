package basicconsepts;
import java.util.HashMap;
import java.util.Map;

/**
 * Geeks for Geeks
 * Least Frequently Used (LFU) is a caching algorithm in which the least frequently used cache block is removed whenever the cache is overflowed.
 * in LFU we check the old page as well as the frequency of that page and if the frequency of the page as well as the frequency of that page and if the frequency of the page is larger than the old page we cannot remove it and if all the old pages are having same frequency then take least that is FIFO method for that and remove that page.

 * Min-heap data structure is a good option to implement this algorithm, as it handles insertion, deletion, and update in logarithmic time complexity.
 * A tie can be resolved by removing the least recently used cache block.

 * The following two containers have been used to solve the problem:
 * A vector of integer pairs has been used to represent the cache, where each pair consists of the block number and the number of times it has been used. The vector is ordered in the form of a min-heap, which allows us to access the least frequently used block in constant time.
 * A hashmap has been used to store the indices of the cache blocks which allows searching in constant time.
 */

class Pair{
    int value, frequency;
    public Pair(int value, int frequency){
        this.value = value;
        this.frequency = frequency;
    }
}

public class LFUCache {
    private final int CACHE_SIZE;
    private final Map<Integer, Pair> lfUCache;

    public LFUCache(int CACHE_SIZE){
        this.CACHE_SIZE = CACHE_SIZE;
        this.lfUCache = new HashMap<>();
    }

    private void increment(int value){
        if (lfUCache.containsKey(value)){
            lfUCache.get(value).frequency += 1;
        }
    }

    private int findLeastFrequentlyUsedBlock(){
        int lfuKey = 0, minFrequency = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Pair> entry: lfUCache.entrySet()){
            if (entry.getValue().frequency < minFrequency){
                minFrequency = entry.getValue().frequency;
                lfuKey = entry.getKey();
            }
        }
        return lfuKey;
    }

    private void insert(int value){
        if (lfUCache.size() == CACHE_SIZE){
            int lfuKey = findLeastFrequentlyUsedBlock();
            System.out.println("Cache block " + lfuKey + " removed.");
            lfUCache.remove(lfuKey);
        }

        Pair pair = new Pair(value, 1);
        lfUCache.put(value, pair);
        System.out.println("Cache block " + value + " inserted.");
    }

    public void refer(int value){
        if (!lfUCache.containsKey(value)){
            insert(value);
        }else {
            increment(value);
        }
    }

    public static void main(String[] args) {
        LFUCache lfuCache = new LFUCache(4);
        lfuCache.refer(1);
        lfuCache.refer(2);
        lfuCache.refer(1);
        lfuCache.refer(3);
        lfuCache.refer(2);
        lfuCache.refer(4);
        lfuCache.refer(5);
    }

}
