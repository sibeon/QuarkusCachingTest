package de.noebis.quarkus

import de.noebis.quarkus.logging.LoggerDelegate
import io.quarkus.scheduler.Scheduled
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class Scheduler(private val cachingTest: CachingTest) {
    private val log by LoggerDelegate()

    @Scheduled(every = "2S")
    fun useCaching() {
        log.info("Fetched Data is ${cachingTest.fetchData()}")
    }
}