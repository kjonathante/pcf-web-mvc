package te.jonathan.kit.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class WelcomeControllerUnitTest {
    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new WelcomeController()).build();
    }

    @Test
    public void givenHomePageURI_whenMockMVC_thenReturnsIndexJSPViewName() throws Exception {
        this.mockMvc.perform(get("/")).andExpect(view().name("index"));
    }
}
