package se.lexicon.dao.Impl;

import se.lexicon.model.AppUser;

import java.util.ArrayList;
import java.util.List;

public class AppUserDAOImpl {

    private List<AppUser> appUsers;

    public AppUserDAOImpl() {
        appUsers = new ArrayList<>();
    }


    @Override
    public AppUser persist(AppUser appUser) {
        if (appUser == null) throw new IllegalArgumentException("AppUser is null");
        if (findByUsername(appUser.getUsername()) != null)
            throw new IllegalArgumentException("Username" + appUser.getUsername() + " is already taken");

        appUsers.add(appUser);
        return appUser;
    }

    @Override
    public AppUser findByUsername(String username) {
        if (username == null) throw new IllegalArgumentException("Username is null");

        return appUsers.stream()
                .filter(appUser -> appUser.getUsername().equalsIgnoreCase(username))
                .findFirst().orElse(null);
    }

    @Override
    public List<AppUser> findAll() {
        return appUsers;
    }

    @Override
    public void remove(String username) {

        AppUser findUser = findByUsername(username);
        if (findUser != null) appUsers.remove(findUser);
    }




}
