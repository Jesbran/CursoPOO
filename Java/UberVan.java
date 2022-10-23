import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car{

    Map<String,Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String licence, Account driver){//, Map<String,Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super(licence, driver);
        //this.typeCarAccepted = typeCarAccepted;
        //this.seatsMaterial = seatsMaterial;
    }

    @Override
    public void setPassenger(Integer passengers) {
        //super.setPassenger(passengers);
        if(passengers == 6){
            this.passengers = passengers;
        }else{
            System.out.println("<---------UberVan necesita un minimo de 6 pasajeros--------->");
        }
    }
}
