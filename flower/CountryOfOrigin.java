package flower;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum CountryOfOrigin {
    UKRAINE("Ukraine"), SPAIN("Spain"), ITALY("Italy");

    private String country;
    CountryOfOrigin(String country){
        this.country = country;
    }
}
