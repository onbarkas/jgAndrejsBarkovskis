package lv.ClassRoom4112019;

import java.util.List;

public interface Repository<T> {

    List<T> findAll();

    T findById(Long id);

    void save(T entity);

    void delete(Long id);

}
