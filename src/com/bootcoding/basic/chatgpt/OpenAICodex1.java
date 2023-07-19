package com.bootcoding.basic.chatgpt;


import java.io.IOException;

public class OpenAICodex1 {
/*
    public static void main(String[] args) throws Exception {
       // String prompt = "print(\"Hello, world!\")";
        final String API_ENDPOINT = "https://api.openai.com/v1/engines/davinci-codex/completions";
        String apiKey = "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";

      *//*  OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");

        RequestBody body = RequestBody.create(mediaType, "{\"model\": \"davinci-codex-002\", \"prompt\": \"" + prompt + "\"}");

        Request request = new Request.Builder()
                .url("https://api.openai.com/v1/engines/davinci-codex/completions")
                .post(body)
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "Bearer " + apiKey)
                .build();

        Response response = client.newCall(request).execute();


        String responseBody = response.body().string();
        System.out.println(responseBody);*//*

      *//*  if (!response.isSuccessful()) {
            throw new IOException("Unexpected code " + response);
        }
*//*





        OkHttpClient client = new OkHttpClient();

        String prompt = "Hello, what's your name?";
        int maxTokens = 50;
        boolean stop = true;

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\"prompt\": \"" + prompt + "\", \"max_tokens\": " + maxTokens + ", \"stop\": " + stop + "}");
        Request request = new Request.Builder()
                .url(API_ENDPOINT)
                .post(body)
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "Bearer " + apiKey)
                .build();

        Response response = client.newCall(request).execute();
        String responseBody = response.body().string();

        System.out.println(responseBody);*/


}
