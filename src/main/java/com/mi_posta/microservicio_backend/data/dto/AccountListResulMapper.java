package com.mi_posta.microservicio_backend.data.dto;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountListResulMapper implements RowMapper<AccountListDto> {
    @Override
    public AccountListDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        return AccountListDto.builder()
                .idPerson(rs.getLong(1))
                .idAccount(rs.getLong(2))
                .code(rs.getString(3))
                .username(rs.getString(4))
                .idAccountType(rs.getInt(5))
                .accountType(rs.getString(6))
                .build();
    }
}
