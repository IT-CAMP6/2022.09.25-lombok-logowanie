package pl.camp.it.lombok;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@Accessors(fluent = true)
@Log4j2
public class User2 {
    @Getter(AccessLevel.PROTECTED)
    private int id;
    private String login;
    private String password;

    public void cos() {
        while (true) {
            log.info("cos sie loguje");
            log.debug("asjhdgkjahsd");
        }
    }
}
