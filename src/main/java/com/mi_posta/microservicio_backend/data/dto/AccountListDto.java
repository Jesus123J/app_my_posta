package com.mi_posta.microservicio_backend.data.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountListDto {

    private Long idPerson;
    private Long idAccount;
    private String code;
    private String username;
    private Integer idAccountType;
    private String accountType;

}
