package catalog;

public class SearchCriteria {

    String title;
    String contributor;

    private SearchCriteria(String title, String contributor) {
        this.contributor = contributor;
        this.title = title;
    }

    public static SearchCriteria createByBoth(String title, String contributor) {
        if (Validator.isBlank(contributor)) {
            throw new IllegalArgumentException("Üres nem lehet a contributor!");
        }
        if (Validator.isBlank(title)) {
            throw new IllegalArgumentException("Üres nem lehet a title!");
        }
        return new SearchCriteria(title, contributor);
    }
    public static SearchCriteria createByTitle(String title) {
        if (Validator.isBlank(title)) {
            throw new IllegalArgumentException("Üres paraméter nem lehet!");
        }
        return new SearchCriteria(title, "");
    }

    public static SearchCriteria createByContributor(String contributor) {
        if (Validator.isBlank(contributor)) {
            throw new IllegalArgumentException("Üres paraméter nem lehet!");
        }
        return new SearchCriteria("", contributor);
    }

    public boolean hasContributor() {
        return !Validator.isBlank(contributor);
    }

    public boolean hasTitle() {
        return !Validator.isBlank(title);
    }

    public String getTitle() {
        return title;
    }

    public String getContributor() {
        return contributor;
    }


}
