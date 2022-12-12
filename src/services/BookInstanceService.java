package services;

import entities.Book;
import entities.BookInstance;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookInstanceService {

    DummyDatasService dummyDatasService;
    private static int uniqueNumber=0;

    public BookInstanceService() {
        dummyDatasService=new DummyDatasService();
    }
    public void generateRandomBookInstanceByCount(int count){

        for (int i=0;i<count;i++){
            BookInstance bookInstanceToAdd=new BookInstance();

            bookInstanceToAdd.setSerialNumber(++uniqueNumber);

            int bookIndex=new Random().nextInt((dummyDatasService.books.size()-1)-0+1)+0;
            bookInstanceToAdd.setBook(dummyDatasService.books.get(bookIndex));

            int storeIndex=new Random().nextInt((dummyDatasService.stores.size()-1)-0+1)+0;
            bookInstanceToAdd.setStore(dummyDatasService.stores.get(storeIndex));

            int bookInstanceTypeIndex=new Random().nextInt((dummyDatasService.bookInstanceTypes.size()-1)-0+1)+0;
            bookInstanceToAdd.setBookInstanceType(dummyDatasService.bookInstanceTypes.get(bookInstanceTypeIndex));

            dummyDatasService.bookInstances.add(bookInstanceToAdd);

        }
    }

    public BookInstance getBySerailNumber(int serialNumber){
        BookInstance result=new BookInstance();

        ArrayList<BookInstance> datas= dummyDatasService.bookInstances;

        for(var data :datas){
            if(data.getSerialNumber()==serialNumber){
                result=data;
                break;
            }
        }

        return result;
    }

    public ArrayList<BookInstance> getByAuthorNameAndPublisherName(String authorName,String publisherName){
        ArrayList<BookInstance> result=new ArrayList<BookInstance>();

        ArrayList<BookInstance> datas =dummyDatasService.bookInstances;

        for (var data:datas){
            if(data.getBook().getAuthor().getName()==authorName && data.getBook().getPublisher().getName()==publisherName ){
                result.add(data);
            }
        }

        return result;
    }



}
