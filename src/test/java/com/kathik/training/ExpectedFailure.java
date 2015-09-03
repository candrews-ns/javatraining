package com.kathik.training;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import java.lang.annotation.*;

public class ExpectedFailure implements TestRule {

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public @interface Optional {

        /**
         * Specify a Throwable, to cause a test method to succeed even if an exception
         * of the specified class is thrown by the method.
         */
        Class<? extends Throwable> exception();
    }

    @Override
    public Statement apply(final Statement base, final Description description) {
        return statement(base, description);
    }

    private Statement statement(final Statement base, final Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                try {
                    base.evaluate();
                } catch (Throwable e) {
                    // check for certain exception types
                    Optional anno = description.getAnnotation(Optional.class);
                    if (anno != null && anno.exception().equals(e.getClass())) {
                        // ok
                    } else {
                        throw e;
                    }
                }
            }
        };
    }
}