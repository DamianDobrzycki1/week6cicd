package ie.atu.week6cicd;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {

    @Min(value =1, message="enter a valid id, please")
    private int id;
    @Min(value =1, message="Nothing will be free, add a price, DONT GO NEGATIVE IT WONT WORK")
    private double price;
    @NotBlank(message = "No name, please enter a name")
    private String name;

}
