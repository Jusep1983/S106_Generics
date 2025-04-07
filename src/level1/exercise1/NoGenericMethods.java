package level1.exercise1;

public class NoGenericMethods {
    private String firstValue;
    private String secondValue;
    private String thridValue;

    public NoGenericMethods(String firstValue, String secondValue, String thridValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thridValue = thridValue;
    }

    public String getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(String firstValue) {
        this.firstValue = firstValue;
    }

    public String getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(String secondValue) {
        this.secondValue = secondValue;
    }

    public String getThridValue() {
        return thridValue;
    }

    public void setThridValue(String thridValue) {
        this.thridValue = thridValue;
    }

}
