package eu.lengarski.exchangerates.main;

import com.google.gson.Gson;
import eu.lengarski.exchangerates.datamodel.kraken.Ping;
import eu.lengarski.exchangerates.rates.Bitfinex;
import eu.lengarski.exchangerates.rates.Exchange;
import eu.lengarski.exchangerates.rates.Kraken;
import netscape.javascript.JSObject;

import java.util.ArrayList;
import java.util.List;

public class ExchangeRatesMain {


    private static List<Exchange> exchanges = new ArrayList<Exchange>();

    public static void main(String args[]) {


//        exchanges.add(new Bitfinex());
        exchanges.add(new Kraken());



        Ping ping = new Ping();
        ping.setEvent("ping");
        ping.setReqid("42");

        Gson gson = new Gson();


        exchanges.get(0).sendMessage( gson.toJson(ping));


    }
}
