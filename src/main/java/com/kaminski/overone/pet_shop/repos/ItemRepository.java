package com.kaminski.overone.pet_shop.repos;

import com.kaminski.overone.pet_shop.models.ItemModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<ItemModel, Long> {
}
