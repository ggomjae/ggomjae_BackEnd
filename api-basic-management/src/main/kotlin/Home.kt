import org.slf4j.Logger
import org.slf4j.LoggerFactory

interface Log {
    val logger: Logger get() = LoggerFactory.getLogger(this.javaClass)
}

class Home {
    companion object : Log {

        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello, World!")

            // 순차적으로 증가
            for(i in 1..10){
                println("$i")
            }

            // 2씩 증가
            for(i in 1..10 step (2)){
                println("$i")
            }

            // 1씩 감소
            for(i in 10 downTo (1)){
                println("$i")
            }

            // 10은 포함안되게
            for(i in 1 until (10)){
                println("$i")
            }

            // 반복문
            var items = listOf("a","b","c")
            for(item in items){
                println(item)
            }

            logger.info("Logger Check")
        }
    }
}

