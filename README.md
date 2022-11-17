# Quarkus Issue 29253

[Link](https://github.com/quarkusio/quarkus/issues/29253)

## Test it

`$ mvn quarkus:dev`

* Not working = returns JSON instead of XML
* Working = returns XML as expected

For the calls, either use the embedded Swagger UI (`/q/swagger-ui`) or the calls hereunder.

### Not working because annotation on interface 

```
curl -X 'POST' \
  'http://localhost:8080/not-working-because-annotations-on-interface-method' \
  -H 'accept: application/xml' \
  -H 'Content-Type: application/json' \
  -d '{}'
```

### Not working because annotation on interface's method

```
curl -X 'POST' \
  'http://localhost:8080/not-working-because-annotations-on-interface-type' \
  -H 'accept: application/xml' \
  -H 'Content-Type: application/json' \
  -d '{}'
```

### Working because annotation on class

```
curl -X 'POST' \
  'http://localhost:8080/working-because-annotations-on-class-type' \
  -H 'accept: application/xml' \
  -H 'Content-Type: application/json' \
  -d '{}'
```

### Working because annotation on class method

```
curl -X 'POST' \
  'http://localhost:8080/working-because-annotations-on-class-method' \
  -H 'accept: application/xml' \
  -H 'Content-Type: application/json' \
  -d '{}'
```