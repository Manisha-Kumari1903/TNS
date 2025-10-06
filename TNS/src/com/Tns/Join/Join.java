package com.Tns.Join;

	class MyThread extends J {
	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println(getName() + " - Count: " + i);
	            try {
	                J.sleep(500); // pause for half a second
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }
	        }
	    }
	}