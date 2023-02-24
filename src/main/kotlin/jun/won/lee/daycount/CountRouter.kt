package jun.won.lee.daycount
import org.springframework.web.servlet.function.router


fun countRouter(handler: CountHandler) = router {
    "/count".nest {
        GET("/", handler::getCount)
        POST("/", handler::postCount)
    }
}