package gadgets;

public class JsonArrayNode {

    public static Object makeGadget(int version,Object gadget) throws Exception {
        if(version!=1){
            com.alibaba.fastjson2.JSONArray jsonArray = new com.alibaba.fastjson2.JSONArray();
            jsonArray.add(gadget);
            return jsonArray;
        }else {
            com.alibaba.fastjson.JSONArray jsonArray = new com.alibaba.fastjson.JSONArray();
            jsonArray.add(gadget);
            return jsonArray;
        }
    }
}
