package com.kodilla.spring.reader;

import java.time.LocalDate;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class IfDayIsOddCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return LocalDate.now().getDayOfMonth() % 2 != 0;
    }
}
