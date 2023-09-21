package com.brianeno.features;

import java.nio.file.Files;
import java.nio.file.Path;

/*
  Shows new methods in Files class
*/
public class NewFileMethodsFeature {

    public void runFeature() throws Exception {

        Path filePath = Files.writeString(Files.createTempFile("sample", ".txt"), "This is our text");
        String fileContent = Files.readString(filePath);
        System.out.println(fileContent);
    }
}

