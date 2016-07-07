### Endpoints

`/time`

Returns the current time

`/time?city={cityName}`

Returns the time for a city

`/times`

Returns a map of times for all cities

`/cities`

Base REST endpoint for cities

### Configuraiton

By default will attempt to connect to MongoDB on `mongodb://localhost/test`.  The `spring.data.mongodb.uri` system
property can be used to alter this.
