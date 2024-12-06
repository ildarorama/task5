package com.epam.jmp.cleantask.task1;

import com.epam.jmp.cleantask.task1.cabinet.LibraryStorage;
import com.epam.jmp.cleantask.task1.cabinet.LibraryUser;
import com.epam.jmp.cleantask.task1.model.UserInfo;

public class LibrarySystem {
    LibraryStorage storage = new LibraryStorage();
    LibraryUser users = new LibraryUser();

    public void checkOutBook(String bookId, String userId) {
        try {
            UserInfo user = users.getById(userId);
            storage.take(bookId, user);
            System.out.println("Book checked out to " + userId);
        } catch (Exception e) {
            System.out.println("Book is currently unavailable.");
        }
    }

    public void returnBook(String bookId) {
        try {
            storage.back(bookId);
            System.out.println("Book was returned");
        } catch (Exception e) {
            System.out.println("Book is currently unavailable.");
        }
    }

}
