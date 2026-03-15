/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.devicelendingandaccesstrackerapp;

/**
 *
 * @author dhruva
 */
public class SingleLinkedList implements SingleLinkedListInterface {

    private Node head;
    private Node curr;
    private int size;

    public SingleLinkedList() {
        head = null;
        curr = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object element) {
        Node newNode = new Node(element, null);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(newNode);
        }
        size++;
    }

    @Override
    public void add(Object element, int index) {
        if (index < 0 || index > size) {
            return;
        }
        Node newNode = new Node(element, null);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.getNext();
            }
            newNode.setNext(curr.getNext());
            curr.setNext(newNode);
        }
        size++;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.getNext();
        }
        return curr.getElement();
    }

    @Override
    public void delete(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }
        size--;
    }
}
