package com.Morgan.repo;


import com.Morgan.user.Users;

public interface FakeRepoInterface {

    void removeUser(long id);

    void insertUser(Users user);

    void findUserById(long id);

}
