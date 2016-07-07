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
  "timestamp": 1467900957,
  "cities": [
    {"name": "London", "offset": 0},
    {"name": "Madrid", "offset": 60},
    {"name": "Azores", "offset": -60}
  ]
}
```

### List of cities
Endpoint:
`/cities`
Response:
```json
{
  "cities": [
    "London", "Madrid", "Azores"
  ]
}
```


Base REST endpoint for cities

### Configuration

By default will attempt to connect to MongoDB on `mongodb://localhost/test`.  The `spring.data.mongodb.uri` system
property can be used to alter this.
