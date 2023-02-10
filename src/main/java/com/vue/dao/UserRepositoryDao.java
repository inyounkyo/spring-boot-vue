package com.vue.dao;

import com.vue.dto.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryDao {
    public User selectOne(){
        User u1 = new User();
        u1.setId(100);
        u1.setName("Kim Cuel-su");
        return u1;
    }


}
