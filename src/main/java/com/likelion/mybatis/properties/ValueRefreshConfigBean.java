package com.likelion.mybatis.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class ValueRefreshConfigBean {
    private String coachName;

    public ValueRefreshConfigBean(@Value("${likelion.coach.name}") String coachName) {
        this.coachName = coachName;
    }
}
