package JavaInAction.Java03.ex01;

class Book {
    private String title;
    private String author;

    public void display(){
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book(Book other) {
        this(other.getTitle(), other.getAuthor());
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
