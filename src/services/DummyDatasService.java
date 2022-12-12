package services;

import entities.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DummyDatasService {
    static public ArrayList<Author> authors;
    static public ArrayList<Book> books;
    static public ArrayList<Publisher> publishers;
    static public ArrayList<Store> stores;
    static public ArrayList<BookInstance> bookInstances;
    static public ArrayList<BookInstanceType> bookInstanceTypes;

    public DummyDatasService(){
        bookInstances=new ArrayList<BookInstance>();

    }


    public void createDummyDatas(){
        authors=new ArrayList<Author>(Arrays.asList(
                new Author(1,"Ayxan","Qadirov",20),
                new Author(2,"Ali","Guseinov",21)
        ));

        publishers=new ArrayList<Publisher>(Arrays.asList(
                new Publisher(1,"Kitab evi"),
                new Publisher(2,"Dunya nesriyyat")
        ));

        books= new ArrayList<Book>(Arrays.asList(
                new Book(1,"Grinin elli tonu",authors.get(0),publishers.get(0)),
                new Book(2,"Anna Karanina",authors.get(1),publishers.get(0)),
                new Book(3,"Peace and war",authors.get(0),publishers.get(1)),
                new Book(4,"Kan piksel ve goz yasi",authors.get(1),publishers.get(1))
        ));

        bookInstanceTypes=new ArrayList<BookInstanceType>(Arrays.asList(
                new BookInstanceType(1,"InStock"),
                new BookInstanceType(2,"Sold")
        ));

        stores =new ArrayList<Store>(Arrays.asList(
                new Store(1,"Ali & Nino","Tarqovu"),
                new Store(2,"Libraff","Genclik"),
                new Store(3,"Ali & Nino","Semed Vurgun"),
                new Store(4,"Libraff","Insatcilar")

        ));

    }

}
