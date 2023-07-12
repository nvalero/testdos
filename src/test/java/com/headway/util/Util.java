package com.headway.util;

import com.model.Credential;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Util {

    private static Util instance;
    private Credential credential;

    private Util() {
        //TODO fix constants values, and path for json
        String fileName = "src/test/java/com/headway/util/login.json";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            credential =  objectMapper.readValue(new File(fileName), Credential.class);
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static Util getInstance() {
        if (instance == null) {
            instance = new Util();
        }
        return instance;
    }

    public Credential getCredential() {
        return credential;
    }
}
