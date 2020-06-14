class test {
  void exception() throws RuntimeException {
    System.out.print("1 ");
    throw new Exception();
  }
  void m() {
    try {
      exception();
    }
    catch(RuntimeException e) {
      System.out.print("2 ");
    }
    catch(Exception e) {
      System.out.print("3 ");
      return;
    }
    finally {
      System.out.print("4 ");
    }
    System.out.print("5 ");
  }
  public static void main(String args[]) {
    new test().m();
  }
}