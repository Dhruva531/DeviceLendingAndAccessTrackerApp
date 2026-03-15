/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.devicelendingandaccesstrackerapp;

/**
 *
 * @author dhruva
 */
public class Stack implements StackInterface {

    private SingleLinkedList list;

    public Stack() {
        list = new SingleLinkedList();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void push(Object element) {
        list.add(element, 0);
    }

    @Override
    public Object peek() {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public Object pop() {
        if (list.isEmpty()) {
            return null;
        }
        Object top = list.get(0);
        list.delete(0);
        return top;
    }
}
