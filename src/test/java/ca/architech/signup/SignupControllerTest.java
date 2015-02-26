package ca.architech.signup;

import org.junit.Test;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import ca.architech.config.WebAppConfigurationAware;

public class SignupControllerTest extends WebAppConfigurationAware {
    @Test
    public void displaysSignupForm() throws Exception {
        mockMvc.perform(get("/signup"))
                .andExpect(model().attributeExists("signupForm"))
                .andExpect(view().name("signup/signup"))
                .andExpect(content().string(
                                containsString("<title>Signup</title>")
                        )
                );
    }
}