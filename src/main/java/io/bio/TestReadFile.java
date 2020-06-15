package io.bio;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.IOUtils;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;

public class TestReadFile {
    @Test
    public void inputStream() throws IOException {
        String filePath = "E:\\github\\go\\a.txt";
//        System.out.println(readFileInputStream(filePath));
//        System.out.println(readFileByReader(filePath));
        System.out.println(readFileByBufferReader(filePath));
    }

    @Test
    public void testBufferReader() throws IOException {

    }

    private String readFileInputStream(String filePath) throws IOException {
        StringBuilder sb = new StringBuilder();
        File file = new File(filePath);
        InputStream inputStream = new FileInputStream(file);
        int read;
        int count = 0;
        while ((read = inputStream.read()) != -1) {
            sb.append((char) read);//read a byte each time
            count++;
        }
        System.out.println(count);
        inputStream.close();
        IOUtils.closeQuietly(inputStream);
        return sb.toString();
    }

    private String readFileByReader(String filePath) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (Reader reader = new FileReader(filePath)) {
            int read;
            int count = 0;
            while ((read = reader.read()) != -1) {
                sb.append((char) read);//read a byte each time
                count++;
            }
            System.out.println(count);
        }
        return sb.toString();
    }

    private String readFileByBufferReader(String filePath) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (Reader reader = new FileReader(filePath); BufferedReader bufferedReader = new BufferedReader(reader)) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                sb.append(s);//read a byte each time
            }
        }
        return sb.toString();
    }

    private String readFilesByCommonIo(String filePath) throws IOException {
        File file = new File(filePath);
        return FileUtils.readFileToString(file, Charset.defaultCharset());
//        return FileUtils.readFileToString(file, "UTF-8");
    }
}
