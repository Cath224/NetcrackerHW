package com.netcracker.book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("count");
        int countAuthorsBook = scanner.nextInt();

        Author [] authors = new Author[countAuthorsBook];

        for (int i = 0 ; i <authors.length ; i++){
            System.out.println("name");
            String name = scanner.next();
            System.out.println("email");
            String email = scanner.next();
            System.out.println("gender");
            char gender = scanner.next().charAt(0);

            authors[i] = new Author(name,email, gender);
            System.out.println(authors[i]);
        }


        Book book = new Book("fff", authors, 33, 44);
        System.out.println(book);
        System.out.println(book.getAuthorNames());


    }



}
