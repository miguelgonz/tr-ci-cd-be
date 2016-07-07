## Endpoints

### Time
Endpoint:
`/time`
Response
```json
{
  "timestamp": 1467900957
}
```

### Time for a city
Endpoint:
`/time?city={cityName}`
Response
```json
{
  "timestamp": 1467900957,
  "name": "London",
  "offset": 0
}
```

### Time for all cities
Endpoint:
`/times`
Response:
```json
{
  "Nottingham":1467902134848,
  "Paris":1467905734848
}
```

### List of cities
Endpoint:
`/cities`
Example Response:
```json
{
  "_embedded" : {
    "cities" : [ {
      "name" : "Nottingham",
      "offset" : 0,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/cities/577e6845bd6ab2e34a97a3d5"
        },
        "city" : {
          "href" : "http://localhost:8080/cities/577e6845bd6ab2e34a97a3d5"
        }
      }
    }, {
      "name" : "Paris",
      "offset" : 1,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/cities/577e6845bd6ab2e34a97a3d6"
        },
        "city" : {
          "href" : "http://localhost:8080/cities/577e6845bd6ab2e34a97a3d6"
        }
      }
    } ]
  },
  "_links" : {
    "self" : {
      "href" : "http://localhost:8080/cities"
    },
    "profile" : {
      "href" : "http://localhost:8080/profile/cities"
    },
    "search" : {
      "href" : "http://localhost:8080/cities/search"
    }
  },
  "page" : {
    "size" : 20,
    "totalElements" : 2,
    "totalPages" : 1,
    "number" : 0
  }
}
```

### Adding a new city

POST `/cities`

```json
{
    "name":"Birmingham",
    "offset": 0
}
```

Base REST endpoint for cities

### Configuration

By default will attempt to connect to MongoDB on `mongodb://localhost/test`.  The `spring.data.mongodb.uri` system
property can be used to alter this.
