package com.razvanm.stoma2.cucumber;

import com.razvanm.stoma2.Stoma2App;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = Stoma2App.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
