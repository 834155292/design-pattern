# design-pattern
java设计模式收集

模块分类：

- Behavioral-*：表示行为型设计模式
- Structural-*：表示结构型设计模式
- Creational-*：表示创建型设计模式

模块说明：

- Behavioral-ChainOfResponsibility：责任链模式
- Behavioral-Command：命令模式
- Behavioral-Iterator：迭代器模式
- Behavioral-Mediator：中介者模式
- Behavioral-Memento：备忘录模式
- Behavioral-Observer：观察者模式
- Behavioral-State：状态模式
- Behavioral-Strategy：策略模式
- Behavioral-TemplateMethod：模板方法模式
- Behavioral-Visitor：访问者模式


- Creational-AbstractFactory：抽象工厂模式
- Creational-Builder：构建者模式
- Creational-FactoryMethod：工厂方法模式
- Creational-Prototype：原型模式
- Creational-Singleton：单例模式


- Structural-Adapter：适配器模式
- Structural-Bridge：桥接模式
- Structural-Composite：组合模式
- Structural-Decorator：装饰器模式
- Structural-Facade：门面模式
- Structural-Flyweight：享元模式
- Structural-Proxy：代理模式

模式解读：

代理模式：该模式的意图是通过一个代理或者占位符来控制对该对象的访问。对于客户端而言，它并不知道它正在和一个代理打交道。

适配器模式：适配器的意图是使用不同接口的类所提供的服务为客户端提供它所期望的接口。适配器模式分为接口适配（类适配）、类与对象适配。当需要适配的方法并非定义在接口时就需要使用类与对象的适配了。继承需要适配的方法所在的类，将请求委派给依赖的具体实现类的对象进行处理。类与对象的适配可以实现双向适配。另一种有争议的适配器模式就是一个抽象类实现了一个接口的所有方法，但是都是空方法，这样做的目的是防止只需要实现接口一个方法的类直接实现接口又不得不实现所有方法的问题。

外观模式：外观模式的意图是为子系统提供一个接口，便于它的使用。它可能全是静态方法。外观类通常是可配置的、便于重用的、提供了高层次的接口。

组合模式：组合模式的意图是为了保证客户端调用单对象与组合对象的一致性。组合对象和单对象共享同一个接口。只有当应用程序的核心模型可以表示为树时，使用组合模式才有意义。

桥接模式：将抽象部分和它的实现部分分离，使他们都可以独立的变化。也就是将一个抽象类中的抽象方法的重要实现部分交给另外一个抽象类的子类或实现另外一个接口的类。

单例模式：单例模式的意图是为了确保一个类有且仅有一个实例，并为它提供一个全局访问点。根据单例创建时机的不同分为懒汉模式和恶汉模式。

观察者模式：观察者模式的意图是在多个对象之间定义一对多的依赖关系，当一个对象的状态发生改变时，会通知依赖于它的对象，并且这些对象会根据新状态做出相应的反应。被观察者对象在通知观察者时有2种方式，一种是推模式，一种的拉模式。推模式下会推送变更的数据，拉模式只会通知有变更发生，需要观察者自己获取变更的数据并作出响应。当处理多主题的时候应当使用拉模式。

中介者模式：该模式的意图是定义一个对象，封装一组对象的交互，从而降低对象间的耦合度，避免了对象间的显示引用，并且可以独立的改变对象的行为。无论何时，只要对象之间存在复杂的交互行为，就可以将这些交互职责集中到这些对象等之外的一个中介者对象中。当对象和中介者交互时通常要把自己的身份信息和交互的信息发送给中介者，这样中介者才能根据不同的身份进行对应的交互。该模式经常用在GUI程序开发中。