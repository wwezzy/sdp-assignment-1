package kz.aitu.sdp.builder;

public final class ReportDirector {
    public Report constructStandardReport(
            ReportBuilder builder,
            String title,
            String author
    ) {
        builder
                .setTitle(title)
                .setAuthor(author)
                .addSection("Introduction")
                .addSection("Main")
                .addSection("Conclusion");
        return builder.build();
    }
}

