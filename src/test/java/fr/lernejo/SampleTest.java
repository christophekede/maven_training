package fr.lernejo;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;


class SampleTest {

    @Test
    void mult_should_produce_20() {
        int a = 10;
        int b = 2;

        int result = new Sample().op(Sample.Operation.MULT,a,b);
        Assertions.assertThat(result).as("10*2").isEqualTo(20);
    }

    @Test
    void add_should_produce_7() {
        int a = 3;
        int b = 4;

        int result = new Sample().op(Sample.Operation.ADD,a,b);

        Assertions.assertThat(result).as("3 + 4").isEqualTo(7);
    }
}