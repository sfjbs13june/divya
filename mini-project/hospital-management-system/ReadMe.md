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
ussername:doc123
password:password
### doctor controller
## post

curl -X 'POST' \
'http://localhost:8080/doctor/save' \
-H 'accept: */*' \
-H 'Content-Type: application/json' \
-d '{
"appointmentId": "1",
"patientName": "jin",
"doctorName": "kim",
"date": "string",
"prescription": {
"prescriptionId": "100",
"appointmentId": "1",
"description": "cold",
"doctorName": "kim",
"patientName": "jin"
}
}'
request url:http://localhost:8080/doctor/save

## get
curl -X 'GET' \
'http://localhost:8080/doctor/doctor-appointment?doctorName=kim' \
-H 'accept: */*'
request url:http://localhost:8080/doctor/doctor-appointment?doctorName=kim
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

### patientcontroller
## post
curl -X 'POST' \
'http://localhost:8080/patient/save' \
-H 'accept: */*' \
-H 'Content-Type: application/json' \
-d '{
"appointmentId": "1",
"doctorName": "kim",
"date": "2-feb-2022",
"prescription": {
"prescriptionId": "122",
"appointmentId": "1",
"description": "corona",
"doctorName": "kim",
"patientName": "jin"
}
}'
request url:http://localhost:8080/patient/save

## get
curl -X 'GET' \
'http://localhost:8080/patient/my-appointment?patientName=jin' \
-H 'accept: */*'
request url:http://localhost:8080/patient/my-appointment?patientName=jin