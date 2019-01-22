package src.Array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTest {

    @Test
    public void getCapacity() {
        Array array = new Array(10);
        array.set(1,1);
        Assert.assertEquals(array.getCapacity(),10);
    }
}