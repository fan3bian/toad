package io.nio;

import io.netty.channel.ChannelFuture;
import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class TestReadFile {
    @Test
    public void test1() throws IOException {
        Path path = Paths.get("src/main/resources/log4j2.xml");
        Files.readAllLines(path).forEach(x -> System.out.println(x));

    }

    @Test
    public void test2() throws IOException, URISyntaxException {
        Path path = Paths.get(getClass().getClassLoader()
                .getResource("log4j2.xml").toURI());

        Stream<String> lines = Files.lines(path);
        String data = lines.collect(Collectors.joining("\n"));
        System.out.println(data);
        lines.close();
    }

    @Test
    public void testByChannel() throws IOException {
        String expected_value = "Hello, world!";
        String file = "src/test/resources/fileTest.txt";
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        FileChannel channel = randomAccessFile.getChannel();

        int bufferSize = 1024;
        if (bufferSize > channel.size()) {
            bufferSize = (int) channel.size();
        }
        ByteBuffer buff = ByteBuffer.allocate(bufferSize);
        channel.read(buff);
        buff.flip();

        assertEquals(expected_value, new String(buff.array()));
        channel.close();
        randomAccessFile.close();

    }

    @Test
    public void readFile() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("src/main/resources/log4j2.xml", "r");
        FileChannel channel = randomAccessFile.getChannel();
//        ChannelFuture channelFuture = new ChannelFuture();

    }

}
