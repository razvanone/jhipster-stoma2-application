package com.razvanm.stoma2;

import com.razvanm.stoma2.Stoma2App;
import com.razvanm.stoma2.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { Stoma2App.class, TestSecurityConfiguration.class })
public @interface IntegrationTest {
}
