import collections

from inmemorycachedesign.model.Cache import Cache


class CacheDao:
    __instance = None

    def __init__(self):
        self.cache = None

    def __new__(cls):
        if cls.__instance is None:
            cls.__instance = super(CacheDao, cls).__new__(cls)
        return cls.__instance

    def create_cache(self, size, eviction_policy):
        self.cache = Cache(size, eviction_policy)

    def get(self, key):
        result = self.cache.get_cache_store().get(key)
        if result is None:
            return None

        self.cache.get_cache_store().pop(key)
        self.cache.get_data_store().appendleft(key)
        return result

    def put(self, key, value):
        try:
            if self.cache.get_size() == len(self.cache.get_data_store()):
                last = self.cache.get_data_store().pop()
                if last in self.cache.get_data_store():
                    self.cache.get_data_store().pop(last)

            if key in self.cache.get_data_store():
                self.cache.get_data_store().remove(key)

            self.cache.get_data_store().appendleft(key)
            self.cache.get_cache_store()[key] = value
        except Exception as e:
            print("Element is not added because of: ", e)

    def delete(self, key):
        if len(self.cache.get_data_store()) == 1:
            return True

        try:
            self.cache.get_data_store().remove(key)
            self.cache.get_cache_store().pop(key)
            return True
        except Exception as e:
            print("Delete function not working properly: ", e)
            return False

    def clear(self):
        try:
            self.cache.set_caches_store(dict())
            self.cache.set_data_store(collections.deque)
            return True

        except Exception as e:
            print("Cache is not clear because of: ", e)
            return False

    def display(self):
        for i in self.cache.get_data_store():
            print(i)
