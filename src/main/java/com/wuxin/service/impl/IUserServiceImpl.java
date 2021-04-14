package com.wuxin.service.impl;

import com.wuxin.dao.IUserDao;
import com.wuxin.domain.User;
import com.wuxin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Tanoty
 * @version 1.0
 * @date 2021/3/29 19:11
 */
@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    private IUserDao iUserDao;
    @Override
    public List<User> findTYAll() {
        List<User> users = iUserDao.findTYAll();
        return users;
    }




    @Override
    public User findTYOne(int i) {
        return null;
    }

    @Override
    public User deleteTYOne(int i) {
        return null;
    }

    @Override
    public void insertTYOne(User user) {

    }

    @Override
    public int updateTYOne(User user) {
        return 0;
    }
}
