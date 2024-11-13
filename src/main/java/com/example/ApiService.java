package com.example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiService {

    public int fetchData(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        return connection.getResponseCode();
    }
}
