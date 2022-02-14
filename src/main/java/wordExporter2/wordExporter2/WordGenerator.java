package wordExporter2.wordExporter2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class WordGenerator {
    public List<Object> getLines(File fileName) throws Exception {
        ReadFile rf = new ReadFile();
        List<Object> lines = rf.readLines(fileName);
        return lines;
    }

    //Create Word
    public void createWord(List<Object> vkLines) throws IOException {
        if (!Paths.get("./generated").toFile().exists()) Files.createDirectories(Paths.get("./generated"));
        for (Object line : vkLines) {
            XWPFDocument document = new XWPFDocument();
            FileOutputStream out = new FileOutputStream("generated/" + "createdWord" + "_" + line + ".docx");
            XWPFParagraph paragraph = document.createParagraph();
            XWPFRun run = paragraph.createRun();
            String line1 = "-------------------------Line 1-------------------------\n";
            String line2 = "-------------------------Line 2-------------------------\n";
            String line3 = "-------------------------Line 3-------------------------\n";
            run.setText(line1+line2+line3);
            document.write(out);
            out.close();
            System.out.println("createdWord" + "_" + line + ".docx" + " written successfully");
        }
    }
}
