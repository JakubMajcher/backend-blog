# Blog backend

Blog backend is tiny project just to practice my dev skills. It's in Java, uses Sprint Boot, Spock and Cucumber.
Whole functionality is one rest endpoint to fetch comments from blog. Source of data is [https://jsonplaceholder.typicode.com](https://jsonplaceholder.typicode.com)

## Run app

To run application use gradle.

```
./gradlew bootRun
```

## How to use an app

When app is run You can connect to it by HTTP Client. To fetch all comments of second post you can call:
```
GET localhost:8080/v1/posts/2/comments
```

If You want to fetch only one of comments You can add parameter:

```
GET localhost:8080/v1/posts/2/comments?id=6
```

## End2end tests

To run e2e tests use cucumber command.
```
./gradlew cucumber
```
Be aware that first You have to run an app.


## License

[MIT](https://choosealicense.com/licenses/mit/)
