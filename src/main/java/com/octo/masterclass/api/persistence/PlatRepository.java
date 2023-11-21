package com.octo.masterclass.api.persistence;

import com.octo.masterclass.api.persistence.Plat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatRepository extends CrudRepository <Plat, Long>{
}
