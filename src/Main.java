import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProgrammingBook book1 = new ProgrammingBook(1,"1",100,"a1","java");
        ProgrammingBook book2 = new ProgrammingBook(2,"2",200,"a2","java");
        ProgrammingBook book3 = new ProgrammingBook(3,"3",300,"a3","java");
        ProgrammingBook book4 = new ProgrammingBook(4,"4",400,"a4","java2");
        ProgrammingBook book5 = new ProgrammingBook(5,"5",500,"a5","java");
        FictionBook book6 = new FictionBook(6,"6",600,"a6","Viễn tưởng 1");
        FictionBook book7 = new FictionBook(7,"7",700,"a7","Viễn tưởng 1");
        FictionBook book8 = new FictionBook(8,"8",80,"a8","b");
        FictionBook book9 = new FictionBook(9,"9",90,"a9","b");
        FictionBook book10 = new FictionBook(10,"10",1000,"a10","b");
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);
        int total=0;
        int countCategory=0;
        int countJava=0;
        int countPrice=0;
        for (Book c:books){
            total+=c.getPrice();
            if (c instanceof ProgrammingBook && ((ProgrammingBook) c).getLanguage()=="java"){
                countJava++;
            }
            if (c instanceof FictionBook && c.getPrice()<100){
                countPrice++;
            }
            if (c instanceof FictionBook && ((FictionBook) c).getCategory()=="Viễn tưởng 1"){
                countCategory++;
            }
        }
        System.out.println(total);
        System.out.println(countJava);
        System.out.println(countCategory);
        System.out.println(countPrice);
    }
}