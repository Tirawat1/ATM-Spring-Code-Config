package atm;

import java.util.Map;

public interface DataSource {

    public Map<Integer,Customer> readCustomers();
}
