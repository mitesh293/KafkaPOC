step tp run the application

1)install & config the zookeepr

2)install & config the kafka server

3)install cassandra db & exeecute the DML.sql file

4)start the zookepper,kafka,cassandra DB application.

5)start the spring-boot with below command

mvn spring-boot:run

6) test the rest microservided by calling below URL in browsr or in postman.


http://localhost:8080/greetings?message=Hello&age=30&firstname=prajesh&lastname=shah
