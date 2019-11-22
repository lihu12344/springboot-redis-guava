package com.example.demo.config;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.charset.Charset;

@Configuration
public class DataConfig {

    @Bean
    public BloomFilter<String> initBloomFilter(){
        return BloomFilter.create(Funnels.stringFunnel(Charset.defaultCharset()),100);
    }
}
