package com.pitneybowes.api360;

import java.util.Base64;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.pitneybowes.api360.model.GetAccessToken200Response;

public class TokenProvider {
    private RestTemplate restTemplate;
    private String tokenBasePath;
    private String clientId;
    private String clientSecret;


    public TokenProvider(RestTemplate restTemplate, String tokenBasePath, String clientId, String clientSecret) {
        this.restTemplate = restTemplate;
        this.tokenBasePath = tokenBasePath;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public void setTokenBasePath(String tokenBasePath) {
        this.tokenBasePath = tokenBasePath;
    }

    private HttpHeaders createHeaders(String username, String password){
        return new HttpHeaders() {{
            String auth = username + ":" + password;
            String authHeader = "Basic " + Base64.getEncoder().encodeToString(auth.getBytes());
            set( "Authorization", authHeader );
            set("Content-Type", "application/json");
        }};
}

    public String fetchBearerToken() {
        String authEndpoint = tokenBasePath + "/api/v1/token";
        HttpHeaders headers = createHeaders(clientId, clientSecret);
        ResponseEntity<GetAccessToken200Response> tokenResponse = restTemplate.exchange(authEndpoint, HttpMethod.POST, new HttpEntity<>(headers), GetAccessToken200Response.class );
        return tokenResponse.getBody().getAccessToken();
    }


}
