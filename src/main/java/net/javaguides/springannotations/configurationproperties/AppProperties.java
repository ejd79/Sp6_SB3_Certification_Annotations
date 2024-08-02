package net.javaguides.springannotations.configurationproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@ConfigurationProperties(prefix = "app")
@Component
public class AppProperties {

    private String name;
    private String description;
    private String uploadDir;

    // the field MUST to be "security" because in application.properties field's name: ex app."security".username
    private Security security = new Security();


    public static class Security {

        // the fields MUST to be the same as the ones in application.properties file
        // ex. app.security.username=javaguides
        private String username;
        private String password;
        List<String> roles = new ArrayList<>();
        private boolean enabled;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public List<String> getRoles() {
            return roles;
        }

        public void setRoles(List<String> roles) {
            this.roles = roles;
        }

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }

    public Security     getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }
}
