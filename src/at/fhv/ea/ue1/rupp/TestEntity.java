package at.fhv.ea.ue1.rupp;

import java.io.Serializable;

public class TestEntity implements Serializable {
    private int testId;
    private String name;

    public TestEntity(int id, String name) {
        testId = id;
        this.name = name;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int id) {
        testId = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return testId + ", " + name;
    }
}
