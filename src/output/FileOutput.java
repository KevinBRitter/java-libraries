package output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutput{
    /**
     * writeOutput method writes to files from string input.
     * @param fileName
     * @param content
     * @throws IOException
     */
    public void writeOutput(String fileName, String content) throws IOException
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(content);
        writer.close();
    }
}