package mobile.back.demo.search;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PhoneSearchRepo extends CrudRepository<MobileEntity,Long> {
    List<MobileEntity> findAllByNameContaining(String name);
}
