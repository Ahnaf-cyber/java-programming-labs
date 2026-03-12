import java.util.Comparator;

public class SortByDestination implements Comparator<Shipment> {

    @Override
    public int compare(Shipment s1, Shipment s2) {
        return s1.getDestination().compareToIgnoreCase(s2.getDestination());
    }
}
