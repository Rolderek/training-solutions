package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();

    public List<Mail> addMail(Mail mail) {
        mails.add(mail);
        return mails;
    }

    public List<Mail> getMails() {
        return mails;
    }

    private List<Mail> startWithFrom(String search) {
        List<Mail> resultList = new ArrayList<>();
        String s = search.substring(5);
        for (Mail m : mails) {
            if (m.getFrom().getEmail().contains(s) || m.getFrom().getName().contains(s)) {
                resultList.add(m);
            }
        }
        return resultList;
    }

    private List<Mail> startWithTo(String search) {
        List<Mail> resultList = new ArrayList<>();
        String s = search.substring(3);
        for (Mail m : mails) {
            for (Contact c : m.getTo()) {
                if (c.getName().contains(s) || c.getEmail().contains(s)) {
                    resultList.add(m);
                }
            }
        }
        return resultList;
    }

    private List<Mail> searchMessageAndSubject(String search) {
        List<Mail> resultList = new ArrayList<>();
        for (Mail m: mails) {
            if (m.getSubject().contains(search) || m.getMessage().contains(search)) {
                resultList.add(m);
            }
        }
        return resultList;
    }

    public List<Mail> findByCriteria(String search) {
        List<Mail> searchList = new ArrayList<>();
        if (search.startsWith("from:")) {
            searchList = startWithFrom(search);
        }
        if(search.startsWith("to:")) {
            searchList = startWithTo(search);
        }
        if (searchList.size() <= 0) {
            searchList = searchMessageAndSubject(search);
        }
        return searchList;
}

    public static void main(String[] args) {
        MailBox mailBox = new MailBox();
        Mail mail1 = new Mail(new Contact("John Doe", "johndoe@example.com"),
                List.of(new Contact("Jane Doe", "janedoe@example.com"), new Contact("Jack Doe", "jackdoe@example.com")),
                "Doe Family",
                "Hi All!");

        Mail mail2 = new Mail(new Contact("John Doe", "johndoe@example.com"),
                List.of(new Contact("John Smith", "johnsmith@example.com")),
                "Johnes",
                "Hi!");

        Mail mail3 = new Mail(new Contact("John Doe", "johndoe@example.com"),
                List.of(new Contact("Jane Smith", "janesmith@example.com")),
                "John - Jane",
                "Hello!");

        Mail mail4 = new Mail(new Contact("Jane Doe", "janedoe@example.com"),
                List.of(new Contact("John Doe", "johndoe@example.com"), new Contact("Jack Doe", "jackdoe@example.com")),
                "RE: Doe Family",
                "Rerere!");

        mailBox.addMail(mail1);
        mailBox.addMail(mail2);
        mailBox.addMail(mail3);
        mailBox.addMail(mail4);

        System.out.println(mailBox.findByCriteria("Rerere").toString());
    }


    /*

    private List<Mail> mails = new ArrayList<>();

    public List<Mail> addMail(Mail mail) {
        mails.add(mail);
        return mails;
    }

    public List<Mail> getMails() {
        return mails;
    }

    public String cuttedSearch(String search) {
        String cutted = "";
        if (search.startsWith("to:")) {
            cutted = search.substring(3);
        }
        if (search.startsWith("from:")) {
            cutted = search.substring(5);
        }
        return cutted;
    }

    public boolean validator(Mail m, String str) {
        for (Contact c : m.getTo()) {
            if (c.getName().equals(str) || c.getEmail().equals(str)) {
                return true;
            }
        }
        return false;
    }


    public List<Mail> findByCriteria(String search) {
        List<Mail> resultList = new ArrayList<>();
        String s = cuttedSearch(search);

        for (Mail mail : mails) {
            if (search.startsWith("from:")) {
                if (mail.getFrom().getEmail().equals(s) || mail.getFrom().getName().equals(s)) {
                    resultList.add(mail);
                }
            } else if (search.startsWith("to:")) {
                if (validator(mail, s)) {
                    resultList.add(mail);
                }
            } else if (mail.getSubject().contains(search) || mail.getMessage().contains(search)) {
                resultList.add(mail);
            }
        }
        return resultList;
    }

    /* túl lassú és így nem végzel Laci mit csinálsz!?
    public List<Mail> findFrom(String search) {
        for (int i = 0; i < mails.size(); i++) {
            if (!mails.get(i).getFrom().toString().contains(search)) {
                mails.remove(mails.get(i));
                return mails;
            }
        }
        return mails;
    }

    public List<Mail> findByCriteria(String search) {

        if (search.contains("from:")) {
            findFrom(search);
        }
        if (search.contains("to:")) {
            for (int i = 0; i < mails.size(); i++) {
                for (int j = 0; j < mails.get(i).getTo().size(); j++) {
                    if (!mails.get(i).getTo().get(j).getEmail().contains(search)) {
                        mails.remove(mails.get(i));
                        return mails;
                    }
                }
            }
        }
        return mails;
    }
 */


}


