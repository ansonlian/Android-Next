package com.mcxiaoke.commons.cache;

/**
 * User: mcxiaoke
 * Date: 14-3-21
 * Time: 17:43
 */
public final class CacheFactory {

    private CacheFactory() {
    }

    public static IMemoryCache<String, ICacheValue> createLruCache(int maxSize) {
        return new LruCache<String, ICacheValue>(maxSize);
    }

    public static IMemoryCache<String, ICacheValue> createCache() {
        return new MapCache<String, ICacheValue>();
    }
}