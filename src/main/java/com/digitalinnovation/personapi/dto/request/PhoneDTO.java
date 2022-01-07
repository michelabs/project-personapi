package com.digitalinnovation.personapi.dto.request;

import com.digitalinnovation.personapi.enums.phoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {


    private Long id;

    @Enumerated(EnumType.STRING)
    private phoneType type;

    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;

}