package eu.lengarski.exchangerates.datamodel.kraken;

public class Ping {

    private String event;
    private String reqid;


    public Ping() {

    }


    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getReqid() {
        return reqid;
    }

    public void setReqid(String reqid) {
        this.reqid = reqid;
    }



}
