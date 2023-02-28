package DemoApplicationTests.demo.service;

import DemoApplicationTests.demo.exeption.ItemNotFoundException;
import DemoApplicationTests.demo.model.item;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;

public class ItemServiceImpl implements ItemService {


    @Override
    public item addItem(item Item) {
        return null;
    }

    @Override
    public item getItemById(Integer id) throws ItemNotFoundException {
        return null;
    }

    @Override
    public List<item> getItems() {
        return null;
    }

    @Override
    public item updateItem(Integer itemId, item Item) throws ItemNotFoundException {
        return null;
    }

    @Override
    public void deleteItem(Integer itemId) throws ItemNotFoundException {

    }
}
