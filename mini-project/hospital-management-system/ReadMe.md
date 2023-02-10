### spring boot application
```
https://start.spring.io/
```
### build the project
```
mvn clean install
mvn install dockerfile:build
```
### run the application
```
docker-compose -f docker-compose-mongo.yml up -d
```
### down the application

```
docker-compose -f docker-compose-mongo.yml down
```
### build the application
```
mvn spring-boot:run

```
### dockerization
cd docker
docker-compose up -d
## run the project
mvn spring-boot:run
### swagger

`
http://localhost:8080/swagger-ui/index.html

swagger login and access
ussername:doctor
password:doctor
### doctor controller
## post
curl --location --request POST 'http://localhost:8080/doctor/save' \
--header 'Authorization: Basic ZG9jdG9yOmRvY3Rvcg==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=0DFFF1C90BF17A74FA09BFE4ED17D59C' \
--data-raw '{
"appointmentId": "string",
"patientName": "string",
"doctorName": "string",
"date": "string",
"prescription": {
"prescriptionId": "string",
"appointmentId": "string",
"description": "string",
"doctorName": "string",
"patientName": "string"
}
}'

## get
curl --location --request GET 'http://localhost:8080/doctor/doctor-appointment?doctorName=string' \
--header 'Authorization: Basic ZG9jdG9yOmRvY3Rvcg==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=0DFFF1C90BF17A74FA09BFE4ED17D59C' \
--data-raw '{
"appointmentId": "string",
"patientName": "string",
"doctorName": "string",
"date": "string",
"prescription": {
"prescriptionId": "string",
"appointmentId": "string",
"description": "string",
"doctorName": "string",
"patientName": "string"
}
}'
username:patient
password:patient

### patientcontroller
## post
curl --location --request POST 'http://localhost:8080/patient/save' \
--header 'Authorization: Basic cGF0aWVudDpwYXRpZW50' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=0DFFF1C90BF17A74FA09BFE4ED17D59C' \
--data-raw '
{
"appointmentId": "string",
"patientName": "string",
"doctorName": "string",
"date": "string",
"prescription": {
"prescriptionId": "string",
"appointmentId": "string",
"description": "string",
"doctorName": "string",
"patientName": "string"
}
}'
request url:http://localhost:8080/patient/save

## get
curl --location --request GET 'http://localhost:8080/patient/my-appointment?patientName=string' \
--header 'Authorization: Basic cGF0aWVudDpwYXRpZW50' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=0DFFF1C90BF17A74FA09BFE4ED17D59C' 
### prescription controller
## post
curl -X 'POST' \
'http://localhost:8080/prescription/save-prescription' \
-H 'accept: */*' \
-H 'Content-Type: application/json' \
-d '{
"prescriptionId": "100",
"appointmentId": "1",
"description": "fever",
"doctorName": "kim",
"patientName": "jin"
}'
request url:http://localhost:8080/prescription/save-prescription
## get
curl -X 'GET' \
'http://localhost:8080/prescription/view-prescription?patientName=jin' \
-H 'accept: */*'
request url:http://localhost:8080/prescription/view-prescription?patientName=jin
