package com.clark.chris.hackathon.api.response;

import lombok.Data;

@Data
public class ProfanityResponse {

    private String original;

    private String censored;

    private boolean has_profanity;

}
