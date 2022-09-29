package com.zerobase.wifi.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
class Loc{
    private String latData;
    private String lntData;
    private LocalDateTime time;
}
