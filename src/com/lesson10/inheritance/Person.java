package com.lesson10.inheritance;

public class Person {
    String name;
    static int lifeSpan = 60;
    static double ageFactor = 1.0;

    public Person() {

        name = "";
    }

    public Person(String aName) {
        name = aName;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public String toString() {
        return ("Hello, my name is " + name);
    }

    public String talk() {
        return ("I have nothing to say.");
    }

    public String walk() {
        return ("I have nowhere to go.");
    }

    public static double lifeSpan() {
        return (lifeSpan * ageFactor);
    }


    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static class Main {
        public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.
            System.out.printf("Hello and welcome!");

            for (int i = 1; i <= 5; i++) {
                //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
                // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
                System.out.println("i = " + i);
            }
        }
    }
}

