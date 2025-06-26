# Simple Calculator

```java
SimpleCalculatorController simpleCalculatorController = client.getSimpleCalculatorController();
```

## Class Name

`SimpleCalculatorController`


# Calculate

Calculates the expression using the specified operation.

```java
CompletableFuture<Double> calculateAsync(
    final OperationTypeEnum operation,
    final double x,
    final double y)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `operation` | [`OperationTypeEnum`](../../doc/models/operation-type-enum.md) | Template, Required | The operator to apply on the variables |
| `x` | `double` | Query, Required | The LHS value |
| `y` | `double` | Query, Required | The RHS value |

## Response Type

`double`

## Example Usage

```java
OperationTypeEnum operation = OperationTypeEnum.SUM;
double x = 222.14D;
double y = 165.14D;

simpleCalculatorController.calculateAsync(operation, x, y).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

