package clone.issuetracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Issue {

    private String name;
    private LocalDateTime time;
    private Status status;
    private List<Comment> comments = new ArrayList<>();

    public Issue(String name, LocalDateTime time, Status status) {
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Status getStatus() {
        return status;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public Issue (Issue another, CopyMode copyMode) {
        name = another.name;
        time = another.time;
        status = another.status;
        if (copyMode.equals(CopyMode.WITH_COMMENTS)) {
            List<Comment> list = new ArrayList<>();
            for (Comment comment: another.comments) {
                list.add(new Comment(comment));
            }
            comments = list;
        }

    }
}
