package de.noebis.quarkus

import io.quarkus.cache.CacheResult

 class CachingTest {
    private var flagging = false

    @CacheResult(cacheName = "flaggingCache")
    fun fetchData() : Boolean {
        flagging = !flagging
        return flagging
    }

}