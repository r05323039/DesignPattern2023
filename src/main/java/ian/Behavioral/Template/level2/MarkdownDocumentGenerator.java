package ian.Behavioral.Template.level2;

class MarkdownDocumentGenerator extends DocumentGenerator {
    private StringBuilder markdownContent = new StringBuilder();

    @Override
    protected void appendContent(String content) {
        markdownContent.append(content).append("\n\n");
    }

    @Override
    protected String getOutput() {
        return markdownContent.toString();
    }
}
