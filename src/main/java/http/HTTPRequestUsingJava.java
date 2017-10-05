package http;

import sun.misc.IOUtils;
import sun.nio.ch.IOUtil;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class HTTPRequestUsingJava {
    public static void main(String[] args)throws  Exception {
        URL url=new URL("http",   "google.co.in", "/");
        HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
        urlConnection.setRequestMethod("GET");
        final InputStream inputStream = urlConnection.getInputStream();
        int responseCode = urlConnection.getResponseCode();
        final String response = org.apache.commons.io.IOUtils.toString(inputStream);
        System.out.println("response Code: " +responseCode);
        System.out.printf("Response received: [%s]%n", response);
    }
}
