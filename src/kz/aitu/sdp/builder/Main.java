package kz.aitu.sdp.builder;

public class Main {
    public static void main(String[] args) {

        ReportDirector director = new ReportDirector();

        ReportBuilder academicBuilder = new AcademicReportBuilder();

        Report academicReport = director.constructStandardReport(
                academicBuilder,
                "Software Design Patterns",
                "Allazhar"
        );

        ReportBuilder businessBuilder = new BusinessReportBuilder();

        Report businessReport = director.constructStandardReport(
                businessBuilder,
                "Software Design Patterns",
                "Allazhar"
        );

        System.out.println("Academic Report:");
        System.out.println(academicReport);

        System.out.println("Business Report:");
        System.out.println(businessReport);
    }
}