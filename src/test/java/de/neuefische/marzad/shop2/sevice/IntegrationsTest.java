package de.neuefische.marzad.shop2.sevice;

import de.neuefische.marzad.shop2.repository.ProductRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;


@SpringBootTest
@AutoConfigureMockMvc
class IntegrationsTest {

    @Autowired
    MockMvc mockMvc;
    @Autowired
    ProductRepo productRepo;

    @Test
    void getProductsList_whenNoProductInDB() throws Exception {



        mockMvc.perform(get("/shop/api/products"))
                        .andExpect(status().isOk())
                                .andExpect(content().json("""
[]
"""));

    }

    @Test
    void addProduct_whenNoProduct() throws Exception {

/*        productRepo.addProduct("");
        mockMvc.perform(get("/shop/api/products"))
                .andExpect(status().isOk())
                .andExpect(content().json("""
[]
"""));*/



        mockMvc.perform(post("/shop/api/products").content("product"))
                .andExpect(status().isOk());
    }

    @Test
    void getProductByNameTest() throws Exception {

        mockMvc.perform(get("/shop/products").content("apfel")).andExpect(content().string(""));

    }

    @Test
    void getProductByID() {
    }

    @Test
    void getOrdersList() {
    }

    @Test
    void addOrder() throws Exception {
        mockMvc.perform(post("/shop/api/orders").contentType(MediaType.APPLICATION_JSON).content("""
[1]
"""))
                .andExpect(status().isOk());
              //  .andExpect(content().string("true"));

    }

    @Test
    void getOrder() {
    }
}