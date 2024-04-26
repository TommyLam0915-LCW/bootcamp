package src;
public class IntegerPrinter {
  private Integer data;

  public IntegerPrinter(String data){
    this.data=data;
  }
  
  public void print(){
    System.out.println(this.data);
  }


  public static void main(String[] args) {
    IntegerPrinter sp = new IntegerPrinter();
    sp.print();
  }
}

