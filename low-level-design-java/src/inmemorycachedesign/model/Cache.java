package inmemorycachedesign.model;

import inmemorycachedesign.constants.EvictionPolicy;

import java.util.HashMap;
import java.util.LinkedList;

public class Cache {
    private final int size;
    private final EvictionPolicy evictionPolicy;
    private LinkedList<Object> dataStore;
    private HashMap<Object, Object> cacheStore;

    public Cache(int size, EvictionPolicy evictionPolicy){
        this.size = size;
        this.evictionPolicy = evictionPolicy;
        this.dataStore = new LinkedList<>();
        this.cacheStore = new HashMap<>();
    }

    public int getSize(){
        return size;
    }

    public EvictionPolicy getEvictionPolicy(){
        return evictionPolicy;
    }

    public LinkedList<Object> getDataStore(){
        return dataStore;
    }

    public HashMap<Object, Object> getCacheStore(){
        return cacheStore;
    }

    public void setDataStore(LinkedList<Object> dataStore){
        this.dataStore = dataStore;
    }

    public void setCacheStore(HashMap<Object, Object> cacheStore){
        this.cacheStore = cacheStore;
    }

}
