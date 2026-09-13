# SDP Assignment 1 — Builder Pattern

This project demonstrates the Builder design pattern using a `Report` product.

## Representations

### Academic Report
Built with `AcademicReportBuilder`.

Default configuration:
- Style: `ACADEMIC`
- Table of contents: enabled
- Footer: `Astana IT University`

### Business Report
Built with `BusinessReportBuilder`.

Default configuration:
- Style: `BUSINESS`
- Table of contents: disabled
- Footer: `Confidential`

## Usage

```java
ReportDirector director = new ReportDirector();

ReportBuilder academicBuilder = new AcademicReportBuilder();

Report academicReport = director.constructStandardReport(
        academicBuilder,
        "Software Design Patterns",
        "Allazhar"
);
```

To create a business representation, use BusinessReportBuilder instead.

Requirements
Java JDK 17
IntelliJ IDEA
Run

Open the project in IntelliJ IDEA and run Main.java.