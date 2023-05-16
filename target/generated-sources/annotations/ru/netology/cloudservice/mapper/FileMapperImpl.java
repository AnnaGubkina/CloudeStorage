package ru.netology.cloudservice.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.netology.cloudservice.entity.CloudFile;
import ru.netology.cloudservice.web.response.FileWebResponse;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-02T17:26:48+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class FileMapperImpl implements FileMapper {

    @Override
    public FileWebResponse cloudFileToFileWebResponse(CloudFile cloudFile) {
        if ( cloudFile == null ) {
            return null;
        }

        FileWebResponse fileWebResponse = new FileWebResponse();

        fileWebResponse.setFilename( cloudFile.getFilename() );
        if ( cloudFile.getSize() != null ) {
            fileWebResponse.setSize( cloudFile.getSize().intValue() );
        }

        return fileWebResponse;
    }
}
