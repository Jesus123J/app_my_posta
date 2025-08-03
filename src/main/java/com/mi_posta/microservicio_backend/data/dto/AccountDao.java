package com.mi_posta.microservicio_backend.data.dto;

import java.util.List;

public interface AccountDao {
    List<AccountListDto> listActiveAccountsWithAccountType();
}
