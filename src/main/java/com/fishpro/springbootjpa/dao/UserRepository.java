package com.fishpro.springbootjpa.dao;

import com.fishpro.springbootjpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yangjie
 * @classname UserRepository
 * @date 2020/03/24 0024 16:57:00
 * @description
 **/
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
