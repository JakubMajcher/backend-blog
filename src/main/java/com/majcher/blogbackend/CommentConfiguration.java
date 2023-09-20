package com.majcher.blogbackend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class CommentConfiguration {

    @Bean
    CommentFacade commentFacade(JSONPlaceHolderClient jsonPlaceHolderClient) {
        return new CommentFacade(jsonPlaceHolderClient);
    }
}
