package com.example.kafkademo.dto;

import lombok.Value;

/**
 * DTO for {@link com.example.kafkademo.entity.Data}
 */
@Value
public class DataDto {
    String description;
    String title;
}