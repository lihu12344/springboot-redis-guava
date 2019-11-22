package com.example.demo.service;

import com.google.common.hash.BloomFilter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BloomFilterService {

    @Resource
    private BloomFilter<String> bloomFilter;

    public void add(String s){
        bloomFilter.put(s);
    }

    public boolean contain(String s){
        return bloomFilter.mightContain(s);
    }
}
