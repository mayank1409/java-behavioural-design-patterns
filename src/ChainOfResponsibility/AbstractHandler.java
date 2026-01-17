package ChainOfResponsibility;

/**
 * Abstract base class for handlers in the Chain of Responsibility pattern.
 * Provides a default implementation for setting the next handler.
 */
public abstract class AbstractHandler implements Handler {

    protected Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * Helper method to pass the request to the next handler.
     *
     * @param request the request to pass to the next handler
     * @throws IllegalArgumentException if there is no next handler to process the request
     */
    protected void passToNextHandler(String request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        } else {
            throw new IllegalArgumentException("Request cannot be handled: " + request);
        }
    }
}
