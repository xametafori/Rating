package reto.bcp.user.model;

import lombok.Data;

@Data
public class ResponseDto {

    private int codigo;
    private String mensaje;
    private Object data;

    public void OkData(Object data){
        this.codigo = 0;
        this.mensaje = "OK";
        this.data = data;
    }
}
