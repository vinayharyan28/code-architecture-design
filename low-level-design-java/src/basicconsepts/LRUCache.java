package basicconsepts;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Geeks for Geeks
 * Cache replacement algorithms are efficiently designed to replace the cache when the space is full.
 * When the cache memory if full LRU picks the data that is least recently used and removes it in order to make space for the new data.
 * The priority of the data in the cache changes according to the need of that data that is if some data is fetched or updated recently then the
 * priority of that data would be changed and assigned to the highest priority, and the priority of the data decreases if it remains unused operation after operations.

 * put(key1, valueA): Since LRU cache has empty capacity=3, there is no need for any replacement, and we put {1, A} at the top that is {1:A} has the highest priority.
 * put(key2, valueB): Since LRU cache has empty capacity=2 again there is no need for any replacement, but now the {2, B} has the highest priority and priority of {1:A} decrease.
 * put(key3, valueC): Still there is 1 empty space vacant in the cache, therefore put {3: C} without any replacement, notice now the cache is full and the current order of priority from highest to lowest is {3:C}, {2:B}, {1:A}
 * get(key2): Now, return value key=2 during this operation, also since key=2 is used, now the new priority order is {2:B}, {3:C}, {1:A}
 * get(key4): Observer that key 4 is not present in the cache, we return '-1' for this operation.
 * put(key, valueD): Observe that cache is full, now use LRU algorithm to determine which key is least recently used, since {1:A} had the least priority, remove {1:A} from our cache and put{4:D} into the cache. Notice that the new priority order is {4:D}, {2,B}, {3,C}
 * put(key3, valueE): Since key=3 was already present in the cache having value=C, so this operation won't result in removal of any key, rather it will update the value of key=3 to 'E'. Now, the new order of priority will become {3:E}, {4:D}, {2:B}
 * get(key4): Return the value of key=4 now, new priority will become {4:D}, {3:E}, {2:B}
 * put(key1, valueA): Since our cache is FULL, so use our LRU algorithm to determine which key was least recently used, and since {2:B} had the least priority, remove {2:B} from our cache and put {1:A} into the cache. Now the new priority order is {1:A}, {4:D}, {3, E}
 *
 */
public class LRUCache {
    private final Deque<Integer> deque;
    private final HashSet<Integer> hashSetCache;
    private final int CACHE_SIZE;

    LRUCache(int capacity){
        this.CACHE_SIZE = capacity;
        this.deque = new LinkedList<>();
        this.hashSetCache = new HashSet<>();
    }

    public void refer(int page){
        if (this.hashSetCache.contains(page)){
            if(this.deque.size() == this.CACHE_SIZE){
                int last = deque.removeLast();
                hashSetCache.remove(last);
            }
        }else {
            // The found page may not be always the last element, even if it's an intermediate element that needs to be removed and added to the start of the queue.
            deque.remove(page);
            hashSetCache.add(page);
        }
        this.deque.push(page);
        this.hashSetCache.add(page);
    }

    public void display(){
        for (Integer integer : this.deque) {
            System.out.println(integer + " ");
        }
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(4);
        lruCache.refer(1);
        lruCache.refer(2);
        lruCache.refer(3);
        lruCache.refer(1);
        lruCache.refer(4);
        lruCache.refer(5);
        lruCache.display();

    }
}
