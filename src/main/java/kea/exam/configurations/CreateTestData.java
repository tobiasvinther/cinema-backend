package kea.exam.configurations;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
@Profile("!test")
public class CreateTestData {
}
