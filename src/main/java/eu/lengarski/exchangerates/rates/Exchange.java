package eu.lengarski.exchangerates.rates;

import javax.websocket.*;
import java.net.URI;

@ClientEndpoint
public abstract class Exchange {

    protected String url;
    protected WebSocketContainer container;
    protected Session userSession = null;
    protected MessageHandler messageHandler;

    public Exchange(String url) {
        this.url = url;

        try {
            container = ContainerProvider.getWebSocketContainer();
            container.connectToServer(this, URI.create(url));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @OnOpen
    public void onOpen(Session userSession) {
        this.userSession = userSession;
    }


    @OnClose
    public void onClose(Session userSession, CloseReason reason) {
        this.userSession = null;
    }

    @OnMessage
    public void onMessage(String message) {
        System.out.println(message);

        if (this.messageHandler != null)
            this.messageHandler.handleMessage(message);
    }

    public void addMessageHandler(MessageHandler msgHandler) {
        this.messageHandler = msgHandler;
    }

    public void sendMessage(String message) {
        this.userSession.getAsyncRemote().sendText(message);
    }


    public static interface MessageHandler {
        public void handleMessage(String message);
    }
}
