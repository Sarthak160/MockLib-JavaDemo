package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpCall {
    public static void main(String[] args) throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://example.com")
                .get()
                .build();
        try (Response response = client.newCall(request).execute()) {
            int responseCode = response.code();
            System.out.println("Response Code : " + responseCode);
            String responseBody = response.body().string();
            System.out.println(responseBody);
        }
    }
}
