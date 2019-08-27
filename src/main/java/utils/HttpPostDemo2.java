package utils;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

import static utils.UrlTest.url_test;

public class HttpPostDemo2 {

    public  static  void doPost(String url2,String value) throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();

      HttpPost post = new HttpPost(url_test+url2);
    System.out.println(url_test+url2);

    post.setHeader("Content-Type", "application/json;charset=utf-8");
    post.setHeader("Accept", "application/json");

    StringEntity entity = new StringEntity(value, "UTF-8");

    System.out.println("requestData::"+value);
/*根据姓名查询，直接传name
    StringEntity entity = new StringEntity("zyf", "UTF-8");*/
    post.setEntity(entity);

        CloseableHttpResponse response = client.execute(post);
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(result);
        response.close();

    }
    }

