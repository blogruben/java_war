package com.ruben.java.web;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import java.util.ArrayList;
import java.util.List;

public class FormularioTest {

    @Test
    public void givenFormularioCalcularArea_whenPostRequestUsingHttpClient_thenCorrect() 
      throws Exception {

        HttpClient client = HttpClientBuilder.create().build();
        HttpPost method = new HttpPost("http://localhost:8080/calculateServlet");

        List<BasicNameValuePair> nvps = new ArrayList<>();
        nvps.add(new BasicNameValuePair("ancho", String.valueOf(2)));
        nvps.add(new BasicNameValuePair("alto", String.valueOf(20)));

        method.setEntity(new UrlEncodedFormEntity(nvps));
        HttpResponse httpResponse = client.execute(method);

        assertEquals("Success", httpResponse.getHeaders("Test")[0].getValue());
        assertEquals("40.0", httpResponse.getHeaders("area")[0].getValue());
    }
}



