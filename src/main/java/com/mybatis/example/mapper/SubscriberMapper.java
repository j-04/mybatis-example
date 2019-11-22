package com.mybatis.example.mapper;

import com.mybatis.example.entity.Subscriber;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SubscriberMapper {
//    final String getSubscribers = "SELECT * FROM subscriber";
//
//    @Select(getSubscribers)
//    @Results(value = {
//            @Result(property = "id", column = "id"),
//            @Result(property = "name", column = "name"),
//            @Result(property = "branch", column = "")
//    })

    Subscriber getSubscriberById(Integer id);
    List<Subscriber> getSubscribers();
}
