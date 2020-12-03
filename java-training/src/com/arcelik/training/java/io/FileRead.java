package com.arcelik.training.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileRead {

    public static void main(final String[] args) throws Exception {
        File file = new File("app.properties");
        byte[] bytes = new byte[4 * 1024];
        FileInputStream fileInputStreamLoc = new FileInputStream(file);
        BufferedInputStream inputStreamLoc = new BufferedInputStream(fileInputStreamLoc);
        inputStreamLoc.read(bytes);

        FileReader fileReaderLoc = new FileReader(file);
        BufferedReader bufferedReaderLoc = new BufferedReader(fileReaderLoc);
        String readLineLoc = bufferedReaderLoc.readLine();

        FileChannel channelLoc = fileInputStreamLoc.getChannel();
        ByteBuffer bufferLoc = ByteBuffer.allocate(4 * 1024);
        ByteBuffer bufferLoc2 = ByteBuffer.allocateDirect(16 * 4 * 1024);
        int readLoc = channelLoc.read(bufferLoc2);

        Path path = Paths.get("./app.properties");
        Path path2 = Paths.get("alt1",
                               "alt2",
                               "app.properties");

        Path absolutePathLoc = path.toAbsolutePath();

        List<String> readAllLinesLoc = Files.readAllLines(path);

    }
}
