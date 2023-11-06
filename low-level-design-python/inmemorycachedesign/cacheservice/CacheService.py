from inmemorycachedesign.dao.CacheDao import CacheDao


class CacheService:
    __instance = None

    def __init__(self):
        self.cache_dao = None

    def __new__(cls):
        if cls.__instance is None:
            cls.__instance = super(CacheService, cls).__new__(cls)
        return cls.__instance

    def initialize(self, size, eviction_policy):
        self.cache_dao = CacheDao()
        self.cache_dao.create_cache(size, eviction_policy)

    def get(self, key):
        return self.cache_dao.get(key)

    def put(self, key, value):
        self.cache_dao.put(key, value)

    def delete(self, key):
        return self.cache_dao.delete(key)

    def clear(self):
        return self.cache_dao.clear()

    def display(self):
        self.cache_dao.display()
