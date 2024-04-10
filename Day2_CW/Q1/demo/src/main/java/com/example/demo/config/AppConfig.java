package com.example.demo.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
    @Value("${app.name}")
    private String appName;
    
    @Value("${app.version}")
    private String appVersion;

    public String getAppName() {
        return appName;
    }
    public String getAppVersion() {
        return appVersion;
    }
    

}
