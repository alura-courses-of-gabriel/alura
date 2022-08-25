package com.company.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHTTPClient implements HTTPAdapter{
    @Override
    public void post(String URL, Map<String, Object> dados) {
        try {
            java.net.URL url = new URL(URL);
            URLConnection connection = url.openConnection();
            connection.connect();
        } catch (MalformedURLException e) {
            throw new RuntimeException("Erro ao enviar requisição HTTP", e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
