package wordExporter2.wordExporter2;

import java.io.File;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception {
        WordGenerator wg = new WordGenerator();

        List<Object> filesName = wg.getLines(
            new File((Objects.requireNonNull(Main.class.getClassLoader().getResource("filesName.txt")).toURI())));

        wg.createWord(filesName);
    }
}
