package com.Morgan.repo;


import com.Morgan.user.Users;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class FakeRepo implements FakeRepoInterface {


    private static Map<String, Users> fakeRepo = new HashMap<>();

    static {

        Users Morgan = new Users(1, "Morgan", "Nkosi");
        fakeRepo.put(String.valueOf(Morgan.getId()), Morgan);

        Users Zama = new Users(2, "Zama", "Zwane");
        fakeRepo.put(String.valueOf(Zama.getId()), Zama);
    }

    @Override
    public void removeUser(long id) {

        fakeRepo.remove(id);
    }


    @Override
    public void insertUser(Users user) {

        fakeRepo.put(user.getId(), user);
    }

    @Override
    public void findUserById(long id) {
        fakeRepo.get(id);
    }

}
