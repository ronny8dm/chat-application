package com.client.event;

import com.client.model.ModelMessage;

public interface EventMessage {

    public void callMessage(ModelMessage message);
}