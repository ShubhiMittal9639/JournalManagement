# JournalManagement
SpringBoot Application responsible for journaling user events.


This application is responsible for journaling user events. It is a downstream microservice for UserManagement application which keeps track of all the events and their timestamps and store them in DB.


REST APIs are exposed for these CRUD operations, having following endpoints:

GetAllJournals -> /jounals (It returns list of all the events present in the DB)

Whenever any operation is performed for user(insert, delete or update), Journal Management service recieves the message from User Management service and insert timestamp and that msg into journal_details table.

Spring JPA is used for object relational model mapping.

journals_details
Id  Message  TimeStamp
