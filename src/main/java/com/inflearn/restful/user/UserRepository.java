package com.inflearn.restful.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Integer>{
    // extends 상속 : <User 타입, 기본키값> 순으로 정의


}
