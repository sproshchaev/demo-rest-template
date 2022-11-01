package com.prosoft.demoresttemplate;

import com.prosoft.demoresttemplate.dto.ResponseFixerApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

        /** Пример ответа с https://api.apilayer.com (запрос курса USD-RUB)
        {
            "date": "2022-11-01",
                "info": {
            "rate": 61.754004,
                    "timestamp": 1667320923
        },
            "query": {
            "amount": 1,
                    "from": "USD",
                    "to": "RUB"
        },
            "result": 61.754004,
                "success": true
        }
        */

        /**
         * Вариант 1 - "GET-запрос c заголовком "apikey". Использование Map.class
         */
        String url = "https://api.apilayer.com/fixer/convert?to=RUB&from=USD&amount=1";
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.set("apikey", "LZ......8mb");
        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);
        System.out.println("Вариант 1:");
        Map response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                requestEntity,
                Map.class).getBody();
        System.out.println("  date=" + response.get("date"));
        System.out.println("  info=" + response.get("info"));
        System.out.println("  query=" + response.get("query"));
        System.out.println("  result=" + response.get("result"));
        System.out.println("  success=" + response.get("success"));
        System.out.println("");
        /**
         * Вариант 2 - "GET-запрос c заголовком "apikey". Использование DTO
         * https://stackoverflow.com/questions/16781680/http-get-with-headers-using-resttemplate
         */
        System.out.println("Вариант 2:");
        ResponseFixerApi responseFixerApi = restTemplate.exchange(
                url,
                HttpMethod.GET,
                requestEntity,
                ResponseFixerApi.class).getBody();
        System.out.println(" response2=" + responseFixerApi.toString());
        System.out.println("  date=" + responseFixerApi.getDate());
        System.out.println("  info=" + responseFixerApi.getInfo());
        System.out.println("    rate=" + responseFixerApi.getInfo().getRate());
        System.out.println("    timestamp=" + responseFixerApi.getInfo().getTimestamp());
        System.out.println("    timestamp=" + responseFixerApi.getInfo().getTimestamp());
        System.out.println("  query=" + responseFixerApi.getQuery());
        System.out.println("    amount=" + responseFixerApi.getQuery().getAmount());
        System.out.println("    from=" + responseFixerApi.getQuery().getFrom());
        System.out.println("    to=" + responseFixerApi.getQuery().getTo());
        System.out.println("  result=" + responseFixerApi.getResult());
        System.out.println("  success=" + responseFixerApi.getSuccess());
    }

}
