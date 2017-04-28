package kom_ev.StockExchange;

import java.util.ArrayList;

/**
 * Created by EKomarov on 28.04.2017.
 */
public class DealRequestData {
    private final RequestType requestType;
    private ArrayList<double[]> requestData;

    public DealRequestData(RequestType requestType) {
        this.requestType = requestType;
    }

    public void setRequestData(double number, double price) {
        requestData.add(new double[]{number, price});
    }

    public ArrayList<double[]> getRequestData(){
        return this.requestData;
    }

    public RequestType getRequestType(){
        return this.requestType;
    }
}
