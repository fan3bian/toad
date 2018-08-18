package ext.json;

import com.google.gson.Gson;
import org.junit.Test;

public class TestGson {
    @Test
    public void tesSerialize(){
        Gson gson = new Gson();
        gson.toJson(1);
    }
}
