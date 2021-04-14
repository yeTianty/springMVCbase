package com.wuxin.service;

import com.wuxin.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Tanoty
 * @version 1.0
 * @date 2021/3/29 19:11
 */
public interface IUserService {
    /**
     * 查询所有操作
     * @return
     */
    List<User> findTYAll();
    /**
     * 查询指定id
     *
     */
    User findTYOne(int i);

    /**
     * 删除指定id
     */
    User deleteTYOne(int i);

    /**
     * 增加数据
     */
    void insertTYOne(User user);

    /**
     * 更改数据
     */
    int updateTYOne(User user);
}
