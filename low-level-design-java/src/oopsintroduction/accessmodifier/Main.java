package oopsintroduction.accessmodifier;
/*
 Access Modifier	Within Class	Within Package	 Outside package by child class only  Outside package
 Public	             Yes,	            Yes,	                    Yes,	                    Yes,
 Protected	         Yes,	            Yes,	                    Yes,                        No
 Default	         Yes,	            Yes,	                    No,	                        No
 Private	         Yes,	            No,	                        No,	                        No
 */

import oopsintroduction.accessmodifier.first.Two;

public class Main {
    public static void main(String[] args) {
        Two two = new Two();
     }
}
