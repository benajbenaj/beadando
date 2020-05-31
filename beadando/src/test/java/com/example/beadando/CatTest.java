package com.example.beadando;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Logger logger = LoggerFactory.getLogger(BeadandoApplication.class);

    private final Cat cat = new Cat(1,"TrueCat",11);
    private final Cat catCaseTwo = new Cat(1,"FalseCat",9);

    @Test
    void isCatOld() {
        logger.info("True case where our first cat is 11 years old");
        assertEquals(true, cat.isCatOld(cat.getAge()));
        logger.info("False case where our second cat is 9 years old");
        assertEquals(false, catCaseTwo.isCatOld(catCaseTwo.getAge()));
    }
}