/*
 * Decompiled with CFR 0.137.
 * 
 * Could not load the following classes:
 *  com.hdsoft.HDSSpringBoot_GlobalAppAPI_LongZen
 *  com.hdsoft.ServletInitializer
 *  org.springframework.boot.builder.SpringApplicationBuilder
 *  org.springframework.boot.web.servlet.support.SpringBootServletInitializer
 */
package com.fpt;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.fpt.Main;

public class ServletInitializer
extends SpringBootServletInitializer {
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(new Class[]{Main.class});
    }
}

