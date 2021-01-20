package com.atguigu.spring5;/**
 * @Author Curry
 * @Create 2021-01-2:21
 */

/**
 * @Description todo
 * @ClassName Book
 * @Author admin
 * @Date 2021/1/2 2:21
 * @Version 1.0
 */
public class Book {
    private String bname;
    private String bauthor;

    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public Book(String bname) {
        this.bname = bname;
    }

    public Book() {
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setBname("test");

    }

    public void testDemo(){
        System.out.println(bname + "::" + bauthor);
    }

   public void showInfo(){
       System.out.println(bname+"::"+bauthor+"::"+address);
   }

}
