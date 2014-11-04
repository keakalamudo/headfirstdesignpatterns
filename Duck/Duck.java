package hfdp.ducks
public abstract class Duck{
  FlyBehavior flyBehavior;
  QuckBehavior quackBehavior;

  public Duck(){

  }
  public abstract void display();

  public void perfromFly(){
    flyBehavior.fly();
  }

  public void perfromQuack(){
    quackBehavior.quack();
  }

  public void swim(){
    System.out.println("All ducks float even decoys!");
  }
}
