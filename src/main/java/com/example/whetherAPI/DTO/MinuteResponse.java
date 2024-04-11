package com.example.whetherAPI.DTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@FieldDefaults(level = AccessLevel.PUBLIC)
public class MinuteResponse {
    String cloudBase;
}
