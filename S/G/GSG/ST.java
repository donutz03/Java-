// // <dependency>
// //     <groupId>org.awaitility</groupId>
// //     <artifactId>awaitility</artifactId>
// //     <version>3.1.2</version>
// //     <scope>test</scope>
// // </dependency>

// <?xml version="1.0" encoding="UTF-8"?>
// <project xmlns="http://maven.apache.org/POM/4.0.0"
// xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
// https://maven.apache.org/xsd/maven-4.0.0.xsd>
//         <modelVersion>4.0.0</modelVersion>
//         <parent>
//                 <groupId>org.springframework.boot</groupId>
//                 <artifactId>spring-boot-starter-parent</artifactId>
//                 <version>3.1.0</version>
//                 <relativePath/>
//         </parent>
//         <groupId>com.example</groupId>
//         <artifactId>scheduling-tasks-complete</artifactId>
//         <version>0.0.1-SNAPSHOT</version>
//         <name>scheduling-tasks-complete</name>
//         <description>Demo project for Spring Boot</description>

//         <properties>
//                 <java.version>17</java.version>
//         </properties>

//         <dependencies>
//                 <dependency>
//                         <groupId>org.springframework.boot</groupId>
//                         <artifactId>spring-boot-starter</artifactId>
//                 </dependency>
//                 <dependency>
//                         <groupId>org.awaitility</groupId>
//                         <artifactId>awaitility</artifactId>
//                         <version>4.2.0</version>
//                         <scope>test</scope>
//                 </dependency>

//                 <dependency>
//                         <groupId>org.springframework.boot</groupId>
//                         <artifactId>spring-boot-starter-test</artifactId>
//                         <scope>test</scope>
//                 </dependency>
//             </dependencies>
//         <build>
//                 <plugins>
//                         <plugin>
//                                 <groupId>org.springframework.boot</groupId>
//                                 <artifactId>spring-boot-maven-plugin</artifactId>
//                         </plugin>
//                 </plugins>
        
// </project>

// testImplementation 'org.awaitility:awaitility:3.1.2'

// plugins {
//         id ;org.springframework.boot' version '3.1.0'
//         id 'io.spring.dependency-management' version '1.1.0'
//         id 'java'
// }

// group = 'com.example'
// version = '0.0.1-SNAPSHOT'
// sourceCompatibility = '17'

// repositories {
//         mavenCentral()
// }

// dependencies {
//         implementation 'org.springframework.boot:spring-boot-starter'
//         testImplementation 'org.awaitility:awaitility:4.2.0'
//         testImplementation('org.springframework.boot:spring-boot-starter-test')
// }

// test {
//         useJUnitPlatform()
// }


package com.example.schedulingtasks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
        
        private static final Logger log = 
        LoggerFactory.getLogger(ScheduledTasks.class);

        private static final SimpleDateFormat dateFormat = new SimpleDateFOrmat("HH:mm:ss");

        @Scheduled(fixedRate = 5000)
        public void reportCurrentTime() {
                log.info("The time is now{}", dateFormat.format(new Date()));
        }



}


package com.example.schedulingtasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableSchedulingpublic class SchedulingTasksApplication {

        public static void main(String[] args) {
                SpringApplication.run(SchedulingTasksApplication.class);
        }
}