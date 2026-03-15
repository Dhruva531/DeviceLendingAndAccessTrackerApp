/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.devicelendingandaccesstrackerapp;

/**
 *
 * @author dhruva
 */
public interface QueueInterface {
    public boolean isEmpty();
    
    public void enqueue(Object element);
    
    public Object dequeue();
    
    public Object front();
    
}
