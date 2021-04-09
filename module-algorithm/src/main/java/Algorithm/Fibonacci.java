package Algorithm;

import lombok.extern.slf4j.Slf4j;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

@Slf4j
public class Fibonacci {

    public static void main(String[] args){

        IntSupplier fib = new IntSupplier() {

            private int previous = 0 ;
            private int current = 1;

            @Override
            public int getAsInt() {

                int nextValue = this.previous + this.current;
                this.previous = this.current;
                this.current = nextValue;

                log.info("previous : {}", this.previous);
                log.info("current : {}", this.current);
                return this.previous + this.current;
            }
        };
        System.out.println(IntStream.generate(fib).limit(3).max().getAsInt());
    }
}
