package com.example.demo.dao;

import com.example.demo.entity.usersd;

import java.util.List;

public interface usersdDao {

    @select("select * from usersd")
    public List<usersd> queryReportFileList();

}

