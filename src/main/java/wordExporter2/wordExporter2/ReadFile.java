package wordExporter2.wordExporter2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ReadFile {
    public List<Object> readLines(File filename) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        List<Object> lines = bufferedReader.lines()
            .filter(Objects::nonNull)
            .collect(Collectors.toList());
        bufferedReader.close();
        return lines;
    }
}
