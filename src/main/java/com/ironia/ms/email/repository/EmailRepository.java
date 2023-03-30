package com.ironia.ms.email.repository;

import com.ironia.ms.email.model.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
