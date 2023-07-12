package com.model;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonGetter;
import lombok.Getter;
import lombok.Setter;

public class Credential {
    @Getter @Setter
    private String user;
    @Getter @Setter
    private String password;
}
