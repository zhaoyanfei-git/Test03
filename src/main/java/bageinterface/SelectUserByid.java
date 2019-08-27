package bageinterface;

import org.testng.annotations.Test;
import utils.HttpPostDemo2;

import java.io.IOException;

import static utils.UrlTest.select_byname_url;

public class SelectUserByid {
    @Test
    public void select_user_byid() throws IOException {
        String value="xiaoming";
        HttpPostDemo2.doPost(select_byname_url,value);
    }}
