package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpCall {
    public HttpCall() {

    }

    public String getResponse2() throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://google.com")
                .get()
                .build();

        try (Response response = client.newCall(request).execute()) {
            int responseCode = response.code();
            System.out.println("Response Code : " + responseCode);
            assert response.body() != null;
            String responseBody = response.body().string();
            System.out.println(responseBody);
            return responseBody;
        } catch (Exception exception) {
            System.out.println(exception);
        }
        return "";
    }

    public String getResponse() throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://example.com")
                .get()
                .build();

        try (Response response = client.newCall(request).execute()) {
            int responseCode = response.code();
            System.out.println("Response Code : " + responseCode);
            assert response.body() != null;
            String responseBody = response.body().string();
            System.out.println(responseBody);
            return responseBody;
        } catch (Exception exception) {
            System.out.println(exception);
        }
        return "";
    }

    public static void main(String[] args) throws Exception {
        HttpCall httpCall = new HttpCall();
        httpCall.getResponse();
        httpCall.getResponse2();
    }
}
