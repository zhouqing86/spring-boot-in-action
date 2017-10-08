package com.wendll.helpers;

import org.junit.Test;

class A {
    static {
        System.out.println("In static A");
    }

    public A() {
        System.out.println("A initialize");
    }
}

class B extends A{
    static {
        System.out.println("In static B");
    }

    public B() {
        System.out.println("B initialize");
    }
}

public class StaticBlockTest {
    @Test
    public void testStaticBlock() throws Exception {
        A ab = new B();
        ab = new B();

    }
}
