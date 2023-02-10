package com.vue.imple;

import com.vue.dao.UserRepositoryDao;
import com.vue.dto.User;
import com.vue.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRepositoryImple implements UserRepository {

    @Autowired
    private UserRepositoryDao userRepositoryDao;

    @Override
    public User findById(int id) {
        return userRepositoryDao.selectOne();
    }
}
