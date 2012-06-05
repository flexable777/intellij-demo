package demo.intellij.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

    public static void main(String... args) throws IOException {
        Properties properties = new Properties();
        InputStream is = null;
        try {
            is = ReadProperties.class.getResourceAsStream("/test.properties");
            properties.load(is);
        } finally {
            if (is != null) {
                is.close();
            }
        }

        System.out.println(properties.get("test"));


    }
}
