/*
###
POST http://localhost:8080/add?first=Homer&last=Simpson

POST http://localhost:8080/add?first=Homer&last=Simpson

HTTP/1.1 200
Content-Type: text/plain;charset=UTF-8
Content-Length: 19
Date: Thu, 07 Jul 2023 08:10:30 GMT
Keep-Alive: timeout=60
COnnection: keep-Alive
Added new customer to repo!

Response code: 200; Time: 217 ms; Content length: 19 bytes

###
GET http://localhost:8080/list

GET http:locahost:8080/list

HTTP/1.1 200
Content-Type: application/json
Transfer-Encoding: chunked
Date: Thu, 28 May 2020 08:23:05 GMT
Keep-Alive: timeout=60
Connection: keep-alive

[
    {
        "id": 1,
        "firstName": "Homer",
        "lastName": "Simpson"
    }
]

Response code: 200; Time: 171ms; Content length: 51 bytes

###
GET http://localhost:8080/find/1





 */
