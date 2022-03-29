package com.inflearn.restful.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="TB_POST")
public class Post {
    // 게시물 관리를 위한 Post Entity 추가와 초기 데이터 생성
    @Id
    @GeneratedValue
    private Integer id;

    private String description;

    // User : Post = 1 : (0 ~ N). User가 Main/Parent , Post는 Sub / child
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;

}
