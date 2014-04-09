package org.hui.practice;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hui on 4/8/14.
 */
public class Practice1Test {

    @Before
    public void testSetup() {

        Practice1 p1 = new Practice1();
        p1.somethingToDo();
    }


    @Test
    public void testAdd() {

        int expectedResult = 5;
        int actualResult = Practice1.add(3,2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSub() {

        int expectedResult = 5;
        int actualResult = Practice1.sub(10, 5);
        assertEquals(expectedResult, actualResult);
    }

}