package com.example.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("------------------------");

        // Text JSON -> Object
        // Object -> Text JSON

        // controller req json(text) -> Object
        // response object -> json(text)
        var objectMapper = new ObjectMapper();

        // object -> text
        // object mapper get method 를 활용한다.
        var user = new User("steve", 10);
        var text = objectMapper.writeValueAsString(user);
        System.out.println(text);
        // text -> object
        var objectUser = objectMapper.readValue(text, User.class);
        System.out.println(objectUser);
    }

}
