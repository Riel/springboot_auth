package com.auth0.samples.authapi.springbootauthupdated.security;

public class SecurityConstants {
  // Innen minden enironment variable legyen
  public static final String SECRET = "SecretKeyToGenJWTs";   // ez kell a dekódoláshoz
  public static final long EXPIRATION_TIME = 864_000_000;     // 10 days
  public static final String TOKEN_PREFIX = "Bearer ";        // convention
  public static final String HEADER_STRING = "Authorization"; // convention
  public static final String SIGN_UP_URL = "/users/sign-up";  // convention
}
