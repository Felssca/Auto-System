/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.toyota.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 *
 * @author Felipe Saboya SCA _ TCC
 */
@MessageDriven(mappedName = "jms/NotificationQueue", activationConfig = {
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class NotificationBean implements MessageListener {
    
    public NotificationBean() {
    }
    
    @Override
    public void onMessage(Message message) {
    }
}
