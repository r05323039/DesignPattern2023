package ian.Behavioral.Template.level2;

import java.util.Arrays;
import java.util.List;

class Client {
    public static void main(String[] args) {
        List<String> reportContent = Arrays.asList(
                "大家好",
                "這是模板設計模式",
                "希望對你有幫助"
        );

        DocumentGenerator htmlGenerator = new HTMLDocumentGenerator();
        System.out.println("Generating HTML Report...");
        htmlGenerator.generateReport("Template Pattern Report", reportContent);

        DocumentGenerator markdownGenerator = new MarkdownDocumentGenerator();
        System.out.println("\nGenerating Markdown Report...");
        markdownGenerator.generateReport("Template Pattern Report", reportContent);
    }
}
