package com.lxq18.learn.design.patterns.builder;

public class Main {
    public static void main(String[] args) {
        HttpClient httpClient =
                HttpClientBuilder.create()
                        .setThreadCount(9)
                        .build();
        System.out.println(httpClient.doGet("http://abc.html"));
    }
}
