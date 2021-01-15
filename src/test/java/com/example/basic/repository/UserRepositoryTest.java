package com.example.basic.repository;

import com.example.basic.BasicApplication;
import com.example.basic.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.time.LocalDateTime;

public class UserRepositoryTest extends BasicApplication {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    DataSource DataSource;

    @Test
    public void connection(){

        try {
            Connection connection = DataSource.getConnection();
            System.out.println(connection.getMetaData().getURL());
            System.out.println(connection.getMetaData().getUserName());
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Test
    public void create(){

        User user = new User();
        user.setAccount("TestUser01");
        user.setEmail("TestUser01@gmail.com");
        user.setPhoneNumber("010-1111-1111");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpatedBy("admin");

//        userRepository.save(user);
//        System.out.println("newUser :: "+user);

    }

    public void read(){

    }

    public void update(){

    }

    public void delete(){

    }

}

