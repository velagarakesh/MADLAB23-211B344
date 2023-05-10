interface testable {
  void displaytest(int x);
}


class test implements testable {
  public void displaytest(int x) {
   for(;X>0;x--){
    System.out.println("hi");
   }
  }
}
abstract class abstest implements testable {
  public void displaytest(int x) {
   for(;X>0;x--){
    System.out.println("hello");
   }
  }
}