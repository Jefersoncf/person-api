package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
//@NoArgsConstructor
public enum PhoneType {

    HOME( description: "Home"),
    MOBILE(description: "Mobile"),
    COMMERCIAL(description: "Cmmercial");

    private  final String description;
}
