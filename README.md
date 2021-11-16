# tp-book

## Description

Test de jersey & jetty dans le cadre d'un TP de création d'une API.

## Utilisation

* Construction du war : `mvn clean package`

* Exécution avec jetty : `mvn jetty:run`

* Appels API en local :

```bash
curl "http://localhost:8080/tp-book/books"

curl "http://localhost:8080/tp-book/books/1"
```

* Appels API avec [replit.com](https://replit.com) : https://tp-book.mborne.repl.co/tp-book/books

## Voir aussi

* [spring-boot](https://spring.io/guides/gs/spring-boot/)

