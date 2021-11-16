# tp-book

## Description

Test de jersey & jetty dans le cadre d'un TP de création d'une API.

## Utilisation

* Construction du war : `mvn clean package`

* Exécution avec jetty : `mvn jetty:run`

* Appels API :

```bash
curl "http://localhost:8080/tp-book/books"

curl "http://localhost:8080/tp-book/books/1"
```

## Voir aussi

* [spring-boot](https://spring.io/guides/gs/spring-boot/)

