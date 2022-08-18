package com.gamepedia.civilopedia.repository;

import com.gamepedia.civilopedia.model.Civilization;
import com.gamepedia.civilopedia.model.UniqueUnit;
import org.springframework.data.repository.CrudRepository;

public interface UnitRepository extends CrudRepository<UniqueUnit, Long> {

}
