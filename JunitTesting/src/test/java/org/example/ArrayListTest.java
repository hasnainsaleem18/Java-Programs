package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    @BeforeAll
    static void before()
    {
        System.out.println("Before Each Test!");
    }

    @Test
    void dummyTest()
    {
        assertTrue(true);
    }

    @Test
    void notNULL()
    {
        ArrayList list = null;
        assertNull(list);
    }


    @Test
    void notsameTest()
    {
        ArrayList list = new ArrayList(5);
        ArrayList list1 = list ;
        assertSame(list1,list);
    }

    @Test
    void toleranceTest()
    {
        assertEquals(60.5234,58.2345,4);
    }

    @Test
    void insert() {
        ArrayList list = new ArrayList(5);
        list.insert(5);

        assertEquals(5,list.get(0));
        assertEquals(1,list.getN());

//        if (list.get(0) == 5 && list.getN() == 1)
//        {
//            System.out.println("All is well");
//        }
//
//        else
//        {
//            System.out.println("Buggg");
//        }
    }

    @Test
    void remove_last()
    {
        ArrayList list = new ArrayList(5);
        list.remove_last();
        assertEquals(0,list.getN());
    }
}