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

适配器模式：适配器的意图是使用不同接口的类所提供的服务为客户端提供它所期望的接口。适配器模式分为接口适配（类适配）、类与对象适配。当需要适配的方法并非定义在接口时就需要使用类与对象的适配了。继承需要适配的方法所在的类，将请求委派给依赖的具体实现类的对象进行处理。类与对象的适配可以实现双向适配。另一种有争议的适配器模式就是一个抽象类实现了一个接口的所有方法，但是都是空方法，这样做的目的是防止只需要实现接口一个方法的类直接实现接口又不得不实现所有方法的问题。

外观模式：外观模式的意图是为子系统提供一个接口，便于它的使用。它可能全是静态方法。外观类通常是可配置的、便于重用的、提供了高层次的接口。

组合模式：组合模式的意图是为了保证客户端调用单对象与组合对象的一致性。组合对象和单对象共享同一个接口。只有当应用程序的核心模型可以表示为树时，使用组合模式才有意义。