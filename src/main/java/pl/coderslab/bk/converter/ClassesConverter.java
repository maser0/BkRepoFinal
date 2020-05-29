package pl.coderslab.bk.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class ClassesConverter implements Converter <String, LocalDateTime> {


    @Override
    public LocalDateTime convert(String s) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");


        return LocalDateTime.parse(s, formatter);
    }
}
