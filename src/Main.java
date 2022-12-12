import entities.BookInstance;
import services.BookInstanceService;
import services.DummyDatasService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //dummy datalari init edirik
        DummyDatasService dummyDatasService=new DummyDatasService();
        dummyDatasService.createDummyDatas();


        //generasiya etmeliyik 100 data
        BookInstanceService bookInstanceService=new BookInstanceService();
        bookInstanceService.generateRandomBookInstanceByCount(100);
        printBookInstance(dummyDatasService.bookInstances);

        //serial numbere gore axtaris aparmaliyiq
        var bookInstanceFinded=bookInstanceService.getBySerailNumber(3);
        printBookInstance(bookInstanceFinded);


        //author adi ve publisher adina gore axtaris aparib neticeleri mueyyen sekilde gostermeliyik
        var bookInstancesFinded=bookInstanceService.getByAuthorNameAndPublisherName("Ayxan","Kitab evi");
        printBookInstance(bookInstancesFinded);
    }

    private static void printBookInstance(ArrayList<BookInstance> bookInstances){
        System.out.println("-----------------------------------------------------------------------------");
        for (var bookInstance:bookInstances){
            System.out.println(
                    "serial number: "+bookInstance.getSerialNumber()
                    +" book: "+bookInstance.getBook().getName()
                    +" author: "+bookInstance.getBook().getAuthor().getName()
                    +" publisher: "+bookInstance.getBook().getPublisher().getName()
                    +" store: "+bookInstance.getStore().getName()+"("+bookInstance.getStore().getBranchName()+")"
            );
        }
    }

    private static void printBookInstance(BookInstance bookInstance){
        System.out.println("-----------------------------------------------------------------------------");
            System.out.println(
                    "serial number: "+bookInstance.getSerialNumber()
                            +" book: "+bookInstance.getBook().getName()
                            +" author: "+bookInstance.getBook().getAuthor().getName()
                            +" publisher: "+bookInstance.getBook().getPublisher().getName()
                            +" store: "+bookInstance.getStore().getName()+"("+bookInstance.getStore().getBranchName()+")"
            );
    }




}