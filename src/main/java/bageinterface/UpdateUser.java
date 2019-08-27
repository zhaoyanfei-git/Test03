package bageinterface;

import org.testng.annotations.Test;
import utils.HttpPostDemo;
import utils.UrlTest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UpdateUser {
    @Test
    public void update_user() throws IOException {
        Map<String, Object> map = new HashMap<>();
        map.put("id", "34");
        map.put("name", "xiaoming");
        map.put("number", "111111");
        map.put("birthday", "2019-09-09");
        map.put("job", "1");
        map.put("password", "1");
        map.put("gender", "1");
        HttpPostDemo.doPost(UrlTest.update_url ,map);
    }
}
