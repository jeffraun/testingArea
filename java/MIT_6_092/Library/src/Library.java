public class Library {
    // Add the missing implementation to this class

    Book bookList[] = new Book[4];
    int numBook = 0;
    String myAddress;

    public Library(String address){
        myAddress = address;

    }

    private void addBook(Book newBook ){

        bookList[numBook] = newBook;
        numBook++;

    }

    private void borrowBook(String bookTitle){

        if (numBook == 0){

            System.out.println("There are not books available.");

        } else {

            for (Book currBook : bookList) {

                if (currBook.title == bookTitle){

                    if (currBook.borrowed == true){
                        System.out.println( bookTitle + " is borrowed already");
                    }else{
                        System.out.println("You have checked out " + bookTitle);
                        currBook.borrowed();
                    }
                }
            }

        }

    }

    private void returnBook(String title){
        for (Book currBook : bookList) {

            if(currBook.title == title){
                currBook.returned();
            }


        }

    }

    private void printAvailableBooks(){

        if (numBook == 0){

            System.out.println("There are no books available.");

        }else{

            for (Book currBook : bookList) {

                if(currBook.isBorrowed() == false){
                    System.out.println(currBook.title);
                }


           }
        }

    }

    private void printOpeningHours(){
        int openTime = 9;
        int closeTime = 5;

        System.out.println("Libraries are open daily from " + openTime + "am to " + closeTime + "pm.");
    }

    private void printAddress(){
        System.out.println(myAddress);
    }

    public static void main(String[] args) {
        // Create two libraries

        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library

        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));


        // System.out.println(firstLibrary);
        // Print opening hours and the addresses
        System.out.println("Library hours:");
        firstLibrary.printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();

    }
} 