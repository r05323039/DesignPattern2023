package ian.Behavioral.Template.level2;

import java.util.List;

abstract class DocumentGenerator {
    public final void generateReport(String title, List<String> content) {
        createHeader(title);
        for (String line : content) {
            appendContent(line);
        }
        finalizeDocument();
        System.out.println(getOutput());
    }

    private void createHeader(String title) {
        System.out.println("Creating document header for: " + title);
    }

    private void finalizeDocument() {
        System.out.println("Finalizing document format.");
    }

    protected abstract void appendContent(String content);

    protected abstract String getOutput();
}
