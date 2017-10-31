package demo.controller.shop;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegistForm {

    public RegistForm(){
        System.out.println("new RegistForm class.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Size(max = 2)
    private String name;

}
