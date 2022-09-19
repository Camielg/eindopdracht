package nl.novi.eindopdrachtcamelcraft.mappers;

import nl.novi.eindopdrachtcamelcraft.dto.InformationDto;

import java.util.List;
import nl.novi.eindopdrachtcamelcraft.model.Information;

public class informationMapper {

   /* public static InformationDto toDto(Information infomation) {
        List<InformationDto> authors = infomation.getInformation()
                .stream()
                .map(InformationMappers::toDto)
                .toList();
        return InformationDto.builder()
                .title(infomation.getTitle())
                .subTitle(infomation.getSubTitle())
                .id(infomation.getId())
                .authors(authors)
                .build();
    }

    public static Book toEntity(BookDto book) {
        List<Author> authors = book.getAuthors()
                .stream()
                .map(AuthorMappers::toEntity)
                .toList();
        return Book.builder()
                .title(book.getTitle())
                .subTitle(book.getSubTitle())
                .id(book.getId())
                .authors(authors)
                .build();
    }*/
}
