package com.fishpro.springbootjpa;

import com.fishpro.springbootjpa.dao.UserRepository;
import com.fishpro.springbootjpa.domain.User;
import com.sun.xml.internal.ws.api.ServiceSharedFeatureMarker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@SpringBootTest
public class SpringBootJpaTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFind(){
        Optional<User> userList = userRepository.findById(1);
        System.out.println("Hello World");
        if(userList.isPresent()){
            User user = userList.get();
            System.out.println("user:"+user.toString());
        }
    }

    @Test
    public void test(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        System.out.println(sdf.format(new Date()));
        Map map = new HashMap();
        map.put("","");
        
        
    }

    //@Test
    public void testInsert(){
        User userDO=new User();
        userDO.setId(1);
        userDO.setUserName("fishpro");
        userDO.setSex(1);
        userDO.setLastLoginTime(new Date());
        userDO.setPassword("123");
        userRepository.save(userDO);
    }

    //@Test
    public void testUpdate(){
        Optional<User> userList = userRepository.findById(1);
        if(userList.isPresent()){
            User user = userList.get();
            System.out.println("before user:"+user.toString());
            user.setUserName("John");
            user.setPassword("123");
            userRepository.save(user);
            System.out.println("after user:"+user.toString());
        }
    }

    //@Test
    public void testDelete(){
        userRepository.deleteById(2);
    }

}
