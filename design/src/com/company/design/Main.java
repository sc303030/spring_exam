package com.company.design;

import com.company.design.adapter.*;
import com.company.design.decorator.*;
import com.company.design.strategy.Base64Strategy;
import com.company.design.strategy.Encoder;
import com.company.design.strategy.EncodingStrategy;
import com.company.design.strategy.NormalStrategy;

public class Main {

    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        //base64
        EncodingStrategy base64 = new Base64Strategy();

        //normal
        EncodingStrategy normal = new NormalStrategy();

        String message = "hello java";
        encoder.setEncodingStrategy(base64);
        String base64Result =encoder.getMessage(message);
        System.out.println(base64Result);

//        encoder.setEncodingStragety(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

    }
    // 콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
