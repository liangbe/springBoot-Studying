package com.bee.study.service;

import com.bee.study.entity.User;

import java.util.List;

/**
 * Created by liangbe on 2017/4/14.
 */

public interface UserService {

    User save(User user);

    User findOne(Long id);
}
