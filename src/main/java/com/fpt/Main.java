/*
 * Decompiled with CFR 0.137.
 * 
 * Could not load the following classes:
 *  com.hdsoft.HDSSpringBoot_GlobalAppAPI_LongZen
 *  org.springframework.boot.SpringApplication
 *  org.springframework.boot.autoconfigure.SpringBootApplication
 *  org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
 */
package com.fpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, (String[])args);
    }
}

