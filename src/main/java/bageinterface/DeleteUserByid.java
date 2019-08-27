package bageinterface;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.HttpPostDemo2;
import utils.UrlTest;

import java.io.IOException;


public class DeleteUserByid {
    @DataProvider(name = "id")
    public static Object[][] dataprovider() {
        return new Object[][]{{"34"},// {"35"}
                 };
    }

    @Test(dataProvider = "id")
    public void delete_user_Byid(String value) throws IOException {
       // String value = "5";
        HttpPostDemo2.doPost(UrlTest.delete_byid_url, value);
    }
}
