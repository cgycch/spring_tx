package com.cch.spring_tx;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

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
        
        ObjectMapper mapper = new ObjectMapper();
        String userStr =  mapper.writeValueAsString(new User());
        System.out.println(userStr);
        
        List<User> userList = mapper.readValue("json", new TypeReference<List<User>>() {});
        for (User user : userList) {
			System.out.println(user);
		}
    }
}
