package com.mishri.ecommerceApp.dto;

import lombok.*;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryDTO {
    @NotNull
    private Long id;
    private String name;

}
