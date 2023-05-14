package ru.zhuravlev.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zhuravlev.entity.ListOfVagon;

public interface ListOfVagonDAO extends JpaRepository<ListOfVagon, Long> {
}
