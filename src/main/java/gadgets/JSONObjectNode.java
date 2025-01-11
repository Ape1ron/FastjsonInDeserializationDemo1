package gadgets;

import common.Reflections;

import java.util.Map;

public class JSONObjectNode {

    public static Object makeGadget(int version,Map map) throws Exception {
        String className;
        if(version==1){
            className = "com.alibaba.fastjson.JSONObject";
        }else{
            className = "com.alibaba.fastjson2.JSONObject";
        }
        Object fjsonObject = Reflections.newInstance(className, Map.class,map);
        return fjsonObject;
    }
}
