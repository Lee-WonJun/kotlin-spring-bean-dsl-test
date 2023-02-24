package jun.won.lee.daycount

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.support.beans

@SpringBootApplication
class DaycountApplication

val beans = beans {
    bean <CountRepository> {
        MemoryCountRepository()
    }
    bean <CountHandler> {
        CountHandler(ref())
    }
    bean {
        countRouter(ref())
    }
}

fun main(args: Array<String>) {
    runApplication<DaycountApplication>(*args) {
        addInitializers(beans)
    }
}
