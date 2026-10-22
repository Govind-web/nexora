package com.gtcoder.projects.nexora.dto.auth;

public record AuthResponse(String token,UserProfileResponse user) {

}
//dummy : new AuthResponse("",new UserProfileResponse());

