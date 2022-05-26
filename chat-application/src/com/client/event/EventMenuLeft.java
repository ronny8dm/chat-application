package com.client.event;

import java.util.List;

import com.client.model.ModelUserAccount;

public interface EventMenuLeft {

    public void newUser(List<ModelUserAccount> users);

    public void userConnect(int userID);

    public void userDisconnect(int userID);
}