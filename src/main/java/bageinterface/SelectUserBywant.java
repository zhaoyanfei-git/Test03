package bageinterface;

import org.testng.annotations.Test;
import utils.HttpPostDemo;
import utils.UrlTest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SelectUserBywant {
  @Test
    public void selete_user_bywant() throws IOException {
        Map<String, Object> map = new HashMap<>();
        map.put("id", "");
        map.put("name", "xiaoming");
        map.put("number", "");
        map.put("birthday", "");
        map.put("job", "");
        map.put("password", "");
        map.put("gender", "");
        HttpPostDemo.doPost(UrlTest.selectwant_url ,map);
    }
}
