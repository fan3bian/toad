package ext.json;

import com.google.gson.*;
import org.junit.Test;

public class TestGson {
    @Test
    public void tesSerialize(){
        Gson gson = new Gson();
        System.out.println(gson.toJson(1));
        System.out.println(gson.toJson("hha"));
        System.out.println(gson.toJson(null));
        System.out.println(gson.toJson(new Object()));
        System.out.println(gson.toJson(new String[2]));

//        JsonElement e =new JsonObject();
//        e.getAsBoolean();
        JsonNull jn = new JsonNull();
        System.out.println(jn.hashCode());

    }
}
