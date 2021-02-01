package com.jimo;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * your comment
 *
 * @author jimo
 * @date 2021/2/1 10:58
 * @since 1.0.0
 */
public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        String xmlPath = args[0];
        parseConfig(xmlPath);
    }

    static void parseConfig(String xmlPath) throws ParserConfigurationException, SAXException, IOException {
        final DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

        final Document doc = builder.parse(Main.class.getResourceAsStream(xmlPath));

        final NodeList names = doc.getElementsByTagName("name");
        final NodeList values = doc.getElementsByTagName("value");
        for (int i = 0; i < names.getLength(); i++) {
            final String key = names.item(i).getTextContent().trim();
            final String value = values.item(i).getTextContent().trim();
            System.out.println(key + "=" + value);
        }
    }
}
