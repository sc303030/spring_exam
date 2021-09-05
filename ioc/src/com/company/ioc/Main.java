package com.company.ioc;

public class Main {

    public static void main(String[] args) {
        String url = "www.naver.com/book/it?page=106&size=20&name=spring-boot";

        // Base64 encoding

        // url encoding
        Encoder encoder = new Encoder(new UrlEncoder());
        String result = encoder.encode(url);

        System.out.println(result);
    }
}
