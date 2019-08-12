##### 01：策略模式

需要新的设计方式，应对项目的扩展性，降低复杂度：

1. 分析项目变化与不变化部分，提取变化部分，抽象成接口+实现

2. 鸭子哪些功能是会根据新需求变化的？叫声、飞行。。。

   接口：

   ```java
   public interface FlyBehavior {
      void fly();
   }
   ```

   ```java
   public class BadFlyBehavior implements FlyBehavior {
       @Override
       public void fly() {
           
           System.out.println("--BadFly--");
       }
   }
   ```

   ```java
   public  interface QuackBehavior {
      void quack();
   };
   ```

   ```java
   public class GaGaQuackBehavior implements QuackBehavior {
       @Override
       public void quack() {
           
           System.out.println("__GaGa__");
       }
   }
   ```

   **// 抽象类 Duck 中 定义行为接口对象**

   ```java
   public abstract class Duck {
       FlyBehavior mFlyBehavior;
       QuackBehavior mQuackBehavior;
   }
   ```

   ```java
   public class GreenHeadDuck extends Duck {
   
      public GreenHeadDuck() {
         mFlyBehavior = new GoodFlyBehavior();
         mQuackBehavior = new GaGaQuackBehavior();
      }
   }
   ```

   ```java
   public class RedHeadDuck extends Duck {
   
      public RedHeadDuck() {
         mFlyBehavior = new BadFlyBehavior();
         mQuackBehavior = new GeGeQuackBehavior();
      }
   }
   ```

   // 示例：

   ```java
   public class StimulateDuck {
   
       public static void main(String[] args) {
   				// 用父类接收对象
           Duck mGreenHeadDuck = new GreenHeadDuck();
           Duck mRedHeadDuck = new RedHeadDuck();
   
           mGreenHeadDuck.display();
           mGreenHeadDuck.Fly();
           mGreenHeadDuck.Quack();
           mGreenHeadDuck.swim();
   
           mRedHeadDuck.display();
           mRedHeadDuck.Fly();
           mRedHeadDuck.Quack();
           mRedHeadDuck.swim();
           mRedHeadDuck.display();
           mRedHeadDuck.SetFlyBehavoir(new NoFlyBehavior());
           mRedHeadDuck.Fly();
           mRedHeadDuck.SetQuackBehavoir(new NoQuackBehavior());
           mRedHeadDuck.Quack();
       }
   }
   ```

3. 好处：新增行为简单，行为类更好的复用，组合更方便。既有继承带来的复用好处，没有挖坑。

4. 总结：

   策略模式：分别封装 行为接口， 实现算法族，超类里放行为接口对象，在子类里具体设定行为对象。原则就是：分离变化部分，封装接口，基于接口编程各种功能。此模式让行为算法的变化独立于算法的使用者。

##### 02：观察者模式

##### 03：装饰者模式：咖啡订单系统

项目分析：

1. 咖啡种类：Espresso、ShortBlack、LongBlack、Decaf
2. 调料：Milk、Soy、Chocolate
3. 扩展性好、改动方便、维护方便

装饰者模式：动态的将新功能附加到对象上。在对象功能扩展方便，比继承更有弹性。 

![image-20190811120707745](/Users/ZPTION/ZPING-Projects/300_design/DesignPatternDemo/readme/img_resource/image-20190811120707745.png)



Java内置装饰者

1. Java的IO结构

   ![image-20190811124507892](/Users/ZPTION/ZPING-Projects/300_design/DesignPatternDemo/readme/img_resource/image-20190811124507892.png)



##### 04：单例模式

略

##### 05：工厂模式

工厂方法模式设计方案：将披萨项目里的披萨对象实例化功能抽象成抽象方法，在不通加盟店具体实现功能。

**工厂方法模式：**定义了一个创建对象的抽象方法，由子类决定要实例化的类。工厂方法模式将对象的实例化推迟到子类。



**抽象工厂模式：**定义了一个接口用于创建相关或有依赖关系的对象族，而无需明确指定具体类。



##### 06：命令模式

命令模式：将请求、命令、动作等封装成对象，这样可以让项目使用这些对象来参数化其他对象。使得命令的请求者和执行者解耦。(遥控器和设备之间解耦)

1. ![image-20190811152309857](/Users/ZPTION/ZPING-Projects/300_design/DesignPatternDemo/readme/img_resource/image-20190811152309857.png)



##### 07：适配器模式

* ![image-20190811160346518](/Users/ZPTION/ZPING-Projects/300_design/DesignPatternDemo/readme/img_resource/image-20190811160346518.png)

* ![image-20190811160545223](/Users/ZPTION/ZPING-Projects/300_design/DesignPatternDemo/readme/img_resource/image-20190811160545223.png)

* ![image-20190811161043018](/Users/ZPTION/ZPING-Projects/300_design/DesignPatternDemo/readme/img_resource/image-20190811161043018.png)

##### 装饰者模式与适配器模式的差别

装饰者模式 装饰者与被装饰者都有一个超类。IO流。

适配器模式 适配与被适配的类是不同的。枚举-迭代。



##### 08：外观模式

直接用遥控器：统筹各设备开关。

外观模式：提供一个统一的接口，来访问子系统中一群功能相关接口

外观模式定义了一个高层接口，让子系统更容易使用

**外观模式和命令模式各自侧重点**

外观模式：在一个系统建高层接口，提供给外部使用。简化对外暴露的接口。

命令模式：把命令包装成对象。实现解耦控制器与设备。

**最少知识原则**

* 最少知识原则：尽量减少对象之间的交互。项目设计中不要太多的类耦合在一起。

1. 如何遵循最少知识原则

* 对象的方法调用范围：
* * 该对象本身
* * 作为参数传进来的对象
* * 此方法创建和实例化的对象
  * 对象的组件

* ![image-20190811164046516](/Users/ZPTION/ZPING-Projects/300_design/DesignPatternDemo/readme/img_resource/image-20190811164046516.png)



##### 09：模板模式

![image-20190811165417118](/Users/ZPTION/ZPING-Projects/300_design/DesignPatternDemo/readme/img_resource/image-20190811165417118.png)



![image-20190811165716371](/Users/ZPTION/ZPING-Projects/300_design/DesignPatternDemo/readme/img_resource/image-20190811165716371.png)

模板模式：封装了一个算法步骤，并允许子类为一个或多个步骤方法提供实现。模板模式可以使子类在不改变算法结构的情况下，重新定义算法中的某些步骤。

##### 好莱坞原则

* 好莱坞原则的意义
  * 你别调用我们，我们会调用你
  * 高层无需知道底层的细节，解耦
* 模板模式与好莱坞原则



##### 10：迭代器模式

两个菜馆合并后的菜单问题

一个用ArrayList管理菜单，一个用数组管理菜单

迭代器模式：提供一种方法顺序访问一个聚合对象中的各个对象。

单一职责原则：一个类应该只有一个引起变化的原因。



##### 11：组合模式











































