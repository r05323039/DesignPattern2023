package ian;

import ian.Creational.Builder.People;
import org.junit.Test;

public class BuilderTest {

    @Test
   public void TestBuilder() {
        People people = People.Builder("Ian", "Lin")
                .setNickName("ANAN")
                .build();

        System.out.println(people);
    }
}
