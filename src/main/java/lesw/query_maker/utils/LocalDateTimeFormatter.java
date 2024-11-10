package lesw.query_maker.utils;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class LocalDateTimeFormatter {

    public String format(LocalDateTime localDateTime) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return localDateTime.format(dateTimeFormatter);
    }
}