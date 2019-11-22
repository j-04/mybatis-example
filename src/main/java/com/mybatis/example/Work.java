package com.mybatis.example;

import com.mybatis.example.entity.Subscriber;
import com.mybatis.example.mapper.SubscriberMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory;
        SubscriberMapper subscriberMapper;
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            subscriberMapper = sqlSessionFactory.openSession().getMapper(SubscriberMapper.class);
            List<Subscriber> subscribers = subscriberMapper.getSubscribers();
            Subscriber subscriber = subscriberMapper.getSubscriberById(1);
            System.out.println(subscriber.getId());
            System.out.println(subscriber.getName());
            System.out.println(subscriber.getPayments());
            System.out.println(subscriber.getTariff());
            System.out.println(subscriber.getTariff().getId());
            System.out.println(subscriber.getTariff().getDescr());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
