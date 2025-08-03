package com.mi_posta.microservicio_backend.data.dto.impl;

import com.mi_posta.microservicio_backend.data.dto.AccountDao;
import com.mi_posta.microservicio_backend.data.dto.AccountListDto;
import com.mi_posta.microservicio_backend.data.dto.AccountListResulMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class AccountImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<AccountListDto> listActiveAccountsWithAccountType(){
        StringBuilder query = new StringBuilder();
        query.append("SELECT                                                                ");
        query.append("	ac_p.id_person,                                                     ");
        query.append("	ac_p.id_account,                                                    ");
        query.append("	ac.code,                                                            ");
        query.append("	ac.username,                                                        ");
        query.append("	ac.account_type as id_account_type,                                 ");
        query.append("  ac_tp.account_type as account_type                                  ");
        query.append("FROM account_person ac_p                                              ");
        query.append("LEFT JOIN account ac ON ac_p.id_account = ac.id                       ");
        query.append("LEFT JOIN account_type ac_tp ON ac_tp.id = ac.account_type            ");
        query.append("WHERE (ac.status = 1 or ac.status = 9);                               ");

        return jdbcTemplate.query(query.toString(), new AccountListResulMapper());
    }
}
