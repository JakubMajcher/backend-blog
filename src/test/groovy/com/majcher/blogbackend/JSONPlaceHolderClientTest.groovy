package com.majcher.blogbackend

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
// small test to be sure JSONPlaceHolderClient is working properly
class JSONPlaceHolderClientTest extends Specification {

    @Autowired
    JSONPlaceHolderClient jsonPlaceHolderClient

    def "check size of all comments of first post is 5"() {
        expect:
        def comments = jsonPlaceHolderClient.getCommentsByPostIdAndCommentId(1, null)
        comments.size() == 5
    }
}
