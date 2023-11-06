package inmemorycachedesign;
import inmemorycachedesign.cacheservice.CacheService;
import inmemorycachedesign.constants.EvictionPolicy;

public class Client {
    public static void main(String[] args){
        CacheService cacheService = CacheService.getInstance();
        cacheService.initialize(2, EvictionPolicy.LRU);
        cacheService.put("Hello", "Working on first design project.");
        cacheService.put("Java", "DSA");
        cacheService.put("Python", "Data Science");
        cacheService.put("SQL", "Database");
        cacheService.display();
    }
}
