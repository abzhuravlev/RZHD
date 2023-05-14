package ru.zhuravlev.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zhuravlev.entity.StationModel;

public interface StationModelDAO extends JpaRepository<StationModel, Long> {
}
