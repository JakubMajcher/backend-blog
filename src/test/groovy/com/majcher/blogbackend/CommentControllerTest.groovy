package com.majcher.blogbackend

import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@AutoConfigureMockMvc
@SpringBootTest
class CommentControllerTest extends Specification implements CommentControllerSamples {

    @Autowired
    private MockMvc mvc

    @SpringBean
    private CommentFacade commentFacade = Mock()

    def "when get is performed then the response has status 200 and content is empty list"() {
        given:
        1 * commentFacade.getComments(_, _) >> emptyList

        expect: "Status is 200 and the response is empty list"
        mvc.perform(get("/v1/posts/{postId}/comments", "1"))
                .andExpect(status().isOk())
                .andReturn()
                .response
                .contentAsString == emptyJsonResponse
    }

    def "when get is performed with query value #commentId parameter then the response has status 200 and content is non-empty list"() {
        given:
        1 * commentFacade.getComments(1l, commentId) >> comments

        expect: "Status is 200 and the response is non-empty list"
        mvc.perform(get(uri, "1"))
                .andExpect(status().isOk())
                .andReturn()
                .response
                .contentAsString == nonEmptyJsonResponse

        where:
        commentId | uri
        null      | "/v1/posts/{postId}/comments"
        1         | "/v1/posts/{postId}/comments?id=1"
    }

    def "when get is performed with wrong query parameter then the response has status 400"() {
        expect:
        mvc.perform(get("/v1/posts/{postId}/comments?id=a", "1"))
                .andExpect(status().isBadRequest())
    }
}
