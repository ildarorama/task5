package com.epam.jmp.cleantask.task1;

public class LibraryStarter {
    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();
        library.checkOutBook("BK001", "USR001");
        library.returnBook("BK001");
    }
}
