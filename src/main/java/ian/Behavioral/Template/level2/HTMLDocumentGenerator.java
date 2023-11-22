package ian.Behavioral.Template.level2;

class HTMLDocumentGenerator extends DocumentGenerator {
    private StringBuilder htmlContent = new StringBuilder();

    @Override
    protected void appendContent(String content) {
        htmlContent.append("<p>").append(content).append("</p>\n");
    }

    @Override
    protected String getOutput() {
        return "<html>\n<head>\n<title>Report</title>\n</head>\n<body>\n" +
                htmlContent.toString() +
                "</body>\n</html>";
    }
}

