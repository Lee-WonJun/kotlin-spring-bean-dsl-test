package jun.won.lee.daycount

import java.util.concurrent.atomic.AtomicInteger

interface CountRepository {
    fun getCount(): Int
    fun postCount(): Int
}

class MemoryCountRepository : CountRepository {
    private var count = AtomicInteger(0)
    override fun getCount(): Int {
        return count.get()
    }
    override fun postCount(): Int {
        return count.incrementAndGet()
    }
}