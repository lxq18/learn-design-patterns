package com.lxq18.learn.design.patterns.builder;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
public class DefaultHttpClient implements HttpClient {
    private int threadCount;

    @Override
    public String doGet(String url) {
        Map<String, Object> result = new HashMap<>();
        result.put("url", url);
        result.put("threadCount", threadCount);
        return JSON.toJSONString(result);
    }
}
