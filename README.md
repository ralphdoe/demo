# demo
Spring Boot Project with Swagger and Spring Security

MySQL Configuration:
# Create the new database 
create database demo; 
# Creates the user 
create user 'demo'@'%' identified by 'demo'; 
# Gives all the privileges to the new user on the newly created database
grant all on demo.* to 'demo'@'%'; 
