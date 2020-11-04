package hh.swd20.AmusementParks.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AttractionRepository extends CrudRepository<Attraction, Long> {
	
	//public List<Attraction> findByParkId(Long parkId);

}
