import java.util.*;

class Library
{
    int no_books;
    String [] book_title;

    Library(int n)
    {
        no_books = 0;
        book_title = new String[n];
    }

    void Add_book(String title)
    {
        this.book_title = title;
        no_books++;

        System.out.println(title+" book has been add");
    }

    void issue_book(String title)
    {
        int count = no_books;
        for(int i=0;i<count;i++)
        {
            if(book_title[i].equals(title))
            {
                System.out.println(title+" book has been issued");
                no_books--;
            }
        }
    }
}

class OnlineLibrary
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Library lb = new Library(10);
    }
}