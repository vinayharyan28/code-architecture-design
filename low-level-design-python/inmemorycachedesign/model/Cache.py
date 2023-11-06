import collections


class Cache:
    def __init__(self, size, eviction_policy):
        self.size = size
        self.eviction_policy = eviction_policy
        self.data_store = collections.deque()
        self.cache_store = dict()

    def get_size(self):
        return self.size

    def get_eviction_policy(self):
        return self.eviction_policy

    def get_data_store(self):
        return self.data_store

    def get_cache_store(self):
        return self.cache_store

    def set_data_store(self, data_store):
        self.data_store = data_store

    def set_cache_store(self, cache_store):
        self.cache_store = cache_store
