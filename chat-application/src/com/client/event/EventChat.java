package com.client.event;

import com.client.model.ModelReceiveMessage;
import com.client.model.ModelSendMessage;

public interface EventChat {

    public void sendMessage(ModelSendMessage data);

    public void receiveMessage(ModelReceiveMessage data);
}