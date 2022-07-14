package Que15;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;



class Itest {

	
@AfterEach
void tearDown() throws Exception {


}
@Test
void test() {
    Item i = new Item (1,"pen", 200,500,LocalDate.of(2022,11,23),LocalDate.of(2023, 2, 22));

    assertEquals(true,i.createObject(i));
}
}
