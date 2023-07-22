package com.clark.chris.hackathon.api;

import com.clark.chris.hackathon.api.response.ProfanityResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.reactive.function.client.WebClient;

@Controller
@AllArgsConstructor
public class SentimentApi {

    public ProfanityResponse sanitiseString(String input) {

        WebClient client = WebClient.create("xxxxxxxxx");

        return client.get()
                .uri("xxxxxx" + input).accept(MediaType.APPLICATION_JSON)
                .header("X-Api-Key", "xxxxxxxx")
                .retrieve()
                .toEntity(ProfanityResponse.class).block().getBody();

    }


}
