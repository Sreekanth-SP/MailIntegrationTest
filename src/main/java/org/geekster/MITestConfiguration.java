package org.geekster;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MITestConfiguration {
    @Bean
    public MIObjects getMIObject(){
        System.out.println("Inside bean method getMIObject" );
        return new MIObjects("GEEKSTER",100);
    }
}
