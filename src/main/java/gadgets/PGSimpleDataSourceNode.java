package gadgets;

import org.postgresql.ds.PGSimpleDataSource;

public class PGSimpleDataSourceNode {

    public static Object makeGadget(String socketFactoryArg) throws Exception {
        PGSimpleDataSource pgSimpleDataSource = new PGSimpleDataSource();
        pgSimpleDataSource.setUser("");
        String socketFactoryClass = "org.springframework.context.support.ClassPathXmlApplicationContext";
        pgSimpleDataSource.setProperty("socketFactory",socketFactoryClass);
        pgSimpleDataSource.setProperty("socketFactoryArg",socketFactoryArg);
        return pgSimpleDataSource;
    }
}
