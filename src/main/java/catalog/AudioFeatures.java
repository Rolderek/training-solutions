package catalog;

import interfacemethods.Audited;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

    private final List<String> composer;
    private final int length;
    private final List<String> performers;
    private final String title;

    public AudioFeatures(String title, int length, List<String> performers) {
        this.title = title;
        this.length = length;
        this.performers = performers;
        this.composer = null;
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        if (Validator.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
        this.title = title;
        if (length < 1 ) {
            throw new IllegalArgumentException("Non valid length");
        }
        this.length = length;
        if (Validator.isEmpty(performers)) {
            throw new IllegalArgumentException("Empty title");
        }
        this.performers = performers;
        this.composer = composer;
    }


    @Override
    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        if (composer != null) {
            contributors.addAll(composer);
        }
        contributors.addAll(performers);
        return contributors;
    }


    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }


}
