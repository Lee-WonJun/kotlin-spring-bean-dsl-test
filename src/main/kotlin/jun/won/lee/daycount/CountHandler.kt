package jun.won.lee.daycount

import org.springframework.web.servlet.function.ServerRequest
import org.springframework.web.servlet.function.ServerResponse
import org.springframework.web.servlet.function.ServerResponse.ok

class CountHandler (private val repository: CountRepository) {
    fun getCount(request: ServerRequest): ServerResponse {
        return ok().body(repository.getCount())
    }
    fun postCount(request: ServerRequest): ServerResponse {
        return ok().body(repository.postCount())
    }
}