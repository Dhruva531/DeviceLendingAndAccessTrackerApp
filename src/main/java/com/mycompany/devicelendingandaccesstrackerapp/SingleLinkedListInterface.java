/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.devicelendingandaccesstrackerapp;

/**
 *
 * @author dhruva
 */
public interface SingleLinkedListInterface {

    public boolean isEmpty();

    public int size();
    
    public void add( Object element, int index);

    public void add(Object element);

    public Object get(int index);

    public void delete(int index);
}
