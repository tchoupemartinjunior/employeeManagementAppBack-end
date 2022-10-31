package com.tchoupe.employeeManager.controller;

import com.tchoupe.employeeManager.repo.EmployeeRepo;
import com.tchoupe.employeeManager.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;

@WebMvcTest
public class EmployeeRessourceTest  {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeRessource employeeRessource;

    @Test
    void findEmployeeById(){

    }

}
