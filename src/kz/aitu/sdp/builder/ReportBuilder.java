package kz.aitu.sdp.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class ReportBuilder {

    private String title;
    private String author;
    private boolean tableOfContents;
    private String footer;
    private final List<String> sections = new ArrayList<>();
    private final ReportStyle style;

    protected ReportBuilder(
            ReportStyle style,
            boolean tableOfContents,
            String footer
    ) {
        this.style = style;
        this.tableOfContents = tableOfContents;
        this.footer = footer;
    }

    public ReportBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public ReportBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public ReportBuilder setTableOfContents(boolean tableOfContents) {
        this.tableOfContents = tableOfContents;
        return this;
    }

    public ReportBuilder setFooter(String footer) {
        this.footer = footer;
        return this;
    }

    public ReportBuilder addSection(String section) {
        if(section == null || section.isBlank()) {
            throw new IllegalArgumentException("Section must not be blank");
        }
        this.sections.add(section);
        return this;
    }

    private void validate() {
        if (title == null || title.isBlank()) {
            throw new IllegalStateException("Title must not be blank");
        }
        if (author == null || author.isBlank()) {
            throw new IllegalStateException("Author must not be blank");
        }
        if (footer == null || footer.isBlank()) {
            throw new IllegalStateException("Footer must not be blank");
        }
        if (sections.isEmpty()) {
            throw new IllegalStateException("Report must contain at least one section");
        }
    }

    public Report build() {
        validate();
        return new Report(
                title,
                author,
                style,
                tableOfContents,
                footer,
                sections
        );
    }
}