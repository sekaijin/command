package fr.sekaijin.command.property;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util {

    private static final String PROP_FILE = "sample.properties";
    protected static final Logger log = LoggerFactory.getLogger(Util.class);
    private static Util instance;
    Properties p = new Properties();

    public static Properties list() throws Exception {
        return util().p;
    }

    public static void set(String name, String value) {
        util().setProperty(name, value).save();
    }

    public static void unset(String name) {
        util().remove(name).save();
    }

    private Util setProperty(String name, String value) {
        p.setProperty(name, value);
        return this;
    }

    private Util() {
        try (InputStream is = Files.newInputStream(Paths.get(PROP_FILE));) {
            p.load(is);
        } catch (Exception e) {
            log.error("read error", e);
        }
    }

    private static Util util() {
        if (null == instance) {
            instance = new Util();
        }
        return instance;
    }

    private Util remove(String name) {
        p.remove(name);
        return this;
    }

    private void save() {
        try (OutputStream os = Files.newOutputStream(Paths.get(PROP_FILE));) {
            p.store(os, "");
            os.flush();
            return;
        } catch (Exception e) {
            log.error("write error", e);
        }
    }

}
