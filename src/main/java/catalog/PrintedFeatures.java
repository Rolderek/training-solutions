package catalog;

import java.util.List;

public class PrintedFeatures implements Feature {

    private String title;
    private int numberOfPages;
    private List<String> author;



    public PrintedFeatures(String title, int numberOfPages, List<String> author) {
        if (Validator.isBlank(title)) {
            throw new IllegalArgumentException("A title üres!");
        }
        this.title = title;
        if (numberOfPages < 1 ) {
            throw new IllegalArgumentException("Üres a title!");
        }
        this.numberOfPages = numberOfPages;
        if (Validator.isEmpty(author)) {
            throw new IllegalArgumentException("Érvénytlen oldalszám!");
        }
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<String > getContributors() {
        return author;
    }

}
