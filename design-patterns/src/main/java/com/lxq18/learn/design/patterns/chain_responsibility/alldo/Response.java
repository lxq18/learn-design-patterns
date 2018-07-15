package com.lxq18.learn.design.patterns.chain_responsibility.alldo;

//封装响应信息的类Response
public class Response {
    String responseStr;

    public String getResponse() {
        return responseStr;
    }

    public void setResponse(String response) {
        this.responseStr = response;
    }

}
