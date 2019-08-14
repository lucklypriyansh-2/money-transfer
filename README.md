REST API for money transfers between accounts.

## Overview
 - implemented in Java 8
 - using akka-actor to ensure thread safety (without need of blocking), responsiveness, resilience and elasticity
 - using akka-http as HTTP "framework" which is built on top of akka-actor
 - storing actor refs in-memory
 - Akka can handle millions of transactions and is easily scalable for money transfer,It ensures thread saftey at any cost 
 - possibility to deploy actors across different jvm instances
 - possibility to persist actors in NoSQL databases (e.g. Redis)

## REST API

##### Account
| Method | URI | Description | Request
| :---: | :---: | :---: | :---: |
| GET | /accounts/[id] | Retrieve account by id |
| POST | /accounts | Create account | {	"id": <Unique-customer-id> ,"balance":100.0}
| DELETE | /accounts/[id] | Delete account |
 
 ##### Transaction
| Method | URI | Description | Request
| :---: | :---: | :---: | :---: | 
| GET | /transactions/[id] | Retrieve transaction by id | 
| POST | /transactions | Create transaction and do money transfer |{"id":<unique transaction id>,"srcAccountId":<source_account_id>,"targetAccountId":<target_account_id> "amount":<amount_decimal> }
| DELETE | /transactions/[id] | Delete transaction|
 
 
## How to run
To build the project:
```
./gradlew build
```
To test:
```
./gradlew test
```
To run:
```
./gradlew run
```
 

### Notes
Please change `server.address` property in `application.properties` file to bootstrap the application on the different port if the default one is occupied.# money-transfer
