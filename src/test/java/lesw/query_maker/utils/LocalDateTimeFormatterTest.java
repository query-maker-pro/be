package lesw.query_maker.utils;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LocalDateTimeFormatterTest {

    LocalDateTimeFormatter localDateTimeFormatter = new LocalDateTimeFormatter();

    @Test
    void 날짜_포맷_yyyy_MM_dd_HH_mm_ss() {
        // given
        LocalDateTime testDateTime = LocalDateTime.of(2024, 1, 1, 12, 0, 0);
        String testDateTimeFormat = "2024-01-01 12:00:00";
        // when

        // then
        String createdLocalDateTime = localDateTimeFormatter.format(testDateTime);

        // when
        assertEquals(testDateTimeFormat, createdLocalDateTime);
    }
}