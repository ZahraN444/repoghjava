
# Getting Started with APIMATIC Calculator

## Introduction

Simple calculator API hosted on APIMATIC

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>java.package.id</groupId>
  <artifactId>testjavanew12</artifactId>
  <version>1.2.3</version>
</dependency>
```

You can also view the package at:
https://central.sonatype.com/artifact/java.package.id/testjavanew12/1.2.3

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project APIMATICCalculatorLib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/ZahraN444/repoghjava/tree/1.2.3/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| environment | `Environment` | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| httpClientConfig | [`Consumer<HttpClientConfiguration.Builder>`](https://www.github.com/ZahraN444/repoghjava/tree/1.2.3/doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |

The API client can be initialized as follows:

```java
APIMATICCalculatorClient client = new APIMATICCalculatorClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .environment(Environment.PRODUCTION)
    .build();
```

## List of APIs

* [Simple Calculator](https://www.github.com/ZahraN444/repoghjava/tree/1.2.3/doc/controllers/simple-calculator.md)

## SDK Infrastructure

### Configuration

* [Configuration Interface](https://www.github.com/ZahraN444/repoghjava/tree/1.2.3/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/ZahraN444/repoghjava/tree/1.2.3/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/ZahraN444/repoghjava/tree/1.2.3/doc/http-client-configuration-builder.md)

### HTTP

* [Headers](https://www.github.com/ZahraN444/repoghjava/tree/1.2.3/doc/headers.md)
* [HttpCallback Interface](https://www.github.com/ZahraN444/repoghjava/tree/1.2.3/doc/http-callback-interface.md)
* [HttpContext](https://www.github.com/ZahraN444/repoghjava/tree/1.2.3/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/ZahraN444/repoghjava/tree/1.2.3/doc/http-body-request.md)
* [HttpRequest](https://www.github.com/ZahraN444/repoghjava/tree/1.2.3/doc/http-request.md)
* [HttpResponse](https://www.github.com/ZahraN444/repoghjava/tree/1.2.3/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/ZahraN444/repoghjava/tree/1.2.3/doc/http-string-response.md)

### Utilities

* [ApiException](https://www.github.com/ZahraN444/repoghjava/tree/1.2.3/doc/api-exception.md)
* [ApiHelper](https://www.github.com/ZahraN444/repoghjava/tree/1.2.3/doc/api-helper.md)
* [FileWrapper](https://www.github.com/ZahraN444/repoghjava/tree/1.2.3/doc/file-wrapper.md)

