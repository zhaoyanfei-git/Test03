package bageinterface;

import org.testng.annotations.Test;
import utils.HttpPostDemo;
import utils.UrlTest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DeleteUserBywant {
    @Test
    public void delete_user_bywant() throws IOException {
        Map<String, Object> map = new HashMap<>();
        map.put("id", "34");
        map.put("name", "lucy");
        map.put("number", "");
        map.put("birthday", "");
        map.put("job", "");
        map.put("password", "");
        map.put("gender", "");
        HttpPostDemo.doPost(UrlTest.deletewant_url ,map);
    }
}
