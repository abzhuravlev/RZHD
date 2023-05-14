package ru.zhuravlev.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zhuravlev.entity.Depos;

public interface DeposDAO extends JpaRepository<Depos, Long> {
}
