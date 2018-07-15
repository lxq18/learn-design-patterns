package com.lxq18.learn.design.patterns.chain_responsibility.alldo;

//封装请求的类Request
public class Request {
    String requestStr;

    public String getRequest() {
        return requestStr;
    }

    public void setRequest(String request) {
        this.requestStr = request;
    }

}
