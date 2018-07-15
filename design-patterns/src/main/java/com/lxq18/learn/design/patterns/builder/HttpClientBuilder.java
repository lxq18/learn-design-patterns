package com.lxq18.learn.design.patterns.builder;

public class HttpClientBuilder {
    private int threadCount = 2;

    public static HttpClientBuilder create() {
        return new HttpClientBuilder();
    }

    public HttpClient build() {
        DefaultHttpClient httpClient = new DefaultHttpClient(this.threadCount);
        return httpClient;
    }

    public HttpClientBuilder setThreadCount(int threadCount) {
        this.threadCount = threadCount;
        return this;
    }
}
