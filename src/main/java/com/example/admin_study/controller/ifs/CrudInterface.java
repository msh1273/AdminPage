package com.example.admin_study.controller.ifs;

import com.example.admin_study.model.network.Header;

public interface CrudInterface {

    Header create();
    Header read(Long id);
    Header update();
    Header delete(Long id);
}
