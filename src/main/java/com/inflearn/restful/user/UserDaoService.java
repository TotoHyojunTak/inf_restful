package com.inflearn.restful.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int usersCount = 4;

    static {
        users.add(new User(1, "toto", new Date(), "pass1", "701010-1111111"));
        users.add(new User(2, "jsh", new Date(), "pass2", "801010-1111111"));
        users.add(new User(3, "ljw", new Date(),"pass3", "901010-1111111"));
        users.add(new User(4, "kjw", new Date(),"pass4", "001010-1111111"));
    }

    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        if (user.getId() == null){
            user.setId(++usersCount);
        }

        users.add(user);
        return user;
    }

    public User findOne(int id){
        for (User user : users){
            if (user.getId() == id){
                return user;
            }
        }

        return null;
    }

    // 강의 : 사용자 삭제를 위한 API 구현 - DELETE HTTP Method
    public User deleteById(int id){
        Iterator<User> iterator = users.iterator();
        while(iterator.hasNext()){
            User user = iterator.next();

            if(user.getId() == id){
                iterator.remove();
                return user;
            }
        }

        return null;
    }
}
