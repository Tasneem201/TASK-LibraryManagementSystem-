// EBook.java
public class EBook extends Book {
    private double fileSize;

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    public void borrow() {
        System.out.println(getTitle() + " is available for download. File size: " + fileSize + "MB.");
    }

    public double getFileSize() {
        return fileSize;
    }
}

