package com.osigu.calculation;

import java.util.Arrays;
import java.util.List;


public class CumulativeTTLCalculator {


    public static void main(String... rg) {
        List<Request> requests = Arrays.asList(new Request("pioax", 1489744808L, 8L),
                new Request("pioax", 1489744803L, 3L),
                new Request("pioax", 1489744806L, 12L),
                new Request("pioax", 1489744810L, 1L));

        System.out.println("Cumulative TTL >> " + new CumulativeTTLCalculator().calculateStreams(requests));

    }


    public Long calculateStreams(List<Request> requests) {
        if (requests == null || requests.isEmpty()) {
            return 0L;
        }
        Long max = requests.stream()
                .map(req -> req.getStartedAt() + req.getTtl())
                .distinct()
                .max(Double::compare)
                .get();
        Long min = requests.stream()
                .map(req -> req.getStartedAt())
                .distinct()
                .min(Double::compare)
                .get();

        return max - min;
    }

}
