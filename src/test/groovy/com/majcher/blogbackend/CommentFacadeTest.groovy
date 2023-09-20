package com.majcher.blogbackend

import spock.lang.Specification

class CommentFacadeTest extends Specification implements CommentFacadeSamples {

    CommentFacade commentFacade

    JSONPlaceHolderClient jsonPlaceHolderClient = Mock()

    def setup() {
        commentFacade = new CommentFacade(jsonPlaceHolderClient)
    }

    def "should return no comments when client return empty list"() {
        when:
        1 * jsonPlaceHolderClient.getCommentsByPostIdAndCommentId(_ as Long, _ as Long) >> emptyList
        def comments = commentFacade.getComments(1l, 1l)

        then:
        comments.size() == 0
    }

    def "should return one comment when client return one comment dto"() {
        when:
        1 * jsonPlaceHolderClient.getCommentsByPostIdAndCommentId(_ as Long, _ as Long) >> oneCommentList
        def comments = commentFacade.getComments(1l, 1l)

        then:
        comments.size() == 1
        comments.first().postId() == commentDto.postId()
        comments.first().id() == commentDto.id()
        comments.first().name() == commentDto.name()
        comments.first().email() == commentDto.email()
        comments.first().body() == commentDto.body()
    }

    def "should return three comments when client return three comments dto"() {
        when:
        1 * jsonPlaceHolderClient.getCommentsByPostIdAndCommentId(_ as Long, _ as Long) >> thereCommentsList
        def comments = commentFacade.getComments(1l, 1l)

        then:
        comments.size() == 3
        comments.each {
            assert it.postId() == commentDto.postId()
            assert it.id() == commentDto.id()
            assert it.name() == commentDto.name()
            assert it.email() == commentDto.email()
            assert it.body() == commentDto.body()
        }
    }

    def "should throw ExternalSystemUnavailableException when external api is down"() {
        when:
        1 * jsonPlaceHolderClient.getCommentsByPostIdAndCommentId(_ as Long, _ as Long) >> { throw new UnknownHostException() }

        and:
        commentFacade.getComments(1l, 1l)

        then:
        thrown(ExternalSystemUnavailableException)
    }
}
