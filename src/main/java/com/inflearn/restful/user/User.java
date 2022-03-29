package com.inflearn.restful.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value={"password","ssn"})
//@JsonFilter("UserInfo") // 프로그래밍으로 제어하는 Filtering 방법 - 개별 사용자 조회
// lec#4-2. Level3 단계의 REST API 구현을 위한 HATEOAS 적용 에서 JsonFilter 주석 처리함
@ApiModel(description = "사용자 상세 정보를 위한 도메인 객체")
@Entity
@Table(name="TB_USER")
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    // 강의 : 유효성 체크를 위한 Validation API 사용
    @Size(min=2, message="Name은 2글자 이상 입력")
    @ApiModelProperty(notes="사용자 이름을 입력해주세요")
    private String name;

    @Past
    @ApiModelProperty(notes="사용자의 등록일을 입력해주세요")
    private Date joinDate;

    // JsonIgnore은 출력할 때 숨겨주는 역할을 한다
    //@JsonIgnore
    @ApiModelProperty(notes="사용자의 비밀번호를 입력해주세요")
    private String password;

    //@JsonIgnore
    @ApiModelProperty(notes="사용자의 주민번호를 입력해주세요")
    private String ssn;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    public User(int id, String name, Date joinDate, String password, String ssn) {
        this.id = id;
        this.name = name;
        this.joinDate = joinDate;
        this.password = password;
        this.ssn = ssn;
    }
}
