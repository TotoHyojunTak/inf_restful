package com.inflearn.restful.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value={"password","ssn"})
@JsonFilter("UserInfo") // 프로그래밍으로 제어하는 Filtering 방법 - 개별 사용자 조회
public class User {
    private Integer id;

    // 강의 : 유효성 체크를 위한 Validation API 사용
    @Size(min=2, message="Name은 2글자 이상 입력")
    private String name;

    @Past
    private Date joinDate;

    // JsonIgnore은 출력할 때 숨겨주는 역할을 한다
    //@JsonIgnore
    private String password;
    //@JsonIgnore
    private String ssn;
}
