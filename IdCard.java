public class IdCard {

    String name;
    int booksIssued;

    // Constructor
    public IdCard(String name, int booksIssued) {

        this.name = name;
        this.booksIssued = booksIssued;
    }

    public static void main(String[] args) {

        IdCard ravi =
                new IdCard("Ravi", 0);

        // Reference copy
        IdCard duplicate = ravi;

        duplicate.booksIssued = 3;

        // Separate object
        IdCard separate =
                new IdCard("Ravi", 3);

        System.out.println(
            "Ravi's booksIssued: " +
            ravi.booksIssued
        );

        System.out.println(
            "duplicate == ravi: " +
            (duplicate == ravi)
        );

        System.out.println(
            "separate == ravi: " +
            (separate == ravi)
        );
    }
}