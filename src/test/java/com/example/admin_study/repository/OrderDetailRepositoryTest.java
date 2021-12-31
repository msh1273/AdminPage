package com.example.admin_study.repository;

import com.example.admin_study.AdminStudyApplicationTests;
import com.example.admin_study.model.entity.OrderDetail;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class OrderDetailRepositoryTest extends AdminStudyApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void create(){
        OrderDetail orderDetail = new OrderDetail();

        orderDetail.setOrderAt(LocalDateTime.now());

        //어떤 사람이 주문했나?
        //orderDetail.setUserId(7L);

        //어떤 상품을 주문했나?
        //orderDetail.setItemId(1L);

        OrderDetail newOrderDetail = orderDetailRepository.save(orderDetail);
        Assert.assertNotNull(newOrderDetail);
    }
}
