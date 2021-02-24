package eu.lengarski.exchangerates.rates;

import static eu.lengarski.exchangerates.main.ExchangeRatesConstants.BITFINEX_URL_WSS;


import java.net.URI;
import javax.websocket.ClientEndpoint;
import javax.websocket.CloseReason;
import javax.websocket.ContainerProvider;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;


@ClientEndpoint
public class Bitfinex extends Exchange {


    public Bitfinex() {
        super(BITFINEX_URL_WSS);
    }


    public void getMsg(){
        ClientEndpoint c;
    }

}
