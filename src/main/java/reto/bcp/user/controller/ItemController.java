package reto.bcp.user.controller;


import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reto.bcp.user.model.ResponseDto;
import reto.bcp.user.service.ItemService;


@RestController
@RequestMapping("api/v1/")
@Api(tags = { "servicio de cambio de moneda" })
public class ItemController {

    @Autowired
    private ItemService itemService;

    @ApiOperation(value = "obtener rating")
    @GetMapping("titles/{rating}")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Ok", response = ResponseDto.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Error en el servidor", response = ResponseDto.class) })
    public Single<ResponseEntity<ResponseDto>> getTitles(
            @PathVariable Double rating ) {
        return this.itemService.getTitles(rating).subscribeOn(Schedulers.io())
                .map(ResponseEntity::ok);
    }

}
