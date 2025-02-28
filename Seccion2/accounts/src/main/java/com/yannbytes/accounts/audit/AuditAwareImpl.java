package com.yannbytes.accounts.audit;


import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

//This name could be custom name
@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {
    //Cuando implementamos AuditorAware, debemos implementar el metodo getCurrentAuditor
    /**
     * Returns the current auditor of the application.
     *
     * @return the current auditor.
     */
    @Override
    public Optional<String> getCurrentAuditor() {
        //This wll be a hardcoded value until use sessions
        return Optional.of("ACCOUNTS_MS");
    }

}
