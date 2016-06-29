package org.kshitiz.utils;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by kshitzgupta on 29/5/16.
 */
public class HttpReqRes {
    public String get_old(URL url) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String br = "";
        String result = "";
        while (null != (br = bufferedReader.readLine())) {
            System.out.println(br);
            result += br;
        }
        return result;
    }

    public String get(URL url) throws IOException {
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url.toString());
//            request.addHeader("","");
        HttpResponse response = httpClient.execute(request);
        System.out.println("Status = " + response.getStatusLine().getStatusCode());
        BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = br.readLine()) != null) {
            result.append(line);
        }
        return result.toString();
    }

}
