package com.majcher.blogbackend.e2e;

import java.util.List;

class GetCommentsSamples {
    List<Comment> expectedComments = List.of(
            new Comment(
                    3,
                    11,
                    "fugit labore quia mollitia quas deserunt nostrum sunt",
                    "Veronica_Goodwin@timmothy.net",
                    "ut dolorum nostrum id quia aut est\nfuga est inventore vel eligendi explicabo quis consectetur\naut occaecati repellat id natus quo est\nut blanditiis quia ut vel ut maiores ea"
            ),
            new Comment(
                    3,
                    12,
                    "modi ut eos dolores illum nam dolor",
                    "Oswald.Vandervort@leanne.org",
                    "expedita maiores dignissimos facilis\nipsum est rem est fugit velit sequi\neum odio dolores dolor totam\noccaecati ratione eius rem velit"
            ),
            new Comment(
                    3,
                    13,
                    "aut inventore non pariatur sit vitae voluptatem sapiente",
                    "Kariane@jadyn.tv",
                    "fuga eos qui dolor rerum\ninventore corporis exercitationem\ncorporis cupiditate et deserunt recusandae est sed quis culpa\neum maiores corporis et"
            ),
            new Comment(
                    3,
                    14,
                    "et officiis id praesentium hic aut ipsa dolorem repudiandae",
                    "Nathan@solon.io",
                    "vel quae voluptas qui exercitationem\nvoluptatibus unde sed\nminima et qui ipsam aspernatur\nexpedita magnam laudantium et et quaerat ut qui dolorum"
            ),
            new Comment(
                    3,
                    15,
                    "debitis magnam hic odit aut ullam nostrum tenetur",
                    "Maynard.Hodkiewicz@roberta.com",
                    "nihil ut voluptates blanditiis autem odio dicta rerum\nquisquam saepe et est\nsunt quasi nemo laudantium deserunt\nmolestias tempora quo quia"
            )
    );

    Comment expectedComment = new Comment(3,
            11,
            "fugit labore quia mollitia quas deserunt nostrum sunt",
            "Veronica_Goodwin@timmothy.net",
            "ut dolorum nostrum id quia aut est\nfuga est inventore vel eligendi explicabo quis consectetur\naut occaecati repellat id natus quo est\nut blanditiis quia ut vel ut maiores ea"
    );
}
