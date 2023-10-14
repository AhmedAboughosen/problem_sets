package src.library;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MainMenu {


    public static void main(String[] args) {

        Borrower[] borrowerList = new Borrower[100];
        Book[] bookList = new Book[100];
        Periodical[] periodicalList = new Periodical[100];

        System.out.println("welcome to M&() Library");


        for (int i = 0; true; i++) {
            System.out.println("Main Menu");

            System.out.println("1. Add");
            System.out.println("2. close");
            System.out.println("3. show");

            Scanner scanner = new Scanner(System.in);
            int menuType = scanner.nextInt();

            switch (menuType) {

                case 1:
                    addMenu(borrowerList, bookList, periodicalList);

                    break;
                case 2:
                    closeMenu(borrowerList, bookList, periodicalList);

                    break;
                case 3:

                    printInfo(borrowerList, bookList, periodicalList);

                    break;
            }


        }


    }

    private static void printInfo(Borrower[] borrowerList, Book[] bookList, Periodical[] periodicalList) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("print info");

        System.out.println("1. All info");
        System.out.println("2. Find book");
        System.out.println("3. Find Borrow");
        int menuType = scanner.nextInt();


        if (menuType == 1) {

            for (int i = 0; i < borrowerList.length; i++) {
                if (borrowerList[i] != null)
                    borrowerList[i].print();
            }


            for (int i = 0; i < bookList.length; i++) {
                if (bookList[i] != null)
                    bookList[i].print();
            }

            for (int i = 0; i < periodicalList.length; i++) {
                if (periodicalList[i] != null)
                    periodicalList[i].print();
            }
        }

        if (menuType == 2) {

            System.out.println("please enter book code");
            int code = scanner.nextInt();

            for (int i = 0; i < bookList.length; i++) {
                if (bookList[i] != null && bookList[i].getCode() == code) {
                    bookList[i].print();
                    break;
                }
            }

        }

        if (menuType == 3) {

            System.out.println("please enter borrower Id");
            int id = scanner.nextInt();

            for (int i = 0; i < borrowerList.length; i++) {
                if (borrowerList[i] != null && borrowerList[i].getId() == id) {
                    borrowerList[i].print();
                    break;
                }
            }

        }
    }


    public static void closeMenu(Borrower[] borrowerList, Book[] books, Periodical[] periodicalList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Close Menu");

        System.out.println("1. Close Borrower");
        System.out.println("2. Close Book");
        System.out.println("3. Close Periodical");
        int menuType = scanner.nextInt();

        if (menuType == 1) {
            System.out.println("Please enter Borrower Id");
            int id = scanner.nextInt();


            //check if borrower exists :

            int borrowerIndex = checkIfBorrowerExists(borrowerList, id);

            if (borrowerIndex == -1) {
                System.err.println("Borrower not exists");
                return;
            }


            borrowerList[borrowerIndex] = null;


        }
        if (menuType == 2) {
            System.out.println("Please enter book code");
            int code = scanner.nextInt();


            //check if book exists :

            int bookIndex = checkIfBookExists(books, code);

            if (bookIndex == -1) {
                System.err.println("Book not exists");
                return;
            }


            borrowerList[bookIndex] = null;


        }

        if (menuType == 3) {
            System.out.println("Please enter Periodical code");
            int code = scanner.nextInt();


            //check if book exists :

            int index = checkIfPeriodicalExists(periodicalList, code);

            if (index == -1) {
                System.err.println("Periodical not exists");
                return;
            }


            borrowerList[index] = null;

        }


    }


    public static void addMenu(Borrower[] borrowerList, Book[] books, Periodical[] periodicalList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add Menu");

        System.out.println("1. Add Borrower");
        System.out.println("2. Add Book");
        System.out.println("3. Add Periodical");
        System.out.println("4.  Borrow a book");


        int menuType = scanner.nextInt();

        if (menuType == 1) {
            System.out.println("Please enter first Name");
            String firstName = scanner.next();

            System.out.println("Please enter second Name");
            String lastName = scanner.next();

            System.out.println("Please enter phone number");
            String phoneNumber = scanner.next();

            System.out.println("Please enter Borrower Id");
            int id = scanner.nextInt();

            borrowerList[firstEmptyIndex(borrowerList)] = new Borrower(id, firstName, lastName, phoneNumber, true, new Book[]{});
            System.out.println("added successfully");

        }
        if (menuType == 2) {
            System.out.println("Please enter author Name");
            String authorName = scanner.next();

            System.out.println("Please enter book code");
            int code = scanner.nextInt();

            System.out.println("Please enter book version");
            String version = scanner.next();

            System.out.println("Please enter total Pages");
            int totalPages = scanner.nextInt();

            books[firstEmptyIndex(books)] = new Book(authorName, code, version, totalPages, false);
            System.out.println("added successfully");

        }

        if (menuType == 3) {
            System.out.println("Please enter periodical type");
            String type = scanner.next();

            System.out.println("Please enter periodical code");
            int code = scanner.nextInt();

            if (type != null && (type.toLowerCase().contains("magazine") || type.toLowerCase().contains("newspaper") || type.toLowerCase().contains("scientificPaper"))) {
                periodicalList[firstEmptyIndex(periodicalList)] = new Periodical(type, code);
                System.out.println("added successfully");

            } else {
                System.err.println("please enter correct periodical type ( magazine or newspaper or  scientificPaper) ");
            }

        }

        if (menuType == 4) {

            System.out.println("Please enter Borrower Id");
            int id = scanner.nextInt();

            System.out.println("Please enter book code");
            int code = scanner.nextInt();

            //check if borrower exists :

            int borrowerIndex = checkIfBorrowerExists(borrowerList, id);

            if (borrowerIndex == -1) {
                System.err.println("Borrower not exists");
                return;
            }


            //check if book exists :

            int bookIndex = checkIfBookExists(books, code);

            if (bookIndex == -1) {
                System.err.println("book not exists");
                return;
            }

            Book[] currentBook = new Book[borrowerList[borrowerIndex].getBooks().length + 1];

            System.arraycopy(borrowerList[borrowerIndex].getBooks(), 0, currentBook, 0, borrowerList[borrowerIndex].getBooks().length);
            currentBook[currentBook.length - 1] = books[bookIndex];

            borrowerList[borrowerIndex].setBooks(currentBook);


            books[bookIndex].setState(true);
            books[bookIndex].setBorrowingDate(LocalDateTime.now().toString());
            books[bookIndex].setBorrowBy(borrowerList[borrowerIndex].getId());
            System.out.println("added successfully");

        }


    }


    public static int checkIfBookExists(Book[] books, int code) {
        int bookIndex = -1;

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getCode() == code) {
                bookIndex = i;
                break;
            }
        }


        return bookIndex;
    }

    public static int checkIfPeriodicalExists(Periodical[] list, int code) {
        int index = -1;

        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getCode() == code) {
                index = i;
                break;
            }
        }


        return index;
    }

    public static int checkIfBorrowerExists(Borrower[] list, int id) {
        int borrowerIndex = -1;

        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getId() == id) {
                borrowerIndex = i;
                break;
            }
        }


        return borrowerIndex;
    }

    public static int firstEmptyIndex(Object[] arr) {
        int openArray = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                openArray = i;
                break;
            }
        }

        return openArray;
    }
}
