package Sep.Constructor;


class books{
    String author;
    String title;
    double price;
    int page;

books (String author, String title){
    System.out.println(author + title);

    }

}

public class Book {
    public static void main(String[] args) {
        books b = new books("chetan", "how are you");

    }
}
