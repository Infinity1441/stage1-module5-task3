package com.epam.mjc;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(integer -> integer%2==0).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Comparator.comparingInt(o -> o));
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream().flatMap(Collection::stream).min(Comparator.comparingInt(o -> o));
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(Integer::sum).get();
    }
}
