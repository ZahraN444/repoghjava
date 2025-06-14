/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated for dgfgfdg by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package io.apimatic.examples.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for GetCalculateInput type.
 */
public class GetCalculateInput {
    private OperationType operation;
    private double x;
    private double y;

    /**
     * Default constructor.
     */
    public GetCalculateInput() {
    }

    /**
     * Initialization constructor.
     * @param  operation  OperationType value for operation.
     * @param  x  double value for x.
     * @param  y  double value for y.
     */
    public GetCalculateInput(
            OperationType operation,
            double x,
            double y) {
        this.operation = operation;
        this.x = x;
        this.y = y;
    }

    /**
     * Getter for Operation.
     * The operator to apply on the variables
     * @return Returns the OperationType
     */
    @JsonGetter("operation")
    public OperationType getOperation() {
        return operation;
    }

    /**
     * Setter for Operation.
     * The operator to apply on the variables
     * @param operation Value for OperationType
     */
    @JsonSetter("operation")
    public void setOperation(OperationType operation) {
        this.operation = operation;
    }

    /**
     * Getter for X.
     * The LHS value
     * @return Returns the double
     */
    @JsonGetter("x")
    public double getX() {
        return x;
    }

    /**
     * Setter for X.
     * The LHS value
     * @param x Value for double
     */
    @JsonSetter("x")
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Getter for Y.
     * The RHS value
     * @return Returns the double
     */
    @JsonGetter("y")
    public double getY() {
        return y;
    }

    /**
     * Setter for Y.
     * The RHS value
     * @param y Value for double
     */
    @JsonSetter("y")
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Converts this GetCalculateInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetCalculateInput [" + "operation=" + operation + ", x=" + x + ", y=" + y + "]";
    }

    /**
     * Builds a new {@link GetCalculateInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetCalculateInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(operation, x, y);
        return builder;
    }

    /**
     * Class to build instances of {@link GetCalculateInput}.
     */
    public static class Builder {
        private OperationType operation;
        private double x;
        private double y;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  operation  OperationType value for operation.
         * @param  x  double value for x.
         * @param  y  double value for y.
         */
        public Builder(OperationType operation, double x, double y) {
            this.operation = operation;
            this.x = x;
            this.y = y;
        }

        /**
         * Setter for operation.
         * @param  operation  OperationType value for operation.
         * @return Builder
         */
        public Builder operation(OperationType operation) {
            this.operation = operation;
            return this;
        }

        /**
         * Setter for x.
         * @param  x  double value for x.
         * @return Builder
         */
        public Builder x(double x) {
            this.x = x;
            return this;
        }

        /**
         * Setter for y.
         * @param  y  double value for y.
         * @return Builder
         */
        public Builder y(double y) {
            this.y = y;
            return this;
        }

        /**
         * Builds a new {@link GetCalculateInput} object using the set fields.
         * @return {@link GetCalculateInput}
         */
        public GetCalculateInput build() {
            return new GetCalculateInput(operation, x, y);
        }
    }
}
