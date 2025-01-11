package gadgets;

import com.mchange.v2.c3p0.DriverManagerDataSource;

public class DriverManagerDataSourceNode_c3p0 {
    public static Object makeGadget(String jdbc) throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setJdbcUrl(jdbc);
        return dataSource;
    }
}
