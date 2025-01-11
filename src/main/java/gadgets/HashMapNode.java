package gadgets;

import common.Util;

public class HashMapNode {
    public static Object makeGadget(Object[] array) throws Exception {
        Object[] keys   = new Object[array.length/2];
        Object[] values = new Object[array.length/2];
        for(int i=0;i<array.length;i+=2){
            keys[i/2] = array[i];
            values[i/2] = array[i+1];
        }
        return Util.createSilenceHashMap(keys,values);
    }

}
