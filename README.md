# Post and Comments - RelationalDB

**_By: Sofía Idárraga_**


---
This repository contains the practice of Relational Data Bases with Springboot and MySQL,
following the tutorial given by Santiago Posada 

## Using the code

I recommend to run the code in IntelliJ Idea Ultimate. Once the server is running, test the routes
in an API platform like Postman. By default the port is _`8080`_

---

## Evidence

- Create a post:
```
> POST: "localhost:8080/api/post"
```
![1](https://github.com/sofia-idarraga/RelationalDB-post-comments/blob/2634655b04c80a0ef6192e2c20855d989304c035/src/main/resources/evidence/sc1.PNG)

- Create a comment:
```
> POST: "localhost:8080/api/comment"
```
![2](https://github.com/sofia-idarraga/RelationalDB-post-comments/blob/2634655b04c80a0ef6192e2c20855d989304c035/src/main/resources/evidence/sc2.PNG)

- Get all the posts:
```
> GET: "localhost:8080/api/"
```
![3](https://github.com/sofia-idarraga/RelationalDB-post-comments/blob/2634655b04c80a0ef6192e2c20855d989304c035/src/main/resources/evidence/sc3.PNG)

- Delete a comment:
```
> DELETE: "localhost:8080/api/delete/comment"
```
![4](https://github.com/sofia-idarraga/RelationalDB-post-comments/blob/2634655b04c80a0ef6192e2c20855d989304c035/src/main/resources/evidence/sc4.PNG)

- Delete a post:
```
> DELETE: "localhost:8080/api/delete/post"
```
![5](https://github.com/sofia-idarraga/RelationalDB-post-comments/blob/2634655b04c80a0ef6192e2c20855d989304c035/src/main/resources/evidence/sc5.PNG)

