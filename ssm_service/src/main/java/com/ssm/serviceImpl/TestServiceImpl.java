package com.ssm.serviceImpl;

import com.ssm.service.Testservice;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements Testservice {
    @Override
    public void add() {
        System.out.println("sreyy");
    }
}
