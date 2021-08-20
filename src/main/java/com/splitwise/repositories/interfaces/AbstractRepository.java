package com.splitwise.repositories.interfaces;

import java.util.List;
import java.util.Optional;




public interface AbstractRepository <Entity>{
    Optional<Entity> save(Entity entity);

    void delete(Entity entity);
    List<Entity> findById();
}
