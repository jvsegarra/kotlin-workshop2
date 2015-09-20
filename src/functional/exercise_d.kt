package functional

import java.util.concurrent.locks.Lock


// TODO: [functional] Create a function that allows some code to be executed protected with a lock
fun lock<T>(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unlock()
    }
}
