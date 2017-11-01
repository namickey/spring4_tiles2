package demo.controller.shop;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RegistShopForm {

    @Size(max = 2)
    private String shopName;

}
