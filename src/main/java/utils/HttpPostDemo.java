package utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Map;

import static utils.UrlTest.url_test;

public class HttpPostDemo {

    public static void doPost(String url2, Map <String, Object> map) throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();

        HttpPost post = new HttpPost(url_test + url2);
        System.out.println(url_test + url2);

        post.setHeader("Content-Type", "application/json;charset=utf-8");
        post.setHeader("Accept", "application/json");

        String requestData = JSONObject.toJSONString(map);
        StringEntity entity = new StringEntity(requestData, "UTF-8");

        System.out.println("requestData::" + requestData);
        post.setEntity(entity);

        CloseableHttpResponse response = client.execute(post);
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(result);
        response.close();

    }
}

