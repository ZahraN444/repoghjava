
# Getting Started with APIMATIC Calculator - zip

## Introduction

Simple calculator API hosted on APIMATIC for demo purposes

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>java.package.id</groupId>
  <artifactId>testjavanew12</artifactId>
  <version>1.2.4</version>
</dependency>
```

You can also view the package at:
https://central.sonatype.com/artifact/java.package.id/testjavanew12/1.2.4

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/ZahraN444/repoghjava/tree/1.2.4/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| httpClientConfig | [`Consumer<HttpClientConfiguration.Builder>`](https://www.github.com/ZahraN444/repoghjava/tree/1.2.4/doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |

The API client can be initialized as follows:

```java
APIMATICCalculatorZipClient client = new APIMATICCalculatorZipClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .build();
```

## List of APIs

* [Simple Calculator](https://www.github.com/ZahraN444/repoghjava/tree/1.2.4/doc/controllers/simple-calculator.md)

## SDK Infrastructure

### Configuration

* [Configuration Interface](https://www.github.com/ZahraN444/repoghjava/tree/1.2.4/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/ZahraN444/repoghjava/tree/1.2.4/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/ZahraN444/repoghjava/tree/1.2.4/doc/http-client-configuration-builder.md)

### HTTP

* [Headers](https://www.github.com/ZahraN444/repoghjava/tree/1.2.4/doc/headers.md)
* [HttpCallback Interface](https://www.github.com/ZahraN444/repoghjava/tree/1.2.4/doc/http-callback-interface.md)
* [HttpContext](https://www.github.com/ZahraN444/repoghjava/tree/1.2.4/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/ZahraN444/repoghjava/tree/1.2.4/doc/http-body-request.md)
* [HttpRequest](https://www.github.com/ZahraN444/repoghjava/tree/1.2.4/doc/http-request.md)
* [HttpResponse](https://www.github.com/ZahraN444/repoghjava/tree/1.2.4/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/ZahraN444/repoghjava/tree/1.2.4/doc/http-string-response.md)

### Utilities

* [ApiException](https://www.github.com/ZahraN444/repoghjava/tree/1.2.4/doc/api-exception.md)
* [ApiHelper](https://www.github.com/ZahraN444/repoghjava/tree/1.2.4/doc/api-helper.md)
* [FileWrapper](https://www.github.com/ZahraN444/repoghjava/tree/1.2.4/doc/file-wrapper.md)

