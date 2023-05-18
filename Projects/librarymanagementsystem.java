import java.util.*;
class Book{
    public int bookid;
    public String bookname;
    public Book(int bookid,String bookname){
        this.bookid=bookid;
        this.bookname=bookname;
    }
}
class Student{
    public int rollno;
    public String name;
    public Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
}
class Library{
    HashMap<Integer,String> db=new HashMap<>();
    public void addBook(int bookid,String bookname){
        db.put(bookid,bookname);
    }
    public boolean check(int d){
        if(db.containsKey(d)){
            return true;
        }
        else{
            return true;
        }
    }
    public void display(){
        for(int x:db.keySet()){
            System.out.println(x+" > "+db.get(x));
        }
    }
    HashMap<Integer,Integer> studentbookdatabse=new HashMap<>();
    public void bookborrow(int rollno,int bookid){
        studentbookdatabse.put(rollno,bookid);
    }
    public void returnabook(int rollno,int bookid){
        studentbookdatabse.remove(rollno,bookid);
    }
    public void showstudentbookdat(){
        for(int x:studentbookdatabse.keySet()){
            System.out.println(x+" has taken the book of:" + studentbookdatabse.get(x));
        }
    }

}
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Library lb=new Library();
        lb.addBook(234,"Wings of Fire");
        lb.addBook(421,"Think like a Monk");
        lb.addBook(765,"Bhagavathgitha as it is");
        System.out.println(lb.check(384));
        lb.display();
        lb.bookborrow(219553302,765);
        lb.showstudentbookdat();
        lb.returnabook(219553302,765);
        lb.showstudentbookdat();
    }
}
