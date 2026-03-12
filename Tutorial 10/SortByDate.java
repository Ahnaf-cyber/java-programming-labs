import java.util.Comparator;

public class SortByDate implements Comparator<Shipment> {

    @Override
    public int compare(Shipment s1, Shipment s2) {
        return s1.getDepartureDate().compareTo(s2.getDepartureDate());
    }
}
