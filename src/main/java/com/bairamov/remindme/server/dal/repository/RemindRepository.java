package com.bairamov.remindme.server.dal.repository;

import com.bairamov.remindme.server.dal.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepository extends JpaRepository<Remind, Long> {
}
