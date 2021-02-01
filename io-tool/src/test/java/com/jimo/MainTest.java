package com.jimo;


import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class MainTest {

    @Test
    public void parse() throws IOException, SAXException, ParserConfigurationException {
        Main.parseConfig("/test.xml");
    }
}