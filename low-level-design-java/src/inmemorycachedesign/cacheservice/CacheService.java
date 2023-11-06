package inmemorycachedesign.cacheservice;


import inmemorycachedesign.constants.EvictionPolicy;
import inmemorycachedesign.dao.CacheDao;

public class CacheService {
    private static CacheService instance = null;
    private CacheService(){

    }

    public static CacheService getInstance(){
        if(instance == null){
            instance = new CacheService();
        }
        return instance;
    }

    private final CacheDao cacheDao = CacheDao.getInstance();

    public void initialize(int size, EvictionPolicy evictionPolicy){
        cacheDao.createCache(size, evictionPolicy);
    }

    public Object get(Object object){
        return cacheDao.get(object);
    }

    public void put(Object key, Object value){
        cacheDao.put(key, value);
    }

    public Boolean delete(Object key){
        return cacheDao.delete(key);
    }

    public Boolean clear(){
        return cacheDao.clear();
    }

    public void display(){
        cacheDao.display();
    }


}
