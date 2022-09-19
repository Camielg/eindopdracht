package nl.novi.eindopdrachtcamelcraft.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "information")
public class Information {

    @Id
    private Long id;
    private String mainInformation;
    private LocalDate date;
    private String place;
    private String additionalInformation;
    private String requirements;
    private String materialsProvided;




}
