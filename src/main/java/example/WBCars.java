package example;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.ArrayList;
import java.util.List;

@WebService
public class WBCars {

    @WebMethod
    public List<Voiture> getElectricsCars(){
        List<Voiture> e = new ArrayList();
        e.add(new Voiture("Tesla", "Modèle S", 652, 7*60));
        e.add(new Voiture("Tesla", "Modèle X", 547, 6*60));
        e.add(new Voiture("Renault", "Zoé", 300, 45));
        e.add(new Voiture("Peugeot", "e-208", 400, 120));
        e.add(new Voiture("Hyundai", "Kona Electric", 100, 120));

        return e;
    }

    public static void main(String[] args) {
        Object implementor = new WBCars();
        String address = "https://electric-car.herokuapp.com";
        Endpoint.publish(address, implementor);
    }
}


