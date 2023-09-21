Feature: Get comments
  user use get endpoint to get comments

  Scenario: user use get endpoint to getch all comments from third post
    When get all comments for post number 3
    Then received 5 comments and they fit

  Scenario: user use get endpoint to getch eleventh comment from third post
    When get comment number 11 for post number 3
    Then received 1 comment and it fits
