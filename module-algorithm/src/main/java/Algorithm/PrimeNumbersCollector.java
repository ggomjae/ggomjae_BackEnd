package Algorithm;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.IntStream;

import static java.util.stream.Collector.Characteristics.IDENTITY_FINISH;

public class PrimeNumbersCollector implements Collector<Integer, Map<Boolean, List<Integer>>, Map<Boolean, List<Integer>>> {

    @Override
    public Supplier<Map<Boolean, List<Integer>>> supplier() {
        // 두 개의 빈 리스트를 포함하는 맵으로 수집 동작을 시작.
        return () -> new HashMap<Boolean, List<Integer>>() {{
            put(true, new ArrayList<Integer>());
            put(false, new ArrayList<Integer>());
        }};
    }

    @Override
    public BiConsumer<Map<Boolean, List<Integer>>, Integer> accumulator() {
        return (Map<Boolean, List<Integer>> acc, Integer candidate) -> {
            // 지금까지 발견한 소수 리스트를 isPrime 메서드로 전달.
            acc.get(isPrime(acc.get(true)
                    , candidate))
                    .add(candidate);
        };
    }

    @Override
    public BinaryOperator<Map<Boolean, List<Integer>>> combiner() {
        return (Map<Boolean, List<Integer>> map1,
                Map<Boolean, List<Integer>> map2) -> {    // 두번째 맵을 첫번째 맵에 병합
            map1.get(true).addAll(map2.get(true));
            map1.get(false).addAll(map2.get(false));
            return map1;
        };
    }

    @Override
    public Function<Map<Boolean, List<Integer>>, Map<Boolean,
                List<Integer>>> finisher() {
        // 최종 수집 과정에서 데이터 변환이 필요하지 않으므로 항등함수 반환
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        // 발견한 소수의 순서에 의미가 있으므로 콜렉터는 IDENTITY_FINISH지만
        // UNORDERED, CONCURRENT는 아니다.
        return Collections.unmodifiableSet(EnumSet.of(IDENTITY_FINISH));
    }

    public boolean isPrime(List<Integer> integers, int candidate) {
        return IntStream.range(2, candidate)    // 2부터 candidate 미만 사이의 자연수 생성.
                .noneMatch(i -> candidate % i == 0);
    }
}
