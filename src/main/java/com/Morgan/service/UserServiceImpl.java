package com.Morgan.service;

import com.Morgan.repo.FakeRepo;

public class UserServiceImpl implements UserService {

    private final FakeRepo fakeRepo;

    public UserServiceImpl(FakeRepo fakeRepo) {
        this.fakeRepo = fakeRepo;
    }

    @Override
    public void addUser(String name, String surname) {

    }

    @Override
    public void removeUser(long Id) {

    }

    @Override
    public void getUser(long Id) {

    }
}
