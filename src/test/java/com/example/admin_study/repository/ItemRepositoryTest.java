package com.example.admin_study.repository;

import com.example.admin_study.AdminStudyApplicationTests;
import com.example.admin_study.model.entity.Item;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ItemRepositoryTest extends AdminStudyApplicationTests {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void create(){

        Item item = new Item();
        item.setName("노트북");
        item.setPrice(1000000);
        item.setContent("맥북");

        Item newItem = itemRepository.save(item);
        Assert.assertNotNull(newItem);
    }

    @Test
    public void read(){
        Long id = 1L;
        Optional<Item> item = itemRepository.findById(id);

        Assert.assertTrue(item.isPresent());
    }
}
