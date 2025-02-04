package com.practice.assignments.java8.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class DeptCollector implements Collector<Employee, Map<String, Double>, Map<String, Double>> {

    @Override
    public Supplier<Map<String, Double>> supplier() {
        return HashMap::new;
    }

    @Override
    public BiConsumer<Map<String, Double>, Employee> accumulator() {
        return (map, employee) -> {
            map.merge(employee.getDepartment(), employee.getSalary(), Double::sum);
        };
    }

    @Override
    public BinaryOperator<Map<String, Double>> combiner() {
        return (map1, map2) -> {
            map1.putAll(map2);
            return map1;
        };
    }

    @Override
    public Function<Map<String, Double>, Map<String, Double>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.IDENTITY_FINISH);
    }
}
