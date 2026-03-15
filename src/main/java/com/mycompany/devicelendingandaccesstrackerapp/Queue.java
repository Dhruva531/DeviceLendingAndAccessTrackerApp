/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.devicelendingandaccesstrackerapp;

/**
 *
 * @author dhruv
 */
public class Queue implements QueueInterface {

    private SingleLinkedList list;

    public Queue() {
        list = new SingleLinkedList();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void enqueue(Object element) {
        list.add(element);
    }

    @Override
    public Object dequeue() {
        if (list.isEmpty()) {
            return null;
        }
        Object frontElement = list.get(0);
        list.delete(0);
        return frontElement;
    }

    @Override
    public Object front() {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
