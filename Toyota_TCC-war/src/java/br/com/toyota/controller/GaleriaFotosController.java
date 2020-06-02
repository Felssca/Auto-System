/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.controller;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Kabelera
 */@SessionScoped
@ManagedBean(name = "galeriaController")

public class GaleriaFotosController {
    
    private List<String> images;
       @PostConstruct  
    public void init() {  
        images = new ArrayList<String>();  
  
        for(int i=1;i<=5;i++) {  
            images.add("" + i + ".jpg");  
        }  
    }  
    
}
