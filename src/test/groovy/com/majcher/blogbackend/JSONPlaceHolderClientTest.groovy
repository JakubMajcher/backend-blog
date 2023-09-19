package com.majcher.blogbackend

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
// small test to be sure JSONPlaceHolderClient is working properly
class JSONPlaceHolderClientTest extends Specification {

    @Autowired
    JSONPlaceHolderClient jsonPlaceHolderClient

    def "check size of all comments is 500"() {
        expect:
        def comments = jsonPlaceHolderClient.getComments()
        comments.size() == 500
    }
}
