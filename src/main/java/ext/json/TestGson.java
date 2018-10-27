package ext.json;

import com.google.gson.Gson;
import com.google.gson.JsonNull;
import com.google.gson.reflect.TypeToken;
import org.codehaus.jackson.type.TypeReference;
import org.junit.Test;
import util.JsonUtil;

import java.io.IOException;
import java.util.Map;

public class TestGson {
    @Test
    public void tesSerialize(){
        Object o = null;
        Gson gson = new Gson();
        System.out.println(gson.toJson(1));
        System.out.println(gson.toJson("hha"));
        System.out.println(gson.toJson(o));
        System.out.println(gson.toJson(null));
        System.out.println(gson.toJson(new Object()));
        System.out.println(gson.toJson(new String[2]));

//        JsonElement e =new JsonObject();
//        e.getAsBoolean();
        JsonNull jn = new JsonNull();
        System.out.println(jn.hashCode());

    }

    public static void main(String... args) throws IOException {

          Map<String, String> remarkMap = JsonUtil.fromJsonByGoogle("", new TypeToken<Map<String, String>>() {
            });
          Map<String, String> jacksonMap = JsonUtil.fromJson("", new TypeReference<Map<String, String>>() {
        });


    }
}
