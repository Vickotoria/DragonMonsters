package Misc;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * Class for reading XML files
 */
public class XmlLoader {
    private static XmlLoader xmlLoader;
    private DocumentBuilder builder;

    private XmlLoader(){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            builder = null;
        }
    }

    public static XmlLoader getInstance() {
        if (xmlLoader == null) {
            xmlLoader = new XmlLoader();
        }
        return xmlLoader;
    }
}
