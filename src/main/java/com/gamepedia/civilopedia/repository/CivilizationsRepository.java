package com.gamepedia.civilopedia.repository;

import com.gamepedia.civilopedia.model.CivilizationGlobal;
import org.springframework.data.repository.CrudRepository;

public interface CivilizationsRepository extends CrudRepository<CivilizationGlobal, Long> {

}
