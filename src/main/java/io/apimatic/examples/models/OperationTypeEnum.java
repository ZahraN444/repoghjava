/*
 * APIMATICCalculatorZipLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package io.apimatic.examples.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * OperationTypeEnum to be used.
 */
public enum OperationTypeEnum {
    SUM,

    SUBTRACT,

    MULTIPLY,

    DIVIDE;


    private static TreeMap<String, OperationTypeEnum> valueMap = new TreeMap<>();
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
    public static OperationTypeEnum constructFromString(String toConvert) throws IOException {
        OperationTypeEnum enumValue = fromString(toConvert);
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
    public static OperationTypeEnum fromString(String toConvert) {
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
     * Convert list of OperationTypeEnum values to list of string values.
     * @param toConvert The list of OperationTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<OperationTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (OperationTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 