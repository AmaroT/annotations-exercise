public class Main {
    private static Object lastName;
    private static Object firstName;

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Author author = new Author("Sandi", "Metz");
        author.addBook("Practical Object-Oriented Design in Ruby");
        author.addBook("99 Bottles of OOP");
        for (String book: author.getBooks()) {
            System.out.println(book);
        }

    }
    public static <lastName, firstName> Object fullName(lastName, firstName) {
        return String.format("%s, %s", lastName, firstName);

    }
}
