package com.api.gateway.api.gateway.security;

public class JwtResponse {

    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;
    private String type = "Bearer";

    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getToken() {
        return this.jwttoken;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
