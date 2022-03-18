package com.inflearn.restful.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("UserInfoV2") // 프로그래밍으로 제어하는 Filtering 방법 - 개별 사용자 조회
public class UserV2 extends User{
    private String grade;

}
