package constructoroverloading.Traner;

import constructoroverloading.Trainer;

public class Test {

    //@Test
    public void testCreate() {
        Trainer trainer = new Trainer("Jhon Doe", 2);
        //ennél a fordító dönt hogy melyik metódust hívja meg a sima class-ból
        //assertThat(trainer.getName(), equalTo("Jhon Doe")); már megint nem csinálja a kis köcsög!

    }
}
