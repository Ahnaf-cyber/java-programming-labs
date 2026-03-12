import java.util.Comparator;

public class SortByWeight implements Comparator<Shipment> {

    @Override
    public int compare(Shipment s1, Shipment s2) {
        return Double.compare(s1.getWeight(), s2.getWeight());
    }
}
