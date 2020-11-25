package hh.swd20.AmusementParks.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ParkRepository extends CrudRepository<Park, Long> {
	
	//public List<Attraction> findAttractionsByParkId(Long parkId);

}
