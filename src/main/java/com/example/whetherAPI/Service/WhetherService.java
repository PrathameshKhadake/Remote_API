package com.example.whetherAPI.Service;

import com.example.whetherAPI.DTO.NewResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WhetherService {

    @Autowired
    RestTemplate restTemplate;

//    https://api.tomorrow.io/v4/weather/forecast?location=42.3478,-71.0466&apikey=24eZ5Ob570GxDFPQaZCObYe7DOTFc512
    String baseURL = "https://api.tomorrow.io/v4/weather/forecast?location=";

    public Object getWhether(String location, String apikey){
        String URL = prepareURL(location, apikey);
        NewResponse response = restTemplate.getForObject(URL, NewResponse.class);
        return response;

    }

    public String prepareURL(String location, String apikey){
        return baseURL + location + '&' + "apikey=" + apikey;
    }

}
