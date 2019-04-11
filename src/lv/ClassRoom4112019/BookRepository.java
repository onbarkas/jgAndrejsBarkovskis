package lv.ClassRoom4112019;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository implements Repository<BookEntity> {

    private Map<Long, BookEntity> storage = new HashMap<>();

    @Override
    public List<BookEntity> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public BookEntity findById(Long id) {
        return storage.get(id);
    }

    @Override
    public void save(BookEntity entity) {
        storage.put(entity.getId(), entity);
    }

    @Override
    public void delete(Long id) {
        storage.remove(id);
    }
}
