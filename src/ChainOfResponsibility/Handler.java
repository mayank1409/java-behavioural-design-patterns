package ChainOfResponsibility;

/**
 * Handler interface for the Chain of Responsibility pattern.
 * Defines methods for setting the next handler in the chain and handling requests.
 */
public interface Handler {

    /**
     * Sets the next handler in the chain.
     *
     * @param handler the next handler to process the request if this handler cannot
     */
    void setNextHandler(Handler handler);

    /**
     * Handles the incoming request.
     * If this handler cannot process the request, it passes it to the next handler in the chain.
     *
     * @param incomingSuspect the request to be handled
     */
    void handle(String incomingSuspect);

}
