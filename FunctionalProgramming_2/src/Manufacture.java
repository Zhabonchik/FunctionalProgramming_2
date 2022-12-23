
public class Manufacture {
    private String name;
    private int productAmount;
    private int expectedProductAmount;

    Manufacture() {
        name = "";
        productAmount = 0;
        expectedProductAmount = 0;
    }

    Manufacture(String name, int productAmount, int expectedProductAmount) {
        this.name = name;
        this.productAmount = productAmount;
        this.expectedProductAmount = expectedProductAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public void setExpectedProductAmount(int expectedProductAmount) {
        this.expectedProductAmount = expectedProductAmount;
    }

    public String getName() {
        return name;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public int getExpectedProductAmount() {
        return expectedProductAmount;
    }

    @Override
    /*public String toString() {
        String answer = new String();
        answer += "{" + "name: " + name + "; " + "product amount: " + productAmount + "; "
                + "expected product amount: " + expectedProductAmount + "}\n";
        return answer;
    }*/
    public String toString() {
        return name + " " + productAmount + " " + expectedProductAmount;
    }
}

