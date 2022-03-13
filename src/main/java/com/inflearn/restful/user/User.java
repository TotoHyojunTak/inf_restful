package com.inflearn.restful.user;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import java.util.Date;

@Data
@AllArgsConstructor
public class User {
    private Integer id;

    // 강의 : 유효성 체크를 위한 Validation API 사용
    @Size(min=2, message="Name은 2글자 이상 입력")
    private String name;

    @Past
    private Date joinDate;
}
