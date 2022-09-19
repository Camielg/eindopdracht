package nl.novi.eindopdrachtcamelcraft.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)

public class InformationDto {
    private Long id;
@NotBlank
private String mainInformation;
    private LocalDate date;
    private String place;
    private String additionalInformation;
    private String requirements;
    private String materialsProvided;
}
