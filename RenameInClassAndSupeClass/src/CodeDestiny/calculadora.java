import java.lang.reflect.Method;

public class calculadora extends calc{
  public static void main(String[] args) {
    calc cal = new calc();
    cal.sum();
  }

  public double sum() {
    return 1.0 + 2.0;
  }

}
