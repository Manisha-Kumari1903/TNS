package com.Tns.threads;

package com.tns.threads;

public class ThreadOneDemo {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadOne t2 = new ThreadOne();
        ThreadOne t3 = new ThreadOne();

        t1.setName("Alpha");
        t2.setName("Beta");
        t3.setName("Gamma");

        t1.start();
        t2.start();
        t3.start();
    }
}

