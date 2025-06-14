/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated for dgfgfdg by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package io.apimatic.examples.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import io.apimatic.core.utilities.TestHelper;
import io.apimatic.examples.APIMATICCalculatorClient;
import io.apimatic.examples.exceptions.ApiException;
import io.apimatic.examples.models.GetCalculateInput;
import io.apimatic.examples.models.OperationType;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleCalculatorControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static APIMATICCalculatorClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static SimpleCalculatorController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getSimpleCalculatorController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Check if multiplication works.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testMultiply() throws Exception {
        // Parameters for the API call
        GetCalculateInput input = new GetCalculateInput();
        input.setOperation(OperationType.fromString(
                "MULTIPLY"));
        input.setX(4d);
        input.setY(5d);

        // Set callback and perform API call
        double result = 0;
        try {
            result = controller.getCalculate(input);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertEquals("Response does not match expected value", 
            20d, result, ASSERT_PRECISION);
    }

}
