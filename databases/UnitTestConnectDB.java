package databases;

import org.junit.Assert;

public class UnitTestConnectDB {
    public static  void main(String[] args) {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        Assert.assertArrayEquals(expected, actual);


    }
}
