package bageinterface;

import org.testng.annotations.Test;
import utils.HttpPostDemo;
import utils.UrlTest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class InsertUser {
    @Test
    public void insert_user() throws IOException {
        Map<String, Object> map = new HashMap<>();
        String num=randomNumeric(3);
        map.put("id", num);
        map.put("name", "xiaoming"+num);
        map.put("number", "33");
        map.put("birthday", "2019-09-14");
        map.put("job", "ok");
        map.put("password", "123456");
        map.put("gender", "3");
        HttpPostDemo.doPost(UrlTest.insert_url ,map);
    }
}
