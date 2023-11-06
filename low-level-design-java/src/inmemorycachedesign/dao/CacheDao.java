package inmemorycachedesign.dao;
import inmemorycachedesign.constants.EvictionPolicy;
import inmemorycachedesign.model.Cache;

import java.util.HashMap;
import java.util.LinkedList;


public class CacheDao {
    private static CacheDao cacheDao = null;
    private Cache cache=null;

    private CacheDao(){

    }

    public static CacheDao getInstance(){
        if(cacheDao == null){
            cacheDao=new CacheDao();
        }
        return cacheDao;
    }

    public void createCache(int size, EvictionPolicy evictionPolicy){
        cache = new Cache(size, evictionPolicy);
    }

    public Object get(Object obj){
        Object result = cache.getCacheStore().get(obj);

        // If object does not exit, then return null
        if(result == null){
            return null;
        }

        // If object exists, return result
        // update data, store, in accordance to Eviction policy
        cache.getCacheStore().remove(obj);
        cache.getDataStore().addFirst(obj);
        return result;
    }

    public void put(Object key, Object value){
        try{
            if(cache.getSize() == cache.getDataStore().size()){
                Object last = cache.getDataStore().removeLast();
                cache.getDataStore().remove(last);
            }
            //Remove key from LL if exit beforehand
            cache.getDataStore().remove(key);
            //Place it in front
            cache.getDataStore().addFirst(key);
            cache.getCacheStore().put(key, value);
        } catch (Exception e){
            System.out.println("Element is not added because of: " + e);
        }

    }

    public Boolean delete(Object object){
        if (cache.getDataStore().size() == 1) return true;

        try{
            cache.getDataStore().remove(object);
            cache.getCacheStore().remove(object);
            return true;
        }catch (Exception e){
            System.out.println("Delete function not working properly. " + e);
            return false;
        }
    }

    public boolean clear(){
        try {
            cache.setCacheStore(new HashMap<>());
            cache.setDataStore(new LinkedList<>());
            return true;
        }catch (Exception e){
            System.out.println("Cache is not clear because of " + e);
            return false;
        }
    }

    public void display(){
        for (Object object1: cache.getDataStore()){
            System.out.println(object1);
        }
    }


}
