/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated for dgfgfdg by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package io.apimatic.examples.controllers;

import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.examples.ApiHelper;
import io.apimatic.examples.Server;
import io.apimatic.examples.exceptions.ApiException;
import io.apimatic.examples.http.request.HttpMethod;
import io.apimatic.examples.models.GetCalculateInput;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SimpleCalculatorController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SimpleCalculatorController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Calculates the expression using the specified operation.
     * @param  input  GetCalculateInput object containing request parameters
     * @return    Returns the Double response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Double getCalculate(
            final GetCalculateInput input) throws ApiException, IOException {
        return prepareGetCalculateRequest(input).execute();
    }

    /**
     * Calculates the expression using the specified operation.
     * @param  input  GetCalculateInput object containing request parameters
     * @return    Returns the Double response from the API call
     */
    public CompletableFuture<Double> getCalculateAsync(
            final GetCalculateInput input) {
        try { 
            return prepareGetCalculateRequest(input).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getCalculate.
     */
    private ApiCall<Double, ApiException> prepareGetCalculateRequest(
            final GetCalculateInput input) throws IOException {
        return new ApiCall.Builder<Double, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.CALCULATOR.value())
                        .path("/{operation}")
                        .queryParam(param -> param.key("x")
                                .value(input.getX()).isRequired(false))
                        .queryParam(param -> param.key("y")
                                .value(input.getY()).isRequired(false))
                        .templateParam(param -> param.key("operation").value((input.getOperation() != null) ? input.getOperation().value() : null)
                                .shouldEncode(true))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> Double.parseDouble(response))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}