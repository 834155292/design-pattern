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

责任链模式：该模式的目的在于通过给予多个对象处理请求的机会，以解除请求的发送者和处理者之间的耦合。将这些对象练成一条链，请求在这条链中传递，直到有一个对象对其进行处理。这些对象都有选择处理请求和将请求传递给下一个处理对象的权利。这些对象即可使上下级关系也可以是并列与协作的关系。

享元模式：该模式的意图是通过共享来有效的支持大量对象细粒度的对象。享元对象不可变且只能由享元工厂创建，具体的享元类可以设置为享元工厂的私有静态内部类。通常将大量细粒度的对象的不可变部分抽离出来封装在享元对象里面，这样在创建大量细粒度的对象时就不必创建这些不变的数据了，直接引用享元对象就可以了。

构建者模式：该模式的意图是将类的构建逻辑转移到类的实例化外部。在创建对象之前，逐步收集创建对象需要的信息，用于构建复杂的对象。通常需要将构建过程封装到director中。对象的创建通常会有一些逻辑，这些逻辑在对象创建完之后就不再有意义，可以将这些逻辑封装到构建者中。

工厂方法模式：该模式的意图是定义一个用于创建对象的接口，并控制返回哪个类的实例。在某些场景下用户不关心或者不需要关心是哪个具体类的实例化，或者用户不知道用哪个构造函数实例化类，或者用户不知道有哪些子类或者实现类可以用，工厂方法解决了这个问题。工厂方法模式不仅要求有一个能够创建新对象的方法，还要让客户端无须了解具体实例化的类。Collection接口的iterator()方法就是工厂方法。

抽象工厂模式：抽象工厂模式又名工具箱，其意图是允许创建一族相关或相互依赖的对象。GUI工具箱是抽象工厂模式的一个典型案例，它为用户提供各种GUI控件，例如客户所在的国家决定不同的界面风格。抽象工厂模式使得客户端代码在需要新对象的时候，无需关心该对象是由哪个类实例化的。就这点而言，抽象工厂就是工厂方法的集合。在某些情况下，工厂方法模式的设计可能会迈向抽象工厂模式的设计。

原型模式：原型模式的意图是通过复制一个现有的对象来生成新的对象，而不是通过实例化的方式。在某些情况下，可能不希望反复使用类的构造方法创建许多对象，而是希望用该类创建一个对象后，以该对象为原型得到该对象的若干个复制品。即将一个对象定义为原型对象，要求该原型对象提供一个方法，使调用该方法可以复制一个和自己有完全相同状态的同类型对象，且原型对象和复制出来的对象的状态可以独立地变化而不相互影响。当创建类的新实例代价更大时，原型模式可以提高创建新实例的效率（见案例：com.zboy.example.creational.prototype.example02.Apple）。

备忘录模式：备忘录模式的意图是为对象状态提供存储和恢复功能。在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样以后就可将该对象恢复到原先保存的状态。备忘录是一个用来存储对象状态的小型数据仓库。通常，可以用一个对象、字符串或者文件来创建备忘录。在该模式中，需要保存状态的对象是“原发者”，负责保存原发者状态的对象是“备忘录”，负责管理备忘录的对象是“负责人”。

模板方法模式：模板方法的意图是在一个方法里实现一个算法，并推迟定义算法中的某些步骤，从而让其他类重新定义它们也不会改变整个算法的骨架。钩子方法是一个回调方法，它可以让其他开发者将自己的代码插入到程序的指定位置。通常开发者会为钩子方法提供一个存根实现，一旦其他客户端不需要钩子方法就没必要再重写它。模板方法模式通常会使用钩子方法调用子类的实现。模板方法模式可以作为开发者之间的一种契约。魔板方法模式的意图并不是要求我们在定义子类前写出模板方法，可能会在已有的类层次中发现一些相似的地方，此时可以将相似的地方提取为模板方法。

状态模式：状态模式的意图是将表示对象状态的逻辑分散到代表状态的不同类中。该模式将状态建模为对象，并把状态相关的逻辑封装到独立的类中。环境状态的更新可以由状态类完成也可以有状态类返回再由自己更新。

策略模式：策略模式的意图是将可互换的方法封装在各自独立的类中，并且让每个方法都实现一个公共的操作。策略模式可以让一组策略共存，代码互不干扰。它还将策略选择的逻辑从策略本身中分离了出来。不同的策略可以相互替换。