/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//package com.mycompany.java_interface_abstract.java;

/**
 *
 * @author Nisarg Modi
 */

abstract class phone
{
    abstract void call(String name);
}

class smartphone extends phone
{
    @Override
    void call(string name)
    {
        System.out.println("Call from ",name);
    }
}
public class Java_Interface_abstractJava {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
          phone p = new smartphone();
          p.call("Nisarg");
    }
}
