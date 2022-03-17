package com.inflearn.restful.helloworld;

// lombok을 사용하여 get, set 를 사용하지 않음

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldBean {
    private String message;
}
