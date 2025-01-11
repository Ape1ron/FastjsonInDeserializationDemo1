package gadgets;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class MysqlDataSourceNode {

    public static Object makeGadget(String jdbc) throws Exception {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl(jdbc);
        return dataSource;
    }
}
