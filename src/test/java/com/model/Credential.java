package com.model;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonGetter;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
public class Credential {
    private String user;
    private String password;
}
