package com.vue.service;

import com.vue.dto.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface UserRepository {
    User findById(int id);
}
