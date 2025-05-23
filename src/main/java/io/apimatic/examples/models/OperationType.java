/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated for dgfgfdg by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package io.apimatic.examples.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * OperationType to be used.
 */
public enum OperationType {
    /**
     * Represents the sum operator
     */
    SUM,

    /**
     * Represents the subtract operator
     */
    SUBTRACT,

    /**
     * Represents the multiply operator
     */
    MULTIPLY,

    /**
     * Represents the divide operator
     */
    DIVIDE;


    private static TreeMap<String, OperationType> valueMap = new TreeMap<>();
    private String value;

    static {
        SUM.value = "SUM";
        SUBTRACT.value = "SUBTRACT";
        MULTIPLY.value = "MULTIPLY";
        DIVIDE.value = "DIVIDE";

        valueMap.put("SUM", SUM);
        valueMap.put("SUBTRACT", SUBTRACT);
        valueMap.put("MULTIPLY", MULTIPLY);
        valueMap.put("DIVIDE", DIVIDE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static OperationType constructFromString(String toConvert) throws IOException {
        OperationType enumValue = fromString(toConvert);
        if (enumValue == null) {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static OperationType fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of OperationType values to list of string values.
     * @param toConvert The list of OperationType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<OperationType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (OperationType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 