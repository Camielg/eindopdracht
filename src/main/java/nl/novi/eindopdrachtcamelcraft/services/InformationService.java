package nl.novi.eindopdrachtcamelcraft.services;

import nl.novi.eindopdrachtcamelcraft.model.Information;
import nl.novi.eindopdrachtcamelcraft.repositories.InformationRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InformationService {

    private final InformationRepository informationRepository;

    public InformationService(InformationRepository informationRepository){
        this.informationRepository=informationRepository;
    }

    public Information addInfomation(Information information){
        List<Information> informations= new ArrayList<>();


        }
    }

}
