package com.lovableclone.backend.repository;

import com.lovableclone.backend.entity.UsageLog;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.time.LocalDate;
import java.util.Optional;

public interface UsageLogRepository extends JpaRepository<UsageLog, Long> {
    Optional<UsageLog> findByUserIdAndDate(Long userId, LocalDate today);
}
