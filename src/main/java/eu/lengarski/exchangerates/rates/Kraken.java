package eu.lengarski.exchangerates.rates;

import javax.websocket.ClientEndpoint;

import static eu.lengarski.exchangerates.main.ExchangeRatesConstants.KRAKEN_URL_WS;

@ClientEndpoint
public class Kraken extends Exchange {


    public Kraken() {
        super(KRAKEN_URL_WS);
    }

}
