package de.noebis.quarkus

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class CachingTestProducer {

    @ApplicationScoped
    fun createCachingTest() = CachingTest()
}