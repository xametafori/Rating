package reto.bcp.user.service;

import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reto.bcp.user.dao.ItemRepository;
import reto.bcp.user.model.Item;
import reto.bcp.user.model.ResponseDto;
import java.util.List;


@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    ItemRepository itemRepository;

    @Override
    public Single<ResponseDto> getTitles(Double rating) {

        return Single.create(subscriber ->{
            subscriber.onSuccess(obteneTitle(rating));
        });
    }
    private ResponseDto obteneTitle(Double rating){
        List<Item> lista = itemRepository.findByItems_RatingGreaterThan(rating);
        ResponseDto responseDto = new ResponseDto();
        responseDto.setData(lista.stream().map(Item::getTitle));
        return responseDto;
    }
}
