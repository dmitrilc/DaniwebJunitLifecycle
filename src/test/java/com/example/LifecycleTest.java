package com.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
class LifecycleTest {

    @BeforeAll
    void beforeAll(){
        System.out.println("Before All");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Before Each");
    }

//    @Test
//    void test(){
//        System.out.println("Test");
//    }

    @RepeatedTest(2)
    void repeatTest(){
        System.out.println("Repeat Test");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After Each");
    }

    @AfterAll
    void afterAll(){
        System.out.println("After All");
    }
}
