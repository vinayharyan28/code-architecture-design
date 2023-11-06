from inmemorycachedesign.cacheservice.CacheService import CacheService
from inmemorycachedesign.constants.EvictionPolicy import EvictionPolicy


if __name__ == '__main__':
    cache_service = CacheService()
    cache_service.initialize(2, EvictionPolicy.LRU)
    cache_service.put("Hello", "First design question")
    cache_service.put("Java", "DSA")
    cache_service.put("Python", "Data Science")
    cache_service.put("SQL", "Database")
    cache_service.display()