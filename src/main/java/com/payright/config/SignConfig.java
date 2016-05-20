package com.payright.config;

/**
 * Created by xiaowei.wang on 2016/4/26.
 */
public class SignConfig {
    //商户自己的私钥【用com.payright.sign.RSAKeyGenerateUtil生成RSA秘钥对，公钥通过Payright网站上传到Payright，私钥设置到下面的变量中】
    public static final String PRIVATE_KEY = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBANTf5n0fstv7rQWNuZFmNjLm58t7+pRrxbyi8EzkzQmB2Bgv8SpabOIqezXYJM9HsNWuPgfadkkEBOAaPqYnzPl7ca8jGLTrdooaVEA9M7wNgYSxuxSDldtymk2BpDiBhX7Z++M8lCq5QW9dMK8pV5XtZ6vfXYtkiPROK1vbGi7DAgMBAAECgYEAm8gejIKeCY5sWBwXKOh70VRZXPglsGgOFLXI1Py7b7GtykWLX0s9U2VzNTwv8+Cq8DTLAERHO7fNOZL7Nez6emKWe2XBvCEWsN4xP5TFwBlnJvHSEh7my7GmwzVLlyyRUT+didEnfgw0yzxSjUamQ6Ct+dlMn44741oPELJHn8ECQQDxaFrq42FwpwOUc+yxtxPkcbVA6VfPermt3YwJfYz7EskDmQV0dFLSUfGxbG4QHKh5hRkvnzOaOWZyWwVVKzItAkEA4b4DUaGm0cezVZGYZDcRo7TlNrIzqrTjjIcuYZFm2+90imzkyrjkesFrC/yR7XEE5t+n3uUcrNPsMunb9eWqrwJBAKWzM3S2zlM80EA9seHqAEV1pyv+/r7zRjAJOe3pt7M+matWhWAB2Dd096kI/CMjCKEgssD1Tb42WBN2Vpq3I6ECQBJiH/EQ4f3pbmBEiA15MpWLULNAldaL/o/eHlfRuHemq23uaj9cCTc58xa5zcRxVL3cbtZHACvO4khPJRuERX8CQGyW2X5WqEVkWFjHcUoSzQNyPzISaX2eu6AU2DWTHNxhdE16XKlNLjFan3QFBt40cY8Uc+SXtf5nL6TAF3xDfqA=";

    //Payright提供给商户的SecretKey，登录网站后查看
    public static final String SECRET_KEY = "8bf1ef218e2346c89c450d8482704dbd";

    //Payright提供给商户的公钥，登录网站后查看
    public static final String PAYRIGHT_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCoFAWfTj6Zc9TCSpqqPzMHiEK9yjoLs74qKJvgxws2nTtsATrSeZp5Nzt2RHurwiFUKI6O/RCGk0HGbue0OGl6CVOc7Nyws46K7F2u9B1k+KzJ5Gc0lWVLZQ030Zd7tUT+nqhguQ09LnR3RmpGoglwkSRq894uZ5IxLXLY7qZKdQIDAQAB";
}