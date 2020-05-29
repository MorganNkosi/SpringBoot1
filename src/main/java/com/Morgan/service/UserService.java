package com.Morgan.service;

public interface UserService {

   void addUser(String name, String surname);

   void removeUser(long Id);

   void getUser(long Id);
}
