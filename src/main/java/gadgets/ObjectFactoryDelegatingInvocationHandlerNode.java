package gadgets;

import common.Reflections;
import org.springframework.beans.factory.ObjectFactory;

public class ObjectFactoryDelegatingInvocationHandlerNode {

    public static Object makeGadget(Object gadget) throws Exception {
        return Reflections.newInstance("org.springframework.beans.factory.support.AutowireUtils$ObjectFactoryDelegatingInvocationHandler",
                ObjectFactory.class,gadget);
    }
}
