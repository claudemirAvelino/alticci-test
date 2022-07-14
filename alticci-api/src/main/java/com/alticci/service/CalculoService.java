package com.alticci.service;
import io.quarkus.cache.CacheResult;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CalculoService {
    @CacheResult(cacheName = "alticci-sequence")
    public Integer alticciSequence(Integer n) {

        if(n.equals(0)) {
            return 0;
        }

        if(n.equals(1)) {
            return 1;
        }

        if (n.equals(2)) {
            return 1;
        }

        return alticciSequence(n-2) + alticciSequence(n-3);
    }
}
