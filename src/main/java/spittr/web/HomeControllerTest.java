package spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class HomeControllerTest {

    @Test
    public void testHomePage() throws Exception{
        HomeController controller=new HomeController();
        /*
        搭建模拟mockMvc
         */
        MockMvc mockMvc=standaloneSetup(controller).build();
        //对“/”执行GET请求
        mockMvc.perform(get("/"))
                //得到预期视图
                .andExpect(view().name("home"));
    }
}
