import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.junit.Assert;
import org.junit.Test;
import sun.misc.IOUtils;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class ApacheHttpClientRequest {
    @Test
    public void makeHttpApacheClientRequest() throws IOException{

        int i=0;
        int I=0;

        HttpClient httpClient= HttpClients.createDefault();
        HttpGet httpGet=new HttpGet("https://google.co.in");
        HttpResponse httpResponse = httpClient.execute(httpGet);
        HttpEntity httpEntity= httpResponse.getEntity();
        InputStream content = httpEntity.getContent();
        org.apache.commons.io.IOUtils.toString(content);
        Assert.assertEquals(200, httpResponse.getStatusLine().getStatusCode());



    }
}
