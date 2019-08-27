package bageinterface;

import org.testng.annotations.Test;
import utils.HttpPostDemo2;
import utils.UrlTest;

import java.io.IOException;

public class SelectUserByidJson {
    @Test
    public void select_user_byid_json() throws IOException {
        String value="xiaoming";
        HttpPostDemo2.doPost(UrlTest.select_byname_url_json,value);
    }
}
