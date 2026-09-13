package kz.aitu.sdp.builder;

public final class BusinessReportBuilder extends ReportBuilder {

    public BusinessReportBuilder() {
        super(
                ReportStyle.BUSINESS,
                false,
                "Confidential"
        );
    }
}