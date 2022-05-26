package com.client.event;

import com.client.model.ModelLogin;
import com.client.model.ModelRegister;

public interface EventLogin {

    public void login(ModelLogin data);

    public void register(ModelRegister data, EventMessage message);

    public void goRegister();

    public void goLogin();
}