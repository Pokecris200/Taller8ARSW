/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.interactivebalckboardlife;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cristian.forero-m
 */
public class UserMemory {
    
    private static UserMemory _instance = new UserMemory();
    private List<Integer> memory = new ArrayList<>();
    
    public UserMemory getInstance(){
        return _instance;
    }
    
    
}
