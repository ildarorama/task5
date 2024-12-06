package com.epam.jmp.cleantask.task1.cabinet;

import com.epam.jmp.cleantask.task1.exception.LibraryException;
import com.epam.jmp.cleantask.task1.model.UserInfo;

import java.util.Set;

public class LibraryUser {
    private Set<UserInfo> users;

    public UserInfo getById(String id) {
        return users.stream().filter(id::equals).findFirst().orElseThrow(LibraryException::new);
    }

}
