package gadgets;

import com.mchange.v1.db.sql.DriverManagerDataSource;

public class DriverManagerDataSourceNode {
    public static Object makeGadget(String jdbc) throws Exception {
        return new DriverManagerDataSource(jdbc,"","");
    }
}
