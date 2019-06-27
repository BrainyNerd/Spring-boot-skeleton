package com.tw.User;

import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import com.tw.App;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.web.context.ConfigurableWebApplicationContext;


@RunWith(PactRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@
@Provider("Spring-boot-skeleton")
@PactFolder("pacts")
public class UserControllerUnitTest {

    @TestTarget
    public final Target target = new HttpTarget("http", "localhost", 5000);


    private static ConfigurableWebApplicationContext application;

    @BeforeClass
    public static void start() {
        application = (ConfigurableWebApplicationContext) SpringApplication.run(App.class);
    }

    @State("foo")
    public void verify() {
    }

//    @Autowired
//    private MockMvc mockMvc;

//    @Test
//    @Ignore
//    public void shouldBeTrue() throws Exception {
//        mockMvc.perform(get("/foo"))
//                .andExpect(content().contentType("text/plain;charset=UTF-8"))
//                .andExpect(content().string(containsString("foo")));
//    }


}
