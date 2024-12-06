package com.epam.jmp.cleantask.task1.cabinet;

import com.epam.jmp.cleantask.task1.exception.LibraryException;
import com.epam.jmp.cleantask.task1.model.UserInfo;

import java.util.HashMap;

public class LibraryStorage {
    private HashMap<String, UserInfo> bookRegistry = new HashMap<>();

    public void take(String bookId, UserInfo user) {
        if (bookRegistry.containsKey(bookId)) {
            bookRegistry.put(bookId, user);
            return;
        }
        throw new LibraryException();
    }

    public void back(String bookId) {
        if (bookRegistry.containsKey(bookId)) {
            bookRegistry.put(bookId, null);
            return;
        }
        throw new LibraryException();
    }
}
