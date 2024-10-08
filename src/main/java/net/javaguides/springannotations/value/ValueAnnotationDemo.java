package net.javaguides.springannotations.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationDemo {

    @Value("Default Name")
    private String defaultName;

    @Value("${mail.host}")
    private String host;

    @Value("${mail.email}")
    private String email;

    @Value("${mail.password}")
    private String password;

    @Value("${java.home}")
    private String java_home;

    @Value("${HOME}")
    private String homeDir;


    public String getDefaultName() {
        return defaultName;
    }

    public String getHost() {
        return host;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getJava_home() {
        return java_home;
    }

    public String getHomeDir() {
        return homeDir;
    }
}
