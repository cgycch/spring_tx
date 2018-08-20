package com.cch.spring_tx;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        StringUtils.isNotBlank("123");
        FileUtils.writeStringToFile(new File("C:/hello.txt"), "data", "utf-8");
    }
}
