package com.school;

import java.util.Map;

/**
 * Created by sghatuwa on 2/5/17.
 */
public class SearchRequest {

    public Map<String, String> requestParameters;

    public boolean hasParameter(String param) {
        return requestParameters.containsKey(param) && !requestParameters.get(param).isEmpty();
    }

    public String  get(String param) {
        return requestParameters.get(param);
    }
    public boolean hasParam(String param) {
        return requestParameters.containsKey(param) && !requestParameters.get(param).isEmpty();
    }

    public String  param(String param) {
        return requestParameters.get(param);
    }

    public void print(){
        for(Map.Entry entry : requestParameters.entrySet()){
            System.out.print(entry.getKey() + "=>" + entry.getValue());
        }
    }

    public int paramAsInt(String key, int defaultValue){
        if (requestParameters.containsKey(key)){
            return Integer.parseInt(requestParameters.get(key));
        }else
            return defaultValue;
    }
}
