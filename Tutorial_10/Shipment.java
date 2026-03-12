import java.util.Date;

public class Shipment {

    private String shipmentId;
    private String destination;
    private Date departureDate;
    private double weight;

    public Shipment(String shipmentId, String destination, Date departureDate, double weight) {
        this.shipmentId = shipmentId;
        this.destination = destination;
        this.departureDate = departureDate;
        this.weight = weight;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public String getDestination() {
        return destination;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Shipment ID: " + shipmentId +
               ", Destination: " + destination +
               ", Departure Date: " + departureDate +
               ", Weight: " + weight + " kg";
    }
}
