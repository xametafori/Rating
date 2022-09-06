package reto.bcp.user.service;

import io.reactivex.Single;
import reto.bcp.user.model.ResponseDto;

import java.util.List;

public interface ItemService {
    Single<ResponseDto> getTitles(Double rating);

}
