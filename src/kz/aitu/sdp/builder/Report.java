package kz.aitu.sdp.builder;

import java.util.List;

public final class Report {

    private final String title;
    private final String author;
    private final ReportStyle style;
    private final boolean tableOfContents;
    private final String footer;
    private final List<String> sections;

        Report(
            String title,
            String author,
            ReportStyle style,
            boolean tableOfContents,
            String footer,
            List<String> sections
    ) {
        this.title = title;
        this.author = author;
        this.style = style;
        this.tableOfContents = tableOfContents;
        this.footer = footer;
        this.sections = List.copyOf(sections);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public ReportStyle getStyle() {
        return style;
    }

    public boolean hasTableOfContents() {
        return tableOfContents;
    }

    public String getFooter() {
        return footer;
    }

    public List<String> getSections() {
        return sections;
    }

    @Override
    public String toString() {
        return """
            Report
            Title: %s
            Author: %s
            Style: %s
            Table of contents: %s
            Footer: %s
            Sections: %s
            """.formatted(
                title,
                author,
                style,
                tableOfContents ? "Yes" : "No",
                footer,
                String.join(", ", sections)
        );
    }
}
